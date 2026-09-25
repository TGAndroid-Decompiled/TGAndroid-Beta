package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.y70;
public final class h implements Runnable {
    public final int f11389a;
    public final y70 f11390b;

    public h(y70 y70Var, int i10) {
        this.f11389a = i10;
        this.f11390b = y70Var;
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
                t70 t70Var = this.f11390b.f30545m;
                if (t70Var != null) {
                    AndroidUtilities.hideKeyboard(t70Var.getContentView());
                    return;
                }
                return;
            case 4:
                t70 t70Var2 = this.f11390b.f30545m;
                if (t70Var2 != null) {
                    AndroidUtilities.hideKeyboard(t70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                t70 t70Var3 = this.f11390b.f30545m;
                if (t70Var3 != null) {
                    AndroidUtilities.hideKeyboard(t70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                t70 t70Var4 = this.f11390b.f30545m;
                if (t70Var4 != null) {
                    AndroidUtilities.hideKeyboard(t70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                t70 t70Var5 = this.f11390b.f30545m;
                if (t70Var5 != null) {
                    AndroidUtilities.hideKeyboard(t70Var5.getContentView());
                    return;
                }
                return;
            default:
                t70 t70Var6 = this.f11390b.f30545m;
                if (t70Var6 != null) {
                    AndroidUtilities.hideKeyboard(t70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
