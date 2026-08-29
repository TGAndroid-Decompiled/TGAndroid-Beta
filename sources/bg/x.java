package bg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final g1 f2603a;

    public x(g1 g1Var) {
        this.f2603a = g1Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        g1 g1Var = this.f2603a;
        g1Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = g1Var.N1) != null && o1Var.isShowing()) {
            g1Var.N1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        q0 i02 = this.f2603a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
