package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.s80;
public final class h implements Runnable {
    public final int f12447a;
    public final s80 f12448b;

    public h(s80 s80Var, int i10) {
        this.f12447a = i10;
        this.f12448b = s80Var;
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
                n80 n80Var = this.f12448b.f30458m;
                if (n80Var != null) {
                    AndroidUtilities.hideKeyboard(n80Var.getContentView());
                    return;
                }
                return;
            case 4:
                n80 n80Var2 = this.f12448b.f30458m;
                if (n80Var2 != null) {
                    AndroidUtilities.hideKeyboard(n80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                n80 n80Var3 = this.f12448b.f30458m;
                if (n80Var3 != null) {
                    AndroidUtilities.hideKeyboard(n80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                n80 n80Var4 = this.f12448b.f30458m;
                if (n80Var4 != null) {
                    AndroidUtilities.hideKeyboard(n80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                n80 n80Var5 = this.f12448b.f30458m;
                if (n80Var5 != null) {
                    AndroidUtilities.hideKeyboard(n80Var5.getContentView());
                    return;
                }
                return;
            default:
                n80 n80Var6 = this.f12448b.f30458m;
                if (n80Var6 != null) {
                    AndroidUtilities.hideKeyboard(n80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
