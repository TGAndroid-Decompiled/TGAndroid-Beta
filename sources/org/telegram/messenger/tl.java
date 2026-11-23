package org.telegram.messenger;

import android.util.SparseArray;
public final class tl implements Runnable {
    public final int f27015a;
    public final np f27016b;
    public final SparseArray f27017c;

    public tl(np npVar, SparseArray sparseArray, int i7) {
        this.f27015a = i7;
        this.f27016b = npVar;
        this.f27017c = sparseArray;
    }

    @Override
    public final void run() {
        int i7 = this.f27015a;
        SparseArray sparseArray = this.f27017c;
        np npVar = this.f27016b;
        char c10 = 2;
        switch (i7) {
            case 0:
                int i10 = 0;
                while (i10 < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i10);
                    long[] jArr = (long[]) sparseArray.valueAt(i10);
                    npVar.getSendMessagesHelper().d0((int) jArr[1]);
                    ls notificationCenter = npVar.getNotificationCenter();
                    Integer valueOf = Integer.valueOf((int) jArr[1]);
                    Integer valueOf2 = Integer.valueOf(keyAt);
                    Long valueOf3 = Long.valueOf(jArr[0]);
                    Boolean bool = Boolean.FALSE;
                    char c11 = c10;
                    Object[] objArr = new Object[7];
                    objArr[0] = valueOf;
                    objArr[1] = valueOf2;
                    objArr[c11] = null;
                    objArr[3] = valueOf3;
                    objArr[4] = 0L;
                    objArr[5] = -1;
                    objArr[6] = bool;
                    notificationCenter.k(21, objArr);
                    ls notificationCenter2 = npVar.getNotificationCenter();
                    Integer valueOf4 = Integer.valueOf((int) jArr[1]);
                    Integer valueOf5 = Integer.valueOf(keyAt);
                    Long valueOf6 = Long.valueOf(jArr[0]);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf4;
                    objArr2[1] = valueOf5;
                    objArr2[c11] = null;
                    objArr2[3] = valueOf6;
                    objArr2[4] = 0L;
                    objArr2[5] = -1;
                    objArr2[6] = bool;
                    notificationCenter2.k(22, objArr2);
                    i10++;
                    c10 = c11;
                }
                return;
            default:
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt2 = sparseArray.keyAt(i11);
                    long[] jArr2 = (long[]) sparseArray.valueAt(i11);
                    npVar.getSendMessagesHelper().d0((int) jArr2[1]);
                    ls notificationCenter3 = npVar.getNotificationCenter();
                    Integer valueOf7 = Integer.valueOf((int) jArr2[1]);
                    Integer valueOf8 = Integer.valueOf(keyAt2);
                    Long valueOf9 = Long.valueOf(jArr2[0]);
                    Boolean bool2 = Boolean.FALSE;
                    notificationCenter3.k(21, valueOf7, valueOf8, null, valueOf9, 0L, -1, bool2);
                    npVar.getNotificationCenter().k(22, Integer.valueOf((int) jArr2[1]), Integer.valueOf(keyAt2), null, Long.valueOf(jArr2[0]), 0L, -1, bool2);
                }
                return;
        }
    }
}
