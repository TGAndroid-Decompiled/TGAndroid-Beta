package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z70;
public final class h implements Runnable {
    public final int f11389a;
    public final z70 f11390b;

    public h(z70 z70Var, int i10) {
        this.f11389a = i10;
        this.f11390b = z70Var;
    }

    @Override
    public final void run() {
        switch (this.f11389a) {
            case 0:
                this.f11390b.s();
                return;
            case 1:
                this.f11390b.s();
                return;
            case 2:
                this.f11390b.s();
                return;
            case 3:
                u70 u70Var = this.f11390b.f30829m;
                if (u70Var != null) {
                    AndroidUtilities.hideKeyboard(u70Var.getContentView());
                    return;
                }
                return;
            case 4:
                u70 u70Var2 = this.f11390b.f30829m;
                if (u70Var2 != null) {
                    AndroidUtilities.hideKeyboard(u70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                u70 u70Var3 = this.f11390b.f30829m;
                if (u70Var3 != null) {
                    AndroidUtilities.hideKeyboard(u70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                u70 u70Var4 = this.f11390b.f30829m;
                if (u70Var4 != null) {
                    AndroidUtilities.hideKeyboard(u70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                u70 u70Var5 = this.f11390b.f30829m;
                if (u70Var5 != null) {
                    AndroidUtilities.hideKeyboard(u70Var5.getContentView());
                    return;
                }
                return;
            default:
                u70 u70Var6 = this.f11390b.f30829m;
                if (u70Var6 != null) {
                    AndroidUtilities.hideKeyboard(u70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
