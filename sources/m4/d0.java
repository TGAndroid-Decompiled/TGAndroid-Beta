package m4;
public final class d0 implements j0 {
    public final int f14708a;
    public final k0 f14709b;
    public final int f14710c;

    public d0(k0 k0Var, int i10, int i11) {
        this.f14708a = i11;
        this.f14709b = k0Var;
        this.f14710c = i10;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f14708a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f14710c;
        k0 k0Var = this.f14709b;
        switch (i10) {
            case 0:
                j1 j1Var = k0Var.f14806g.f14687t;
                int i13 = k.f14803a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            e2.a.n("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 1;
                    }
                }
                j1Var.j(i11);
                return;
            default:
                j1 j1Var2 = k0Var.f14806g.f14687t;
                int i14 = k.f14803a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.k0.h(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                j1Var2.x(z10);
                return;
        }
    }
}
