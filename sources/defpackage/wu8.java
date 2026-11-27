package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class wu8 extends d6 {
    public final String a;
    public final zu8 b;

    public wu8(zu8 zu8Var, String str) {
        this.b = zu8Var;
        this.a = str;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        zu8 zu8Var = this.b;
        long j = zu8Var.h;
        long j2 = zu8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!zu8Var.n && zu8Var.r) {
                i8 = ((e) zu8Var).currentAccount;
                SharedPreferences.Editor edit = uc7.s1(i8).X3.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((e) zu8Var).currentAccount;
            SharedPreferences sharedPreferences = uc7.s1(i2).X3;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i3 = ((e) zu8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(i3).R.f(j2);
            if (zu8Var.r) {
                edit2.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((e) zu8Var).currentAccount;
                    kf7.a0(i7).G1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((e) zu8Var).currentAccount;
                    ip7.n(i4).N(j2);
                    i5 = ((e) zu8Var).currentAccount;
                    kf7.a0(i5).G1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i6 = ((e) zu8Var).currentAccount;
            ip7.n(i6).c0(zu8Var.f, zu8Var.h, true);
            if (zu8Var.s != null) {
                ?? obj = new Object();
                obj.d = j2;
                obj.b = true;
                int g = qu6.g("notify2_", str, sharedPreferences, 0);
                obj.c = g;
                if (g != 0) {
                    obj.a = qu6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                zu8Var.s.i(obj);
            }
        }
        zu8Var.finishFragment();
    }
}
