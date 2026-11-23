package hi;

import android.content.DialogInterface;
import org.telegram.ui.Components.du0;
public final class a5 implements DialogInterface.OnDismissListener {
    public final int f14186a;
    public final int f14187b;
    public final du0 f14188c;
    public final Object d;

    public a5(du0 du0Var, Object obj, int i7, int i10) {
        this.f14186a = i10;
        this.f14188c = du0Var;
        this.d = obj;
        this.f14187b = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14186a) {
            case 0:
                v5 v5Var = (v5) this.f14188c;
                v5Var.Y1 = null;
                if (((boolean[]) this.d)[0]) {
                    v5Var.y0(false);
                }
                v5Var.R0(this.f14187b);
                return;
            default:
                tg.l0 l0Var = (tg.l0) this.f14188c;
                if (l0Var.K1 == ((tg.b0) this.d)) {
                    l0Var.K1 = null;
                }
                l0Var.r0(false);
                l0Var.F0(this.f14187b);
                return;
        }
    }
}
