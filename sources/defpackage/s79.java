package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class s79 implements Runnable {
    public final byte a;
    public final d b;
    public final Context c;
    public final wjb d;
    public final tj9 e;

    public s79(d dVar, Context context, wjb wjbVar, tj9 tj9Var, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = context;
        this.d = wjbVar;
        this.e = tj9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tj9 tj9Var = this.e;
        wjb wjbVar = this.d;
        Context context = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                u21.b0(dVar).c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 11), wjbVar)).j();
                gl.d3(tj9Var);
                return;
            case 1:
                u21.b0(dVar).c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 10), wjbVar)).j();
                gl.d3(tj9Var);
                return;
            default:
                u21.b0(dVar).c(gl.O2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 14), wjbVar)).j();
                gl.d3(tj9Var);
                return;
        }
    }
}
