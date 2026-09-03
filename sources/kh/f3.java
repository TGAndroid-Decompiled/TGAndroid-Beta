package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.p70;
public final class f3 implements Runnable {
    public final int f10717a;
    public final p70 f10718b;

    public f3(p70 p70Var, int i10) {
        this.f10717a = i10;
        this.f10718b = p70Var;
    }

    @Override
    public final void run() {
        switch (this.f10717a) {
            case 0:
                this.f10718b.s();
                return;
            case 1:
                k70 k70Var = this.f10718b.f27767m;
                if (k70Var != null) {
                    AndroidUtilities.hideKeyboard(k70Var.getContentView());
                    return;
                }
                return;
            case 2:
                k70 k70Var2 = this.f10718b.f27767m;
                if (k70Var2 != null) {
                    AndroidUtilities.hideKeyboard(k70Var2.getContentView());
                    return;
                }
                return;
            case 3:
                k70 k70Var3 = this.f10718b.f27767m;
                if (k70Var3 != null) {
                    AndroidUtilities.hideKeyboard(k70Var3.getContentView());
                    return;
                }
                return;
            case 4:
                k70 k70Var4 = this.f10718b.f27767m;
                if (k70Var4 != null) {
                    AndroidUtilities.hideKeyboard(k70Var4.getContentView());
                    return;
                }
                return;
            case 5:
                k70 k70Var5 = this.f10718b.f27767m;
                if (k70Var5 != null) {
                    AndroidUtilities.hideKeyboard(k70Var5.getContentView());
                    return;
                }
                return;
            case 6:
                k70 k70Var6 = this.f10718b.f27767m;
                if (k70Var6 != null) {
                    AndroidUtilities.hideKeyboard(k70Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f10718b.s();
                return;
            default:
                this.f10718b.s();
                return;
        }
    }
}
