package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;
public final class r3 implements Runnable {
    public final int f6737a;
    public final x60 f6738b;

    public r3(x60 x60Var, int i9) {
        this.f6737a = i9;
        this.f6738b = x60Var;
    }

    @Override
    public final void run() {
        switch (this.f6737a) {
            case 0:
                this.f6738b.s();
                return;
            case 1:
                s60 s60Var = this.f6738b.f34570m;
                if (s60Var != null) {
                    AndroidUtilities.hideKeyboard(s60Var.getContentView());
                    return;
                }
                return;
            case 2:
                s60 s60Var2 = this.f6738b.f34570m;
                if (s60Var2 != null) {
                    AndroidUtilities.hideKeyboard(s60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                s60 s60Var3 = this.f6738b.f34570m;
                if (s60Var3 != null) {
                    AndroidUtilities.hideKeyboard(s60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                s60 s60Var4 = this.f6738b.f34570m;
                if (s60Var4 != null) {
                    AndroidUtilities.hideKeyboard(s60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                s60 s60Var5 = this.f6738b.f34570m;
                if (s60Var5 != null) {
                    AndroidUtilities.hideKeyboard(s60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                s60 s60Var6 = this.f6738b.f34570m;
                if (s60Var6 != null) {
                    AndroidUtilities.hideKeyboard(s60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f6738b.s();
                return;
            default:
                this.f6738b.s();
                return;
        }
    }
}
