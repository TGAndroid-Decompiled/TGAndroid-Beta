package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
public final class zx5 implements k8, mac {
    public final ry5 a;

    public zx5(ry5 ry5Var) {
        this.a = ry5Var;
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        iy5 e0 = this.a.e0(obj, document, true);
        if (bool.booleanValue()) {
            e0.setScale(1.5f);
        }
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        ry5 ry5Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (ry5Var = this.a).H1) != null && m8Var.isShowing()) {
            ry5Var.H1.d(true);
        }
    }
}
