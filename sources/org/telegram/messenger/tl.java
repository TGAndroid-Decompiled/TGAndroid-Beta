package org.telegram.messenger;

import android.util.SparseArray;
public final class tl implements Runnable {
    public final int f25561a;
    public final hp f25562b;
    public final SparseArray f25563c;

    public tl(hp hpVar, SparseArray sparseArray, int i3) {
        this.f25561a = i3;
        this.f25562b = hpVar;
        this.f25563c = sparseArray;
    }

    @Override
    public final void run() {
        int i3 = this.f25561a;
        SparseArray sparseArray = this.f25563c;
        hp hpVar = this.f25562b;
        char c2 = 2;
        switch (i3) {
            case 0:
                int i10 = 0;
                while (i10 < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i10);
                    long[] jArr = (long[]) sparseArray.valueAt(i10);
                    hpVar.getSendMessagesHelper().d0((int) jArr[1]);
                    hs notificationCenter = hpVar.getNotificationCenter();
                    Integer valueOf = Integer.valueOf((int) jArr[1]);
                    Integer valueOf2 = Integer.valueOf(keyAt);
                    Long valueOf3 = Long.valueOf(jArr[0]);
                    Boolean bool = Boolean.FALSE;
                    char c10 = c2;
                    Object[] objArr = new Object[7];
                    objArr[0] = valueOf;
                    objArr[1] = valueOf2;
                    objArr[c10] = null;
                    objArr[3] = valueOf3;
                    objArr[4] = 0L;
                    objArr[5] = -1;
                    objArr[6] = bool;
                    notificationCenter.k(21, objArr);
                    hs notificationCenter2 = hpVar.getNotificationCenter();
                    Integer valueOf4 = Integer.valueOf((int) jArr[1]);
                    Integer valueOf5 = Integer.valueOf(keyAt);
                    Long valueOf6 = Long.valueOf(jArr[0]);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf4;
                    objArr2[1] = valueOf5;
                    objArr2[c10] = null;
                    objArr2[3] = valueOf6;
                    objArr2[4] = 0L;
                    objArr2[5] = -1;
                    objArr2[6] = bool;
                    notificationCenter2.k(22, objArr2);
                    i10++;
                    c2 = c10;
                }
                return;
            default:
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt2 = sparseArray.keyAt(i11);
                    long[] jArr2 = (long[]) sparseArray.valueAt(i11);
                    hpVar.getSendMessagesHelper().d0((int) jArr2[1]);
                    hs notificationCenter3 = hpVar.getNotificationCenter();
                    Integer valueOf7 = Integer.valueOf((int) jArr2[1]);
                    Integer valueOf8 = Integer.valueOf(keyAt2);
                    Long valueOf9 = Long.valueOf(jArr2[0]);
                    Boolean bool2 = Boolean.FALSE;
                    notificationCenter3.k(21, valueOf7, valueOf8, null, valueOf9, 0L, -1, bool2);
                    hpVar.getNotificationCenter().k(22, Integer.valueOf((int) jArr2[1]), Integer.valueOf(keyAt2), null, Long.valueOf(jArr2[0]), 0L, -1, bool2);
                }
                return;
        }
    }
}
