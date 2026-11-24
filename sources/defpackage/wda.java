package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wda implements Runnable {
    public final byte a = 0;
    public final nha b;
    public final ylb c;
    public final k47 d;
    public final int e;

    public wda(nha nhaVar, ylb ylbVar, int i, k47 k47Var) {
        this.b = nhaVar;
        this.c = ylbVar;
        this.e = i;
        this.d = k47Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                he[] heVarArr = {new he(3, this.c, this.b.getContext())};
                int i = this.e;
                int v0 = a6a.B(i).v0(this.d, null, new wi0(heVarArr, (byte) 9));
                if (v0 != 0) {
                    gm.d3(new gea(heVarArr, i, v0, (byte) 0), 500L);
                    return;
                }
                return;
            default:
                nha nhaVar = this.b;
                Context context = nhaVar.getContext();
                ylb ylbVar = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                he heVar = alertDialog$Builder.a;
                heVar.Q0 = false;
                k47 k47Var = this.d;
                if (k47Var.b4()) {
                    heVar.S = jb6.M0(2131744513, null);
                    heVar.U = jb6.M0(2131744514, null);
                } else {
                    heVar.S = jb6.M0(2131744518, null);
                    heVar.U = jb6.M0(2131744519, null);
                }
                alertDialog$Builder.j(jb6.M0(2131744530, null), new zn(nhaVar, ylbVar, k47Var, this.e, (byte) 10));
                wi8.y(null, 2131752542, alertDialog$Builder, null);
                return;
        }
    }

    public wda(nha nhaVar, ylb ylbVar, k47 k47Var, int i) {
        this.b = nhaVar;
        this.c = ylbVar;
        this.d = k47Var;
        this.e = i;
    }
}
