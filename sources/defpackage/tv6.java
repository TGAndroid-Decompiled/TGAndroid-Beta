package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
public final class tv6 extends ov6 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final h6 H;
    public final uv6 I;
    public final View z;

    public tv6(defpackage.uv6 r4, android.view.View r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.<init>(uv6, android.view.View):void");
    }

    public final boolean v(jw6 jw6Var) {
        int i;
        if (!jw6Var.g()) {
            v34 b = this.I.x.r.b(jw6Var);
            if (b != null) {
                yv6 yv6Var = (yv6) b.b;
                if (yv6Var != null) {
                    i = yv6Var.b;
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
