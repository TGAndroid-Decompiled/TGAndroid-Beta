package nh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.e10;
import org.telegram.ui.x00;
public final class z implements e10 {
    public final j0 f18731a;

    public z(j0 j0Var) {
        this.f18731a = j0Var;
    }

    @Override
    public final boolean b(x00 x00Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i9;
        j0 j0Var = this.f18731a;
        o2 o2Var = j0Var.f18655s;
        i9 = ((f3) j0Var).currentAccount;
        o2Var.presentFragment(hn0.K(messageObject, i9));
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
    public final void d(MessageObject messageObject, View view, int i9) {
    }
}
