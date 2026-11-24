package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vba implements Runnable {
    public final byte a = 0;
    public final nfa b;
    public final wjb c;
    public final k27 d;
    public final int e;

    public vba(nfa nfaVar, wjb wjbVar, int i, k27 k27Var) {
        this.b = nfaVar;
        this.c = wjbVar;
        this.e = i;
        this.d = k27Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hd[] hdVarArr = {new hd(3, this.c, this.b.getContext())};
                int i = this.e;
                int v0 = z3a.B(i).v0(this.d, null, new wh0(hdVarArr, (byte) 9));
                if (v0 != 0) {
                    gl.d3(new fca(hdVarArr, i, v0, (byte) 0), 500L);
                    return;
                }
                return;
            default:
                nfa nfaVar = this.b;
                Context context = nfaVar.getContext();
                wjb wjbVar = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                hd hdVar = alertDialog$Builder.a;
                hdVar.Q0 = false;
                k27 k27Var = this.d;
                if (k27Var.b4()) {
                    hdVar.S = k96.M0(2131744587, null);
                    hdVar.U = k96.M0(2131744588, null);
                } else {
                    hdVar.S = k96.M0(2131744592, null);
                    hdVar.U = k96.M0(2131744593, null);
                }
                alertDialog$Builder.j(k96.M0(2131744604, null), new zm(nfaVar, wjbVar, k27Var, this.e, (byte) 10));
                ug8.y(null, 2131752577, alertDialog$Builder, null);
                return;
        }
    }

    public vba(nfa nfaVar, wjb wjbVar, k27 k27Var, int i) {
        this.b = nfaVar;
        this.c = wjbVar;
        this.d = k27Var;
        this.e = i;
    }
}
