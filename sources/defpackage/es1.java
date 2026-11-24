package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class es1 extends u17 {
    public boolean V;
    public final yv1 W;

    public es1(yv1 yv1Var, Context context, long j, long j2, yv1 yv1Var2, ylb ylbVar) {
        super(context, j, j2, yv1Var2, ylbVar);
        this.W = yv1Var;
        this.V = true;
    }

    @Override
    public final boolean a() {
        yv1 yv1Var = this.W;
        if (yv1Var.T.getVisibility() == 0 && !yv1Var.C3) {
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
        yv1 yv1Var = this.W;
        if (yv1Var.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                yv1Var.Oa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g1 = k47.g1(botInlineResult);
            kq1 kq1Var = yv1Var.gb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = botInlineResult.description;
            String str4 = botInlineResult.content.url;
            zv3.I0(yv1Var, null, kq1Var, str2, str3, str4, str4, g1[0], g1[1], -1, yv1Var.Y7());
        }
    }

    @Override
    public final void l(boolean z) {
        String str;
        yv1 yv1Var = this.W;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            k17 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.r0;
                if (str2 != null && str2.equals("gif")) {
                    str = jb6.M0(2131745498, null);
                } else {
                    str = null;
                }
            }
            ms1Var.setCaption(str);
            ay1 ay1Var = yv1Var.a0.F2;
            if (ay1Var != null) {
                if (z) {
                    ay1Var.e = true;
                    ay1Var.b = System.currentTimeMillis();
                    ay1Var.invalidateSelf();
                    return;
                }
                ay1Var.e = false;
            }
        }
    }

    @Override
    public final void m() {
        yv1 yv1Var = this.W;
        if (yv1Var.r5 && ((getAdapter().S == null || yv1Var.s5 || yv1Var.t5) && yv1Var.h != null && getAdapter().S != null)) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                String M0 = jb6.M0(2131689472, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745428, null);
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                yv1Var.showDialog(heVar);
                d1.edit().putBoolean("secretbot", true).commit();
            }
        }
        yv1Var.ad();
    }

    @Override
    public final void n(boolean z) {
        boolean z2;
        if (this.V != z) {
            yv1 yv1Var = this.W;
            fdb fdbVar = yv1Var.s1;
            if (!yv1Var.isInPreviewMode() && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            gm.P3(fdbVar, z2, false);
            this.V = z;
        }
    }
}
