package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class oo7 implements Runnable {
    public final byte a;
    public final NotificationsCustomSettingsActivity b;
    public final View c;
    public final int d;

    public oo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i, byte b) {
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
                if (view instanceof djb) {
                    if (i >= 0 && i < arrayList.size()) {
                        ((uo7) arrayList.get(i)).h = notificationsCustomSettingsActivity.g0();
                    }
                    ((djb) view).b(notificationsCustomSettingsActivity.g0(), jb6.M0(2131748746, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof vkb) {
                    if (i >= 0 && i < arrayList2.size()) {
                        ((uo7) arrayList2.get(i)).f = notificationsCustomSettingsActivity.h0();
                    }
                    vkb vkbVar = (vkb) view;
                    vkbVar.c(jb6.M0(2131746831, "PopupNotification"), notificationsCustomSettingsActivity.h0(), true, vkbVar.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof vkb) {
                    if (i >= 0 && i < arrayList3.size()) {
                        ((uo7) arrayList3.get(i)).f = notificationsCustomSettingsActivity.i0();
                    }
                    vkb vkbVar2 = (vkb) view;
                    vkbVar2.c(jb6.M0(2131747639, "NotificationsImportance"), notificationsCustomSettingsActivity.i0(), true, vkbVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
