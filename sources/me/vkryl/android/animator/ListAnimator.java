package me.vkryl.android.animator;

import android.graphics.RectF;
import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.lambda.Destroyable;

public final class ListAnimator implements Iterable {
    public final FactorAnimator animator;
    public final Callback callback;
    public boolean foundListChanges;
    public final Metadata metadata;
    public final ArrayList entries = new ArrayList();
    public final ArrayList actualList = new ArrayList();

    public interface Callback {
        boolean hasChanges();

        boolean onApplyMetadataAnimation(float f);

        void onFinishMetadataAnimation(boolean z);

        void onForceApplyChanges();

        void onItemsChanged();

        void onPrepareMetadataAnimation();
    }

    public final class Entry implements Comparable {
        public int index;
        public boolean isBeingRemoved = false;
        public final Object item;
        public final VariableRect measuredPositionRect;
        public final VariableFloat measuredSpacingStart;
        public final VariableFloat position;
        public final VariableFloat visibility;

        public Entry(int i, Object obj, boolean z) {
            this.item = obj;
            this.index = i;
            VariableFloat variableFloat = new VariableFloat(z ? 1.0f : 0.0f);
            this.visibility = variableFloat;
            VariableFloat variableFloat2 = new VariableFloat(i);
            this.position = variableFloat2;
            VariableRect variableRect = new VariableRect();
            this.measuredPositionRect = variableRect;
            VariableFloat variableFloat3 = new VariableFloat(0.0f);
            this.measuredSpacingStart = variableFloat3;
            variableFloat2.finishAnimation(false);
            variableFloat.finishAnimation(false);
            variableRect.left.finishAnimation(false);
            variableRect.top.finishAnimation(false);
            variableRect.right.finishAnimation(false);
            variableRect.bottom.finishAnimation(false);
            variableFloat3.finishAnimation(false);
            if (obj instanceof VariableRect) {
                VariableRect variableRect2 = (VariableRect) obj;
                variableRect2.left.finishAnimation(false);
                variableRect2.top.finishAnimation(false);
                variableRect2.right.finishAnimation(false);
                variableRect2.bottom.finishAnimation(false);
            }
        }

        @Override
        public final int compareTo(Object obj) {
            return Integer.compare(this.index, ((Entry) obj).index);
        }

        public final RectF getRectF() {
            VariableRect variableRect = this.measuredPositionRect;
            variableRect.rectF.set(variableRect.left.now, variableRect.top.now, variableRect.right.now, variableRect.bottom.now);
            return variableRect.rectF;
        }

        public final float getVisibility() {
            return MathUtils.clamp(this.visibility.now, 0.0f, 1.0f);
        }
    }

    public interface Measurable {
        int getHeight();

        int getSpacingStart(boolean z);

        int getWidth();
    }

    public final class Metadata {
        public final Callback metadataCallback;
        public final VariableFloat size = new VariableFloat(0.0f);
        public final VariableFloat totalVisibility = new VariableFloat(0.0f);
        public final VariableFloat maxItemWidth = new VariableFloat(0.0f);
        public final VariableFloat maxItemHeight = new VariableFloat(0.0f);
        public final VariableFloat totalWidth = new VariableFloat(0.0f);
        public final VariableFloat totalHeight = new VariableFloat(0.0f);

        public Metadata(ListAnimator listAnimator, Callback callback) {
            this.metadataCallback = callback;
        }

        public static void access$1400(Metadata metadata, int i, boolean z) {
            if (z) {
                metadata.size.to = i;
                metadata.totalVisibility.to = i > 0 ? 1.0f : 0.0f;
                return;
            }
            VariableFloat variableFloat = metadata.size;
            float f = i;
            variableFloat.from = f;
            variableFloat.to = f;
            variableFloat.now = f;
            float f2 = i > 0 ? 1.0f : 0.0f;
            VariableFloat variableFloat2 = metadata.totalVisibility;
            variableFloat2.from = f2;
            variableFloat2.to = f2;
            variableFloat2.now = f2;
        }
    }

    public ListAnimator(Callback callback, Interpolator interpolator, long j) {
        this.callback = callback;
        this.metadata = new Metadata(this, callback);
        if (interpolator == null || j <= 0) {
            this.animator = null;
        } else {
            this.animator = new FactorAnimator(0, new Stripe(this, 11), interpolator, j);
        }
    }

    public final void applyAnimation(float f) {
        Metadata metadata = this.metadata;
        boolean z = metadata.metadataCallback.onApplyMetadataAnimation(f) || (metadata.totalVisibility.applyAnimation(f) || (metadata.totalHeight.applyAnimation(f) || (metadata.totalWidth.applyAnimation(f) || (metadata.maxItemHeight.applyAnimation(f) || (metadata.maxItemWidth.applyAnimation(f) || metadata.size.applyAnimation(f))))));
        ArrayList arrayList = this.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Entry entry = (Entry) obj;
            boolean z2 = entry.measuredSpacingStart.applyAnimation(f) || (entry.measuredPositionRect.applyAnimation(f) || (entry.visibility.applyAnimation(f) || entry.position.applyAnimation(f)));
            Object obj2 = entry.item;
            if (obj2 instanceof VariableRect) {
                z2 = ((VariableRect) obj2).applyAnimation(f) || z2;
            }
            z = z2 || z;
        }
        if (z) {
            this.callback.onItemsChanged();
            if (f == 1.0f) {
                removeJunk(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.entries.iterator();
    }

    public final void measureImpl(boolean z) {
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
                arrayList2.size();
                int spacingStart = measurable.getSpacingStart(z2);
                int width = measurable.getWidth();
                int height = measurable.getHeight();
                int i4 = spacingStart + width + i3;
                int i5 = spacingStart + height + i2;
                VariableFloat variableFloat = entry.measuredSpacingStart;
                VariableRect variableRect = entry.measuredPositionRect;
                if (!z || entry.getVisibility() <= 0.0f) {
                    arrayList = arrayList2;
                    size = size;
                    variableRect.set(i3, i2, i4, i5);
                    float f = spacingStart;
                    variableFloat.from = f;
                    variableFloat.to = f;
                    variableFloat.now = f;
                } else {
                    float f2 = i3;
                    float f3 = i2;
                    float f4 = i4;
                    arrayList = arrayList2;
                    float f5 = i5;
                    if (variableRect.differs(f2, f3, f4, f5)) {
                        onBeforeListChanged();
                        variableRect.left.to = f2;
                        variableRect.top.to = f3;
                        variableRect.right.to = f4;
                        variableRect.bottom.to = f5;
                    }
                    float f6 = spacingStart;
                    if (variableFloat.differs(f6)) {
                        onBeforeListChanged();
                        variableFloat.to = f6;
                    }
                }
                iMax = Math.max(iMax, width);
                iMax2 = Math.max(iMax2, height);
                i3 = i4;
                i2 = i5;
                arrayList2 = arrayList;
                size = size;
            }
        }
        ArrayList arrayList3 = this.entries;
        if (z) {
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                Object obj4 = ((Entry) obj3).item;
                if (obj4 instanceof VariableRect) {
                    ((VariableRect) obj4).getClass();
                }
            }
        }
        int size3 = arrayList3.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj5 = arrayList3.get(i7);
            i7++;
            Object obj6 = ((Entry) obj5).item;
            if (obj6 instanceof VariableRect) {
                VariableRect variableRect2 = (VariableRect) obj6;
                if (z) {
                    variableRect2.getClass();
                } else {
                    variableRect2.getClass();
                }
            }
        }
        Metadata metadata = this.metadata;
        if (!z) {
            VariableFloat variableFloat2 = metadata.totalWidth;
            float f7 = i3;
            variableFloat2.from = f7;
            variableFloat2.to = f7;
            variableFloat2.now = f7;
            float f8 = i2;
            VariableFloat variableFloat3 = metadata.totalHeight;
            variableFloat3.from = f8;
            variableFloat3.to = f8;
            variableFloat3.now = f8;
            float f9 = iMax;
            VariableFloat variableFloat4 = metadata.maxItemWidth;
            variableFloat4.from = f9;
            variableFloat4.to = f9;
            variableFloat4.now = f9;
            float f10 = iMax2;
            VariableFloat variableFloat5 = metadata.maxItemHeight;
            variableFloat5.from = f10;
            variableFloat5.to = f10;
            variableFloat5.now = f10;
            metadata.metadataCallback.onForceApplyChanges();
            return;
        }
        float f11 = i3;
        if (metadata.totalWidth.differs(f11)) {
            onBeforeListChanged();
            metadata.totalWidth.to = f11;
        }
        VariableFloat variableFloat6 = metadata.totalHeight;
        float f12 = i2;
        if (variableFloat6.differs(f12)) {
            onBeforeListChanged();
            variableFloat6.to = f12;
        }
        VariableFloat variableFloat7 = metadata.maxItemWidth;
        float f13 = iMax;
        if (variableFloat7.differs(f13)) {
            onBeforeListChanged();
            variableFloat7.to = f13;
        }
        VariableFloat variableFloat8 = metadata.maxItemHeight;
        float f14 = iMax2;
        if (variableFloat8.differs(f14)) {
            onBeforeListChanged();
            variableFloat8.to = f14;
        }
        Callback callback = metadata.metadataCallback;
        if (callback.hasChanges()) {
            onBeforeListChanged();
            callback.onPrepareMetadataAnimation();
        }
    }

    public final void onBeforeListChanged() {
        if (this.foundListChanges) {
            return;
        }
        this.foundListChanges = true;
        FactorAnimator factorAnimator = this.animator;
        if (factorAnimator == null) {
            removeJunk(false);
            return;
        }
        factorAnimator.cancel();
        removeJunk(false);
        factorAnimator.forceFactor(0.0f);
    }

    public final void removeJunk(boolean z) {
        ArrayList arrayList = this.entries;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Entry entry = (Entry) arrayList.get(size);
            entry.position.finishAnimation(z);
            entry.visibility.finishAnimation(z);
            VariableRect variableRect = entry.measuredPositionRect;
            variableRect.left.finishAnimation(z);
            variableRect.top.finishAnimation(z);
            variableRect.right.finishAnimation(z);
            variableRect.bottom.finishAnimation(z);
            entry.measuredSpacingStart.finishAnimation(z);
            Object obj = entry.item;
            if (obj instanceof VariableRect) {
                VariableRect variableRect2 = (VariableRect) obj;
                variableRect2.left.finishAnimation(z);
                variableRect2.top.finishAnimation(z);
                variableRect2.right.finishAnimation(z);
                variableRect2.bottom.finishAnimation(z);
            }
            if (entry.getVisibility() == 0.0f && entry.isBeingRemoved) {
                arrayList.remove(size);
                if (obj instanceof Destroyable) {
                    ((Destroyable) obj).performDestroy();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        Metadata metadata = this.metadata;
        metadata.size.finishAnimation(z);
        metadata.maxItemWidth.finishAnimation(z);
        metadata.maxItemHeight.finishAnimation(z);
        metadata.totalWidth.finishAnimation(z);
        metadata.totalHeight.finishAnimation(z);
        metadata.totalVisibility.finishAnimation(z);
        metadata.metadataCallback.onFinishMetadataAnimation(z);
    }

    public final void reset(List list, boolean z) {
        boolean zIsEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean zRemove;
        ArrayList arrayList = this.entries;
        ArrayList arrayList2 = this.actualList;
        FactorAnimator factorAnimator = this.animator;
        Metadata metadata = this.metadata;
        if (!z) {
            if (factorAnimator != null) {
                factorAnimator.cancel();
                removeJunk(false);
                factorAnimator.forceFactor(0.0f);
            } else {
                removeJunk(false);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = ((Entry) arrayList.get(size)).item;
                if (obj instanceof Destroyable) {
                    ((Destroyable) obj).performDestroy();
                }
            }
            arrayList.clear();
            arrayList2.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                arrayList.ensureCapacity(size2);
                arrayList2.ensureCapacity(size2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Entry entry = new Entry(arrayList2.size(), it.next(), true);
                    arrayList.add(entry);
                    arrayList2.add(entry);
                }
                arrayList.trimToSize();
                arrayList2.trimToSize();
            }
            Metadata.access$1400(metadata, size2, false);
            measureImpl(false);
            this.callback.onItemsChanged();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList2.size() != list.size()) {
                zIsEmpty = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    zIsEmpty = true;
                    break;
                } else {
                    if (!((Entry) arrayList2.get(i2)).equals(list.get(i2))) {
                        zIsEmpty = false;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            zIsEmpty = arrayList2.isEmpty();
        }
        if (zIsEmpty) {
            return;
        }
        onBeforeListChanged();
        if (list == null || list.isEmpty()) {
            if (!this.foundListChanges) {
                int size3 = arrayList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (((Entry) obj2).visibility.differs(0.0f)) {
                        onBeforeListChanged();
                        break;
                    }
                }
            }
            if (this.foundListChanges) {
                int size4 = arrayList.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    Entry entry2 = (Entry) obj3;
                    if (entry2.visibility.differs(0.0f)) {
                        onBeforeListChanged();
                        entry2.visibility.to = 0.0f;
                        entry2.isBeingRemoved = true;
                        int iBinarySearch = Collections.binarySearch(arrayList2, entry2);
                        if (iBinarySearch >= 0) {
                            arrayList2.remove(iBinarySearch);
                        }
                        Metadata.access$1400(metadata, arrayList2.size(), true);
                    }
                }
            }
            z2 = true;
            z3 = false;
        } else {
            boolean z4 = false;
            int i5 = 0;
            z3 = false;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                Entry entry3 = (Entry) arrayList.get(i6);
                int iIndexOf = list.indexOf(entry3.item);
                VariableFloat variableFloat = entry3.visibility;
                if (iIndexOf != -1) {
                    i5++;
                    float f = iIndexOf;
                    VariableFloat variableFloat2 = entry3.position;
                    if (variableFloat2.differs(f)) {
                        onBeforeListChanged();
                        variableFloat2.to = f;
                    }
                    if (entry3.index != iIndexOf) {
                        entry3.index = iIndexOf;
                        z4 = z4 || !entry3.isBeingRemoved;
                        z3 = true;
                    }
                    if (variableFloat.differs(1.0f)) {
                        onBeforeListChanged();
                        variableFloat.to = 1.0f;
                        entry3.isBeingRemoved = false;
                        arrayList2.add(entry3);
                        Metadata.access$1400(metadata, arrayList2.size(), true);
                        z4 = true;
                    }
                } else if (variableFloat.differs(0.0f)) {
                    onBeforeListChanged();
                    variableFloat.to = 0.0f;
                    entry3.isBeingRemoved = true;
                    if (z4) {
                        zRemove = arrayList2.remove(entry3);
                    } else {
                        int iBinarySearch2 = Collections.binarySearch(arrayList2, entry3);
                        if (iBinarySearch2 >= 0) {
                            arrayList2.remove(iBinarySearch2);
                            zRemove = true;
                        } else {
                            zRemove = false;
                        }
                    }
                    if (!zRemove) {
                        throw new IllegalArgumentException();
                    }
                    Metadata.access$1400(metadata, arrayList2.size(), true);
                } else {
                    continue;
                }
            }
            if (z4) {
                Collections.sort(arrayList2);
            }
            if (i5 < list.size()) {
                arrayList.ensureCapacity((list.size() - i5) + arrayList.size());
                int i7 = 0;
                for (Object obj4 : list) {
                    if (obj4 != null) {
                        int size5 = arrayList.size();
                        int i8 = 0;
                        i = 0;
                        while (true) {
                            if (i8 >= size5) {
                                i = -1;
                                break;
                            }
                            Object obj5 = arrayList.get(i8);
                            i8++;
                            if (obj4.equals(((Entry) obj5).item)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        int size6 = arrayList.size();
                        int i9 = 0;
                        i = 0;
                        while (true) {
                            if (i9 >= size6) {
                                i = -1;
                                break;
                            }
                            Object obj6 = arrayList.get(i9);
                            i9++;
                            if (((Entry) obj6).item == null) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (i == -1) {
                        if (i7 != arrayList.size()) {
                            z3 = true;
                        }
                        onBeforeListChanged();
                        Entry entry4 = new Entry(i7, obj4, false);
                        entry4.visibility.to = 1.0f;
                        entry4.isBeingRemoved = false;
                        arrayList.add(entry4);
                        int iBinarySearch3 = Collections.binarySearch(arrayList2, entry4);
                        if (iBinarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList2.add((-iBinarySearch3) - 1, entry4);
                        Metadata.access$1400(metadata, arrayList2.size(), true);
                    }
                    i7++;
                }
            }
            z2 = true;
        }
        if (z3) {
            Collections.sort(arrayList);
        }
        measureImpl(z2);
        if (this.foundListChanges) {
            this.foundListChanges = false;
            if (factorAnimator != null) {
                factorAnimator.animateTo(1.0f);
                return;
            }
            return;
        }
        if (factorAnimator == null) {
            int size7 = arrayList.size();
            int i10 = 0;
            while (i10 < size7) {
                Object obj7 = arrayList.get(i10);
                i10++;
                Entry entry5 = (Entry) obj7;
                VariableFloat variableFloat3 = entry5.visibility;
                variableFloat3.from = variableFloat3.now;
                VariableFloat variableFloat4 = entry5.position;
                variableFloat4.from = variableFloat4.now;
            }
        }
    }
}
