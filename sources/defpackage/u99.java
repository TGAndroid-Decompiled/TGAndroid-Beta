package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class u99 implements Runnable {
    public final byte a;
    public final d b;
    public final Context c;
    public final ylb d;
    public final il9 e;

    public u99(d dVar, Context context, ylb ylbVar, il9 il9Var, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = context;
        this.d = ylbVar;
        this.e = il9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        il9 il9Var = this.e;
        ylb ylbVar = this.d;
        Context context = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 11), ylbVar)).j();
                gm.c3(il9Var);
                return;
            case 1:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 10), ylbVar)).j();
                gm.c3(il9Var);
                return;
            default:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 14), ylbVar)).j();
                gm.c3(il9Var);
                return;
        }
    }
}
