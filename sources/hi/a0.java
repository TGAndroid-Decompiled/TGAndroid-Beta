package hi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.f10;
import org.telegram.ui.y00;
public final class a0 implements f10 {
    public final k0 f12129a;

    public a0(k0 k0Var) {
        this.f12129a = k0Var;
    }

    @Override
    public final boolean b(y00 y00Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f12129a;
        n2 n2Var = k0Var.f12174s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(vo0.K(messageObject, i10));
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
