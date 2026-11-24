package defpackage;

import android.widget.FrameLayout;
public final class d7 extends wi2 {
    public final byte h;
    public final Object i;

    public d7(h14 h14Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = h14Var;
        this.f = gl.L(7.0f);
    }

    @Override
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((r7) obj).c.b.s0;
            case 1:
                return bkb.v0(bkb.Af, (wjb) obj);
            case 2:
                return bkb.v0(bkb.Af, ((h14) obj).H.a2);
            case 3:
                return bkb.v0(bkb.P5, ((js9) obj).e);
            default:
                return bkb.v0(bkb.Af, ((lw9) obj).G.a1);
        }
    }

    public d7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    public d7(wjb wjbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = wjbVar;
        this.f = gl.L(7.0f);
    }

    public d7(lw9 lw9Var) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = lw9Var;
        this.f = gl.L(7.0f);
    }
}
