package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.r10;
import org.telegram.ui.y10;
public final class a0 implements y10 {
    public final k0 f9085a;

    public a0(k0 k0Var) {
        this.f9085a = k0Var;
    }

    @Override
    public final boolean c(r10 r10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9085a;
        o2 o2Var = k0Var.f9130s;
        i10 = ((g3) k0Var).currentAccount;
        o2Var.presentFragment(zn0.L(messageObject, i10));
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
