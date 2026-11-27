package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
public final class ey5 implements l8, lcc {
    public final wy5 a;

    public ey5(wy5 wy5Var) {
        this.a = wy5Var;
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        ny5 e0 = this.a.e0(obj, document, true);
        if (bool.booleanValue()) {
            e0.setScale(1.5f);
        }
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        wy5 wy5Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (wy5Var = this.a).B1) != null && n8Var.isShowing()) {
            wy5Var.B1.d(true);
        }
    }
}
