package gi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class h7 implements Runnable {
    public final int f12919a;
    public final m7 f12920b;

    public h7(m7 m7Var, int i3) {
        this.f12919a = i3;
        this.f12920b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f12919a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                m7 m7Var = this.f12920b;
                getwebpagepreview.message = m7Var.R1.d.getText().toString();
                m7Var.f13255b2 = ConnectionsManager.getInstance(m7Var.f28583a).sendRequest(getwebpagepreview, new ci.d0(m7Var, 11));
                return;
            case 1:
                this.f12920b.h1();
                return;
            default:
                m7 m7Var2 = this.f12920b;
                org.telegram.ui.Cells.k3 k3Var = m7Var2.R1;
                if (m7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.K3(k3Var.d);
                    return;
                }
                return;
        }
    }
}
