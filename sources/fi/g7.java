package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g7 implements Runnable {
    public final int f12111a;
    public final m7 f12112b;

    public g7(m7 m7Var, int i7) {
        this.f12111a = i7;
        this.f12112b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f12111a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                m7 m7Var = this.f12112b;
                getwebpagepreview.message = m7Var.T1.d.getText().toString();
                m7Var.d2 = ConnectionsManager.getInstance(m7Var.f28669a).sendRequest(getwebpagepreview, new bi.j0(m7Var, 11));
                return;
            case 1:
                this.f12112b.h1();
                return;
            default:
                m7 m7Var2 = this.f12112b;
                org.telegram.ui.Cells.k3 k3Var = m7Var2.T1;
                if (m7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.K3(k3Var.d);
                    return;
                }
                return;
        }
    }
}
