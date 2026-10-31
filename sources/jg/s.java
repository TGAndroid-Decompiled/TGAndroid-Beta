package jg;

import android.view.KeyEvent;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
public final class s implements org.telegram.ui.ActionBar.i1, m20 {
    public final r0 f10204a;

    public s(r0 r0Var) {
        this.f10204a = r0Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        g0 g02 = this.f10204a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }

    @Override
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        r0 r0Var = this.f10204a;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = r0Var.A1) != null && k1Var.isShowing()) {
            r0Var.A1.d(true);
        }
    }
}
