package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class yz5 implements oj3 {
    public final byte a = 0;
    public final LaunchActivity b;
    public final TLRPC.User c;
    public final String d;
    public final int e;

    public yz5(LaunchActivity launchActivity, String str, int i, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i;
        this.c = user;
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        byte b = this.a;
        int i3 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j = ((jf7) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = uc7.s1(i3).q1(user);
                r7a.B(i3).o0(uc7.s1(i3).j1(j), tL_inputMediaGame, 0L, 0L);
                Bundle l = bs2.l("scrollToTopOnResume", true);
                if (wf3.B(j)) {
                    l.putInt("enc_id", (int) (j & 4294967295L));
                } else if (wf3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (uc7.s1(i3).C(l, uj3Var, null, null)) {
                    jn7.f(i3).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.N()).U(new zu1(l), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.C1;
                long j2 = ((jf7) arrayList.get(0)).a;
                Bundle l2 = bs2.l("scrollToTopOnResume", true);
                if (wf3.B(j2)) {
                    l2.putInt("enc_id", (int) (j2 & 4294967295L));
                } else if (wf3.D(j2)) {
                    l2.putLong("user_id", j2);
                } else {
                    l2.putLong("chat_id", -j2);
                }
                l2.putString("attach_bot", lbc.p(user));
                if (str != null) {
                    l2.putString("attach_bot_start_command", str);
                }
                if (uc7.s1(i3).C(l2, uj3Var, null, null)) {
                    jn7.f(i3).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.N()).U(new zu1(l2), true, false);
                }
                return true;
        }
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    public yz5(LaunchActivity launchActivity, TLRPC.User user, String str, int i) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i;
    }
}
