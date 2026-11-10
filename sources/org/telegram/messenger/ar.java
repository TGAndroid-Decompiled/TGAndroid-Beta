package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ar implements Comparator {
    public final int f21511a;
    public final LongSparseIntArray f21512b;

    public ar(LongSparseIntArray longSparseIntArray, int i7) {
        this.f21511a = i7;
        this.f21512b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f21511a) {
            case 0:
                long longValue = l10.longValue();
                LongSparseIntArray longSparseIntArray = this.f21512b;
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
                LongSparseIntArray longSparseIntArray2 = this.f21512b;
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
