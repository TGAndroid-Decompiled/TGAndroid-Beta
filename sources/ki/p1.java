package ki;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q9;
public abstract class p1 {
    public static void a(Activity activity, int i7, long j3, long j10, TL_bots.BotVerifierSettings botVerifierSettings, bi.r3 r3Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j10));
            str = o10.l(c22);
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
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        b9 b9Var = new b9((i6) null);
        b9Var.l(user);
        q9Var.f(user, b9Var);
        frameLayout2.addView(q9Var, ma.e(28, 28, 51));
        q9 q9Var2 = new q9(activity);
        q9Var2.setEmojiColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.f29810z9, false), PorterDuff.Mode.SRC_IN));
        q9Var2.setAnimatedEmojiDrawable(o5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(q9Var2, ma.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(activity);
        u6.X(n5Var, n6.f29504j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str, false);
        n5Var.setWidthWrapContent(true);
        frameLayout2.addView(n5Var, ma.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, ma.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = gd.M0(2131752986, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        if (i11 >= 0) {
            i10 = 2131752987;
        } else {
            i10 = 2131752988;
        }
        u1Var.U = gd.M0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.k(gd.M0(2131746126, null), new ii.h(zArr, i7, j3, j10, r3Var));
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
