package ji;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.m80;
public final class h implements Runnable {
    public final int f13286a;
    public final m80 f13287b;

    public h(m80 m80Var, int i10) {
        this.f13286a = i10;
        this.f13287b = m80Var;
    }

    @Override
    public final void run() {
        switch (this.f13286a) {
            case 0:
                this.f13287b.s();
                return;
            case 1:
                this.f13287b.s();
                return;
            case 2:
                this.f13287b.s();
                return;
            case 3:
                h80 h80Var = this.f13287b.f27288m;
                if (h80Var != null) {
                    AndroidUtilities.hideKeyboard(h80Var.getContentView());
                    return;
                }
                return;
            case 4:
                h80 h80Var2 = this.f13287b.f27288m;
                if (h80Var2 != null) {
                    AndroidUtilities.hideKeyboard(h80Var2.getContentView());
                    return;
                }
                return;
            case 5:
                h80 h80Var3 = this.f13287b.f27288m;
                if (h80Var3 != null) {
                    AndroidUtilities.hideKeyboard(h80Var3.getContentView());
                    return;
                }
                return;
            case 6:
                h80 h80Var4 = this.f13287b.f27288m;
                if (h80Var4 != null) {
                    AndroidUtilities.hideKeyboard(h80Var4.getContentView());
                    return;
                }
                return;
            case 7:
                h80 h80Var5 = this.f13287b.f27288m;
                if (h80Var5 != null) {
                    AndroidUtilities.hideKeyboard(h80Var5.getContentView());
                    return;
                }
                return;
            default:
                h80 h80Var6 = this.f13287b.f27288m;
                if (h80Var6 != null) {
                    AndroidUtilities.hideKeyboard(h80Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
