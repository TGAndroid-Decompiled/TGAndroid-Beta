package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.q80;
public final class h implements Runnable {
    public final int f12447a;
    public final q80 f12448b;

    public h(q80 q80Var, int i10) {
        this.f12447a = i10;
        this.f12448b = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f12447a) {
            case 0:
                this.f12448b.s();
                return;
            case 1:
                this.f12448b.s();
                return;
            case 2:
                this.f12448b.s();
                return;
            case 3:
                l80 l80Var = this.f12448b.f30073m;
                if (l80Var != null) {
                    AndroidUtilities.hideKeyboard(l80Var.getContentView());
                    return;
                }
                return;
            case 4:
                l80 l80Var2 = this.f12448b.f30073m;
                if (l80Var2 != null) {
                    AndroidUtilities.hideKeyboard(l80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                l80 l80Var3 = this.f12448b.f30073m;
                if (l80Var3 != null) {
                    AndroidUtilities.hideKeyboard(l80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                l80 l80Var4 = this.f12448b.f30073m;
                if (l80Var4 != null) {
                    AndroidUtilities.hideKeyboard(l80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                l80 l80Var5 = this.f12448b.f30073m;
                if (l80Var5 != null) {
                    AndroidUtilities.hideKeyboard(l80Var5.getContentView());
                    return;
                }
                return;
            default:
                l80 l80Var6 = this.f12448b.f30073m;
                if (l80Var6 != null) {
                    AndroidUtilities.hideKeyboard(l80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
