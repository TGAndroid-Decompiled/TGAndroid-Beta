package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class zv8 implements ed {
    public final gw8 a;

    public zv8(gw8 gw8Var) {
        this.a = gw8Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
        gw8 gw8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            gw8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
