package kh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z4 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final g6 f16426a;

    public z4(g6 g6Var) {
        this.f16426a = g6Var;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        g6 g6Var = this.f16426a;
        g6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = g6Var.D1) != null && o1Var.isShowing()) {
            g6Var.D1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        g6 g6Var = this.f16426a;
        g6Var.f15282h2 = true;
        t5 n02 = g6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        g6Var.d0(n02);
        return Boolean.TRUE;
    }
}
