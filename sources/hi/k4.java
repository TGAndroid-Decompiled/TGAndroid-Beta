package hi;

import android.view.KeyEvent;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class k4 implements org.telegram.ui.ActionBar.e1, u10 {
    public final l5 f14811a;

    public k4(l5 l5Var) {
        this.f14811a = l5Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        l5 l5Var = this.f14811a;
        l5Var.V1 = true;
        c5 k02 = l5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        l5Var.b0(k02);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        l5 l5Var = this.f14811a;
        l5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = l5Var.f14913r1) != null && g1Var.isShowing()) {
            l5Var.f14913r1.d(true);
        }
    }
}
