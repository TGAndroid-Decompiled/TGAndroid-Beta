package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.p80;
public final class h implements Runnable {
    public final int f12448a;
    public final p80 f12449b;

    public h(p80 p80Var, int i10) {
        this.f12448a = i10;
        this.f12449b = p80Var;
    }

    @Override
    public final void run() {
        switch (this.f12448a) {
            case 0:
                this.f12449b.s();
                return;
            case 1:
                this.f12449b.s();
                return;
            case 2:
                this.f12449b.s();
                return;
            case 3:
                k80 k80Var = this.f12449b.f29779m;
                if (k80Var != null) {
                    AndroidUtilities.hideKeyboard(k80Var.getContentView());
                    return;
                }
                return;
            case 4:
                k80 k80Var2 = this.f12449b.f29779m;
                if (k80Var2 != null) {
                    AndroidUtilities.hideKeyboard(k80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                k80 k80Var3 = this.f12449b.f29779m;
                if (k80Var3 != null) {
                    AndroidUtilities.hideKeyboard(k80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                k80 k80Var4 = this.f12449b.f29779m;
                if (k80Var4 != null) {
                    AndroidUtilities.hideKeyboard(k80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                k80 k80Var5 = this.f12449b.f29779m;
                if (k80Var5 != null) {
                    AndroidUtilities.hideKeyboard(k80Var5.getContentView());
                    return;
                }
                return;
            default:
                k80 k80Var6 = this.f12449b.f29779m;
                if (k80Var6 != null) {
                    AndroidUtilities.hideKeyboard(k80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
