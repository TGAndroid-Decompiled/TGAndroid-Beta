package ii;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
public final class n0 implements org.telegram.ui.ActionBar.p1 {
    public final int f15089a;
    public final Activity f15090b;

    public n0(Activity activity, int i3) {
        this.f15089a = i3;
        this.f15090b = activity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f15089a) {
            case 0:
                Activity activity = this.f15090b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f15090b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
