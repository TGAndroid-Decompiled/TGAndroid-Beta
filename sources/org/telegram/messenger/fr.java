package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fr implements Comparator {
    public final int f15618a;
    public final LongSparseIntArray f15619b;

    public fr(LongSparseIntArray longSparseIntArray, int i10) {
        this.f15618a = i10;
        this.f15619b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.f15618a) {
            case 0:
                long longValue = l4.longValue();
                LongSparseIntArray longSparseIntArray = this.f15619b;
                int i10 = longSparseIntArray.get(longValue);
                int i11 = longSparseIntArray.get(l10.longValue());
                if (i10 > i11) {
                    return 1;
                }
                if (i10 < i11) {
                    return -1;
                }
                return 0;
            default:
                long longValue2 = l4.longValue();
                LongSparseIntArray longSparseIntArray2 = this.f15619b;
                int i12 = longSparseIntArray2.get(longValue2);
                int i13 = longSparseIntArray2.get(l10.longValue());
                if (i12 < i13) {
                    return 1;
                }
                if (i12 > i13) {
                    return -1;
                }
                return 0;
        }
    }
}
