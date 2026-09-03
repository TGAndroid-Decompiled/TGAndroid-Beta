package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.q70;
public final class g3 implements Runnable {
    public final int f12778a;
    public final q70 f12779b;

    public g3(q70 q70Var, int i10) {
        this.f12778a = i10;
        this.f12779b = q70Var;
    }

    @Override
    public final void run() {
        switch (this.f12778a) {
            case 0:
                this.f12779b.s();
                return;
            case 1:
                l70 l70Var = this.f12779b.f30323m;
                if (l70Var != null) {
                    AndroidUtilities.hideKeyboard(l70Var.getContentView());
                    return;
                }
                return;
            case 2:
                l70 l70Var2 = this.f12779b.f30323m;
                if (l70Var2 != null) {
                    AndroidUtilities.hideKeyboard(l70Var2.getContentView());
                    return;
                }
                return;
            case 3:
                l70 l70Var3 = this.f12779b.f30323m;
                if (l70Var3 != null) {
                    AndroidUtilities.hideKeyboard(l70Var3.getContentView());
                    return;
                }
                return;
            case 4:
                l70 l70Var4 = this.f12779b.f30323m;
                if (l70Var4 != null) {
                    AndroidUtilities.hideKeyboard(l70Var4.getContentView());
                    return;
                }
                return;
            case 5:
                l70 l70Var5 = this.f12779b.f30323m;
                if (l70Var5 != null) {
                    AndroidUtilities.hideKeyboard(l70Var5.getContentView());
                    return;
                }
                return;
            case 6:
                l70 l70Var6 = this.f12779b.f30323m;
                if (l70Var6 != null) {
                    AndroidUtilities.hideKeyboard(l70Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f12779b.s();
                return;
            default:
                this.f12779b.s();
                return;
        }
    }
}
