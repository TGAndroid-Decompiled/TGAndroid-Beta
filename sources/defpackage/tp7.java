package defpackage;

import android.view.View;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tp7 implements s69, fd {
    public final NotificationsSettingsActivity a;

    public tp7(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        this.a.z0(f, i, view);
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.B0();
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
