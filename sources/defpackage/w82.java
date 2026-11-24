package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w82 extends c6 {
    public final Context a;
    public final f92 b;

    public w82(f92 f92Var, Context context) {
        this.b = f92Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        f92 f92Var = this.b;
        if (i == -1) {
            f92Var.finishFragment();
        } else if (i == 1) {
            sha shaVar = f92Var.r;
            if (shaVar == null || !shaVar.y.f) {
                String K = hc2.K(f92Var.Y, false);
                if (f92Var.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f92Var.getResourceProvider(), this.a);
                    if (f92Var.b0) {
                        i2 = 2131748510;
                    } else {
                        i2 = 2131748508;
                    }
                    String M0 = k96.M0(i2, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    if (f92Var.b0) {
                        i3 = 2131748511;
                    } else {
                        i3 = 2131748509;
                    }
                    hdVar.U = gl.T2(k96.a0(null, null, i3, ls6.o(f92Var.getMessagesController().N2, "/", K, new StringBuilder())));
                    alertDialog$Builder.j(k96.M0(2131751759, null), new rh1(this, (byte) 20));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    f92Var.showDialog(hdVar);
                    return;
                }
                f92Var.d0();
            }
        }
    }
}
