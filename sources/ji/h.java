package ji;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.n70;
public final class h implements Runnable {
    public final int f13966a;
    public final n70 f13967b;

    public h(n70 n70Var, int i10) {
        this.f13966a = i10;
        this.f13967b = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f13966a) {
            case 0:
                this.f13967b.s();
                return;
            case 1:
                this.f13967b.s();
                return;
            case 2:
                this.f13967b.s();
                return;
            case 3:
                i70 i70Var = this.f13967b.f28677m;
                if (i70Var != null) {
                    AndroidUtilities.hideKeyboard(i70Var.getContentView());
                    return;
                }
                return;
            case 4:
                i70 i70Var2 = this.f13967b.f28677m;
                if (i70Var2 != null) {
                    AndroidUtilities.hideKeyboard(i70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                i70 i70Var3 = this.f13967b.f28677m;
                if (i70Var3 != null) {
                    AndroidUtilities.hideKeyboard(i70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                i70 i70Var4 = this.f13967b.f28677m;
                if (i70Var4 != null) {
                    AndroidUtilities.hideKeyboard(i70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                i70 i70Var5 = this.f13967b.f28677m;
                if (i70Var5 != null) {
                    AndroidUtilities.hideKeyboard(i70Var5.getContentView());
                    return;
                }
                return;
            default:
                i70 i70Var6 = this.f13967b.f28677m;
                if (i70Var6 != null) {
                    AndroidUtilities.hideKeyboard(i70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
