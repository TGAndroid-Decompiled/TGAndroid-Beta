package ai;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
public final class p0 implements b2 {
    public final z0 f1617a;

    public p0(z0 z0Var) {
        this.f1617a = z0Var;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        z0 z0Var = this.f1617a;
        z0Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            z0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
