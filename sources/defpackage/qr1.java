package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class qr1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;

    public qr1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        a aVar;
        o39 o39Var;
        va vaVar;
        boolean z;
        f7 f7Var;
        f7 f7Var2;
        f7 f7Var3;
        byte b = this.a;
        int i = 0;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                aVar = ((d) ((rr1) obj).d).actionBar;
                aVar.invalidate();
                return true;
            case 1:
                c42 c42Var = (c42) obj;
                x10 x10Var = c42Var.b.U2;
                if (x10Var != null) {
                    f = x10Var.getAlpha();
                }
                if (f != c42Var.A0) {
                    c42Var.A0 = f;
                    c42Var.h0();
                }
                return true;
            case 2:
                Field field = EditTextBoldCursor.E1;
                yi4 yi4Var = ((EditTextBoldCursor) obj).Z0;
                if (yi4Var != null) {
                    yi4Var.c();
                }
                return true;
            case 3:
                ((zr5) obj).invalidate();
                return true;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.T3();
                profileActivity.U3();
                return true;
            case 5:
                dha dhaVar = (dha) obj;
                if (dhaVar.a && dhaVar.b > 0) {
                    dhaVar.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                dhaVar.s();
                if (dhaVar.h0 && (o39Var = dhaVar.F) != null && !o39Var.d0()) {
                    float p = dhaVar.p();
                    if (!Float.isInfinite(p)) {
                        dhaVar.h0 = false;
                        dhaVar.u(dhaVar.F, Math.round(p - dhaVar.V));
                        dhaVar.C();
                    }
                }
                if (dhaVar.a && dhaVar.b > 0) {
                    dhaVar.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    dhaVar.b--;
                    dhaVar.c++;
                }
                return true;
            case 6:
                ((uxa) obj).s0();
                return true;
            case 7:
                hmc hmcVar = (hmc) ((gw9) obj).c;
                if (hmcVar.G) {
                    hmcVar.W0();
                }
                return true;
            case 8:
                wlc wlcVar = (wlc) obj;
                hmc hmcVar2 = wlcVar.e;
                if (hmcVar2.a0 != null && (vaVar = hmcVar2.a) != null) {
                    if (hmcVar2.r0 && !vaVar.canScrollVertically(1)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (hmcVar2.c0 != z) {
                        hmcVar2.c0 = z;
                        hmcVar2.a0.animate().cancel();
                        l46 l46Var = hmcVar2.a0;
                        if (z) {
                            l46Var.setVisibility(0);
                            hmcVar2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(s33.g).start();
                        } else {
                            l46Var.setAlpha(0.0f);
                            hmcVar2.a0.setVisibility(4);
                        }
                    }
                }
                hmcVar2.e1();
                View m = hmcVar2.a.f3.m(hmcVar2.h);
                if (m != null) {
                    f = m.getY();
                    i = m.getHeight();
                }
                if (m != wlcVar.a || f != wlcVar.b || i != wlcVar.c) {
                    wlcVar.a = m;
                    wlcVar.b = f;
                    wlcVar.c = i;
                    hmcVar2.X0();
                }
                return true;
            case 9:
                koc kocVar = (koc) obj;
                smc smcVar = kocVar.c;
                float cardRotationX = smcVar.getCardRotationX();
                float cardRotationY = smcVar.getCardRotationY();
                if (cardRotationX != kocVar.b0 || cardRotationY != kocVar.c0) {
                    kocVar.b0 = cardRotationX;
                    kocVar.c0 = cardRotationY;
                    kocVar.M.invalidate();
                }
                return true;
            default:
                qpc qpcVar = (qpc) ((f7) obj).c;
                f7 f7Var4 = qpcVar.x;
                if (f7Var4 != null && qpcVar.a0 != null && f7Var4.getHeight() > 0 && qpcVar.a0.getHeight() > 0) {
                    float paddingTop = qpcVar.fragmentView.getPaddingTop();
                    if (qpcVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (qpcVar.w.getScaleY() * (qpcVar.w.getContentBottom() - qpcVar.w.getPivotY())) + qpcVar.w.getPivotY() + qpcVar.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(qpcVar.fragmentView.getHeight() - qpcVar.fragmentView.getPaddingBottom(), qpcVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(gl.L(12.0f), max / 4.0f) * 2.0f)) / qpcVar.x.getHeight());
                    qpcVar.x.setPivotX(f7Var.getWidth() / 2.0f);
                    qpcVar.x.setPivotY(f7Var2.getHeight() / 2.0f);
                    qpcVar.x.setScaleX(min);
                    qpcVar.x.setScaleY(min);
                    qpcVar.x.setTranslationY((((max / 2.0f) + paddingTop) - f7Var3.getTop()) - (qpcVar.x.getHeight() / 2.0f));
                }
                if (qpcVar.b0 != null || qpcVar.c0 < 1.0f) {
                    qpcVar.F0();
                }
                return true;
        }
    }
}
