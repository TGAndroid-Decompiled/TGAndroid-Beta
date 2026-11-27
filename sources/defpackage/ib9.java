package defpackage;

import android.content.Context;
public final class ib9 implements jb9 {
    public final vn1 a;
    public final d31 b;
    public final Context c;
    public final w53 d;
    public final dec e;

    public ib9(vn1 vn1Var, d31 d31Var, Context context, w53 w53Var, dec decVar) {
        this.a = vn1Var;
        this.b = d31Var;
        this.c = context;
        this.d = w53Var;
        this.e = decVar;
    }

    @Override
    public final void d() {
        hl.d3(new gb9(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override
    public final void f() {
        hl.d3(new yz8(this.a, this.b, (byte) 12), 200L);
    }

    @Override
    public final void i() {
        this.e.run();
    }
}
