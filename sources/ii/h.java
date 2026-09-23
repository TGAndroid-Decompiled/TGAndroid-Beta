package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o70;
public final class h implements Runnable {
    public final int f11389a;
    public final o70 f11390b;

    public h(o70 o70Var, int i10) {
        this.f11389a = i10;
        this.f11390b = o70Var;
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
                j70 j70Var = this.f11390b.f26659m;
                if (j70Var != null) {
                    AndroidUtilities.hideKeyboard(j70Var.getContentView());
                    return;
                }
                return;
            case 4:
                j70 j70Var2 = this.f11390b.f26659m;
                if (j70Var2 != null) {
                    AndroidUtilities.hideKeyboard(j70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                j70 j70Var3 = this.f11390b.f26659m;
                if (j70Var3 != null) {
                    AndroidUtilities.hideKeyboard(j70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                j70 j70Var4 = this.f11390b.f26659m;
                if (j70Var4 != null) {
                    AndroidUtilities.hideKeyboard(j70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                j70 j70Var5 = this.f11390b.f26659m;
                if (j70Var5 != null) {
                    AndroidUtilities.hideKeyboard(j70Var5.getContentView());
                    return;
                }
                return;
            default:
                j70 j70Var6 = this.f11390b.f26659m;
                if (j70Var6 != null) {
                    AndroidUtilities.hideKeyboard(j70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
