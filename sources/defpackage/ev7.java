package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
public final class ev7 implements k8, mac {
    public final xv7 a;

    public ev7(xv7 xv7Var) {
        this.a = xv7Var;
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        xv7 xv7Var = this.a;
        xv7Var.f2 = true;
        qv7 k0 = xv7Var.k0(obj, document);
        if (bool.booleanValue()) {
            k0.setScale(1.5f);
        }
        xv7Var.a0(k0);
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        xv7 xv7Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (xv7Var = this.a).x1) != null && m8Var.isShowing()) {
            xv7Var.x1.d(true);
        }
    }
}
