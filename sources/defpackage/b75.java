package defpackage;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class b75 extends o75 {
    public final byte h = 0;
    public final n39 n;

    public b75(r95 r95Var, Context context) {
        super(context, true);
        this.n = r95Var;
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.h;
        n39 n39Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                h75 h75Var = ((c75) n39Var).N;
                if (h75Var.J1.getVisibility() == 0 && h75Var.F4) {
                    h75Var.E0(this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                r95 r95Var = (r95) n39Var;
                if (r95Var.r && getParticipant() != null) {
                    r95Var.E(this, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        byte b = this.h;
        n39 n39Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                h75 h75Var = ((c75) n39Var).N;
                h75 h75Var2 = h75.s5;
                h75Var.E0(this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((r95) n39Var).E(this, false);
                return;
        }
    }

    public b75(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = c75Var;
    }
}
