package dg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final e1 f4839a;

    public w(e1 e1Var) {
        this.f4839a = e1Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        e1 e1Var = this.f4839a;
        e1Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = e1Var.O1) != null && p1Var.isShowing()) {
            e1Var.O1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        p0 i02 = this.f4839a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
