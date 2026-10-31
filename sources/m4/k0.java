package m4;
public final class k0 implements o0 {
    public final int f12814a;
    public final p0 f12815b;
    public final int f12816c;

    public k0(p0 p0Var, int i10, int i11) {
        this.f12814a = i11;
        this.f12815b = p0Var;
        this.f12816c = i10;
    }

    @Override
    public final void b(w wVar) {
        int i10 = this.f12814a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f12816c;
        p0 p0Var = this.f12815b;
        switch (i10) {
            case 0:
                n1 n1Var = p0Var.h.f12754t;
                int i13 = o.f12868a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            e2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 1;
                    }
                }
                n1Var.k(i11);
                return;
            default:
                n1 n1Var2 = p0Var.h.f12754t;
                int i14 = o.f12868a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(i0.a.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                n1Var2.w(z10);
                return;
        }
    }
}
