package gi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.b20;
import org.telegram.ui.u10;
public final class a0 implements b20 {
    public final k0 f10160a;

    public a0(k0 k0Var) {
        this.f10160a = k0Var;
    }

    @Override
    public final boolean b(u10 u10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f10160a;
        m2 m2Var = k0Var.f10205s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(zo0.K(messageObject, i10));
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
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
