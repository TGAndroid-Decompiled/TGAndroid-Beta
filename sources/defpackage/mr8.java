package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class mr8 extends c6 {
    public final String a;
    public final pr8 b;

    public mr8(pr8 pr8Var, String str) {
        this.b = pr8Var;
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
        pr8 pr8Var = this.b;
        long j = pr8Var.h;
        long j2 = pr8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!pr8Var.n && pr8Var.r) {
                i8 = ((d) pr8Var).currentAccount;
                SharedPreferences.Editor edit = na7.q1(i8).W3.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((d) pr8Var).currentAccount;
            SharedPreferences sharedPreferences = na7.q1(i2).W3;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i3 = ((d) pr8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(i3).R.f(j2);
            if (pr8Var.r) {
                edit2.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((d) pr8Var).currentAccount;
                    ad7.Y(i7).B1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((d) pr8Var).currentAccount;
                    im7.n(i4).N(j2);
                    i5 = ((d) pr8Var).currentAccount;
                    ad7.Y(i5).B1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i6 = ((d) pr8Var).currentAccount;
            im7.n(i6).c0(pr8Var.f, pr8Var.h, true);
            if (pr8Var.s != null) {
                ?? obj = new Object();
                obj.d = j2;
                obj.b = true;
                int g = ls6.g("notify2_", str, sharedPreferences, 0);
                obj.c = g;
                if (g != 0) {
                    obj.a = ls6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                pr8Var.s.h(obj);
            }
        }
        pr8Var.finishFragment();
    }
}
