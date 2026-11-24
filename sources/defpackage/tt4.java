package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class tt4 implements View.OnClickListener {
    public final byte a;
    public final vt4 b;

    public tt4(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.c(null);
                return;
            default:
                LinearLayout linearLayout = vt4Var.e;
                if (linearLayout != null && !vt4Var.O) {
                    vt4Var.e = null;
                    vt4Var.h(linearLayout, false);
                    return;
                }
                return;
        }
    }
}
