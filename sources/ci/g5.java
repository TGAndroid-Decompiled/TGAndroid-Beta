package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g5 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final q6 f5119a;

    public g5(q6 q6Var) {
        this.f5119a = q6Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        q6 q6Var = this.f5119a;
        q6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = q6Var.H1) != null && m1Var.isShowing()) {
            q6Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        q6 q6Var = this.f5119a;
        q6Var.f5810l2 = true;
        c6 m0 = q6Var.m0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            m0.setScale(1.5f);
        }
        q6Var.d0(m0);
        return Boolean.TRUE;
    }
}
