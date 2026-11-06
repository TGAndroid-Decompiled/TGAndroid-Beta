package ai;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class j0 implements r1 {
    public final s0 f1298a;

    public j0(s0 s0Var) {
        this.f1298a = s0Var;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        s0 s0Var = this.f1298a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25563b.getPackageName()));
            s0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
