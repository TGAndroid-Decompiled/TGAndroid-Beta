package ki;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q9;
public abstract class o1 {
    public static void a(Activity activity, int i7, long j3, long j10, TL_bots.BotVerifierSettings botVerifierSettings, bi.x3 x3Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j10));
            str = p10.l(c22);
            user = c22;
        } else {
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j10));
            if (O0 == null) {
                str = "";
                user = O0;
            } else {
                str = O0.title;
                user = O0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i12 = m6.Ti;
        ShapeDrawable e02 = m6.e0(L, L2, m6.x0(null, i12, false));
        p6 M = t6.M(i12);
        frameLayout2.setBackground(e02);
        t6.j(frameLayout2, e02, M, null, null);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        b9 b9Var = new b9((h6) null);
        b9Var.l(user);
        q9Var.f(user, b9Var);
        frameLayout2.addView(q9Var, na.e(28, 28, 51));
        q9 q9Var2 = new q9(activity);
        q9Var2.setEmojiColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.f29761z9, false), PorterDuff.Mode.SRC_IN));
        q9Var2.setAnimatedEmojiDrawable(p5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(q9Var2, na.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        m5 m5Var = new m5(activity);
        t6.X(m5Var, m6.f29455j5, null);
        m5Var.setTextSize(13);
        m5Var.setEllipsizeByGradient(true);
        m5Var.l(str, false);
        m5Var.setWidthWrapContent(true);
        frameLayout2.addView(m5Var, na.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, na.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String N0 = hd.N0(2131752985, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        if (i11 >= 0) {
            i10 = 2131752986;
        } else {
            i10 = 2131752987;
        }
        t1Var.U = hd.N0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.k(hd.N0(2131746125, null), new ii.h(zArr, i7, j3, j10, x3Var));
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
