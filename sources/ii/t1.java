package ii;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public abstract class t1 {
    public static void a(Activity activity, final int i3, final long j10, final long j11, TL_bots.BotVerifierSettings botVerifierSettings, final p1 p1Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j11));
            str = l10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j11));
            if (M0 == null) {
                str = "";
                user = M0;
            } else {
                str = M0.title;
                user = M0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i12 = k6.Qi;
        ShapeDrawable e02 = k6.e0(L, L2, k6.x0(null, i12, false));
        n6 N = r6.N(i12);
        frameLayout2.setBackground(e02);
        r6.k(frameLayout2, e02, N, null, null);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        u8 u8Var = new u8((e6) null);
        u8Var.l(user);
        k9Var.e(user, u8Var);
        frameLayout2.addView(k9Var, mf.e(28, 28, 51));
        k9 k9Var2 = new k9(activity);
        k9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.f28293z9, false), PorterDuff.Mode.SRC_IN));
        k9Var2.setAnimatedEmojiDrawable(g5.m(i3, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(k9Var2, mf.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(activity);
        r6.Y(k5Var, k6.f27988j5, null);
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout2.addView(k5Var, mf.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, mf.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = bd.M0(2131752997, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M02;
        if (i11 >= 0) {
            i10 = 2131752998;
        } else {
            i10 = 2131752999;
        }
        s1Var.U = bd.M0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.k(bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i14 = i3;
                setcustomverification.bot = hp.s1(i14).o1(j10);
                setcustomverification.peer = hp.s1(i14).j1(j11);
                ConnectionsManager.getInstance(i14).sendRequest(setcustomverification, new ai.f3(18, zArr2, p1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
