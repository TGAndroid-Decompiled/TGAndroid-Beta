package defpackage;

import android.app.Activity;
public final class wh3 implements qac {
    public final byte a;
    public final Activity b;

    public wh3(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Activity activity = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (!use.a()) {
                        use.f();
                        return;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        return;
                    }
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!use.a()) {
                        use.f();
                        return;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        return;
                    }
                }
                return;
        }
    }
}
