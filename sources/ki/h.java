package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.h80;
public final class h implements Runnable {
    public final int f15351a;
    public final h80 f15352b;

    public h(h80 h80Var, int i10) {
        this.f15351a = i10;
        this.f15352b = h80Var;
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
                c80 c80Var = this.f15352b.f26919m;
                if (c80Var != null) {
                    AndroidUtilities.hideKeyboard(c80Var.getContentView());
                    return;
                }
                return;
            case 4:
                c80 c80Var2 = this.f15352b.f26919m;
                if (c80Var2 != null) {
                    AndroidUtilities.hideKeyboard(c80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                c80 c80Var3 = this.f15352b.f26919m;
                if (c80Var3 != null) {
                    AndroidUtilities.hideKeyboard(c80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                c80 c80Var4 = this.f15352b.f26919m;
                if (c80Var4 != null) {
                    AndroidUtilities.hideKeyboard(c80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                c80 c80Var5 = this.f15352b.f26919m;
                if (c80Var5 != null) {
                    AndroidUtilities.hideKeyboard(c80Var5.getContentView());
                    return;
                }
                return;
            default:
                c80 c80Var6 = this.f15352b.f26919m;
                if (c80Var6 != null) {
                    AndroidUtilities.hideKeyboard(c80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
