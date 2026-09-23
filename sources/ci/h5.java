package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h5 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final q6 f4754a;

    public h5(q6 q6Var) {
        this.f4754a = q6Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        q6 q6Var = this.f4754a;
        q6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = q6Var.H1) != null && n1Var.isShowing()) {
            q6Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        q6 q6Var = this.f4754a;
        q6Var.f5352l2 = true;
        c6 n02 = q6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        q6Var.d0(n02);
        return Boolean.TRUE;
    }
}
