package hi;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class j4 implements org.telegram.ui.ActionBar.e1, t10 {
    public final k5 f14824a;

    public j4(k5 k5Var) {
        this.f14824a = k5Var;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        k5 k5Var = this.f14824a;
        k5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = k5Var.f14898r1) != null && g1Var.isShowing()) {
            k5Var.f14898r1.d(true);
        }
    }

    @Override
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        k5 k5Var = this.f14824a;
        k5Var.V1 = true;
        b5 k02 = k5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        k5Var.b0(k02);
    }
}
