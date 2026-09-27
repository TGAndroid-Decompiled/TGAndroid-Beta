package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.o10;
import org.telegram.ui.v10;
public final class a0 implements v10 {
    public final k0 f9072a;

    public a0(k0 k0Var) {
        this.f9072a = k0Var;
    }

    @Override
    public final boolean c(o10 o10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9072a;
        o2 o2Var = k0Var.f9117s;
        i10 = ((g3) k0Var).currentAccount;
        o2Var.presentFragment(mo0.L(messageObject, i10));
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
