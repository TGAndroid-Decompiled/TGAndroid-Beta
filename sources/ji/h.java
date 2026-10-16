package ji;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.l80;
public final class h implements Runnable {
    public final int f13289a;
    public final l80 f13290b;

    public h(l80 l80Var, int i10) {
        this.f13289a = i10;
        this.f13290b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f13289a) {
            case 0:
                this.f13290b.s();
                return;
            case 1:
                this.f13290b.s();
                return;
            case 2:
                this.f13290b.s();
                return;
            case 3:
                g80 g80Var = this.f13290b.f26658m;
                if (g80Var != null) {
                    AndroidUtilities.hideKeyboard(g80Var.getContentView());
                    return;
                }
                return;
            case 4:
                g80 g80Var2 = this.f13290b.f26658m;
                if (g80Var2 != null) {
                    AndroidUtilities.hideKeyboard(g80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                g80 g80Var3 = this.f13290b.f26658m;
                if (g80Var3 != null) {
                    AndroidUtilities.hideKeyboard(g80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                g80 g80Var4 = this.f13290b.f26658m;
                if (g80Var4 != null) {
                    AndroidUtilities.hideKeyboard(g80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                g80 g80Var5 = this.f13290b.f26658m;
                if (g80Var5 != null) {
                    AndroidUtilities.hideKeyboard(g80Var5.getContentView());
                    return;
                }
                return;
            default:
                g80 g80Var6 = this.f13290b.f26658m;
                if (g80Var6 != null) {
                    AndroidUtilities.hideKeyboard(g80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
