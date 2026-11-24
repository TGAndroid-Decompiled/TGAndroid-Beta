package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class qo7 implements id2 {
    public final long a;
    public final boolean b;
    public final zo7 c;
    public final boolean d;
    public final int e;
    public final ArrayList f;
    public final NotificationsCustomSettingsActivity h;

    public qo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j, boolean z, zo7 zo7Var, boolean z2, int i, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j;
        this.b = z;
        this.c = zo7Var;
        this.d = z2;
        this.e = i;
        this.f = arrayList;
    }

    public final void a() {
        rja rjaVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        zo7 zo7Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(zo7Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(zo7Var.d));
        }
        arrayList2.remove(zo7Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.e0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        rjaVar = ((d) notificationsCustomSettingsActivity).simpleActionBar;
        rjaVar.o(true);
    }

    public final void b() {
        rja rjaVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().o2(this.a, 0L, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb = new StringBuilder("custom_");
        zo7 zo7Var = this.c;
        sb.append(zo7Var.d);
        zo7Var.b = notificationsSettings.getBoolean(sb.toString(), false);
        int i = notificationsSettings.getInt("notify2_" + zo7Var.d, 0);
        zo7Var.c = i;
        if (i != 0) {
            int i2 = notificationsSettings.getInt("notifyuntil_" + zo7Var.d, -1);
            if (i2 != -1) {
                zo7Var.a = i2;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(zo7Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(zo7Var.d), zo7Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        rjaVar = ((d) notificationsCustomSettingsActivity).simpleActionBar;
        rjaVar.o(true);
    }

    @Override
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        boolean o2 = notificationsCustomSettingsActivity.getMessagesController().o2(this.a, 0L, null);
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, 0L, !o2);
        c41.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().o2(this.a, 0L, null), null).j();
        b();
    }

    @Override
    public final void r() {
        long j = this.a;
        if (j != 0) {
            st8 st8Var = new st8(kt6.k(j, "dialog_id"), null);
            st8Var.s = new fk3(this);
            this.h.presentFragment(st8Var);
        }
    }

    @Override
    public final void s() {
        int i;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        notificationsCustomSettingsActivity.getClass();
        String p = lo7.p(this.a, 0L, false);
        i = ((d) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + p, true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + p, z2).apply();
        if (c41.a(notificationsCustomSettingsActivity)) {
            c41.S(z ? 1 : 0, notificationsCustomSettingsActivity.getResourceProvider(), notificationsCustomSettingsActivity).j();
        }
    }

    @Override
    public final void t(int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().o2(this.a, 0L, null)) {
                p();
            }
            if (c41.a(notificationsCustomSettingsActivity)) {
                c41.z(notificationsCustomSettingsActivity, 4, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i, 0L);
            if (c41.a(notificationsCustomSettingsActivity)) {
                c41.z(notificationsCustomSettingsActivity, 5, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void h() {
    }
}
