package defpackage;

import android.content.SharedPreferences;
import org.telegram.ui.NotificationsSettingsActivity;
public final class up7 implements Runnable {
    public final NotificationsSettingsActivity a;
    public final byte b;
    public final boolean c;
    public final uo7 d;
    public final int e;

    public up7(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, uo7 uo7Var, int i2) {
        this.a = notificationsSettingsActivity;
        this.b = i;
        this.c = z;
        this.d = uo7Var;
        this.e = i2;
    }

    @Override
    public final void run() {
        int i;
        NotificationsSettingsActivity notificationsSettingsActivity = this.a;
        notificationsSettingsActivity.getClass();
        byte b = this.b;
        boolean z = this.c;
        if (b == 3) {
            SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit.remove("EnableAllStories");
            } else {
                edit.putBoolean("EnableAllStories", true);
            }
            edit.apply();
            notificationsSettingsActivity.getNotificationsController().b0(b);
        } else if (b != 4 && b != 5) {
            ip7 notificationsController = notificationsSettingsActivity.getNotificationsController();
            if (!z) {
                i = 0;
            } else {
                i = Integer.MAX_VALUE;
            }
            notificationsController.U(b, i);
        } else {
            SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit2.putBoolean("EnableReactionsMessages", false);
                edit2.putBoolean("EnableReactionsStories", false);
            } else {
                edit2.putBoolean("EnableReactionsMessages", true);
                edit2.putBoolean("EnableReactionsStories", true);
            }
            edit2.apply();
            notificationsSettingsActivity.getNotificationsController().b0(b);
            notificationsSettingsActivity.getNotificationsController().g(b);
        }
        this.d.e.b(0, !z, true);
        notificationsSettingsActivity.c.g(this.e);
    }
}
