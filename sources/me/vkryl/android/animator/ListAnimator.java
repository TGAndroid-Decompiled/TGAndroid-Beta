package me.vkryl.android.animator;

import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.ArrayUtils;
import me.vkryl.core.lambda.Destroyable;

public final class ListAnimator implements Iterable {
    private final FactorAnimator animator;
    private final Callback callback;
    private boolean foundListChanges;
    private final Metadata metadata;
    private final ArrayList entries = new ArrayList();
    private final ArrayList actualList = new ArrayList();

    public interface Callback extends MetadataCallback {
        void onItemsChanged(ListAnimator listAnimator);
    }

    public interface MetadataCallback {
        boolean hasChanges(ListAnimator listAnimator);

        boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f);

        void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z);

        void onForceApplyChanges(ListAnimator listAnimator);

        void onPrepareMetadataAnimation(ListAnimator listAnimator);
    }

    public interface ResetCallback {
        void onItemAdded(Object obj, boolean z);

        void onItemRemoved(Object obj);
    }

    public static class Entry implements Comparable {
        private int index;
        private boolean isBeingRemoved = false;
        public final Object item;
        private final VariableRect measuredPositionRect;
        private final VariableFloat measuredSpacingStart;
        private final VariableFloat position;
        private final VariableFloat visibility;

        public Entry(Object obj, int i, boolean z) {
            this.item = obj;
            this.index = i;
            this.visibility = new VariableFloat(z ? 1.0f : 0.0f);
            this.position = new VariableFloat(i);
            this.measuredPositionRect = new VariableRect();
            this.measuredSpacingStart = new VariableFloat(0.0f);
            finishAnimation(false);
        }

        public boolean isJunk() {
            return getVisibility() == 0.0f && !isAffectingList();
        }

        public void onPrepareRemove() {
            this.visibility.setTo(0.0f);
            this.isBeingRemoved = true;
        }

        public void onPrepareAppear() {
            this.visibility.setTo(1.0f);
            this.isBeingRemoved = false;
        }

        @Override
        public int compareTo(Entry entry) {
            return Integer.compare(this.index, entry.index);
        }

        public float getVisibility() {
            return MathUtils.clamp(this.visibility.get(), 0.0f, 1.0f);
        }

        public boolean isAffectingList() {
            return !this.isBeingRemoved;
        }

        public void onRecycled() {
            Object obj = this.item;
            if (obj instanceof Destroyable) {
                ((Destroyable) obj).performDestroy();
            }
        }

        public void finishAnimation(boolean z) {
            this.position.finishAnimation(z);
            this.visibility.finishAnimation(z);
            this.measuredPositionRect.finishAnimation(z);
            this.measuredSpacingStart.finishAnimation(z);
            Object obj = this.item;
            if (obj instanceof Animatable) {
                ((Animatable) obj).finishAnimation(z);
            }
        }

        public boolean applyAnimation(float f) {
            boolean z = this.measuredSpacingStart.applyAnimation(f) || (this.measuredPositionRect.applyAnimation(f) || (this.visibility.applyAnimation(f) || this.position.applyAnimation(f)));
            Object obj = this.item;
            return obj instanceof Animatable ? ((Animatable) obj).applyAnimation(f) || z : z;
        }
    }

    public static class Metadata {
        private final ListAnimator context;
        private final VariableFloat maxItemHeight;
        private final VariableFloat maxItemWidth;
        private final MetadataCallback metadataCallback;
        private final VariableFloat size;
        private final VariableFloat totalHeight;
        private final VariableFloat totalVisibility;
        private final VariableFloat totalWidth;

        private Metadata(ListAnimator listAnimator, MetadataCallback metadataCallback) {
            this.size = new VariableFloat(0.0f);
            this.totalVisibility = new VariableFloat(0.0f);
            this.maxItemWidth = new VariableFloat(0.0f);
            this.maxItemHeight = new VariableFloat(0.0f);
            this.totalWidth = new VariableFloat(0.0f);
            this.totalHeight = new VariableFloat(0.0f);
            this.context = listAnimator;
            this.metadataCallback = metadataCallback;
        }

        public boolean applyAnimation(float f) {
            return this.metadataCallback.onApplyMetadataAnimation(this.context, f) || (this.totalVisibility.applyAnimation(f) || (this.totalHeight.applyAnimation(f) || (this.totalWidth.applyAnimation(f) || (this.maxItemHeight.applyAnimation(f) || (this.maxItemWidth.applyAnimation(f) || this.size.applyAnimation(f))))));
        }

        public void finishAnimation(boolean z) {
            this.size.finishAnimation(z);
            this.maxItemWidth.finishAnimation(z);
            this.maxItemHeight.finishAnimation(z);
            this.totalWidth.finishAnimation(z);
            this.totalHeight.finishAnimation(z);
            this.totalVisibility.finishAnimation(z);
            this.metadataCallback.onFinishMetadataAnimation(this.context, z);
        }

        public void setSize(int i, boolean z) {
            if (z) {
                this.size.setTo(i);
                this.totalVisibility.setTo(i > 0 ? 1.0f : 0.0f);
            } else {
                this.size.set(i);
                this.totalVisibility.set(i > 0 ? 1.0f : 0.0f);
            }
        }

        public float getTotalVisibility() {
            return this.totalVisibility.get();
        }
    }

    public ListAnimator(Callback callback, Interpolator interpolator, long j) {
        this.callback = callback;
        this.metadata = new Metadata(callback);
        if (interpolator != null && j > 0) {
            this.animator = new FactorAnimator(0, new FactorAnimator.Target() {
                @Override
                public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                    ListAnimator.this.applyAnimation(f);
                }

                @Override
                public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                    ListAnimator.this.applyAnimation(f);
                }
            }, interpolator, j);
        } else {
            this.animator = null;
        }
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public void applyAnimation(float f) {
        boolean applyAnimation = this.metadata.applyAnimation(f);
        Iterator it = this.entries.iterator();
        while (it.hasNext()) {
            applyAnimation = ((Entry) it.next()).applyAnimation(f) || applyAnimation;
        }
        if (applyAnimation) {
            this.callback.onItemsChanged(this);
            if (f == 1.0f) {
                removeJunk(true);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return this.entries.iterator();
    }

    private void removeJunk(boolean z) {
        boolean z2 = false;
        for (int size = this.entries.size() - 1; size >= 0; size--) {
            Entry entry = (Entry) this.entries.get(size);
            entry.finishAnimation(z);
            if (entry.isJunk()) {
                this.entries.remove(size);
                entry.onRecycled();
                z2 = true;
            }
        }
        if (z2) {
            this.entries.trimToSize();
        }
        this.metadata.finishAnimation(z);
    }

    public void stopAnimation(boolean z) {
        FactorAnimator factorAnimator = this.animator;
        if (factorAnimator != null) {
            factorAnimator.cancel();
            removeJunk(z);
            this.animator.forceFactor(0.0f);
            return;
        }
        removeJunk(z);
    }

    private int indexOfItem(Object obj) {
        int i = 0;
        if (obj == null) {
            Iterator it = this.entries.iterator();
            while (it.hasNext()) {
                if (((Entry) it.next()).item == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Iterator it2 = this.entries.iterator();
        while (it2.hasNext()) {
            if (obj.equals(((Entry) it2.next()).item)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void onBeforeListChanged() {
        if (this.foundListChanges) {
            return;
        }
        this.foundListChanges = true;
        stopAnimation(false);
    }

    private void onApplyListChanges() {
        if (this.foundListChanges) {
            this.foundListChanges = false;
            FactorAnimator factorAnimator = this.animator;
            if (factorAnimator != null) {
                factorAnimator.animateTo(1.0f);
                return;
            }
            return;
        }
        if (this.animator == null) {
            Iterator it = this.entries.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                entry.visibility.setFrom(entry.visibility.get());
                entry.position.setFrom(entry.position.get());
            }
        }
    }

    public void measureImpl(boolean z) {
        Iterator it = this.actualList.iterator();
        while (it.hasNext()) {
            Object obj = ((Entry) it.next()).item;
        }
        if (z) {
            Iterator it2 = this.entries.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object obj2 = ((Entry) it2.next()).item;
                if ((obj2 instanceof Animatable) && ((Animatable) obj2).hasChanges()) {
                    onBeforeListChanged();
                    break;
                }
            }
        }
        Iterator it3 = this.entries.iterator();
        while (it3.hasNext()) {
            Object obj3 = ((Entry) it3.next()).item;
            if (obj3 instanceof Animatable) {
                Animatable animatable = (Animatable) obj3;
                if (z) {
                    if (animatable.hasChanges()) {
                        animatable.prepareChanges();
                    }
                } else {
                    animatable.applyChanges();
                }
            }
        }
        if (z) {
            float f = 0;
            if (this.metadata.totalWidth.differs(f)) {
                onBeforeListChanged();
                this.metadata.totalWidth.setTo(f);
            }
            if (this.metadata.totalHeight.differs(f)) {
                onBeforeListChanged();
                this.metadata.totalHeight.setTo(f);
            }
            if (this.metadata.maxItemWidth.differs(f)) {
                onBeforeListChanged();
                this.metadata.maxItemWidth.setTo(f);
            }
            if (this.metadata.maxItemHeight.differs(f)) {
                onBeforeListChanged();
                this.metadata.maxItemHeight.setTo(f);
            }
            if (this.metadata.metadataCallback.hasChanges(this)) {
                onBeforeListChanged();
                this.metadata.metadataCallback.onPrepareMetadataAnimation(this);
                return;
            }
            return;
        }
        float f2 = 0;
        this.metadata.totalWidth.set(f2);
        this.metadata.totalHeight.set(f2);
        this.metadata.maxItemWidth.set(f2);
        this.metadata.maxItemHeight.set(f2);
        this.metadata.metadataCallback.onForceApplyChanges(this);
    }

    public void reset(List list, boolean z) {
        reset(list, z, null);
    }

    public boolean compareContents(List list) {
        if (list == null || list.isEmpty()) {
            return this.actualList.isEmpty();
        }
        if (this.actualList.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((Entry) this.actualList.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void reset(List list, boolean z, ResetCallback resetCallback) {
        boolean z2 = false;
        if (!z) {
            stopAnimation(false);
            for (int size = this.entries.size() - 1; size >= 0; size--) {
                ((Entry) this.entries.get(size)).onRecycled();
            }
            this.entries.clear();
            this.actualList.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                this.entries.ensureCapacity(size2);
                this.actualList.ensureCapacity(size2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Entry entry = new Entry(it.next(), this.actualList.size(), true);
                    this.entries.add(entry);
                    this.actualList.add(entry);
                }
                this.entries.trimToSize();
                this.actualList.trimToSize();
            }
            this.metadata.setSize(size2, false);
            measureImpl(false);
            this.callback.onItemsChanged(this);
            return;
        }
        if (compareContents(list)) {
            return;
        }
        onBeforeListChanged();
        if (list != null && !list.isEmpty()) {
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            for (int i2 = 0; i2 < this.entries.size(); i2++) {
                Entry entry2 = (Entry) this.entries.get(i2);
                int indexOf = list.indexOf(entry2.item);
                if (indexOf != -1) {
                    i++;
                    float f = indexOf;
                    if (entry2.position.differs(f)) {
                        onBeforeListChanged();
                        entry2.position.setTo(f);
                    }
                    if (entry2.index != indexOf) {
                        entry2.index = indexOf;
                        z3 = z3 || entry2.isAffectingList();
                        z4 = true;
                    }
                    if (entry2.visibility.differs(1.0f)) {
                        onBeforeListChanged();
                        entry2.onPrepareAppear();
                        this.actualList.add(entry2);
                        this.metadata.setSize(this.actualList.size(), true);
                        if (resetCallback != null) {
                            resetCallback.onItemAdded(entry2.item, true);
                        }
                        z3 = true;
                    }
                } else if (entry2.visibility.differs(0.0f)) {
                    onBeforeListChanged();
                    entry2.onPrepareRemove();
                    if (z3 ? this.actualList.remove(entry2) : ArrayUtils.removeSorted(this.actualList, entry2)) {
                        this.metadata.setSize(this.actualList.size(), true);
                        if (resetCallback != null) {
                            resetCallback.onItemRemoved(entry2.item);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    continue;
                }
            }
            if (z3) {
                Collections.sort(this.actualList);
            }
            if (i < list.size()) {
                ArrayList arrayList = this.entries;
                arrayList.ensureCapacity(arrayList.size() + (list.size() - i));
                int i3 = 0;
                for (Object obj : list) {
                    if (indexOfItem(obj) == -1) {
                        if (i3 != this.entries.size()) {
                            z4 = true;
                        }
                        onBeforeListChanged();
                        Entry entry3 = new Entry(obj, i3, false);
                        entry3.onPrepareAppear();
                        this.entries.add(entry3);
                        ArrayUtils.addSorted(this.actualList, entry3);
                        this.metadata.setSize(this.actualList.size(), true);
                        if (resetCallback != null) {
                            resetCallback.onItemAdded(entry3.item, false);
                        }
                    }
                    i3++;
                }
            }
            z2 = z4;
        } else {
            if (!this.foundListChanges) {
                Iterator it2 = this.entries.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((Entry) it2.next()).visibility.differs(0.0f)) {
                            onBeforeListChanged();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (this.foundListChanges) {
                Iterator it3 = this.entries.iterator();
                while (it3.hasNext()) {
                    Entry entry4 = (Entry) it3.next();
                    if (entry4.visibility.differs(0.0f)) {
                        onBeforeListChanged();
                        entry4.onPrepareRemove();
                        ArrayUtils.removeSorted(this.actualList, entry4);
                        this.metadata.setSize(this.actualList.size(), true);
                        if (resetCallback != null) {
                            resetCallback.onItemRemoved(entry4.item);
                        }
                    }
                }
            }
        }
        if (z2) {
            Collections.sort(this.entries);
        }
        measureImpl(true);
        onApplyListChanges();
    }
}
