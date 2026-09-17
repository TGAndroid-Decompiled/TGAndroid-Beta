package m4;
public final class d0 implements k0 {
    public final int f14500a;
    public final l0 f14501b;
    public final int f14502c;

    public d0(l0 l0Var, int i10, int i11) {
        this.f14500a = i11;
        this.f14501b = l0Var;
        this.f14502c = i10;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14500a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f14502c;
        l0 l0Var = this.f14501b;
        switch (i10) {
            case 0:
                k1 k1Var = l0Var.f14606g.f14476t;
                int i13 = k.f14597a;
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
                k1Var.j(i11);
                return;
            default:
                k1 k1Var2 = l0Var.f14606g.f14476t;
                int i14 = k.f14597a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.k0.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                k1Var2.x(z10);
                return;
        }
    }
}
