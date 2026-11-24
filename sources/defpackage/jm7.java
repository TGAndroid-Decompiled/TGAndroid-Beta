package defpackage;

import android.view.View;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class jm7 implements Runnable {
    public final byte a;
    public final NotificationsCustomSettingsActivity b;
    public final vm7 c;
    public final View d;

    public jm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vm7 vm7Var, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vm7Var;
        this.d = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.d;
        vm7 vm7Var = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                notificationsCustomSettingsActivity.o0(vm7Var, view, false);
                return;
            case 1:
                notificationsCustomSettingsActivity.e0(vm7Var, view);
                return;
            case 2:
                notificationsCustomSettingsActivity.k0(vm7Var, view);
                return;
            case 3:
                notificationsCustomSettingsActivity.l0(vm7Var, view);
                return;
            case 4:
                notificationsCustomSettingsActivity.e0(vm7Var, view);
                return;
            default:
                notificationsCustomSettingsActivity.o0(vm7Var, view, true);
                return;
        }
    }

    public jm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vm7 vm7Var, View view, boolean z, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vm7Var;
        this.d = view;
    }
}
