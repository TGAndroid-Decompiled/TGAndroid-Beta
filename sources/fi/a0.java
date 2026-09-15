package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.p10;
import org.telegram.ui.w10;
public final class a0 implements w10 {
    public final k0 f9080a;

    public a0(k0 k0Var) {
        this.f9080a = k0Var;
    }

    @Override
    public final boolean c(p10 p10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9080a;
        n2 n2Var = k0Var.f9125s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(yn0.K(messageObject, i10));
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
