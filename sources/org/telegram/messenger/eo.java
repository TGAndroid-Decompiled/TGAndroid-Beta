package org.telegram.messenger;
public final class eo implements cs {
    public final int f22377a;
    public final int f22378b;
    public final int f22379c;
    public final long d;
    public final vo f22380e;
    public final hp f22381f;

    public eo(hp hpVar, int i3, int i10, int i11, long j10, vo voVar) {
        this.f22381f = hpVar;
        this.f22377a = i3;
        this.f22378b = i10;
        this.f22379c = i11;
        this.d = j10;
        this.f22380e = voVar;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.I;
        vo voVar = this.f22380e;
        int i12 = this.f22377a;
        hp hpVar = this.f22381f;
        int i13 = hs.H;
        if (i3 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f22378b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f22379c;
                if (i15 != 0) {
                    hpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f22377a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    hpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f22377a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            hpVar.getNotificationCenter().n(this, i13);
            hpVar.getNotificationCenter().n(this, i11);
            if (voVar != null) {
                voVar.j(booleanValue);
            }
        } else if (i3 == i11 && ((Integer) objArr[0]).intValue() == i12) {
            hpVar.getNotificationCenter().n(this, i13);
            hpVar.getNotificationCenter().n(this, i11);
            if (voVar != null) {
                voVar.a();
            }
        }
    }
}
