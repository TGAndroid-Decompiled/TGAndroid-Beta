package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class mq implements Comparator {
    public final int f25828a;
    public final LongSparseIntArray f25829b;

    public mq(LongSparseIntArray longSparseIntArray, int i7) {
        this.f25828a = i7;
        this.f25829b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f25828a) {
            case 0:
                long longValue = l10.longValue();
                LongSparseIntArray longSparseIntArray = this.f25829b;
                int i7 = longSparseIntArray.get(longValue);
                int i10 = longSparseIntArray.get(l11.longValue());
                if (i7 > i10) {
                    return 1;
                }
                if (i7 < i10) {
                    return -1;
                }
                return 0;
            default:
                long longValue2 = l10.longValue();
                LongSparseIntArray longSparseIntArray2 = this.f25829b;
                int i11 = longSparseIntArray2.get(longValue2);
                int i12 = longSparseIntArray2.get(l11.longValue());
                if (i11 < i12) {
                    return 1;
                }
                if (i11 > i12) {
                    return -1;
                }
                return 0;
        }
    }
}
