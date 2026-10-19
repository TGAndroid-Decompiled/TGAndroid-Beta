package ei;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y4 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final f6 f10131a;

    public y4(f6 f6Var) {
        this.f10131a = f6Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        f6 f6Var = this.f10131a;
        f6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = f6Var.H1) != null && m1Var.isShowing()) {
            f6Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        f6 f6Var = this.f10131a;
        f6Var.f9020l2 = true;
        s5 m0 = f6Var.m0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            m0.setScale(1.5f);
        }
        f6Var.d0(m0);
        return Boolean.TRUE;
    }
}
