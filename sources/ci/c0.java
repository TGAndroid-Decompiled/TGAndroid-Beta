package ci;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class c0 implements q1 {
    public final j0 f5605a;

    public c0(j0 j0Var) {
        this.f5605a = j0Var;
    }

    @Override
    public void i(t1 t1Var, int i7) {
        j0 j0Var = this.f5605a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
            j0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
