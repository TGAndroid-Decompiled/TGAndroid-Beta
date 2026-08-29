package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.j70;
public final class g3 implements Runnable {
    public final int f9186a;
    public final j70 f9187b;

    public g3(j70 j70Var, int i10) {
        this.f9186a = i10;
        this.f9187b = j70Var;
    }

    @Override
    public final void run() {
        switch (this.f9186a) {
            case 0:
                this.f9187b.s();
                return;
            case 1:
                e70 e70Var = this.f9187b.f29590m;
                if (e70Var != null) {
                    AndroidUtilities.hideKeyboard(e70Var.getContentView());
                    return;
                }
                return;
            case 2:
                e70 e70Var2 = this.f9187b.f29590m;
                if (e70Var2 != null) {
                    AndroidUtilities.hideKeyboard(e70Var2.getContentView());
                    return;
                }
                return;
            case 3:
                e70 e70Var3 = this.f9187b.f29590m;
                if (e70Var3 != null) {
                    AndroidUtilities.hideKeyboard(e70Var3.getContentView());
                    return;
                }
                return;
            case 4:
                e70 e70Var4 = this.f9187b.f29590m;
                if (e70Var4 != null) {
                    AndroidUtilities.hideKeyboard(e70Var4.getContentView());
                    return;
                }
                return;
            case 5:
                e70 e70Var5 = this.f9187b.f29590m;
                if (e70Var5 != null) {
                    AndroidUtilities.hideKeyboard(e70Var5.getContentView());
                    return;
                }
                return;
            case 6:
                e70 e70Var6 = this.f9187b.f29590m;
                if (e70Var6 != null) {
                    AndroidUtilities.hideKeyboard(e70Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f9187b.s();
                return;
            default:
                this.f9187b.s();
                return;
        }
    }
}
