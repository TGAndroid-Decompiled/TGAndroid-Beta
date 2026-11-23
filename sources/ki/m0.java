package ki;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
public final class m0 implements org.telegram.ui.ActionBar.q1 {
    public final int f18805a;
    public final Activity f18806b;

    public m0(Activity activity, int i7) {
        this.f18805a = i7;
        this.f18806b = activity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18805a) {
            case 0:
                Activity activity = this.f18806b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26931b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f18806b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
