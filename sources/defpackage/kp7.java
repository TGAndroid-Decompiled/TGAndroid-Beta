package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class kp7 implements oj3, fd, yu8 {
    public final NotificationsCustomSettingsActivity a;

    public kp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void i(vp7 vp7Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, vp7Var);
        notificationsCustomSettingsActivity.p0(true);
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.getClass();
        int i3 = 0;
        long j = ((jf7) arrayList.get(0)).a;
        if (notificationsCustomSettingsActivity.s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((vp7) it.next()).d == j) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((vp7) it2.next()).d == j) {
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
        zu8 zu8Var = new zu8(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        zu8Var.s = new kp7(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(zu8Var, true);
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            vp7 vp7Var = (vp7) notificationsCustomSettingsActivity.x.get(i2);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + vp7Var.d);
            } else {
                edit.remove("notify2_" + vp7Var.d).remove("custom_" + vp7Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().G1(vp7Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(vp7Var.d);
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
                notificationsCustomSettingsActivity.getNotificationsController().c0(((vp7) arrayList.get(i3)).d, 0L, false);
                i3++;
            } else {
                arrayList.clear();
                notificationsCustomSettingsActivity.y.clear();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationCenter().k(jn7.f0, new Object[0]);
                return;
            }
        }
    }

    @Override
    public final void l() {
    }
}
