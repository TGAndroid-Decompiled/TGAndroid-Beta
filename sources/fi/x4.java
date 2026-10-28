package fi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x4 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final e6 f11955a;

    public x4(e6 e6Var) {
        this.f11955a = e6Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        e6 e6Var = this.f11955a;
        e6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = e6Var.f10820w1) != null && o1Var.isShowing()) {
            e6Var.f10820w1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        e6 e6Var = this.f11955a;
        e6Var.a2 = true;
        r5 k02 = e6Var.k0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            k02.setScale(1.5f);
        }
        e6Var.b0(k02);
        return Boolean.TRUE;
    }
}
