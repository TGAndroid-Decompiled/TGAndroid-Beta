package fi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q0 implements org.telegram.ui.ActionBar.a2 {
    public final int f9891a;
    public final Activity f9892b;

    public q0(Activity activity, int i10) {
        this.f9891a = i10;
        this.f9892b = activity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9891a) {
            case 0:
                Activity activity = this.f9892b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Activity activity2 = this.f9892b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
