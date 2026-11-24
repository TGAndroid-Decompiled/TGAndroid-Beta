package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class vu0 {
    public static void a(Activity activity, int i, long j, long j2, TL_bots.BotVerifierSettings botVerifierSettings, qu0 qu0Var) {
        String str;
        TLRPC.User user;
        int i2;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 >= 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j2));
            str = m9c.l(W1);
            user = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j2));
            if (L0 == null) {
                str = "";
                user = L0;
            } else {
                str = L0.title;
                user = L0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gm.L(28.0f);
        int L2 = gm.L(28.0f);
        int i4 = cmb.Si;
        ShapeDrawable c0 = cmb.c0(L, L2, cmb.w0(null, i4, false));
        wmb M = anb.M(i4);
        frameLayout2.setBackground(c0);
        anb.j(frameLayout2, c0, M, null, null);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(28.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(user);
        bf0Var.f(user, pc0Var);
        frameLayout2.addView(bf0Var, qoe.e(28, 28, 51));
        bf0 bf0Var2 = new bf0(activity);
        bf0Var2.setEmojiColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.y9, false), PorterDuff.Mode.SRC_IN));
        bf0Var2.setAnimatedEmojiDrawable(vm.m(i, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(bf0Var2, qoe.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        lka lkaVar = new lka(activity);
        anb.W(lkaVar, cmb.i5, null);
        lkaVar.setTextSize(13);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.l(str, false);
        lkaVar.setWidthWrapContent(true);
        frameLayout2.addView(lkaVar, qoe.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, qoe.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = jb6.M0(2131752950, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        if (i3 >= 0) {
            i2 = 2131752951;
        } else {
            i2 = 2131752952;
        }
        heVar.U = jb6.M0(i2, null);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131746054, null), new tu0(zArr, i, j, j2, qu0Var));
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }
}
