package ii;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.b10;
import org.telegram.ui.i10;
public final class z implements i10 {
    public final j0 f14436a;

    public z(j0 j0Var) {
        this.f14436a = j0Var;
    }

    @Override
    public final boolean c(b10 b10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        j0 j0Var = this.f14436a;
        r2 r2Var = j0Var.f14362s;
        i10 = ((k3) j0Var).currentAccount;
        r2Var.presentFragment(fp0.M(messageObject, i10));
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
