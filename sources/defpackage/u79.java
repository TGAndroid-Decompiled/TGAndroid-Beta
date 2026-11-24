package defpackage;

import android.content.Context;
public final class u79 implements Runnable {
    public final byte a;
    public final en1 b;
    public final u21 c;
    public final Context d;
    public final e53 e;

    public u79(en1 en1Var, u21 u21Var, Context context, e53 e53Var, byte b) {
        this.a = b;
        this.b = en1Var;
        this.c = u21Var;
        this.d = context;
        this.e = e53Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e53 e53Var = this.e;
        Context context = this.d;
        u21 u21Var = this.c;
        en1 en1Var = this.b;
        switch (b) {
            case 0:
                en1Var.run();
                u21Var.c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 9), e53Var)).j();
                return;
            case 1:
                en1Var.run();
                u21Var.c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 12), e53Var)).j();
                return;
            default:
                en1Var.run();
                u21Var.c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 13), e53Var)).j();
                return;
        }
    }
}
