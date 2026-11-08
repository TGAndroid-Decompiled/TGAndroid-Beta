package org.telegram.messenger;
public final class oo implements ls {
    public final int f24363a;
    public final int f24364b;
    public final int f24365c;
    public final long d;
    public final ep f24366e;
    public final qp f24367f;

    public oo(qp qpVar, int i7, int i10, int i11, long j3, ep epVar) {
        this.f24367f = qpVar;
        this.f24363a = i7;
        this.f24364b = i10;
        this.f24365c = i11;
        this.d = j3;
        this.f24366e = epVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.I;
        ep epVar = this.f24366e;
        int i12 = this.f24363a;
        qp qpVar = this.f24367f;
        int i13 = qs.H;
        if (i7 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f24364b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f24365c;
                if (i15 != 0) {
                    qpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f24363a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    qpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f24363a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            qpVar.getNotificationCenter().n(this, i13);
            qpVar.getNotificationCenter().n(this, i11);
            if (epVar != null) {
                epVar.f(booleanValue);
            }
        } else if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
            qpVar.getNotificationCenter().n(this, i13);
            qpVar.getNotificationCenter().n(this, i11);
            if (epVar != null) {
                epVar.a();
            }
        }
    }
}
