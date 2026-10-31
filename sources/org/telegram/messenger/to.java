package org.telegram.messenger;
public final class to implements us {
    public final int f18091a;
    public final int f18092b;
    public final int f18093c;
    public final long d;
    public final jp e;
    public final vp f18094f;

    public to(vp vpVar, int i10, int i11, int i12, long j10, jp jpVar) {
        this.f18094f = vpVar;
        this.f18091a = i10;
        this.f18092b = i11;
        this.f18093c = i12;
        this.d = j10;
        this.e = jpVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.I;
        jp jpVar = this.e;
        int i13 = this.f18091a;
        vp vpVar = this.f18094f;
        int i14 = zs.H;
        if (i10 == i14 && ((Integer) objArr[0]).intValue() == i13) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i15 = this.f18092b;
            if (intValue < i15 / 2 && !booleanValue2 && booleanValue) {
                int i16 = this.f18093c;
                if (i16 != 0) {
                    vpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.f18091a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    vpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.f18091a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            vpVar.getNotificationCenter().n(this, i14);
            vpVar.getNotificationCenter().n(this, i12);
            if (jpVar != null) {
                jpVar.g(booleanValue);
            }
        } else if (i10 == i12 && ((Integer) objArr[0]).intValue() == i13) {
            vpVar.getNotificationCenter().n(this, i14);
            vpVar.getNotificationCenter().n(this, i12);
            if (jpVar != null) {
                jpVar.a();
            }
        }
    }
}
