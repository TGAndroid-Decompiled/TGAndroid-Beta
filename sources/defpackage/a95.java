package defpackage;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class a95 extends n95 {
    public final byte h = 0;
    public final q59 n;

    public a95(pb5 pb5Var, Context context) {
        super(context, true);
        this.n = pb5Var;
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.h;
        q59 q59Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                g95 g95Var = ((b95) q59Var).N;
                if (g95Var.J1.getVisibility() == 0 && g95Var.F4) {
                    g95Var.E0(this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                pb5 pb5Var = (pb5) q59Var;
                if (pb5Var.r && getParticipant() != null) {
                    pb5Var.E(this, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        byte b = this.h;
        q59 q59Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                g95 g95Var = ((b95) q59Var).N;
                g95 g95Var2 = g95.s5;
                g95Var.E0(this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((pb5) q59Var).E(this, false);
                return;
        }
    }

    public a95(b95 b95Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = b95Var;
    }
}
