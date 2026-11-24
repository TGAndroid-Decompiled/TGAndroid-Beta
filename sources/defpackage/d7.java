package defpackage;

import android.widget.FrameLayout;
public final class d7 extends kk2 {
    public final byte h;
    public final Object i;

    public d7(s24 s24Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = s24Var;
        this.f = gm.L(7.0f);
    }

    @Override
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((r7) obj).c.b.s0;
            case 1:
                return cmb.v0(cmb.Af, (ylb) obj);
            case 2:
                return cmb.v0(cmb.Af, ((s24) obj).H.a2);
            case 3:
                return cmb.v0(cmb.P5, ((lu9) obj).e);
            default:
                return cmb.v0(cmb.Af, ((ny9) obj).G.a1);
        }
    }

    public d7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    public d7(ylb ylbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = ylbVar;
        this.f = gm.L(7.0f);
    }

    public d7(ny9 ny9Var) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = ny9Var;
        this.f = gm.L(7.0f);
    }
}
