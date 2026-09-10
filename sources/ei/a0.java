package ei;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.r10;
import org.telegram.ui.y10;
public final class a0 implements y10 {
    public final k0 f7529a;

    public a0(k0 k0Var) {
        this.f7529a = k0Var;
    }

    @Override
    public final boolean b(r10 r10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f7529a;
        p2 p2Var = k0Var.f7574s;
        i10 = ((h3) k0Var).currentAccount;
        p2Var.presentFragment(ho0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
