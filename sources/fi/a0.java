package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.o10;
import org.telegram.ui.v10;
public final class a0 implements v10 {
    public final k0 f9946a;

    public a0(k0 k0Var) {
        this.f9946a = k0Var;
    }

    @Override
    public final boolean c(o10 o10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9946a;
        n2 n2Var = k0Var.f9996s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(dp0.K(messageObject, i10));
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
