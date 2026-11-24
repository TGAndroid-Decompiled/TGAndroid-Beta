package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class wva implements Runnable {
    public final byte a;
    public final my0[] b;
    public final Context c;

    public wva(Context context, my0[] my0VarArr) {
        this.a = (byte) 0;
        this.c = context;
        this.b = my0VarArr;
    }

    @Override
    public final void run() {
        my0 my0Var;
        d dVar;
        byte b = this.a;
        Context context = this.c;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                apa apaVar = new apa(context);
                if (!gm.O1() && !gm.s1(my0VarArr[0].i1) && (my0Var = my0VarArr[0]) != null && (dVar = my0Var.i1) != null) {
                    apaVar.X(dVar);
                }
                apaVar.show();
                return;
            case 1:
                my0VarArr[0].dismiss();
                l11.u(context, jb6.M0(2131751972, null));
                return;
            case 2:
                my0VarArr[0].dismiss();
                l11.w(context, jb6.M0(2131751967, null), false);
                return;
            default:
                my0VarArr[0].dismiss();
                l11.u(context, jb6.M0(2131751964, null));
                return;
        }
    }

    public wva(my0[] my0VarArr, Context context, byte b) {
        this.a = b;
        this.b = my0VarArr;
        this.c = context;
    }
}
