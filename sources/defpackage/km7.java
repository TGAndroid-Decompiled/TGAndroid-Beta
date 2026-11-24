package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class km7 implements wi3, ed, or8 {
    public final NotificationsCustomSettingsActivity a;

    public km7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void h(vm7 vm7Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, vm7Var);
        notificationsCustomSettingsActivity.p0(true);
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.getClass();
        int i3 = 0;
        long j = ((zc7) arrayList.get(0)).a;
        if (notificationsCustomSettingsActivity.s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((vm7) it.next()).d == j) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((vm7) it2.next()).d == j) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.n;
            if (bool != null && bool.booleanValue()) {
                i3 = Integer.MAX_VALUE;
            }
            obj.c = i3;
            ArrayList arrayList4 = notificationsCustomSettingsActivity.x;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                notificationsCustomSettingsActivity.x = arrayList4;
            }
            arrayList4.add(obj);
            notificationsCustomSettingsActivity.p0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j);
        bundle.putBoolean("exception", true);
        pr8 pr8Var = new pr8(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        pr8Var.s = new km7(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(pr8Var, true);
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            vm7 vm7Var = (vm7) notificationsCustomSettingsActivity.x.get(i2);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + vm7Var.d);
            } else {
                edit.remove("notify2_" + vm7Var.d).remove("custom_" + vm7Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().B1(vm7Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(vm7Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = notificationsCustomSettingsActivity.x;
            if (i3 < size2) {
                notificationsCustomSettingsActivity.getNotificationsController().c0(((vm7) arrayList.get(i3)).d, 0L, false);
                i3++;
            } else {
                arrayList.clear();
                notificationsCustomSettingsActivity.y.clear();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationCenter().k(kk7.e0, new Object[0]);
                return;
            }
        }
    }

    @Override
    public final void n() {
    }
}
