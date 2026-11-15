package org.telegram.messenger;
public final class lo implements is {
    public final int f24854a;
    public final int f24855b;
    public final int f24856c;
    public final long d;
    public final bp f24857e;
    public final np f24858f;

    public lo(np npVar, int i7, int i10, int i11, long j3, bp bpVar) {
        this.f24858f = npVar;
        this.f24854a = i7;
        this.f24855b = i10;
        this.f24856c = i11;
        this.d = j3;
        this.f24857e = bpVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.I;
        bp bpVar = this.f24857e;
        int i12 = this.f24854a;
        np npVar = this.f24858f;
        int i13 = ns.H;
        if (i7 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f24855b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f24856c;
                if (i15 != 0) {
                    npVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f24854a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    npVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.f24854a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            npVar.getNotificationCenter().n(this, i13);
            npVar.getNotificationCenter().n(this, i11);
            if (bpVar != null) {
                bpVar.f(booleanValue);
            }
        } else if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
            npVar.getNotificationCenter().n(this, i13);
            npVar.getNotificationCenter().n(this, i11);
            if (bpVar != null) {
                bpVar.a();
            }
        }
    }
}
