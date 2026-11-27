package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.e;
public final class fb9 implements Runnable {
    public final byte a;
    public final e b;
    public final Context c;
    public final vnb d;
    public final en9 e;

    public fb9(e eVar, Context context, vnb vnbVar, en9 en9Var, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = context;
        this.d = vnbVar;
        this.e = en9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        en9 en9Var = this.e;
        vnb vnbVar = this.d;
        Context context = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 11), vnbVar)).j();
                hl.c3(en9Var);
                return;
            case 1:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 9), vnbVar)).j();
                hl.c3(en9Var);
                return;
            default:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 14), vnbVar)).j();
                hl.c3(en9Var);
                return;
        }
    }
}
