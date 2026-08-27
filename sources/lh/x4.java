package lh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class x4 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {

    public final f6 f17034a;

    public x4(f6 f6Var) {
        this.f17034a = f6Var;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        f6 f6Var = this.f17034a;
        f6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = f6Var.D1) != null && n1Var.isShowing()) {
            f6Var.D1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        f6 f6Var = this.f17034a;
        f6Var.f15972h2 = true;
        s5 s5VarN0 = f6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            s5VarN0.setScale(1.5f);
        }
        f6Var.d0(s5VarN0);
        return Boolean.TRUE;
    }
}
