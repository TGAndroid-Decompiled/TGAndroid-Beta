package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f7 implements Runnable {
    public final int f14650a;
    public final k7 f14651b;

    public f7(k7 k7Var, int i7) {
        this.f14650a = i7;
        this.f14651b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f14650a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                k7 k7Var = this.f14651b;
                getwebpagepreview.message = k7Var.U1.d.getText().toString();
                k7Var.f14922e2 = ConnectionsManager.getInstance(k7Var.f30173a).sendRequest(getwebpagepreview, new ai.g1(k7Var, 12));
                return;
            case 1:
                this.f14651b.i1();
                return;
            default:
                k7 k7Var2 = this.f14651b;
                org.telegram.ui.Cells.l3 l3Var = k7Var2.U1;
                if (k7Var2.isShowing()) {
                    l3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(l3Var.d);
                    return;
                }
                return;
        }
    }
}
