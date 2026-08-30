package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o70;
public final class g3 implements Runnable {
    public final int f10623a;
    public final o70 f10624b;

    public g3(o70 o70Var, int i10) {
        this.f10623a = i10;
        this.f10624b = o70Var;
    }

    @Override
    public final void run() {
        switch (this.f10623a) {
            case 0:
                this.f10624b.s();
                return;
            case 1:
                j70 j70Var = this.f10624b.f27479m;
                if (j70Var != null) {
                    AndroidUtilities.hideKeyboard(j70Var.getContentView());
                    return;
                }
                return;
            case 2:
                j70 j70Var2 = this.f10624b.f27479m;
                if (j70Var2 != null) {
                    AndroidUtilities.hideKeyboard(j70Var2.getContentView());
                    return;
                }
                return;
            case 3:
                j70 j70Var3 = this.f10624b.f27479m;
                if (j70Var3 != null) {
                    AndroidUtilities.hideKeyboard(j70Var3.getContentView());
                    return;
                }
                return;
            case 4:
                j70 j70Var4 = this.f10624b.f27479m;
                if (j70Var4 != null) {
                    AndroidUtilities.hideKeyboard(j70Var4.getContentView());
                    return;
                }
                return;
            case 5:
                j70 j70Var5 = this.f10624b.f27479m;
                if (j70Var5 != null) {
                    AndroidUtilities.hideKeyboard(j70Var5.getContentView());
                    return;
                }
                return;
            case 6:
                j70 j70Var6 = this.f10624b.f27479m;
                if (j70Var6 != null) {
                    AndroidUtilities.hideKeyboard(j70Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f10624b.s();
                return;
            default:
                this.f10624b.s();
                return;
        }
    }
}
