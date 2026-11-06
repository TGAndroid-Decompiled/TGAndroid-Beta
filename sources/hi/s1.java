package hi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
public abstract class s1 {
    public static void a(Activity activity, final int i7, final long j3, final long j10, TL_bots.BotVerifierSettings botVerifierSettings, final o1 o1Var) {
        String str;
        TLRPC.User user;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j10));
            str = t10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j10));
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
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        w8 w8Var = new w8((f6) null);
        w8Var.l(user);
        l9Var.e(user, w8Var);
        frameLayout2.addView(l9Var, ha.e(28, 28, 51));
        l9 l9Var2 = new l9(activity);
        l9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.z9, false), PorterDuff.Mode.SRC_IN));
        l9Var2.setAnimatedEmojiDrawable(i5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(l9Var2, ha.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(activity);
        r6.Y(k5Var, k6.f27956j5, null);
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout2.addView(k5Var, ha.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, ha.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = hd.M0(2131752997, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M02;
        if (i11 >= 0) {
            i10 = 2131752998;
        } else {
            i10 = 2131752999;
        }
        u1Var.T = hd.M0(i10, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.k(hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i14 = i7;
                setcustomverification.bot = qp.s1(i14).o1(j3);
                setcustomverification.peer = qp.s1(i14).j1(j10);
                ConnectionsManager.getInstance(i14).sendRequest(setcustomverification, new bi.j(15, zArr2, o1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
