package org.telegram.messenger;
public final class lo implements gs {
    public final int f25219a;
    public final int f25220b;
    public final int f25221c;
    public final long d;
    public final bp f25222e;
    public final np f25223f;

    public lo(np npVar, int i7, int i10, int i11, long j3, bp bpVar) {
        this.f25223f = npVar;
        this.f25219a = i7;
        this.f25220b = i10;
        this.f25221c = i11;
        this.d = j3;
        this.f25222e = bpVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.I;
        bp bpVar = this.f25222e;
        int i12 = this.f25219a;
        np npVar = this.f25223f;
        int i13 = ls.H;
        if (i7 == i13 && ((Integer) objArr[0]).intValue() == i12) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i14 = this.f25220b;
            if (intValue < i14 / 2 && !booleanValue2 && booleanValue) {
                int i15 = this.f25221c;
                if (i15 != 0) {
                    npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25219a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.f25219a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
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
