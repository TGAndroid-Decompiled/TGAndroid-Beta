package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.j80;
public final class h implements Runnable {
    public final int f15351a;
    public final j80 f15352b;

    public h(j80 j80Var, int i10) {
        this.f15351a = i10;
        this.f15352b = j80Var;
    }

    @Override
    public final void run() {
        switch (this.f15351a) {
            case 0:
                this.f15352b.s();
                return;
            case 1:
                this.f15352b.s();
                return;
            case 2:
                this.f15352b.s();
                return;
            case 3:
                e80 e80Var = this.f15352b.f27570m;
                if (e80Var != null) {
                    AndroidUtilities.hideKeyboard(e80Var.getContentView());
                    return;
                }
                return;
            case 4:
                e80 e80Var2 = this.f15352b.f27570m;
                if (e80Var2 != null) {
                    AndroidUtilities.hideKeyboard(e80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                e80 e80Var3 = this.f15352b.f27570m;
                if (e80Var3 != null) {
                    AndroidUtilities.hideKeyboard(e80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                e80 e80Var4 = this.f15352b.f27570m;
                if (e80Var4 != null) {
                    AndroidUtilities.hideKeyboard(e80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                e80 e80Var5 = this.f15352b.f27570m;
                if (e80Var5 != null) {
                    AndroidUtilities.hideKeyboard(e80Var5.getContentView());
                    return;
                }
                return;
            default:
                e80 e80Var6 = this.f15352b.f27570m;
                if (e80Var6 != null) {
                    AndroidUtilities.hideKeyboard(e80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
