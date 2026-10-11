package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.n10;
import org.telegram.ui.u10;
public final class a0 implements u10 {
    public final k0 f9945a;

    public a0(k0 k0Var) {
        this.f9945a = k0Var;
    }

    @Override
    public final boolean c(n10 n10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9945a;
        m2 m2Var = k0Var.f9995s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(fp0.K(messageObject, i10));
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
