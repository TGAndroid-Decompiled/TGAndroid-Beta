package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.e;
public final class vxa implements Runnable {
    public final byte a;
    public final nx0[] b;
    public final Context c;

    public vxa(Context context, nx0[] nx0VarArr) {
        this.a = (byte) 0;
        this.c = context;
        this.b = nx0VarArr;
    }

    @Override
    public final void run() {
        nx0 nx0Var;
        e eVar;
        byte b = this.a;
        Context context = this.c;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                wqa wqaVar = new wqa(context);
                if (!hl.O1() && !hl.s1(nx0VarArr[0].i1) && (nx0Var = nx0VarArr[0]) != null && (eVar = nx0Var.i1) != null) {
                    wqaVar.X(eVar);
                }
                wqaVar.show();
                return;
            case 1:
                nx0VarArr[0].dismiss();
                m01.u(context, ob6.M0(2131752000, null));
                return;
            case 2:
                nx0VarArr[0].dismiss();
                m01.w(context, ob6.M0(2131751995, null), false);
                return;
            default:
                nx0VarArr[0].dismiss();
                m01.u(context, ob6.M0(2131751992, null));
                return;
        }
    }

    public vxa(nx0[] nx0VarArr, Context context, byte b) {
        this.a = b;
        this.b = nx0VarArr;
        this.c = context;
    }
}
