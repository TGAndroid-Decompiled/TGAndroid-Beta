package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.i80;
public final class h implements Runnable {
    public final int f15293a;
    public final i80 f15294b;

    public h(i80 i80Var, int i10) {
        this.f15293a = i10;
        this.f15294b = i80Var;
    }

    @Override
    public final void run() {
        switch (this.f15293a) {
            case 0:
                this.f15294b.s();
                return;
            case 1:
                this.f15294b.s();
                return;
            case 2:
                this.f15294b.s();
                return;
            case 3:
                d80 d80Var = this.f15294b.f27175m;
                if (d80Var != null) {
                    AndroidUtilities.hideKeyboard(d80Var.getContentView());
                    return;
                }
                return;
            case 4:
                d80 d80Var2 = this.f15294b.f27175m;
                if (d80Var2 != null) {
                    AndroidUtilities.hideKeyboard(d80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                d80 d80Var3 = this.f15294b.f27175m;
                if (d80Var3 != null) {
                    AndroidUtilities.hideKeyboard(d80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                d80 d80Var4 = this.f15294b.f27175m;
                if (d80Var4 != null) {
                    AndroidUtilities.hideKeyboard(d80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                d80 d80Var5 = this.f15294b.f27175m;
                if (d80Var5 != null) {
                    AndroidUtilities.hideKeyboard(d80Var5.getContentView());
                    return;
                }
                return;
            default:
                d80 d80Var6 = this.f15294b.f27175m;
                if (d80Var6 != null) {
                    AndroidUtilities.hideKeyboard(d80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
