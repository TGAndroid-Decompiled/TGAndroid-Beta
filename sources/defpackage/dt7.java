package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
public final class dt7 implements k8, l8c {
    public final wt7 a;

    public dt7(wt7 wt7Var) {
        this.a = wt7Var;
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        wt7 wt7Var = this.a;
        wt7Var.f2 = true;
        pt7 k0 = wt7Var.k0(obj, document);
        if (bool.booleanValue()) {
            k0.setScale(1.5f);
        }
        wt7Var.a0(k0);
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        wt7 wt7Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (wt7Var = this.a).x1) != null && m8Var.isShowing()) {
            wt7Var.x1.d(true);
        }
    }
}
