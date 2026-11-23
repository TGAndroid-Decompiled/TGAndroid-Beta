package org.telegram.messenger;
public final class lo implements gs {
    public final int f25255a;
    public final int f25256b;
    public final int f25257c;
    public final long d;
    public final bp f25258e;
    public final np f25259f;

    public lo(np npVar, int i7, int i10, int i11, long j3, bp bpVar) {
        this.f25259f = npVar;
        this.f25255a = i7;
        this.f25256b = i10;
        this.f25257c = i11;
        this.d = j3;
        this.f25258e = bpVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.I;
        bp bpVar = this.f25258e;
        int i12 = this.f25255a;
        np npVar = this.f25259f;
        int i13 = ls.H;
        if (i7 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f25256b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f25257c;
                if (i15 != 0) {
                    npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25255a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25255a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
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
