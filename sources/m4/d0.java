package m4;
public final class d0 implements k0 {
    public final int f14475a;
    public final l0 f14476b;
    public final int f14477c;

    public d0(l0 l0Var, int i10, int i11) {
        this.f14475a = i11;
        this.f14476b = l0Var;
        this.f14477c = i10;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14475a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f14477c;
        l0 l0Var = this.f14476b;
        switch (i10) {
            case 0:
                f1 f1Var = l0Var.f14607g.f14454t;
                int i13 = k.f14581a;
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
                f1 f1Var2 = l0Var.f14607g.f14454t;
                int i14 = k.f14581a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.c.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                f1Var2.x(z10);
                return;
        }
    }
}
