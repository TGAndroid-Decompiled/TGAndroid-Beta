package ki;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public abstract class t1 {
    public static void a(Activity activity, int i7, long j3, long j10, TL_bots.BotVerifierSettings botVerifierSettings, p1 p1Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j10));
            str = q10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j10));
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
        int i12 = j6.Ti;
        ShapeDrawable e02 = j6.e0(L, L2, j6.x0(null, i12, false));
        m6 M = q6.M(i12);
        frameLayout2.setBackground(e02);
        q6.j(frameLayout2, e02, M, null, null);
        i9 i9Var = new i9(activity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        t8 t8Var = new t8((e6) null);
        t8Var.l(user);
        i9Var.f(user, t8Var);
        frameLayout2.addView(i9Var, ja.e(28, 28, 51));
        i9 i9Var2 = new i9(activity);
        i9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.f29263z9, false), PorterDuff.Mode.SRC_IN));
        i9Var2.setAnimatedEmojiDrawable(g5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(i9Var2, ja.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(activity);
        q6.X(j5Var, j6.f28957j5, null);
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout2.addView(j5Var, ja.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, ja.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = hd.M0(2131752997, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M02;
        if (i11 >= 0) {
            i10 = 2131752998;
        } else {
            i10 = 2131752999;
        }
        t1Var.U = hd.M0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.k(hd.M0(2131746321, null), new r1(zArr, i7, j3, j10, p1Var));
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
