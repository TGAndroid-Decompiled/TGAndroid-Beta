package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class vt0 {
    public static void a(Activity activity, int i, long j, long j2, TL_bots.BotVerifierSettings botVerifierSettings, qt0 qt0Var) {
        String str;
        TLRPC.User user;
        int i2;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j2));
            str = lbc.l(X1);
            user = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j2));
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
        int L = hl.L(28.0f);
        int L2 = hl.L(28.0f);
        int i4 = aob.Ti;
        ShapeDrawable c0 = aob.c0(L, L2, aob.w0(null, i4, false));
        uob M = yob.M(i4);
        frameLayout2.setBackground(c0);
        yob.j(frameLayout2, c0, M, null, null);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(28.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(user);
        de0Var.f(user, rb0Var);
        frameLayout2.addView(de0Var, tre.e(28, 28, 51));
        de0 de0Var2 = new de0(activity);
        de0Var2.setEmojiColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.z9, false), PorterDuff.Mode.SRC_IN));
        de0Var2.setAnimatedEmojiDrawable(wl.m(i, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(de0Var2, tre.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        ema emaVar = new ema(activity);
        yob.W(emaVar, aob.j5, null);
        emaVar.setTextSize(13);
        emaVar.setEllipsizeByGradient(true);
        emaVar.l(str, false);
        emaVar.setWidthWrapContent(true);
        frameLayout2.addView(emaVar, tre.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, tre.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = ob6.M0(2131752978, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        if (i3 >= 0) {
            i2 = 2131752979;
        } else {
            i2 = 2131752980;
        }
        idVar.U = ob6.M0(i2, null);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131746048, null), new tt0(zArr, i, j, j2, qt0Var));
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }
}
