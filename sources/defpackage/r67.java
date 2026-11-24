package defpackage;

import android.util.SparseArray;
public final class r67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final SparseArray c;

    public r67(na7 na7Var, SparseArray sparseArray, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = sparseArray;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SparseArray sparseArray = this.c;
        na7 na7Var = this.b;
        char c = 2;
        switch (b) {
            case 0:
                int i = 0;
                while (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    long[] jArr = (long[]) sparseArray.valueAt(i);
                    na7Var.getSendMessagesHelper().c0((int) jArr[1]);
                    kk7 notificationCenter = na7Var.getNotificationCenter();
                    Integer valueOf = Integer.valueOf((int) jArr[1]);
                    Integer valueOf2 = Integer.valueOf(keyAt);
                    Long valueOf3 = Long.valueOf(jArr[0]);
                    Boolean bool = Boolean.FALSE;
                    char c2 = c;
                    Object[] objArr = new Object[7];
                    objArr[0] = valueOf;
                    objArr[1] = valueOf2;
                    objArr[c2] = null;
                    objArr[3] = valueOf3;
                    objArr[4] = 0L;
                    objArr[5] = -1;
                    objArr[6] = bool;
                    notificationCenter.k(21, objArr);
                    kk7 notificationCenter2 = na7Var.getNotificationCenter();
                    Integer valueOf4 = Integer.valueOf((int) jArr[1]);
                    Integer valueOf5 = Integer.valueOf(keyAt);
                    Long valueOf6 = Long.valueOf(jArr[0]);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf4;
                    objArr2[1] = valueOf5;
                    objArr2[c2] = null;
                    objArr2[3] = valueOf6;
                    objArr2[4] = 0L;
                    objArr2[5] = -1;
                    objArr2[6] = bool;
                    notificationCenter2.k(22, objArr2);
                    i++;
                    c = c2;
                }
                return;
            default:
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    long[] jArr2 = (long[]) sparseArray.valueAt(i2);
                    na7Var.getSendMessagesHelper().c0((int) jArr2[1]);
                    kk7 notificationCenter3 = na7Var.getNotificationCenter();
                    Integer valueOf7 = Integer.valueOf((int) jArr2[1]);
                    Integer valueOf8 = Integer.valueOf(keyAt2);
                    Long valueOf9 = Long.valueOf(jArr2[0]);
                    Boolean bool2 = Boolean.FALSE;
                    notificationCenter3.k(21, valueOf7, valueOf8, null, valueOf9, 0L, -1, bool2);
                    na7Var.getNotificationCenter().k(22, Integer.valueOf((int) jArr2[1]), Integer.valueOf(keyAt2), null, Long.valueOf(jArr2[0]), 0L, -1, bool2);
                }
                return;
        }
    }
}
