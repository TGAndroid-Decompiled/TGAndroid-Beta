package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class nm7 implements xb2 {
    public final long a;
    public final boolean b;
    public final vm7 c;
    public final boolean d;
    public final int e;
    public final ArrayList f;
    public final NotificationsCustomSettingsActivity h;

    public nm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j, boolean z, vm7 vm7Var, boolean z2, int i, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j;
        this.b = z;
        this.c = vm7Var;
        this.d = z2;
        this.e = i;
        this.f = arrayList;
    }

    public final void b() {
        pha phaVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        vm7 vm7Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(vm7Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(vm7Var.d));
        }
        arrayList2.remove(vm7Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        phaVar = ((d) notificationsCustomSettingsActivity).simpleActionBar;
        phaVar.n(true);
    }

    public final void c() {
        pha phaVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().n2(this.a, 0L, null) != this.b) {
            b();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb = new StringBuilder("custom_");
        vm7 vm7Var = this.c;
        sb.append(vm7Var.d);
        vm7Var.b = notificationsSettings.getBoolean(sb.toString(), false);
        int i = notificationsSettings.getInt("notify2_" + vm7Var.d, 0);
        vm7Var.c = i;
        if (i != 0) {
            int i2 = notificationsSettings.getInt("notifyuntil_" + vm7Var.d, -1);
            if (i2 != -1) {
                vm7Var.a = i2;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(vm7Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(vm7Var.d), vm7Var);
            notificationsCustomSettingsActivity.p0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        phaVar = ((d) notificationsCustomSettingsActivity).simpleActionBar;
        phaVar.n(true);
    }

    @Override
    public final void i() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        boolean n2 = notificationsCustomSettingsActivity.getMessagesController().n2(this.a, 0L, null);
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, 0L, !n2);
        u21.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().n2(this.a, 0L, null), null).j();
        c();
    }

    @Override
    public final void l() {
        long j = this.a;
        if (j != 0) {
            pr8 pr8Var = new pr8(ls6.k(j, "dialog_id"), null);
            pr8Var.s = new s34(this, (byte) 19);
            this.h.presentFragment(pr8Var);
        }
    }

    @Override
    public final void n() {
        int i;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        notificationsCustomSettingsActivity.getClass();
        String p = im7.p(this.a, 0L, false);
        i = ((d) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + p, true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + p, z2).apply();
        if (u21.a(notificationsCustomSettingsActivity)) {
            u21.S(z ? 1 : 0, notificationsCustomSettingsActivity.getResourceProvider(), notificationsCustomSettingsActivity).j();
        }
    }

    @Override
    public final void p(int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().n2(this.a, 0L, null)) {
                i();
            }
            if (u21.a(notificationsCustomSettingsActivity)) {
                u21.z(notificationsCustomSettingsActivity, 4, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i, 0L);
            if (u21.a(notificationsCustomSettingsActivity)) {
                u21.z(notificationsCustomSettingsActivity, 5, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        c();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void dismiss() {
    }
}
