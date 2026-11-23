package ki;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
public final class m0 implements org.telegram.ui.ActionBar.q1 {
    public final int f18875a;
    public final Activity f18876b;

    public m0(Activity activity, int i7) {
        this.f18875a = i7;
        this.f18876b = activity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18875a) {
            case 0:
                Activity activity = this.f18876b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f18876b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                return;
        }
    }
}
