package hi;

import android.view.KeyEvent;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class l4 implements org.telegram.ui.ActionBar.e1, v10 {
    public final m5 f14583a;

    public l4(m5 m5Var) {
        this.f14583a = m5Var;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        m5 m5Var = this.f14583a;
        m5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = m5Var.f14687r1) != null && g1Var.isShowing()) {
            m5Var.f14687r1.d(true);
        }
    }

    @Override
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        m5 m5Var = this.f14583a;
        m5Var.V1 = true;
        d5 k02 = m5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        m5Var.b0(k02);
    }
}
