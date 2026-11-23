package org.telegram.messenger;
public final class ko implements fs {
    public final int f25160a;
    public final int f25161b;
    public final int f25162c;
    public final long d;
    public final ap f25163e;
    public final mp f25164f;

    public ko(mp mpVar, int i7, int i10, int i11, long j3, ap apVar) {
        this.f25164f = mpVar;
        this.f25160a = i7;
        this.f25161b = i10;
        this.f25162c = i11;
        this.d = j3;
        this.f25163e = apVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I;
        ap apVar = this.f25163e;
        int i12 = this.f25160a;
        mp mpVar = this.f25164f;
        int i13 = ks.H;
        if (i7 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f25161b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f25162c;
                if (i15 != 0) {
                    mpVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25160a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    mpVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25160a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            mpVar.getNotificationCenter().n(this, i13);
            mpVar.getNotificationCenter().n(this, i11);
            if (apVar != null) {
                apVar.e(booleanValue);
            }
        } else if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
            mpVar.getNotificationCenter().n(this, i13);
            mpVar.getNotificationCenter().n(this, i11);
            if (apVar != null) {
                apVar.a();
            }
        }
    }
}
