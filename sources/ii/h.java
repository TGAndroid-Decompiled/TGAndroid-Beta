package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.w70;
public final class h implements Runnable {
    public final int f11399a;
    public final w70 f11400b;

    public h(w70 w70Var, int i10) {
        this.f11399a = i10;
        this.f11400b = w70Var;
    }

    @Override
    public final void run() {
        switch (this.f11399a) {
            case 0:
                this.f11400b.s();
                return;
            case 1:
                this.f11400b.s();
                return;
            case 2:
                this.f11400b.s();
                return;
            case 3:
                r70 r70Var = this.f11400b.f29914m;
                if (r70Var != null) {
                    AndroidUtilities.hideKeyboard(r70Var.getContentView());
                    return;
                }
                return;
            case 4:
                r70 r70Var2 = this.f11400b.f29914m;
                if (r70Var2 != null) {
                    AndroidUtilities.hideKeyboard(r70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                r70 r70Var3 = this.f11400b.f29914m;
                if (r70Var3 != null) {
                    AndroidUtilities.hideKeyboard(r70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                r70 r70Var4 = this.f11400b.f29914m;
                if (r70Var4 != null) {
                    AndroidUtilities.hideKeyboard(r70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                r70 r70Var5 = this.f11400b.f29914m;
                if (r70Var5 != null) {
                    AndroidUtilities.hideKeyboard(r70Var5.getContentView());
                    return;
                }
                return;
            default:
                r70 r70Var6 = this.f11400b.f29914m;
                if (r70Var6 != null) {
                    AndroidUtilities.hideKeyboard(r70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
