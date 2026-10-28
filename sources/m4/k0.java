package m4;
public final class k0 implements o0 {
    public final int f18116a;
    public final p0 f18117b;
    public final int f18118c;

    public k0(p0 p0Var, int i10, int i11) {
        this.f18116a = i11;
        this.f18117b = p0Var;
        this.f18118c = i10;
    }

    @Override
    public final void i(w wVar) {
        int i10 = this.f18116a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f18118c;
        p0 p0Var = this.f18117b;
        switch (i10) {
            case 0:
                n1 n1Var = p0Var.f18180g.f18056t;
                int i13 = o.f18170a;
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
                n1Var.j(i11);
                return;
            default:
                n1 n1Var2 = p0Var.f18180g.f18056t;
                int i14 = o.f18170a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(ic.a.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                n1Var2.w(z10);
                return;
        }
    }
}
