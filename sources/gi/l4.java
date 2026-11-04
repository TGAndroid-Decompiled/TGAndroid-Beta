package gi;

import android.view.KeyEvent;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class l4 implements org.telegram.ui.ActionBar.d1, q10 {
    public final m5 f13113a;

    public l4(m5 m5Var) {
        this.f13113a = m5Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        m5 m5Var = this.f13113a;
        m5Var.V1 = true;
        d5 k02 = m5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        m5Var.b0(k02);
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        m5 m5Var = this.f13113a;
        m5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = m5Var.f13226r1) != null && f1Var.isShowing()) {
            m5Var.f13226r1.d(true);
        }
    }
}
