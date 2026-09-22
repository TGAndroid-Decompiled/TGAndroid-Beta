package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i5 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final r6 f4783a;

    public i5(r6 r6Var) {
        this.f4783a = r6Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        r6 r6Var = this.f4783a;
        r6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = r6Var.H1) != null && n1Var.isShowing()) {
            r6Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        r6 r6Var = this.f4783a;
        r6Var.f5427l2 = true;
        d6 n02 = r6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        r6Var.d0(n02);
        return Boolean.TRUE;
    }
}
