package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.v70;
public final class h implements Runnable {
    public final int f11389a;
    public final a80 f11390b;

    public h(a80 a80Var, int i10) {
        this.f11389a = i10;
        this.f11390b = a80Var;
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
                v70 v70Var = this.f11390b.f22592m;
                if (v70Var != null) {
                    AndroidUtilities.hideKeyboard(v70Var.getContentView());
                    return;
                }
                return;
            case 4:
                v70 v70Var2 = this.f11390b.f22592m;
                if (v70Var2 != null) {
                    AndroidUtilities.hideKeyboard(v70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                v70 v70Var3 = this.f11390b.f22592m;
                if (v70Var3 != null) {
                    AndroidUtilities.hideKeyboard(v70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                v70 v70Var4 = this.f11390b.f22592m;
                if (v70Var4 != null) {
                    AndroidUtilities.hideKeyboard(v70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                v70 v70Var5 = this.f11390b.f22592m;
                if (v70Var5 != null) {
                    AndroidUtilities.hideKeyboard(v70Var5.getContentView());
                    return;
                }
                return;
            default:
                v70 v70Var6 = this.f11390b.f22592m;
                if (v70Var6 != null) {
                    AndroidUtilities.hideKeyboard(v70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
