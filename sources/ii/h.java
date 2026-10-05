package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.w70;
public final class h implements Runnable {
    public final int f12402a;
    public final b80 f12403b;

    public h(b80 b80Var, int i10) {
        this.f12402a = i10;
        this.f12403b = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f12402a) {
            case 0:
                this.f12403b.s();
                return;
            case 1:
                this.f12403b.s();
                return;
            case 2:
                this.f12403b.s();
                return;
            case 3:
                w70 w70Var = this.f12403b.f24875m;
                if (w70Var != null) {
                    AndroidUtilities.hideKeyboard(w70Var.getContentView());
                    return;
                }
                return;
            case 4:
                w70 w70Var2 = this.f12403b.f24875m;
                if (w70Var2 != null) {
                    AndroidUtilities.hideKeyboard(w70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                w70 w70Var3 = this.f12403b.f24875m;
                if (w70Var3 != null) {
                    AndroidUtilities.hideKeyboard(w70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                w70 w70Var4 = this.f12403b.f24875m;
                if (w70Var4 != null) {
                    AndroidUtilities.hideKeyboard(w70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                w70 w70Var5 = this.f12403b.f24875m;
                if (w70Var5 != null) {
                    AndroidUtilities.hideKeyboard(w70Var5.getContentView());
                    return;
                }
                return;
            default:
                w70 w70Var6 = this.f12403b.f24875m;
                if (w70Var6 != null) {
                    AndroidUtilities.hideKeyboard(w70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
