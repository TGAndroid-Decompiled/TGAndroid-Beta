package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pt8 extends c6 {
    public final String a;
    public final st8 b;

    public pt8(st8 st8Var, String str) {
        this.b = st8Var;
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
        st8 st8Var = this.b;
        long j = st8Var.h;
        long j2 = st8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!st8Var.n && st8Var.r) {
                i8 = ((d) st8Var).currentAccount;
                SharedPreferences.Editor edit = oc7.r1(i8).W3.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((d) st8Var).currentAccount;
            SharedPreferences sharedPreferences = oc7.r1(i2).W3;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i3 = ((d) st8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(i3).R.f(j2);
            if (st8Var.r) {
                edit2.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((d) st8Var).currentAccount;
                    cf7.Y(i7).B1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((d) st8Var).currentAccount;
                    lo7.n(i4).N(j2);
                    i5 = ((d) st8Var).currentAccount;
                    cf7.Y(i5).B1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i6 = ((d) st8Var).currentAccount;
            lo7.n(i6).c0(st8Var.f, st8Var.h, true);
            if (st8Var.s != null) {
                ?? obj = new Object();
                obj.d = j2;
                obj.b = true;
                int g = kt6.g("notify2_", str, sharedPreferences, 0);
                obj.c = g;
                if (g != 0) {
                    obj.a = kt6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                st8Var.s.f(obj);
            }
        }
        st8Var.finishFragment();
    }
}
