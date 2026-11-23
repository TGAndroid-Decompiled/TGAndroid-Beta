package ki;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p9;
public abstract class o1 {
    public static void a(Activity activity, int i7, long j3, long j10, TL_bots.BotVerifierSettings botVerifierSettings, bi.x3 x3Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j10));
            str = n10.l(c22);
            user = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j10));
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
        int i12 = n6.Ti;
        ShapeDrawable e02 = n6.e0(L, L2, n6.x0(null, i12, false));
        q6 M = u6.M(i12);
        frameLayout2.setBackground(e02);
        u6.j(frameLayout2, e02, M, null, null);
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        a9 a9Var = new a9((i6) null);
        a9Var.l(user);
        p9Var.f(user, a9Var);
        frameLayout2.addView(p9Var, na.e(28, 28, 51));
        p9 p9Var2 = new p9(activity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.f29865z9, false), PorterDuff.Mode.SRC_IN));
        p9Var2.setAnimatedEmojiDrawable(o5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(p9Var2, na.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(activity);
        u6.X(n5Var, n6.f29559j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str, false);
        n5Var.setWidthWrapContent(true);
        frameLayout2.addView(n5Var, na.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, na.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String N0 = gd.N0(2131752985, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        if (i11 >= 0) {
            i10 = 2131752986;
        } else {
            i10 = 2131752987;
        }
        t1Var.U = gd.N0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.k(gd.N0(2131746125, null), new ii.h(zArr, i7, j3, j10, x3Var));
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
