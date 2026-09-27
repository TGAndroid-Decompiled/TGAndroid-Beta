package ei;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q0 implements org.telegram.ui.ActionBar.b2 {
    public final int f8545a;
    public final Activity f8546b;

    public q0(Activity activity, int i10) {
        this.f8545a = i10;
        this.f8546b = activity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f8545a) {
            case 0:
                Activity activity = this.f8546b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Activity activity2 = this.f8546b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
