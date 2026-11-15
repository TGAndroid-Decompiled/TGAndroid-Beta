package ci;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class b0 implements q1 {
    public final i0 f5300a;

    public b0(i0 i0Var) {
        this.f5300a = i0Var;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        i0 i0Var = this.f5300a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
            i0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
