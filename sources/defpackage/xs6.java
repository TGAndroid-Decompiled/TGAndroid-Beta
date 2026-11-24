package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
public class xs6 extends ze3 {
    public boolean B0 = false;
    public dp C0;
    public yt6 D0;

    public xs6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override
    public final void I() {
        super.I();
        dp dpVar = this.C0;
        if (dpVar != null && !this.B0) {
            ((ws6) dpVar).i(false);
        }
    }

    @Override
    public final Dialog P() {
        if (this.B0) {
            rt6 rt6Var = new rt6(n());
            this.C0 = rt6Var;
            rt6Var.i(this.D0);
        } else {
            this.C0 = new ws6(n());
        }
        return this.C0;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        dp dpVar = this.C0;
        if (dpVar != null) {
            if (this.B0) {
                ((rt6) dpVar).j();
            } else {
                ((ws6) dpVar).s();
            }
        }
    }
}
