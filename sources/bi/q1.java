package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn;
import org.telegram.ui.iw;
import org.telegram.ui.mp;
import org.telegram.ui.ns;
import org.telegram.ui.qw;
import org.telegram.ui.rq;
public final class q1 extends pj0 {
    public final int f4553e3;
    public final Object f4554f3;

    public q1(int i7, Context context, Object obj) {
        super(context, null);
        this.f4553e3 = i7;
        this.f4554f3 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        int i10;
        switch (this.f4553e3) {
            case 5:
                ci ciVar = ((kg.g0) this.f4554f3).f38656b;
                int L = org.telegram.messenger.g0.L(30.0f) + ciVar.Y3[0];
                if (!ciVar.f32591a2) {
                    i7 = org.telegram.messenger.g0.f22561m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            case 15:
                ci ciVar2 = ((ej) this.f4554f3).f38656b;
                int L2 = org.telegram.messenger.g0.L(30.0f) + ciVar2.Y3[0];
                if (!ciVar2.f32591a2) {
                    i10 = org.telegram.messenger.g0.f22561m;
                } else {
                    i10 = 0;
                }
                if (f10 < L2 + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.f4553e3) {
            case 7:
                if (view != ((org.telegram.ui.y6) this.f4554f3).W) {
                    return true;
                }
                return false;
            case 19:
                ez ezVar = (ez) this.f4554f3;
                if (ezVar.isEnabled() && !((qw) ezVar.J).f49166b.f52609k2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.f4553e3) {
            case 0:
                ((w1) this.f4554f3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ma) this.f4554f3).J0(view, f10, f11);
            case 19:
                if (((ez) this.f4554f3).f33380n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((cz) view).f32813f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((u61) this.f4554f3).f38573n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((s61) view).f37880c;
                    float f13 = L2;
                    if (rectF2.left - f13 < f10 && rectF2.right + f13 > f10) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f10, f11);
        }
    }

    @Override
    public boolean R0() {
        switch (this.f4553e3) {
            case 28:
                if (getAdapter() != null && ((c51) this.f4554f3).B1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f4553e3) {
            case 1:
                return 0;
            case 24:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        switch (this.f4553e3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (((u61) this.f4554f3).V) {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    return;
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setAlpha(1.0f);
                return;
            default:
                super.addView(view, i7, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        di.s0 s0Var;
        boolean z9;
        dj djVar;
        ArrayList arrayList;
        q1 q1Var;
        ca0 ca0Var;
        int i7;
        q1 q1Var2;
        boolean z10;
        dj currentMessagesGroup;
        dj currentMessagesGroup2;
        switch (this.f4553e3) {
            case 1:
                di.g2 g2Var = (di.g2) this.f4554f3;
                int i10 = -1;
                if (!g2Var.f9816f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof di.n0) && (s0Var = ((di.n0) childAt).K) != null) {
                                i10 = s0Var.f9719a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > g2Var.F) {
                    g2Var.F = i10;
                    di.a aVar = g2Var.f9014i0.G1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                ue ueVar = (ue) this.f4554f3;
                q1 q1Var3 = ueVar.f14969c;
                if (q1Var3.getLayoutManager() != null && q1Var3.getAdapter() != null && q1Var3.getAdapter().b() != 0) {
                    float L = ueVar.h - org.telegram.messenger.g0.L(8.0f);
                    ueVar.f14970e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = ueVar.f14973r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ueVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.f4554f3).F = false;
                return;
            case 21:
                ca0 ca0Var2 = (ca0) this.f4554f3;
                org.telegram.ui.v8 v8Var = ca0Var2.f32521b;
                boolean z11 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                dj djVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != djVar2)) {
                        djVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    ia0 ia0Var = ca0Var2.f32524c0;
                    ArrayList arrayList2 = ia0Var.E;
                    q1 q1Var4 = ca0Var2.f32526f;
                    ia0Var.E.clear();
                    int i15 = 2;
                    if (i14 != 2 || q1Var4.V1) {
                        int i16 = z11 ? 1 : 0;
                        ?? r12 = z11;
                        while (true) {
                            boolean z12 = true;
                            if (i16 < childCount) {
                                View childAt4 = q1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= q1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                                        cj cjVar = currentMessagesGroup.f22048m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || cjVar.f21870i) && ((i14 != 0 || !q1Var5.getMessageObject().Z) && ((i14 != 1 || q1Var5.getMessageObject().Z) && ((i14 != i15 || q1Var5.ya) && (i14 == i15 || !q1Var5.ya)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                cjVar.f21864a = r12;
                                                cjVar.f21865b = r12;
                                                cjVar.f21866c = r12;
                                                cjVar.d = r12;
                                                cjVar.f21873l = r12;
                                                cjVar.f21872k = r12;
                                                cjVar.f21874m = q1Var5;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            cjVar.f21872k = q1Var5.I2();
                                            cjVar.f21873l = q1Var5.H2();
                                            int backgroundDrawableLeft = q1Var5.getBackgroundDrawableLeft() + q1Var5.getLeft();
                                            int backgroundDrawableRight = q1Var5.getBackgroundDrawableRight() + q1Var5.getLeft();
                                            int backgroundDrawableTop = q1Var5.getBackgroundDrawableTop() + q1Var5.getPaddingTop() + q1Var5.getTop();
                                            int backgroundDrawableBottom = q1Var5.getBackgroundDrawableBottom() + q1Var5.getPaddingTop() + q1Var5.getTop();
                                            if ((q1Var5.getCurrentPosition().f21455l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((q1Var5.getCurrentPosition().f21455l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (q1Var5.ya) {
                                                cjVar.f21874m = q1Var5;
                                            }
                                            int i18 = cjVar.f21865b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                cjVar.f21865b = backgroundDrawableTop;
                                            }
                                            int i19 = cjVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                cjVar.d = i17;
                                            }
                                            int i20 = cjVar.f21864a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                cjVar.f21864a = backgroundDrawableLeft;
                                            }
                                            int i21 = cjVar.f21866c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                cjVar.f21866c = backgroundDrawableRight;
                                            }
                                        }
                                    }
                                }
                                i16++;
                                i15 = 2;
                                r12 = 0;
                            } else {
                                int i22 = 0;
                                while (i22 < arrayList2.size()) {
                                    dj djVar3 = (dj) arrayList2.get(i22);
                                    if (djVar3 == null) {
                                        arrayList = arrayList2;
                                        q1Var2 = q1Var4;
                                        z10 = z12;
                                        ca0Var = ca0Var2;
                                        i7 = i22;
                                    } else {
                                        cj cjVar2 = djVar3.f22048m;
                                        float R1 = cjVar2.f21874m.R1(z12);
                                        float f10 = cjVar2.f21864a + R1 + cjVar2.f21867e;
                                        float f11 = cjVar2.f21865b + cjVar2.f21868f;
                                        float f12 = cjVar2.f21869g + cjVar2.f21866c + R1;
                                        float f13 = cjVar2.d + cjVar2.h;
                                        if (!cjVar2.f21871j) {
                                            f11 += cjVar2.f21874m.getTranslationY();
                                            f13 += cjVar2.f21874m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + q1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + q1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        if (cjVar2.f21874m.getScaleX() == 1.0f && cjVar2.f21874m.getScaleY() == 1.0f) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        if (z9) {
                                            canvas.save();
                                            djVar = djVar3;
                                            arrayList = arrayList2;
                                            q1Var = q1Var4;
                                            canvas.scale(cjVar2.f21874m.getScaleX(), cjVar2.f21874m.getScaleY(), com.google.android.recaptcha.internal.a.A(f12, f10, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f15, f14, 2.0f, f14));
                                        } else {
                                            djVar = djVar3;
                                            arrayList = arrayList2;
                                            q1Var = q1Var4;
                                        }
                                        ca0Var = ca0Var2;
                                        dj djVar4 = djVar;
                                        i7 = i22;
                                        q1Var2 = q1Var;
                                        z10 = true;
                                        cjVar2.f21874m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, cjVar2.f21872k, cjVar2.f21873l, false, 0);
                                        cjVar2.f21874m = null;
                                        cjVar2.f21876o = djVar4.f22040c;
                                        if (z9) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = q1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var6.getCurrentMessagesGroup() == djVar4) {
                                                        int left = q1Var6.getLeft();
                                                        int top = q1Var6.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    q1Var4 = q1Var2;
                                    ca0Var2 = ca0Var;
                                    arrayList2 = arrayList;
                                    z12 = z10;
                                }
                            }
                        }
                    }
                    i14++;
                    ca0Var2 = ca0Var2;
                    z11 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                iw iwVar = (iw) this.f4554f3;
                v4.b0 b0Var = iwVar.f33591e0;
                v4.k kVar = iwVar.f33589c0;
                yl0 yl0Var = iwVar.f33590d0;
                if (yl0Var != null && kVar != null && b0Var != null && yl0Var.m0) {
                    canvas.save();
                    invalidate();
                    int b10 = yl0Var.b() - 1;
                    int i24 = 0;
                    while (true) {
                        if (i24 < getChildCount()) {
                            View childAt6 = getChildAt(i24);
                            if (RecyclerView.R(childAt6) == b10) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt6.getTranslationY() + childAt6.getBottom());
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (yl0Var != null && kVar != null && b0Var != null && yl0Var.m0) {
                    canvas.restore();
                }
                if (yl0Var != null && yl0Var.f16754o0 != null) {
                    canvas.save();
                    canvas.translate(yl0Var.f16754o0.getLeft(), yl0Var.f16754o0.getTranslationY() + yl0Var.f16754o0.getTop());
                    yl0Var.f16754o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e5 e5Var;
        v4.d1 K;
        int i7 = this.f4553e3;
        Object obj = this.f4554f3;
        switch (i7) {
            case 1:
                if (((di.g2) obj).f9816f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (((fi.f3) obj).K) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    vk vkVar = (vk) obj;
                    if (motionEvent.getY() < vkVar.f39036s0 && (e5Var = vkVar.J) != null && e5Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.f57052a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                ii0 ii0Var = (ii0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && ii0Var.getPullingLeftProgress() > 0.95f) {
                        ii0.a(ii0Var);
                    } else if (ii0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = ii0Var.f34679y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(ii0Var.B0, 0.0f);
                        ii0Var.f34679y0 = ofFloat;
                        ofFloat.addUpdateListener(new c60(ii0Var, 5));
                        ii0Var.f34679y0.setDuration(150L);
                        ii0Var.f34679y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                LinearLayout linearLayout = ((ql0) obj).f37325f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void invalidate() {
        switch (this.f4553e3) {
            case 1:
                super.invalidate();
                ((di.g2) this.f4554f3).invalidate();
                return;
            case 12:
                super.invalidate();
                View view = ((rq) this.f4554f3).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k0(int i7) {
        switch (this.f4553e3) {
            case 21:
                if (i7 == 0) {
                    ((ca0) this.f4554f3).f32525e.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l0(int i7) {
        boolean z9;
        switch (this.f4553e3) {
            case 5:
                return;
            case 17:
                am amVar = (am) this.f4554f3;
                amVar.invalidate();
                amVar.f38656b.M1(amVar, i7);
                zl zlVar = amVar.f31882w;
                boolean z10 = true;
                int i10 = 0;
                if (zlVar.f41063y == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    boolean[] d = zlVar.d();
                    if (d.length == zlVar.f41063y.length) {
                        while (true) {
                            if (i10 < d.length) {
                                if (d[i10] == zlVar.f41063y[i10]) {
                                    i10++;
                                }
                            } else {
                                z10 = z9;
                            }
                        }
                    }
                    z9 = z10;
                } else {
                    zlVar.f41063y = zlVar.d();
                }
                if (z9) {
                    zlVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((ca0) this.f4554f3).f32525e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4553e3) {
            case 10:
                super.onAttachedToWindow();
                jg.m1 m1Var = ((cn) this.f4554f3).f44422a4;
                if (m1Var != null) {
                    qs.f(m1Var.f16845r).c(m1Var, 326);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4553e3) {
            case 10:
                super.onDetachedFromWindow();
                jg.m1 m1Var = ((cn) this.f4554f3).f44422a4;
                if (m1Var != null) {
                    org.telegram.messenger.g0.r(m1Var.E);
                    qs.f(m1Var.f16845r).n(m1Var, 326);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        switch (this.f4553e3) {
            case 2:
                ns p10 = ns.p();
                fi.t1 t1Var = (fi.t1) this.f4554f3;
                boolean q10 = p10.q(motionEvent, t1Var.f12840b, t1Var.f12843f, this.f36980n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            case 3:
                if (((fi.f3) this.f4554f3).K) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (((mp) this.f4554f3).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((pi) this.f4554f3).f38656b.Y3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                if (((am) this.f4554f3).J != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z9);
                    ((gy) this.f4554f3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                boolean q11 = ns.p().q(motionEvent, ((bt0) this.f4554f3).l1, null, this.f36980n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q11) {
                    return false;
                }
                return true;
            case 27:
                yv0 yv0Var = (yv0) this.f4554f3;
                if (yv0Var.L1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q12 = ns.p().q(motionEvent, yv0Var.f40747m1, yv0Var.f40741g2, this.f36980n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        ij ijVar;
        switch (this.f4553e3) {
            case 0:
                ((w1) this.f4554f3).I0();
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 9:
                org.telegram.ui.mb mbVar = (org.telegram.ui.mb) this.f4554f3;
                if (mbVar.f47901w != null && mbVar.f47905y != null && (i13 = mbVar.N0) >= 0) {
                    if (mbVar.M0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.jb jbVar = mbVar.E;
                            if (i14 < jbVar.d) {
                                if (i14 >= jbVar.f46892f && i14 < jbVar.h) {
                                    ArrayList arrayList = jbVar.f46893n.f47891o0;
                                    ijVar = (ij) arrayList.get((arrayList.size() - (i14 - jbVar.f46892f)) - 1);
                                } else {
                                    ijVar = null;
                                }
                                if (ijVar != null && ijVar.T == mbVar.M0) {
                                    i13 = i14;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    mbVar.f47905y.i1(i13, mbVar.O0, true);
                    mbVar.N0 = -1;
                    mbVar.M0 = 0L;
                }
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 13:
                ((org.telegram.ui.Components.ma) this.f4554f3).I0();
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            case 16:
                super.onLayout(z9, i7, i10, i11, i12);
                vk vkVar = (vk) this.f4554f3;
                vk.a0(vkVar);
                vkVar.i0();
                return;
            case 21:
                ca0 ca0Var = (ca0) this.f4554f3;
                int i15 = ca0Var.f32519a;
                if (ca0Var.K) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    ca0Var.K = false;
                }
                super.onLayout(z9, i7, i10, i11, i12);
                ca0Var.j();
                q1 q1Var = ca0Var.f32526f;
                if (ca0Var.U) {
                    if (q1Var.computeVerticalScrollRange() > q1Var.computeVerticalScrollExtent()) {
                        ca0Var.postDelayed(new s90(ca0Var, 0), 0L);
                    }
                    ca0Var.U = false;
                }
                if (ca0Var.N && i15 == 0) {
                    int i16 = ca0Var.L;
                    int i17 = ca0Var.M;
                    ca0Var.N = false;
                    post(new jg.r(this, i16, i17, 13));
                    return;
                }
                return;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((dl0) this.f4554f3).a();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f4553e3) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4553e3) {
            case 11:
                if (((mp) this.f4554f3).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((pi) this.f4554f3).f38656b.Y3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 17:
                if (((am) this.f4554f3).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f4553e3) {
            case 6:
                if (!((org.telegram.ui.h1) this.f4554f3).f46197r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((fz) this.f4554f3).f33697s1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((bt0) this.f4554f3).f32356q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((yv0) this.f4554f3).f40736a2) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f4553e3) {
            case 19:
                super.setAlpha(f10);
                ((ez) this.f4554f3).invalidate();
                return;
            case 29:
                super.setAlpha(f10);
                ((u61) this.f4554f3).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f4553e3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public q1(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f4553e3 = i7;
        this.f4554f3 = obj;
    }

    public q1(gy gyVar, Context context, ey eyVar) {
        super(context, null);
        this.f4553e3 = 18;
        this.f4554f3 = gyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.f27982i6, this.f36980n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(eyVar);
    }

    private final void z1(int i7) {
    }
}
