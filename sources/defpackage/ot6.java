package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
public final class ot6 extends jt6 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final g6 H;
    public final pt6 I;
    public final View z;

    public ot6(defpackage.pt6 r4, android.view.View r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot6.<init>(pt6, android.view.View):void");
    }

    public final boolean v(eu6 eu6Var) {
        int i;
        if (!eu6Var.g()) {
            pj4 b = this.I.x.r.b(eu6Var);
            if (b != null) {
                tt6 tt6Var = (tt6) b.b;
                if (tt6Var != null) {
                    i = tt6Var.b;
                } else {
                    i = 1;
                }
                if (i != 3) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final void w(boolean z, boolean z2) {
        CheckBox checkBox = this.E;
        int i = 0;
        checkBox.setEnabled(false);
        this.z.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.A.setVisibility(4);
            this.B.setVisibility(0);
        }
        if (z2) {
            if (z) {
                i = this.G;
            }
            this.I.D(i, this.D);
        }
    }
}
