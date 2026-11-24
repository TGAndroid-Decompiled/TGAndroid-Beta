package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sq1 extends uz6 {
    public boolean V;
    public final mu1 W;

    public sq1(mu1 mu1Var, Context context, long j, long j2, mu1 mu1Var2, wjb wjbVar) {
        super(context, j, j2, mu1Var2, wjbVar);
        this.W = mu1Var;
        this.V = true;
    }

    @Override
    public final boolean a() {
        mu1 mu1Var = this.W;
        if (mu1Var.T.getVisibility() == 0 && !mu1Var.C3) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void j() {
        this.W.Oc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        mu1 mu1Var = this.W;
        if (mu1Var.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                mu1Var.Ea(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g1 = k27.g1(botInlineResult);
            yo1 yo1Var = mu1Var.gb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = botInlineResult.description;
            String str4 = botInlineResult.content.url;
            ou3.I0(mu1Var, null, yo1Var, str2, str3, str4, str4, g1[0], g1[1], -1, mu1Var.Q7());
        }
    }

    @Override
    public final void l(boolean z) {
        String str;
        mu1 mu1Var = this.W;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            kz6 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.r0;
                if (str2 != null && str2.equals("gif")) {
                    str = k96.M0(2131745572, null);
                } else {
                    str = null;
                }
            }
            ar1Var.setCaption(str);
            nw1 nw1Var = mu1Var.a0.F2;
            if (nw1Var != null) {
                if (z) {
                    nw1Var.e = true;
                    nw1Var.b = System.currentTimeMillis();
                    nw1Var.invalidateSelf();
                    return;
                }
                nw1Var.e = false;
            }
        }
    }

    @Override
    public final void m() {
        mu1 mu1Var = this.W;
        if (mu1Var.r5 && ((getAdapter().S == null || mu1Var.s5 || mu1Var.t5) && mu1Var.h != null && getAdapter().S != null)) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                String M0 = k96.M0(2131689472, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745502, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                mu1Var.showDialog(hdVar);
                c1.edit().putBoolean("secretbot", true).commit();
            }
        }
        mu1Var.Oc();
    }

    @Override
    public final void n(boolean z) {
        boolean z2;
        if (this.V != z) {
            mu1 mu1Var = this.W;
            dbb dbbVar = mu1Var.s1;
            if (!mu1Var.isInPreviewMode() && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            gl.P3(dbbVar, z2, false);
            this.V = z;
        }
    }
}
