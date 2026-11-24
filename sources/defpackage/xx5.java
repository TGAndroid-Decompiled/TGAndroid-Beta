package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class xx5 implements wi3 {
    public final byte a = 0;
    public final LaunchActivity b;
    public final TLRPC.User c;
    public final String d;
    public final int e;

    public xx5(LaunchActivity launchActivity, String str, int i, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i;
        this.c = user;
    }

    @Override
    public final boolean G() {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        byte b = this.a;
        int i3 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j = ((zc7) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = na7.q1(i3).o1(user);
                z3a.B(i3).o0(na7.q1(i3).h1(j), tL_inputMediaGame, 0L, 0L);
                Bundle l = ir2.l("scrollToTopOnResume", true);
                if (cf3.B(j)) {
                    l.putInt("enc_id", (int) (j & 4294967295L));
                } else if (cf3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (na7.q1(i3).A(l, cj3Var, null, null)) {
                    kk7.f(i3).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.N()).U(new mu1(l), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.C1;
                long j2 = ((zc7) arrayList.get(0)).a;
                Bundle l2 = ir2.l("scrollToTopOnResume", true);
                if (cf3.B(j2)) {
                    l2.putInt("enc_id", (int) (j2 & 4294967295L));
                } else if (cf3.D(j2)) {
                    l2.putLong("user_id", j2);
                } else {
                    l2.putLong("chat_id", -j2);
                }
                l2.putString("attach_bot", l7c.p(user));
                if (str != null) {
                    l2.putString("attach_bot_start_command", str);
                }
                if (na7.q1(i3).A(l2, cj3Var, null, null)) {
                    kk7.f(i3).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.N()).U(new mu1(l2), true, false);
                }
                return true;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        byte b = this.a;
        return false;
    }

    public xx5(LaunchActivity launchActivity, TLRPC.User user, String str, int i) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i;
    }
}
