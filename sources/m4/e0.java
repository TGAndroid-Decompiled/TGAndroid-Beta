package m4;
public final class e0 implements k0 {
    public final int f16047a;
    public final l0 f16048b;
    public final int f16049c;

    public e0(l0 l0Var, int i10, int i11) {
        this.f16047a = i11;
        this.f16048b = l0Var;
        this.f16049c = i10;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16047a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f16049c;
        l0 l0Var = this.f16048b;
        switch (i10) {
            case 0:
                g1 g1Var = l0Var.f16162g.f16022t;
                int i13 = k.f16148a;
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
                g1Var.j(i11);
                return;
            default:
                g1 g1Var2 = l0Var.f16162g.f16022t;
                int i14 = k.f16148a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                g1Var2.x(z10);
                return;
        }
    }
}
