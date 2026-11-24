package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class nt0 {
    public static void a(Activity activity, int i, long j, long j2, TL_bots.BotVerifierSettings botVerifierSettings, it0 it0Var) {
        String str;
        TLRPC.User user;
        int i2;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 >= 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j2));
            str = l7c.l(V1);
            user = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j2));
            if (K0 == null) {
                str = "";
                user = K0;
            } else {
                str = K0.title;
                user = K0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gl.L(28.0f);
        int L2 = gl.L(28.0f);
        int i4 = bkb.Si;
        ShapeDrawable c0 = bkb.c0(L, L2, bkb.w0(null, i4, false));
        vkb M = zkb.M(i4);
        frameLayout2.setBackground(c0);
        zkb.j(frameLayout2, c0, M, null, null);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(28.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(user);
        be0Var.f(user, pb0Var);
        frameLayout2.addView(be0Var, nme.e(28, 28, 51));
        be0 be0Var2 = new be0(activity);
        be0Var2.setEmojiColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.y9, false), PorterDuff.Mode.SRC_IN));
        be0Var2.setAnimatedEmojiDrawable(vl.m(i, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(be0Var2, nme.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        jia jiaVar = new jia(activity);
        zkb.W(jiaVar, bkb.i5, null);
        jiaVar.setTextSize(13);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.l(str, false);
        jiaVar.setWidthWrapContent(true);
        frameLayout2.addView(jiaVar, nme.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, nme.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = k96.M0(2131752985, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        if (i3 >= 0) {
            i2 = 2131752986;
        } else {
            i2 = 2131752987;
        }
        hdVar.U = k96.M0(i2, null);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131746128, null), new lt0(zArr, i, j, j2, it0Var));
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }
}
