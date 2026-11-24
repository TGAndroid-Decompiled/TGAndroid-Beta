package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class vv4 implements View.OnClickListener {
    public final byte a;
    public final xv4 b;

    public vv4(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.c(null);
                return;
            default:
                LinearLayout linearLayout = xv4Var.e;
                if (linearLayout != null && !xv4Var.O) {
                    xv4Var.e = null;
                    xv4Var.h(linearLayout, false);
                    return;
                }
                return;
        }
    }
}
