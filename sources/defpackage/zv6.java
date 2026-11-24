package defpackage;
public final class zv6 implements kw6 {
    public final byte a;
    public final lw6 b;
    public final int c;

    public zv6(lw6 lw6Var, int i, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = i;
    }

    @Override
    public final void a(su6 su6Var) {
        byte b = this.a;
        int i = 0;
        r0 = false;
        boolean z = false;
        i = 0;
        i = 0;
        int i2 = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                tv6 tv6Var = lw6Var.j;
                tv6Var.t();
                ad8 ad8Var = tv6Var.t;
                int i3 = j06.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            lad.f("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 1;
                    }
                }
                ad8Var.n0(i);
                return;
            default:
                tv6 tv6Var2 = lw6Var.j;
                tv6Var2.t();
                ad8 ad8Var2 = tv6Var2.t;
                int i4 = j06.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        w26.j(de9.k(i2, "Unrecognized ShuffleMode: "));
                        return;
                    }
                    z = true;
                }
                ad8Var2.v(z);
                return;
        }
    }
}
