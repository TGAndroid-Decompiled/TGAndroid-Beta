package defpackage;
public final class zx6 implements ky6 {
    public final byte a;
    public final ly6 b;
    public final int c;

    public zx6(ly6 ly6Var, int i, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = i;
    }

    @Override
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        int i = 0;
        r0 = false;
        boolean z = false;
        i = 0;
        i = 0;
        int i2 = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                cf8 cf8Var = tx6Var.t;
                int i3 = j26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            ncd.f("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 1;
                    }
                }
                cf8Var.n0(i);
                return;
            default:
                tx6 tx6Var2 = ly6Var.j;
                tx6Var2.t();
                cf8 cf8Var2 = tx6Var2.t;
                int i4 = j26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        u36.j(hg9.j(i2, "Unrecognized ShuffleMode: "));
                        return;
                    }
                    z = true;
                }
                cf8Var2.v(z);
                return;
        }
    }
}
