package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.q10;
import org.telegram.ui.x10;
public final class a0 implements x10 {
    public final k0 f9944a;

    public a0(k0 k0Var) {
        this.f9944a = k0Var;
    }

    @Override
    public final boolean c(q10 q10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9944a;
        m2 m2Var = k0Var.f9994s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(jp0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
