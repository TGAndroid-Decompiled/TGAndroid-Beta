package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class es1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;

    public es1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        a aVar;
        d79 d79Var;
        wa waVar;
        boolean z;
        g7 g7Var;
        g7 g7Var2;
        g7 g7Var3;
        byte b = this.a;
        int i = 0;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                aVar = ((e) ((fs1) obj).d).actionBar;
                aVar.invalidate();
                return true;
            case 1:
                s42 s42Var = (s42) obj;
                y10 y10Var = s42Var.b.U2;
                if (y10Var != null) {
                    f = y10Var.getAlpha();
                }
                if (f != s42Var.A0) {
                    s42Var.A0 = f;
                    s42Var.g0();
                }
                return true;
            case 2:
                Field field = EditTextBoldCursor.F1;
                cl4 cl4Var = ((EditTextBoldCursor) obj).Z0;
                if (cl4Var != null) {
                    cl4Var.c();
                }
                return true;
            case 3:
                ((bu5) obj).invalidate();
                return true;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.U3();
                profileActivity.V3();
                return true;
            case 5:
                wka wkaVar = (wka) obj;
                if (wkaVar.a && wkaVar.b > 0) {
                    wkaVar.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                wkaVar.s();
                if (wkaVar.h0 && (d79Var = wkaVar.F) != null && !d79Var.e0()) {
                    float p = wkaVar.p();
                    if (!Float.isInfinite(p)) {
                        wkaVar.h0 = false;
                        wkaVar.u(wkaVar.F, Math.round(p - wkaVar.V));
                        wkaVar.C();
                    }
                }
                if (wkaVar.a && wkaVar.b > 0) {
                    wkaVar.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    wkaVar.b--;
                    wkaVar.c++;
                }
                return true;
            case 6:
                ((w1b) obj).s0();
                return true;
            case 7:
                uqc uqcVar = (uqc) ((iy9) obj).c;
                if (uqcVar.G) {
                    uqcVar.W0();
                }
                return true;
            case 8:
                jqc jqcVar = (jqc) obj;
                uqc uqcVar2 = jqcVar.e;
                if (uqcVar2.a0 != null && (waVar = uqcVar2.a) != null) {
                    if (uqcVar2.r0 && !waVar.canScrollVertically(1)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (uqcVar2.c0 != z) {
                        uqcVar2.c0 = z;
                        uqcVar2.a0.animate().cancel();
                        p66 p66Var = uqcVar2.a0;
                        if (z) {
                            p66Var.setVisibility(0);
                            uqcVar2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.g).start();
                        } else {
                            p66Var.setAlpha(0.0f);
                            uqcVar2.a0.setVisibility(4);
                        }
                    }
                }
                uqcVar2.e1();
                View m = uqcVar2.a.f3.m(uqcVar2.h);
                if (m != null) {
                    f = m.getY();
                    i = m.getHeight();
                }
                if (m != jqcVar.a || f != jqcVar.b || i != jqcVar.c) {
                    jqcVar.a = m;
                    jqcVar.b = f;
                    jqcVar.c = i;
                    uqcVar2.X0();
                }
                return true;
            case 9:
                wsc wscVar = (wsc) obj;
                frc frcVar = wscVar.c;
                float cardRotationX = frcVar.getCardRotationX();
                float cardRotationY = frcVar.getCardRotationY();
                if (cardRotationX != wscVar.b0 || cardRotationY != wscVar.c0) {
                    wscVar.b0 = cardRotationX;
                    wscVar.c0 = cardRotationY;
                    wscVar.M.invalidate();
                }
                return true;
            default:
                euc eucVar = (euc) ((g7) obj).c;
                g7 g7Var4 = eucVar.x;
                if (g7Var4 != null && eucVar.a0 != null && g7Var4.getHeight() > 0 && eucVar.a0.getHeight() > 0) {
                    float paddingTop = eucVar.fragmentView.getPaddingTop();
                    if (eucVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (eucVar.w.getScaleY() * (eucVar.w.getContentBottom() - eucVar.w.getPivotY())) + eucVar.w.getPivotY() + eucVar.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(eucVar.fragmentView.getHeight() - eucVar.fragmentView.getPaddingBottom(), eucVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(hl.L(12.0f), max / 4.0f) * 2.0f)) / eucVar.x.getHeight());
                    eucVar.x.setPivotX(g7Var.getWidth() / 2.0f);
                    eucVar.x.setPivotY(g7Var2.getHeight() / 2.0f);
                    eucVar.x.setScaleX(min);
                    eucVar.x.setScaleY(min);
                    eucVar.x.setTranslationY((((max / 2.0f) + paddingTop) - g7Var3.getTop()) - (eucVar.x.getHeight() / 2.0f));
                }
                if (eucVar.b0 != null || eucVar.c0 < 1.0f) {
                    eucVar.G0();
                }
                return true;
        }
    }
}
