package defpackage;
public final class ey6 implements py6 {
    public final byte a;
    public final qy6 b;
    public final int c;

    public ey6(qy6 qy6Var, int i, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = i;
    }

    @Override
    public final void a(xw6 xw6Var) {
        byte b = this.a;
        int i = 0;
        r0 = false;
        boolean z = false;
        i = 0;
        i = 0;
        int i2 = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                yx6 yx6Var = qy6Var.j;
                yx6Var.t();
                og8 og8Var = yx6Var.t;
                int i3 = n26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            efd.f("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 1;
                    }
                }
                og8Var.n0(i);
                return;
            default:
                yx6 yx6Var2 = qy6Var.j;
                yx6Var2.t();
                og8 og8Var2 = yx6Var2.t;
                int i4 = n26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        lq5.j(uh9.k(i2, "Unrecognized ShuffleMode: "));
                        return;
                    }
                    z = true;
                }
                og8Var2.v(z);
                return;
        }
    }
}
