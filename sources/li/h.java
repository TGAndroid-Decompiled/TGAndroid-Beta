package li;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.l80;
public final class h implements Runnable {
    public final int f17268a;
    public final l80 f17269b;

    public h(l80 l80Var, int i10) {
        this.f17268a = i10;
        this.f17269b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f17268a) {
            case 0:
                this.f17269b.s();
                return;
            case 1:
                this.f17269b.s();
                return;
            case 2:
                this.f17269b.s();
                return;
            case 3:
                g80 g80Var = this.f17269b.f30158m;
                if (g80Var != null) {
                    AndroidUtilities.hideKeyboard(g80Var.getContentView());
                    return;
                }
                return;
            case 4:
                g80 g80Var2 = this.f17269b.f30158m;
                if (g80Var2 != null) {
                    AndroidUtilities.hideKeyboard(g80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                g80 g80Var3 = this.f17269b.f30158m;
                if (g80Var3 != null) {
                    AndroidUtilities.hideKeyboard(g80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                g80 g80Var4 = this.f17269b.f30158m;
                if (g80Var4 != null) {
                    AndroidUtilities.hideKeyboard(g80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                g80 g80Var5 = this.f17269b.f30158m;
                if (g80Var5 != null) {
                    AndroidUtilities.hideKeyboard(g80Var5.getContentView());
                    return;
                }
                return;
            default:
                g80 g80Var6 = this.f17269b.f30158m;
                if (g80Var6 != null) {
                    AndroidUtilities.hideKeyboard(g80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
