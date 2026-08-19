package me.vkryl.android.animator;

import android.graphics.RectF;
import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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

    public interface Measurable {

        public abstract class CC {
            public static int $default$getSpacingEnd(Measurable measurable, boolean z) {
                return 0;
            }

            public static int $default$getSpacingStart(Measurable measurable, boolean z) {
                return 0;
            }
        }

        int getHeight();

        int getSpacingEnd(boolean z);

        int getSpacingStart(boolean z);

        int getWidth();
    }

    public interface MetadataCallback {

        public abstract class CC {
            public static boolean $default$hasChanges(MetadataCallback metadataCallback, ListAnimator listAnimator) {
                return false;
            }

            public static boolean $default$onApplyMetadataAnimation(MetadataCallback metadataCallback, ListAnimator listAnimator, float f) {
                return false;
            }

            public static void $default$onFinishMetadataAnimation(MetadataCallback metadataCallback, ListAnimator listAnimator, boolean z) {
            }

            public static void $default$onForceApplyChanges(MetadataCallback metadataCallback, ListAnimator listAnimator) {
            }

            public static void $default$onPrepareMetadataAnimation(MetadataCallback metadataCallback, ListAnimator listAnimator) {
            }
        }

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

        public float getPosition() {
            return this.position.get();
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

        public RectF getRectF() {
            return this.measuredPositionRect.toRectF();
        }

        public float getSpacingStart() {
            return this.measuredSpacingStart.get();
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
            if (obj instanceof Animatable) {
                return ((Animatable) obj).applyAnimation(f) || z;
            }
            return z;
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

        public float getTotalWidth() {
            return this.totalWidth.get();
        }

        public float getTotalHeight() {
            return this.totalHeight.get();
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

    public int size() {
        return this.entries.size();
    }

    public Entry getEntry(int i) {
        return (Entry) this.entries.get(i);
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public void applyAnimation(float f) {
        boolean zApplyAnimation = this.metadata.applyAnimation(f);
        ArrayList arrayList = this.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zApplyAnimation = ((Entry) obj).applyAnimation(f) || zApplyAnimation;
        }
        if (zApplyAnimation) {
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
            ArrayList arrayList = this.entries;
            int size = arrayList.size();
            int i2 = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (((Entry) obj2).item == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        ArrayList arrayList2 = this.entries;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            if (obj.equals(((Entry) obj3).item)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public void clear(boolean z) {
        reset(null, z);
    }

    private void onBeforeListChanged() {
        if (this.foundListChanges) {
            return;
        }
        this.foundListChanges = true;
        stopAnimation(false);
    }

    private void onApplyListChanges() {
        int i = 0;
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
            ArrayList arrayList = this.entries;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Entry entry = (Entry) obj;
                entry.visibility.setFrom(entry.visibility.get());
                entry.position.setFrom(entry.position.get());
            }
        }
    }

    public void measureImpl(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.actualList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Entry entry = (Entry) obj;
            Object obj2 = entry.item;
            if (obj2 instanceof Measurable) {
                Measurable measurable = (Measurable) obj2;
                boolean z2 = entry.index == 0;
                boolean z3 = entry.index + 1 == this.actualList.size();
                int spacingStart = measurable.getSpacingStart(z2);
                int spacingEnd = measurable.getSpacingEnd(z3);
                int width = measurable.getWidth();
                int height = measurable.getHeight();
                int i4 = spacingStart + width + spacingEnd + i3;
                int i5 = spacingStart + height + spacingEnd + i2;
                if (!z || entry.getVisibility() <= 0.0f) {
                    arrayList = arrayList2;
                    entry.measuredPositionRect.set(i3, i2, i4, i5);
                    entry.measuredSpacingStart.set(spacingStart);
                } else {
                    float f = i3;
                    float f2 = i2;
                    float f3 = i4;
                    arrayList = arrayList2;
                    float f4 = i5;
                    if (entry.measuredPositionRect.differs(f, f2, f3, f4)) {
                        onBeforeListChanged();
                        entry.measuredPositionRect.setTo(f, f2, f3, f4);
                    }
                    float f5 = spacingStart;
                    if (entry.measuredSpacingStart.differs(f5)) {
                        onBeforeListChanged();
                        entry.measuredSpacingStart.setTo(f5);
                    }
                }
                iMax = Math.max(iMax, width);
                iMax2 = Math.max(iMax2, height);
                i3 = i4;
                i2 = i5;
                arrayList2 = arrayList;
            }
        }
        if (z) {
            ArrayList arrayList3 = this.entries;
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                Object obj4 = ((Entry) obj3).item;
                if ((obj4 instanceof Animatable) && ((Animatable) obj4).hasChanges()) {
                    onBeforeListChanged();
                    break;
                }
            }
        }
        ArrayList arrayList4 = this.entries;
        int size3 = arrayList4.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            Object obj6 = ((Entry) obj5).item;
            if (obj6 instanceof Animatable) {
                Animatable animatable = (Animatable) obj6;
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
            float f6 = i3;
            if (this.metadata.totalWidth.differs(f6)) {
                onBeforeListChanged();
                this.metadata.totalWidth.setTo(f6);
            }
            float f7 = i2;
            if (this.metadata.totalHeight.differs(f7)) {
                onBeforeListChanged();
                this.metadata.totalHeight.setTo(f7);
            }
            float f8 = iMax;
            if (this.metadata.maxItemWidth.differs(f8)) {
                onBeforeListChanged();
                this.metadata.maxItemWidth.setTo(f8);
            }
            float f9 = iMax2;
            if (this.metadata.maxItemHeight.differs(f9)) {
                onBeforeListChanged();
                this.metadata.maxItemHeight.setTo(f9);
            }
            if (this.metadata.metadataCallback.hasChanges(this)) {
                onBeforeListChanged();
                this.metadata.metadataCallback.onPrepareMetadataAnimation(this);
                return;
            }
            return;
        }
        this.metadata.totalWidth.set(i3);
        this.metadata.totalHeight.set(i2);
        this.metadata.maxItemWidth.set(iMax);
        this.metadata.maxItemHeight.set(iMax2);
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
                int iIndexOf = list.indexOf(entry2.item);
                if (iIndexOf != -1) {
                    i++;
                    float f = iIndexOf;
                    if (entry2.position.differs(f)) {
                        onBeforeListChanged();
                        entry2.position.setTo(f);
                    }
                    if (entry2.index != iIndexOf) {
                        entry2.index = iIndexOf;
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
                ArrayList arrayList2 = this.entries;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    if (((Entry) obj2).visibility.differs(0.0f)) {
                        onBeforeListChanged();
                        break;
                    }
                }
            }
            if (this.foundListChanges) {
                ArrayList arrayList3 = this.entries;
                int size4 = arrayList3.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj3 = arrayList3.get(i5);
                    i5++;
                    Entry entry4 = (Entry) obj3;
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
