package defpackage;

import android.view.View;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tm7 implements d39, ed {
    public final NotificationsSettingsActivity a;

    public tm7(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        this.a.y0(f, i, view);
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.A0();
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
