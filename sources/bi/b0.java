package bi;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
public final class b0 implements p1 {
    public final j0 f3655a;

    public b0(j0 j0Var) {
        this.f3655a = j0Var;
    }

    @Override
    public void g(s1 s1Var, int i3) {
        j0 j0Var = this.f3655a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
            j0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
