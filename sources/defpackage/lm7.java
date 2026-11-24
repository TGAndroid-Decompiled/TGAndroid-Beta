package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class lm7 implements Runnable {
    public final byte a;
    public final NotificationsCustomSettingsActivity b;
    public final View c;
    public final int d;

    public lm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        View view = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (view instanceof chb) {
                    if (i >= 0 && i < arrayList.size()) {
                        ((qm7) arrayList.get(i)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((chb) view).b(notificationsCustomSettingsActivity.f0(), k96.M0(2131748797, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof uib) {
                    if (i >= 0 && i < arrayList2.size()) {
                        ((qm7) arrayList2.get(i)).f = notificationsCustomSettingsActivity.g0();
                    }
                    uib uibVar = (uib) view;
                    uibVar.c(k96.M0(2131746905, "PopupNotification"), notificationsCustomSettingsActivity.g0(), true, uibVar.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof uib) {
                    if (i >= 0 && i < arrayList3.size()) {
                        ((qm7) arrayList3.get(i)).f = notificationsCustomSettingsActivity.h0();
                    }
                    uib uibVar2 = (uib) view;
                    uibVar2.c(k96.M0(2131747713, "NotificationsImportance"), notificationsCustomSettingsActivity.h0(), true, uibVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
        }
    }
}
