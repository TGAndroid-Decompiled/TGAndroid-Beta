package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.w60;

public final class m3 implements Runnable {

    public final int f7431a;

    public final b70 f7432b;

    public m3(b70 b70Var, int i10) {
        this.f7431a = i10;
        this.f7432b = b70Var;
    }

    @Override
    public final void run() {
        switch (this.f7431a) {
            case 0:
                this.f7432b.s();
                break;
            case 1:
                w60 w60Var = this.f7432b.f26982m;
                if (w60Var != null) {
                    AndroidUtilities.hideKeyboard(w60Var.getContentView());
                }
                break;
            case 2:
                w60 w60Var2 = this.f7432b.f26982m;
                if (w60Var2 != null) {
                    AndroidUtilities.hideKeyboard(w60Var2.getContentView());
                }
                break;
            case 3:
                w60 w60Var3 = this.f7432b.f26982m;
                if (w60Var3 != null) {
                    AndroidUtilities.hideKeyboard(w60Var3.getContentView());
                }
                break;
            case 4:
                w60 w60Var4 = this.f7432b.f26982m;
                if (w60Var4 != null) {
                    AndroidUtilities.hideKeyboard(w60Var4.getContentView());
                }
                break;
            case 5:
                w60 w60Var5 = this.f7432b.f26982m;
                if (w60Var5 != null) {
                    AndroidUtilities.hideKeyboard(w60Var5.getContentView());
                }
                break;
            case 6:
                w60 w60Var6 = this.f7432b.f26982m;
                if (w60Var6 != null) {
                    AndroidUtilities.hideKeyboard(w60Var6.getContentView());
                }
                break;
            case 7:
                this.f7432b.s();
                break;
            default:
                this.f7432b.s();
                break;
        }
    }
}
