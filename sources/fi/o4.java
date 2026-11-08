package fi;

import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class o4 implements org.telegram.ui.ActionBar.e1, y10 {
    public final o5 f12513a;

    public o4(o5 o5Var) {
        this.f12513a = o5Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        o5 o5Var = this.f12513a;
        o5Var.U1 = true;
        f5 k02 = o5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        o5Var.b0(k02);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        o5 o5Var = this.f12513a;
        o5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = o5Var.f12542q1) != null && g1Var.isShowing()) {
            o5Var.f12542q1.d(true);
        }
    }
}
