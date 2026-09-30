package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.w70;
public final class h implements Runnable {
    public final int f11403a;
    public final b80 f11404b;

    public h(b80 b80Var, int i10) {
        this.f11403a = i10;
        this.f11404b = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f11403a) {
            case 0:
                this.f11404b.s();
                return;
            case 1:
                this.f11404b.s();
                return;
            case 2:
                this.f11404b.s();
                return;
            case 3:
                w70 w70Var = this.f11404b.f22862m;
                if (w70Var != null) {
                    AndroidUtilities.hideKeyboard(w70Var.getContentView());
                    return;
                }
                return;
            case 4:
                w70 w70Var2 = this.f11404b.f22862m;
                if (w70Var2 != null) {
                    AndroidUtilities.hideKeyboard(w70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                w70 w70Var3 = this.f11404b.f22862m;
                if (w70Var3 != null) {
                    AndroidUtilities.hideKeyboard(w70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                w70 w70Var4 = this.f11404b.f22862m;
                if (w70Var4 != null) {
                    AndroidUtilities.hideKeyboard(w70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                w70 w70Var5 = this.f11404b.f22862m;
                if (w70Var5 != null) {
                    AndroidUtilities.hideKeyboard(w70Var5.getContentView());
                    return;
                }
                return;
            default:
                w70 w70Var6 = this.f11404b.f22862m;
                if (w70Var6 != null) {
                    AndroidUtilities.hideKeyboard(w70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
