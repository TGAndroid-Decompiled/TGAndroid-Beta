package ci;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class c0 implements r1 {
    public final j0 f5613a;

    public c0(j0 j0Var) {
        this.f5613a = j0Var;
    }

    @Override
    public void h(u1 u1Var, int i7) {
        j0 j0Var = this.f5613a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
            j0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
