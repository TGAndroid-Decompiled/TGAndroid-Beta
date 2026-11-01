package org.telegram.messenger;
public final class uo implements vs {
    public final int f18460a;
    public final int f18461b;
    public final int f18462c;
    public final long d;
    public final kp e;
    public final wp f18463f;

    public uo(wp wpVar, int i10, int i11, int i12, long j10, kp kpVar) {
        this.f18463f = wpVar;
        this.f18460a = i10;
        this.f18461b = i11;
        this.f18462c = i12;
        this.d = j10;
        this.e = kpVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.I;
        kp kpVar = this.e;
        int i13 = this.f18460a;
        wp wpVar = this.f18463f;
        int i14 = at.H;
        if (i10 == i14 && ((Integer) objArr[0]).intValue() == i13) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i15 = this.f18461b;
            if (intValue < i15 / 2 && !booleanValue2 && booleanValue) {
                int i16 = this.f18462c;
                if (i16 != 0) {
                    wpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.f18460a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    wpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.f18460a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            wpVar.getNotificationCenter().n(this, i14);
            wpVar.getNotificationCenter().n(this, i12);
            if (kpVar != null) {
                kpVar.g(booleanValue);
            }
        } else if (i10 == i12 && ((Integer) objArr[0]).intValue() == i13) {
            wpVar.getNotificationCenter().n(this, i14);
            wpVar.getNotificationCenter().n(this, i12);
            if (kpVar != null) {
                kpVar.a();
            }
        }
    }
}
