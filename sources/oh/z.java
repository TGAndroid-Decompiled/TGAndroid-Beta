package oh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.a10;
import org.telegram.ui.h10;

public final class z implements h10 {

    public final j0 f19580a;

    public z(j0 j0Var) {
        this.f19580a = j0Var;
    }

    @Override
    public final boolean b(a10 a10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        j0 j0Var = this.f19580a;
        j0Var.f19504s.presentFragment(jn0.K(messageObject, ((e3) j0Var).currentAccount));
        j0Var.dismiss();
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
