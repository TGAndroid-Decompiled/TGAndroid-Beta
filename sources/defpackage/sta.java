package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
public final class sta implements Runnable {
    public final byte a;
    public final fx0[] b;
    public final Context c;

    public sta(Context context, fx0[] fx0VarArr) {
        this.a = (byte) 0;
        this.c = context;
        this.b = fx0VarArr;
    }

    @Override
    public final void run() {
        fx0 fx0Var;
        d dVar;
        byte b = this.a;
        Context context = this.c;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                zma zmaVar = new zma(context);
                if (!gl.O1() && !gl.s1(fx0VarArr[0].i1) && (fx0Var = fx0VarArr[0]) != null && (dVar = fx0Var.i1) != null) {
                    zmaVar.X(dVar);
                }
                zmaVar.show();
                return;
            case 1:
                fx0VarArr[0].dismiss();
                d01.t(context, k96.M0(2131752023, null));
                return;
            case 2:
                fx0VarArr[0].dismiss();
                d01.v(context, k96.M0(2131752018, null), false);
                return;
            default:
                fx0VarArr[0].dismiss();
                d01.t(context, k96.M0(2131752015, null));
                return;
        }
    }

    public sta(fx0[] fx0VarArr, Context context, byte b) {
        this.a = b;
        this.b = fx0VarArr;
        this.c = context;
    }
}
