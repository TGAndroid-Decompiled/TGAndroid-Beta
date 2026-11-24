package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
public final class mi implements ee {
    public final byte a;
    public final Activity b;

    public mi(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent2);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent3);
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 3:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent4);
                    return;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
            default:
                Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent5.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent5);
                return;
        }
    }
}
