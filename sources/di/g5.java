package di;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g5 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final o6 f6971a;

    public g5(o6 o6Var) {
        this.f6971a = o6Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        o6 o6Var = this.f6971a;
        o6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = o6Var.H1) != null && m1Var.isShowing()) {
            o6Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        o6 o6Var = this.f6971a;
        o6Var.f7533l2 = true;
        b6 m0 = o6Var.m0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            m0.setScale(1.5f);
        }
        o6Var.d0(m0);
        return Boolean.TRUE;
    }
}
