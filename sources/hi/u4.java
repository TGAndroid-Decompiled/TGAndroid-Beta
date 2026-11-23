package hi;

import android.view.KeyEvent;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
public final class u4 implements org.telegram.ui.ActionBar.e1, s10 {
    public final v5 f15519a;

    public u4(v5 v5Var) {
        this.f15519a = v5Var;
    }

    @Override
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        v5 v5Var = this.f15519a;
        v5Var.Z1 = true;
        m5 m0 = v5Var.m0(obj, document);
        if (bool.booleanValue()) {
            m0.setScale(1.5f);
        }
        v5Var.c0(m0);
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        v5 v5Var = this.f15519a;
        v5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = v5Var.f15587r1) != null && g1Var.isShowing()) {
            v5Var.f15587r1.d(true);
        }
    }
}
