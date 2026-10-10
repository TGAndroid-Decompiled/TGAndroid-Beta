package m4;
public final class e0 implements k0 {
    public final int f16060a;
    public final l0 f16061b;
    public final int f16062c;

    public e0(l0 l0Var, int i10, int i11) {
        this.f16060a = i11;
        this.f16061b = l0Var;
        this.f16062c = i10;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16060a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f16062c;
        l0 l0Var = this.f16061b;
        switch (i10) {
            case 0:
                f1 f1Var = l0Var.f16160g.f16001t;
                int i13 = k.f16132a;
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
                f1Var.j(i11);
                return;
            default:
                f1 f1Var2 = l0Var.f16160g.f16001t;
                int i14 = k.f16132a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                f1Var2.x(z10);
                return;
        }
    }
}
