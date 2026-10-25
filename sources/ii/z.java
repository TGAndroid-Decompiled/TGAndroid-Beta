package ii;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.g10;
import org.telegram.ui.z00;
public final class z implements g10 {
    public final j0 f14437a;

    public z(j0 j0Var) {
        this.f14437a = j0Var;
    }

    @Override
    public final boolean c(z00 z00Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        j0 j0Var = this.f14437a;
        r2 r2Var = j0Var.f14363s;
        i10 = ((k3) j0Var).currentAccount;
        r2Var.presentFragment(ep0.M(messageObject, i10));
        j0Var.dismiss();
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
