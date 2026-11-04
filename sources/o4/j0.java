package o4;
public final class j0 implements n0 {
    public final int f20702a;
    public final o0 f20703b;
    public final int f20704c;

    public j0(o0 o0Var, int i3, int i10) {
        this.f20702a = i10;
        this.f20703b = o0Var;
        this.f20704c = i3;
    }

    @Override
    public final void c(v vVar) {
        int i3 = this.f20702a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f20704c;
        o0 o0Var = this.f20703b;
        switch (i3) {
            case 0:
                l1 l1Var = o0Var.h.f20636t;
                int i12 = n.f20759a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            g2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 1;
                    }
                }
                l1Var.k(i10);
                return;
            default:
                l1 l1Var2 = o0Var.h.f20636t;
                int i13 = n.f20759a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(k2.p1.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                l1Var2.x(z10);
                return;
        }
    }
}
