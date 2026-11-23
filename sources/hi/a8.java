package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class a8 implements Runnable {
    public final int f14195a;
    public final f8 f14196b;

    public a8(f8 f8Var, int i7) {
        this.f14195a = i7;
        this.f14196b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f14195a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                f8 f8Var = this.f14196b;
                getwebpagepreview.message = f8Var.U1.d.getText().toString();
                f8Var.f14487e2 = ConnectionsManager.getInstance(f8Var.f30223a).sendRequest(getwebpagepreview, new ai.b1(f8Var, 12));
                return;
            case 1:
                this.f14196b.i1();
                return;
            default:
                f8 f8Var2 = this.f14196b;
                org.telegram.ui.Cells.l3 l3Var = f8Var2.U1;
                if (f8Var2.isShowing()) {
                    l3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(l3Var.d);
                    return;
                }
                return;
        }
    }
}
