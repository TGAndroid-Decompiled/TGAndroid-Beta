package defpackage;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class d95 extends q95 {
    public final byte h = 0;
    public final c79 n;

    public d95(sb5 sb5Var, Context context) {
        super(context, true);
        this.n = sb5Var;
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.h;
        c79 c79Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                j95 j95Var = ((e95) c79Var).N;
                if (j95Var.J1.getVisibility() == 0 && j95Var.F4) {
                    j95Var.F0(this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                sb5 sb5Var = (sb5) c79Var;
                if (sb5Var.r && getParticipant() != null) {
                    sb5Var.E(this, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        byte b = this.h;
        c79 c79Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                j95 j95Var = ((e95) c79Var).N;
                j95 j95Var2 = j95.s5;
                j95Var.F0(this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((sb5) c79Var).E(this, false);
                return;
        }
    }

    public d95(e95 e95Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = e95Var;
    }
}
