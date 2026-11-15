package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f7 implements Runnable {
    public final int f14311a;
    public final l7 f14312b;

    public f7(l7 l7Var, int i7) {
        this.f14311a = i7;
        this.f14312b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f14311a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                l7 l7Var = this.f14312b;
                getwebpagepreview.message = l7Var.U1.d.getText().toString();
                l7Var.f14592e2 = ConnectionsManager.getInstance(l7Var.f29679a).sendRequest(getwebpagepreview, new ai.e1(l7Var, 12));
                return;
            case 1:
                this.f14312b.h1();
                return;
            default:
                l7 l7Var2 = this.f14312b;
                org.telegram.ui.Cells.k3 k3Var = l7Var2.U1;
                if (l7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.J3(k3Var.d);
                    return;
                }
                return;
        }
    }
}
