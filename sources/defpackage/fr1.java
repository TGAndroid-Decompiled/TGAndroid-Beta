package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fr1 extends b27 {
    public boolean V;
    public final zu1 W;

    public fr1(zu1 zu1Var, Context context, long j, long j2, zu1 zu1Var2, vnb vnbVar) {
        super(context, j, j2, zu1Var2, vnbVar);
        this.W = zu1Var;
        this.V = true;
    }

    @Override
    public final boolean a() {
        zu1 zu1Var = this.W;
        if (zu1Var.T.getVisibility() == 0 && !zu1Var.C3) {
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
        this.W.ad();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        zu1 zu1Var = this.W;
        if (zu1Var.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                zu1Var.Pa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g1 = r47.g1(botInlineResult);
            lp1 lp1Var = zu1Var.gb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = botInlineResult.description;
            String str4 = botInlineResult.content.url;
            iv3.J0(zu1Var, null, lp1Var, str2, str3, str4, str4, g1[0], g1[1], -1, zu1Var.Y7());
        }
    }

    @Override
    public final void l(boolean z) {
        String str;
        zu1 zu1Var = this.W;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            r17 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.r0;
                if (str2 != null && str2.equals("gif")) {
                    str = ob6.M0(2131745492, null);
                } else {
                    str = null;
                }
            }
            nr1Var.setCaption(str);
            ax1 ax1Var = zu1Var.a0.E2;
            if (ax1Var != null) {
                if (z) {
                    ax1Var.e = true;
                    ax1Var.b = System.currentTimeMillis();
                    ax1Var.invalidateSelf();
                    return;
                }
                ax1Var.e = false;
            }
        }
    }

    @Override
    public final void m() {
        zu1 zu1Var = this.W;
        if (zu1Var.r5 && ((getAdapter().S == null || zu1Var.s5 || zu1Var.t5) && zu1Var.h != null && getAdapter().S != null)) {
            SharedPreferences e1 = uc7.e1();
            if (!e1.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                String M0 = ob6.M0(2131689472, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745422, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                zu1Var.showDialog(idVar);
                e1.edit().putBoolean("secretbot", true).commit();
            }
        }
        zu1Var.ad();
    }

    @Override
    public final void n(boolean z) {
        boolean z2;
        if (this.V != z) {
            zu1 zu1Var = this.W;
            zeb zebVar = zu1Var.s1;
            if (!zu1Var.isInPreviewMode() && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            hl.P3(zebVar, z2, false);
            this.V = z;
        }
    }
}
