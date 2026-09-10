package bi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e6 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final r7 f2629a;

    public e6(r7 r7Var) {
        this.f2629a = r7Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        r7 r7Var = this.f2629a;
        r7Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = r7Var.H1) != null && p1Var.isShowing()) {
            r7Var.H1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        r7 r7Var = this.f2629a;
        r7Var.f3521l2 = true;
        c7 n02 = r7Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        r7Var.d0(n02);
        return Boolean.TRUE;
    }
}
