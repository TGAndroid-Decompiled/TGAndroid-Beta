package di;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class t0 implements org.telegram.ui.ActionBar.c2 {
    public final int f6904a;
    public final Activity f6905b;

    public t0(Activity activity, int i10) {
        this.f6904a = i10;
        this.f6905b = activity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6904a) {
            case 0:
                Activity activity = this.f6905b;
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
                Activity activity2 = this.f6905b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
