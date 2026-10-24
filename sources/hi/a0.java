package hi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.a10;
import org.telegram.ui.h10;
public final class a0 implements h10 {
    public final k0 f12158a;

    public a0(k0 k0Var) {
        this.f12158a = k0Var;
    }

    @Override
    public final boolean b(a10 a10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f12158a;
        o2 o2Var = k0Var.f12204s;
        i10 = ((h3) k0Var).currentAccount;
        o2Var.presentFragment(zo0.K(messageObject, i10));
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
