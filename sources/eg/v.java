package eg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final c1 f5510a;

    public v(c1 c1Var) {
        this.f5510a = c1Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        c1 c1Var = this.f5510a;
        c1Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = c1Var.O1) != null && p1Var.isShowing()) {
            c1Var.O1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        n0 i02 = this.f5510a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
