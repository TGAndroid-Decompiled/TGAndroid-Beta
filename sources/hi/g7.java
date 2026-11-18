package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g7 implements Runnable {
    public final int f14698a;
    public final l7 f14699b;

    public g7(l7 l7Var, int i7) {
        this.f14698a = i7;
        this.f14699b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f14698a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                l7 l7Var = this.f14699b;
                getwebpagepreview.message = l7Var.U1.d.getText().toString();
                l7Var.f14947e2 = ConnectionsManager.getInstance(l7Var.f30189a).sendRequest(getwebpagepreview, new ai.e1(l7Var, 12));
                return;
            case 1:
                this.f14699b.i1();
                return;
            default:
                l7 l7Var2 = this.f14699b;
                org.telegram.ui.Cells.k3 k3Var = l7Var2.U1;
                if (l7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(k3Var.d);
                    return;
                }
                return;
        }
    }
}
