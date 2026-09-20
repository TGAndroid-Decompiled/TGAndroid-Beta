package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.v70;
public final class h implements Runnable {
    public final int f11400a;
    public final v70 f11401b;

    public h(v70 v70Var, int i10) {
        this.f11400a = i10;
        this.f11401b = v70Var;
    }

    @Override
    public final void run() {
        switch (this.f11400a) {
            case 0:
                this.f11401b.s();
                return;
            case 1:
                this.f11401b.s();
                return;
            case 2:
                this.f11401b.s();
                return;
            case 3:
                q70 q70Var = this.f11401b.f28984m;
                if (q70Var != null) {
                    AndroidUtilities.hideKeyboard(q70Var.getContentView());
                    return;
                }
                return;
            case 4:
                q70 q70Var2 = this.f11401b.f28984m;
                if (q70Var2 != null) {
                    AndroidUtilities.hideKeyboard(q70Var2.getContentView());
                    return;
                }
                return;
            case 5:
                q70 q70Var3 = this.f11401b.f28984m;
                if (q70Var3 != null) {
                    AndroidUtilities.hideKeyboard(q70Var3.getContentView());
                    return;
                }
                return;
            case 6:
                q70 q70Var4 = this.f11401b.f28984m;
                if (q70Var4 != null) {
                    AndroidUtilities.hideKeyboard(q70Var4.getContentView());
                    return;
                }
                return;
            case 7:
                q70 q70Var5 = this.f11401b.f28984m;
                if (q70Var5 != null) {
                    AndroidUtilities.hideKeyboard(q70Var5.getContentView());
                    return;
                }
                return;
            default:
                q70 q70Var6 = this.f11401b.f28984m;
                if (q70Var6 != null) {
                    AndroidUtilities.hideKeyboard(q70Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
