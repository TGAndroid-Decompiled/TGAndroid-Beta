package defpackage;

import android.view.View;
import org.telegram.ui.NotificationsSettingsActivity;
public final class xo7 implements g59, ee {
    public final NotificationsSettingsActivity a;

    public xo7(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        this.a.z0(f, i, view);
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.B0();
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
