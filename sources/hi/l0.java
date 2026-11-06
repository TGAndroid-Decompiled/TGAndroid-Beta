package hi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
public final class l0 implements org.telegram.ui.ActionBar.r1 {
    public final int f14773a;
    public final Activity f14774b;

    public l0(Activity activity, int i7) {
        this.f14773a = i7;
        this.f14774b = activity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f14773a) {
            case 0:
                Activity activity = this.f14774b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f14774b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
