package defpackage;

import android.content.Context;
public final class w79 implements x79 {
    public final en1 a;
    public final u21 b;
    public final Context c;
    public final e53 d;
    public final dac e;

    public w79(en1 en1Var, u21 u21Var, Context context, e53 e53Var, dac dacVar) {
        this.a = en1Var;
        this.b = u21Var;
        this.c = context;
        this.d = e53Var;
        this.e = dacVar;
    }

    @Override
    public final void d() {
        gl.e3(new u79(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override
    public final void g() {
        gl.e3(new lw8(this.a, this.b, (byte) 13), 200L);
    }

    @Override
    public final void j() {
        this.e.run();
    }
}
