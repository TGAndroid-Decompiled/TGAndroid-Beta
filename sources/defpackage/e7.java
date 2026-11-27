package defpackage;

import android.widget.FrameLayout;
public final class e7 extends sj2 {
    public final byte h;
    public final Object i;

    public e7(c24 c24Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = c24Var;
        this.f = hl.L(7.0f);
    }

    @Override
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((s7) obj).c.b.s0;
            case 1:
                return aob.v0(aob.Bf, (vnb) obj);
            case 2:
                return aob.v0(aob.Bf, ((c24) obj).H.a2);
            case 3:
                return aob.v0(aob.Q5, ((cw9) obj).e);
            default:
                return aob.v0(aob.Bf, ((e0a) obj).G.a1);
        }
    }

    public e7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    public e7(vnb vnbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = vnbVar;
        this.f = hl.L(7.0f);
    }

    public e7(e0a e0aVar) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = e0aVar;
        this.f = hl.L(7.0f);
    }
}
