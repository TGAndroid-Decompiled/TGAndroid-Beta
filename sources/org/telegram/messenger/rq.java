package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class rq implements Comparator {
    public final int f25199a;
    public final LongSparseIntArray f25200b;

    public rq(LongSparseIntArray longSparseIntArray, int i3) {
        this.f25199a = i3;
        this.f25200b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f25199a) {
            case 0:
                long longValue = l10.longValue();
                LongSparseIntArray longSparseIntArray = this.f25200b;
                int i3 = longSparseIntArray.get(longValue);
                int i10 = longSparseIntArray.get(l11.longValue());
                if (i3 > i10) {
                    return 1;
                }
                if (i3 < i10) {
                    return -1;
                }
                return 0;
            default:
                long longValue2 = l10.longValue();
                LongSparseIntArray longSparseIntArray2 = this.f25200b;
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
