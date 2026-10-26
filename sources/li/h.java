package li;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.k80;
public final class h implements Runnable {
    public final int f17269a;
    public final k80 f17270b;

    public h(k80 k80Var, int i10) {
        this.f17269a = i10;
        this.f17270b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f17269a) {
            case 0:
                this.f17270b.s();
                return;
            case 1:
                this.f17270b.s();
                return;
            case 2:
                this.f17270b.s();
                return;
            case 3:
                f80 f80Var = this.f17270b.f29858m;
                if (f80Var != null) {
                    AndroidUtilities.hideKeyboard(f80Var.getContentView());
                    return;
                }
                return;
            case 4:
                f80 f80Var2 = this.f17270b.f29858m;
                if (f80Var2 != null) {
                    AndroidUtilities.hideKeyboard(f80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                f80 f80Var3 = this.f17270b.f29858m;
                if (f80Var3 != null) {
                    AndroidUtilities.hideKeyboard(f80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                f80 f80Var4 = this.f17270b.f29858m;
                if (f80Var4 != null) {
                    AndroidUtilities.hideKeyboard(f80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                f80 f80Var5 = this.f17270b.f29858m;
                if (f80Var5 != null) {
                    AndroidUtilities.hideKeyboard(f80Var5.getContentView());
                    return;
                }
                return;
            default:
                f80 f80Var6 = this.f17270b.f29858m;
                if (f80Var6 != null) {
                    AndroidUtilities.hideKeyboard(f80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
