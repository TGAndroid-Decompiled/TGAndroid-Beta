package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class lp7 implements Runnable {
    public final byte a;
    public final NotificationsCustomSettingsActivity b;
    public final View c;
    public final int d;

    public lp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i, byte b) {
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
                if (view instanceof ykb) {
                    if (i >= 0 && i < arrayList.size()) {
                        ((qp7) arrayList.get(i)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((ykb) view).b(notificationsCustomSettingsActivity.f0(), ob6.M0(2131748743, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof qmb) {
                    if (i >= 0 && i < arrayList2.size()) {
                        ((qp7) arrayList2.get(i)).f = notificationsCustomSettingsActivity.g0();
                    }
                    qmb qmbVar = (qmb) view;
                    qmbVar.c(ob6.M0(2131746825, "PopupNotification"), notificationsCustomSettingsActivity.g0(), true, qmbVar.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof qmb) {
                    if (i >= 0 && i < arrayList3.size()) {
                        ((qp7) arrayList3.get(i)).f = notificationsCustomSettingsActivity.h0();
                    }
                    qmb qmbVar2 = (qmb) view;
                    qmbVar2.c(ob6.M0(2131747633, "NotificationsImportance"), notificationsCustomSettingsActivity.h0(), true, qmbVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
        }
    }
}
