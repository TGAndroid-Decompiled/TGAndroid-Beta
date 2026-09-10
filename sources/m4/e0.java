package m4;
public final class e0 implements k0 {
    public final int f13333a;
    public final l0 f13334b;
    public final int f13335c;

    public e0(l0 l0Var, int i10, int i11) {
        this.f13333a = i11;
        this.f13334b = l0Var;
        this.f13335c = i10;
    }

    @Override
    public final void h(r rVar) {
        int i10 = this.f13333a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f13335c;
        l0 l0Var = this.f13334b;
        switch (i10) {
            case 0:
                l1 l1Var = l0Var.f13430g.f13307t;
                int i13 = k.f13417a;
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
                l1Var.j(i11);
                return;
            default:
                l1 l1Var2 = l0Var.f13430g.f13307t;
                int i14 = k.f13417a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hc.b.j(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                l1Var2.x(z10);
                return;
        }
    }
}
