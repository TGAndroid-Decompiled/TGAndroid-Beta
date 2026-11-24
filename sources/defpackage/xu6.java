package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
public class xu6 extends mg3 {
    public boolean B0 = false;
    public dq C0;
    public yv6 D0;

    public xu6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override
    public final void I() {
        super.I();
        dq dqVar = this.C0;
        if (dqVar != null && !this.B0) {
            ((wu6) dqVar).i(false);
        }
    }

    @Override
    public final Dialog P() {
        if (this.B0) {
            rv6 rv6Var = new rv6(n());
            this.C0 = rv6Var;
            rv6Var.i(this.D0);
        } else {
            this.C0 = new wu6(n());
        }
        return this.C0;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        dq dqVar = this.C0;
        if (dqVar != null) {
            if (this.B0) {
                ((rv6) dqVar).j();
            } else {
                ((wu6) dqVar).s();
            }
        }
    }
}
