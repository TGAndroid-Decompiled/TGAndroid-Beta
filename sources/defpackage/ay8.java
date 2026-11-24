package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class ay8 implements ee {
    public final iy8 a;

    public ay8(iy8 iy8Var) {
        this.a = iy8Var;
    }

    @Override
    public final void r(he heVar, int i) {
        iy8 iy8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            iy8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
