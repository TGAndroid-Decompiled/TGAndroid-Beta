package defpackage;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class nc4 implements Comparator {
    public final byte a;
    public final LongSparseIntArray b;

    public nc4(LongSparseIntArray longSparseIntArray, byte b) {
        this.a = b;
        this.b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        LongSparseIntArray longSparseIntArray = this.b;
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        switch (b) {
            case 0:
                int i = longSparseIntArray.get(l.longValue());
                int i2 = longSparseIntArray.get(l2.longValue());
                if (i > i2) {
                    return 1;
                }
                if (i >= i2) {
                    return 0;
                }
                return -1;
            case 1:
                int i3 = longSparseIntArray.get(l.longValue());
                int i4 = longSparseIntArray.get(l2.longValue());
                if (i3 > i4) {
                    return 1;
                }
                if (i3 >= i4) {
                    return 0;
                }
                return -1;
            default:
                int i5 = longSparseIntArray.get(l.longValue());
                int i6 = longSparseIntArray.get(l2.longValue());
                if (i5 < i6) {
                    return 1;
                }
                if (i5 <= i6) {
                    return 0;
                }
                return -1;
        }
    }
}
