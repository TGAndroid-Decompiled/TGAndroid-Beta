package defpackage;

import android.view.View;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class mo7 implements Runnable {
    public final byte a;
    public final NotificationsCustomSettingsActivity b;
    public final zo7 c;
    public final View d;

    public mo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zo7 zo7Var, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = zo7Var;
        this.d = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.d;
        zo7 zo7Var = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                notificationsCustomSettingsActivity.p0(zo7Var, view, false);
                return;
            case 1:
                notificationsCustomSettingsActivity.f0(zo7Var, view);
                return;
            case 2:
                notificationsCustomSettingsActivity.l0(zo7Var, view);
                return;
            case 3:
                notificationsCustomSettingsActivity.m0(zo7Var, view);
                return;
            case 4:
                notificationsCustomSettingsActivity.f0(zo7Var, view);
                return;
            default:
                notificationsCustomSettingsActivity.p0(zo7Var, view, true);
                return;
        }
    }

    public mo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zo7 zo7Var, View view, boolean z, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = zo7Var;
        this.d = view;
    }
}
