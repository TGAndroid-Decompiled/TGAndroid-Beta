package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class cc implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Object b;

    public cc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        a aVar;
        Object[] objArr;
        boolean z;
        r59 r59Var;
        va vaVar;
        boolean z2;
        f7 f7Var;
        f7 f7Var2;
        f7 f7Var3;
        byte b = this.a;
        boolean z3 = false;
        int i = 0;
        z3 = false;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                dc dcVar = (dc) obj;
                View view = dcVar.b;
                int[] iArr = dcVar.r;
                view.getLocationInWindow(iArr);
                int i2 = iArr[1];
                if (i2 != dcVar.s) {
                    dcVar.s = i2;
                    bka bkaVar = dcVar.c;
                    if (bkaVar.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = bkaVar.f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == bkaVar && bkaVar.getWidth() != 0) {
                        bkaVar.onMeasure(View.MeasureSpec.makeMeasureSpec(bkaVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(bkaVar.getHeight(), 1073741824));
                        bkaVar.onLayout(false, bkaVar.getLeft(), bkaVar.getTop(), bkaVar.getRight(), bkaVar.getBottom());
                        bkaVar.invalidate();
                    }
                }
                return true;
            case 1:
                aVar = ((d) ((dt1) obj).d).actionBar;
                aVar.invalidate();
                return true;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i3 = ChatActivityEnterView.z7;
                tx1 tx1Var = chatActivityEnterView.h2;
                px1 px1Var = chatActivityEnterView.f1;
                if (px1Var != null && px1Var.getVisibility() == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (objArr == null || chatActivityEnterView.v3) {
                    chatActivityEnterView.R6 = false;
                }
                un3 un3Var = chatActivityEnterView.j1;
                if ((un3Var == null || !un3Var.o()) && !chatActivityEnterView.R6 && (chatActivityEnterView.v3 || (chatActivityEnterView.n <= 0.0f && (objArr != null || chatActivityEnterView.Q6)))) {
                    z = true;
                } else {
                    z = false;
                }
                if (chatActivityEnterView.Q6 != z && chatActivityEnterView.K6 != null) {
                    chatActivityEnterView.Q6 = z;
                    chatActivityEnterView.h2();
                    chatActivityEnterView.requestLayout();
                }
                if (chatActivityEnterView.O0()) {
                    float d = chatActivityEnterView.O6.d(!chatActivityEnterView.Q6);
                    ln lnVar = chatActivityEnterView.N6;
                    un3 un3Var2 = chatActivityEnterView.j1;
                    if (un3Var2 != null && un3Var2.o()) {
                        z3 = true;
                    }
                    float d2 = lnVar.d(z3);
                    float max = Math.max(Math.min(Math.min(1.0f, chatActivityEnterView.n), d), d2);
                    float max2 = Math.max(Math.min(chatActivityEnterView.h, d), d2);
                    tc tcVar = chatActivityEnterView.K6;
                    sc scVar = tcVar.d;
                    scVar.setScaleX(max2);
                    scVar.setScaleY(max2);
                    tcVar.setAlpha(max);
                    if (tx1Var != null && (tx1Var.getAlpha() != max || tx1Var.getScaleX() != max2 || tx1Var.getScaleY() != max2)) {
                        tx1Var.animate().cancel();
                        chatActivityEnterView.l2 = max;
                        tx1Var.setAlpha(max);
                        tx1Var.setScaleX(max2);
                        tx1Var.setScaleY(max2);
                    }
                }
                return true;
            case 3:
                n52 n52Var = (n52) obj;
                x20 x20Var = n52Var.b.U2;
                if (x20Var != null) {
                    f = x20Var.getAlpha();
                }
                if (f != n52Var.A0) {
                    n52Var.A0 = f;
                    n52Var.h0();
                }
                return true;
            case 4:
                Field field = EditTextBoldCursor.E1;
                cl4 cl4Var = ((EditTextBoldCursor) obj).Z0;
                if (cl4Var != null) {
                    cl4Var.c();
                }
                return true;
            case 5:
                ((yt5) obj).invalidate();
                return true;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                profileActivity.X3();
                profileActivity.Y3();
                return true;
            case 7:
                fja fjaVar = (fja) obj;
                if (fjaVar.a && fjaVar.b > 0) {
                    fjaVar.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                fjaVar.s();
                if (fjaVar.h0 && (r59Var = fjaVar.F) != null && !r59Var.d0()) {
                    float p = fjaVar.p();
                    if (!Float.isInfinite(p)) {
                        fjaVar.h0 = false;
                        fjaVar.u(fjaVar.F, Math.round(p - fjaVar.V));
                        fjaVar.C();
                    }
                }
                if (fjaVar.a && fjaVar.b > 0) {
                    fjaVar.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    fjaVar.b--;
                    fjaVar.c++;
                }
                return true;
            case 8:
                ((xza) obj).t0();
                return true;
            case 9:
                goc gocVar = (goc) ((qw9) obj).c;
                if (gocVar.G) {
                    gocVar.X0();
                }
                return true;
            case 10:
                vnc vncVar = (vnc) obj;
                goc gocVar2 = vncVar.e;
                if (gocVar2.a0 != null && (vaVar = gocVar2.a) != null) {
                    if (gocVar2.r0 && !vaVar.canScrollVertically(1)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (gocVar2.c0 != z2) {
                        gocVar2.c0 = z2;
                        gocVar2.a0.animate().cancel();
                        l66 l66Var = gocVar2.a0;
                        if (z2) {
                            l66Var.setVisibility(0);
                            gocVar2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(d53.g).start();
                        } else {
                            l66Var.setAlpha(0.0f);
                            gocVar2.a0.setVisibility(4);
                        }
                    }
                }
                gocVar2.f1();
                View m = gocVar2.a.f3.m(gocVar2.h);
                if (m != null) {
                    f = m.getY();
                    i = m.getHeight();
                }
                if (m != vncVar.a || f != vncVar.b || i != vncVar.c) {
                    vncVar.a = m;
                    vncVar.b = f;
                    vncVar.c = i;
                    gocVar2.Y0();
                }
                return true;
            case 11:
                mqc mqcVar = (mqc) obj;
                soc socVar = mqcVar.c;
                float cardRotationX = socVar.getCardRotationX();
                float cardRotationY = socVar.getCardRotationY();
                if (cardRotationX != mqcVar.b0 || cardRotationY != mqcVar.c0) {
                    mqcVar.b0 = cardRotationX;
                    mqcVar.c0 = cardRotationY;
                    mqcVar.M.invalidate();
                }
                return true;
            default:
                rrc rrcVar = (rrc) ((f7) obj).c;
                f7 f7Var4 = rrcVar.x;
                if (f7Var4 != null && rrcVar.a0 != null && f7Var4.getHeight() > 0 && rrcVar.a0.getHeight() > 0) {
                    float paddingTop = rrcVar.fragmentView.getPaddingTop();
                    if (rrcVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (rrcVar.w.getScaleY() * (rrcVar.w.getContentBottom() - rrcVar.w.getPivotY())) + rrcVar.w.getPivotY() + rrcVar.w.getY());
                    }
                    float max3 = Math.max(0.0f, Math.min(rrcVar.fragmentView.getHeight() - rrcVar.fragmentView.getPaddingBottom(), rrcVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max3 - (Math.min(gm.L(12.0f), max3 / 4.0f) * 2.0f)) / rrcVar.x.getHeight());
                    rrcVar.x.setPivotX(f7Var.getWidth() / 2.0f);
                    rrcVar.x.setPivotY(f7Var2.getHeight() / 2.0f);
                    rrcVar.x.setScaleX(min);
                    rrcVar.x.setScaleY(min);
                    rrcVar.x.setTranslationY((((max3 / 2.0f) + paddingTop) - f7Var3.getTop()) - (rrcVar.x.getHeight() / 2.0f));
                }
                if (rrcVar.b0 != null || rrcVar.c0 < 1.0f) {
                    rrcVar.G0();
                }
                return true;
        }
    }
}
