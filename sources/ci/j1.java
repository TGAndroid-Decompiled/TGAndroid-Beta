package ci;

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
import org.telegram.messenger.hs;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.zl;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
import org.telegram.ui.ip;
import org.telegram.ui.is;
import org.telegram.ui.kw;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
public final class j1 extends tj0 {
    public final int f5324f3;
    public final Object f5325g3;

    public j1(int i3, Context context, Object obj) {
        super(context, null);
        this.f5324f3 = i3;
        this.f5325g3 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i3;
        int i10;
        switch (this.f5324f3) {
            case 5:
                bi biVar = ((lg.h0) this.f5325g3).f38416b;
                int L = org.telegram.messenger.g0.L(30.0f) + biVar.W3[0];
                if (!biVar.Y1) {
                    i3 = org.telegram.messenger.g0.f22602m;
                } else {
                    i3 = 0;
                }
                if (f10 < L + i3) {
                    return false;
                }
                return true;
            case 15:
                bi biVar2 = ((ej) this.f5325g3).f38416b;
                int L2 = org.telegram.messenger.g0.L(30.0f) + biVar2.W3[0];
                if (!biVar2.Y1) {
                    i10 = org.telegram.messenger.g0.f22602m;
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
        switch (this.f5324f3) {
            case 7:
                if (view != ((org.telegram.ui.z6) this.f5325g3).X) {
                    return true;
                }
                return false;
            case 19:
                bz bzVar = (bz) this.f5325g3;
                if (bzVar.isEnabled() && !((kw) bzVar.K).f47036b.f50255k2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.f5324f3) {
            case 0:
                ((p1) this.f5325g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ma) this.f5325g3).J0(view, f10, f11);
            case 19:
                if (((bz) this.f5325g3).f32459n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((zy) view).f41155f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((m61) this.f5325g3).f36043n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((k61) view).f35331c;
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
        switch (this.f5324f3) {
            case 28:
                if (getAdapter() != null && ((v41) this.f5325g3).f39007z1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i3) {
        switch (this.f5324f3) {
            case 1:
                return 0;
            case 24:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        switch (this.f5324f3) {
            case 29:
                super.addView(view, i3, layoutParams);
                if (((m61) this.f5325g3).W) {
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
                super.addView(view, i3, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ei.u0 u0Var;
        boolean z10;
        ui uiVar;
        ArrayList arrayList;
        j1 j1Var;
        x90 x90Var;
        int i3;
        j1 j1Var2;
        boolean z11;
        ui currentMessagesGroup;
        ui currentMessagesGroup2;
        switch (this.f5324f3) {
            case 1:
                ei.k2 k2Var = (ei.k2) this.f5325g3;
                int i10 = -1;
                if (!k2Var.f11157g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof ei.p0) && (u0Var = ((ei.p0) childAt).L) != null) {
                                i10 = u0Var.f11069a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > k2Var.G) {
                    k2Var.G = i10;
                    ei.a aVar = k2Var.f10563j0.H1;
                    if (aVar != null) {
                        aVar.setCount(k2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                te teVar = (te) this.f5325g3;
                j1 j1Var3 = teVar.f15279c;
                if (j1Var3.getLayoutManager() != null && j1Var3.getAdapter() != null && j1Var3.getAdapter().b() != 0) {
                    float L = teVar.h - org.telegram.messenger.g0.L(8.0f);
                    teVar.f15280e = L - org.telegram.messenger.g0.L(16.0f);
                    gh.g gVar = teVar.f15283r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), teVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.i8) this.f5325g3).G = false;
                return;
            case 21:
                x90 x90Var2 = (x90) this.f5325g3;
                ai.h5 h5Var = x90Var2.f40287b;
                boolean z12 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).w3(h5Var.getMeasuredWidth(), h5Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                ui uiVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != uiVar2)) {
                        uiVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    da0 da0Var = x90Var2.f40291d0;
                    ArrayList arrayList2 = da0Var.F;
                    j1 j1Var4 = x90Var2.f40293f;
                    da0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || j1Var4.W1) {
                        int i16 = z12 ? 1 : 0;
                        ?? r12 = z12;
                        while (true) {
                            boolean z13 = true;
                            if (i16 < childCount) {
                                View childAt4 = j1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= j1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        ti tiVar = currentMessagesGroup.f25709m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || tiVar.f25533i) && ((i14 != 0 || !q1Var.getMessageObject().Z) && ((i14 != 1 || q1Var.getMessageObject().Z) && ((i14 != i15 || q1Var.f30156ya) && (i14 == i15 || !q1Var.f30156ya)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                tiVar.f25527a = r12;
                                                tiVar.f25528b = r12;
                                                tiVar.f25529c = r12;
                                                tiVar.d = r12;
                                                tiVar.f25536l = r12;
                                                tiVar.f25535k = r12;
                                                tiVar.f25537m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            tiVar.f25535k = q1Var.H2();
                                            tiVar.f25536l = q1Var.G2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().f25149l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().f25149l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (q1Var.f30156ya) {
                                                tiVar.f25537m = q1Var;
                                            }
                                            int i18 = tiVar.f25528b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                tiVar.f25528b = backgroundDrawableTop;
                                            }
                                            int i19 = tiVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                tiVar.d = i17;
                                            }
                                            int i20 = tiVar.f25527a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                tiVar.f25527a = backgroundDrawableLeft;
                                            }
                                            int i21 = tiVar.f25529c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                tiVar.f25529c = backgroundDrawableRight;
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
                                    ui uiVar3 = (ui) arrayList2.get(i22);
                                    if (uiVar3 == null) {
                                        arrayList = arrayList2;
                                        j1Var2 = j1Var4;
                                        z11 = z13;
                                        x90Var = x90Var2;
                                        i3 = i22;
                                    } else {
                                        ti tiVar2 = uiVar3.f25709m;
                                        float R1 = tiVar2.f25537m.R1(z13);
                                        float f10 = tiVar2.f25527a + R1 + tiVar2.f25530e;
                                        float f11 = tiVar2.f25528b + tiVar2.f25531f;
                                        float f12 = tiVar2.f25532g + tiVar2.f25529c + R1;
                                        float f13 = tiVar2.d + tiVar2.h;
                                        if (!tiVar2.f25534j) {
                                            f11 += tiVar2.f25537m.getTranslationY();
                                            f13 += tiVar2.f25537m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + j1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + j1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        if (tiVar2.f25537m.getScaleX() == 1.0f && tiVar2.f25537m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas.save();
                                            uiVar = uiVar3;
                                            arrayList = arrayList2;
                                            j1Var = j1Var4;
                                            canvas.scale(tiVar2.f25537m.getScaleX(), tiVar2.f25537m.getScaleY(), com.google.android.recaptcha.internal.a.z(f12, f10, 2.0f, f10), com.google.android.recaptcha.internal.a.z(f15, f14, 2.0f, f14));
                                        } else {
                                            uiVar = uiVar3;
                                            arrayList = arrayList2;
                                            j1Var = j1Var4;
                                        }
                                        x90Var = x90Var2;
                                        ui uiVar4 = uiVar;
                                        i3 = i22;
                                        j1Var2 = j1Var;
                                        z11 = true;
                                        tiVar2.f25537m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, tiVar2.f25535k, tiVar2.f25536l, false, 0);
                                        tiVar2.f25537m = null;
                                        tiVar2.f25539o = uiVar4.f25701c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = j1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var2.getCurrentMessagesGroup() == uiVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i3 + 1;
                                    j1Var4 = j1Var2;
                                    x90Var2 = x90Var;
                                    arrayList2 = arrayList;
                                    z13 = z11;
                                }
                            }
                        }
                    }
                    i14++;
                    x90Var2 = x90Var2;
                    z12 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                cw cwVar = (cw) this.f5325g3;
                u4.b0 b0Var = cwVar.f34752f0;
                u4.k kVar = cwVar.f34750d0;
                bm0 bm0Var = cwVar.f34751e0;
                if (bm0Var != null && kVar != null && b0Var != null && bm0Var.f16972n0) {
                    canvas.save();
                    invalidate();
                    int b10 = bm0Var.b() - 1;
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
                if (bm0Var != null && kVar != null && b0Var != null && bm0Var.f16972n0) {
                    canvas.restore();
                }
                if (bm0Var != null && bm0Var.f16974p0 != null) {
                    canvas.save();
                    canvas.translate(bm0Var.f16974p0.getLeft(), bm0Var.f16974p0.getTranslationY() + bm0Var.f16974p0.getTop());
                    bm0Var.f16974p0.draw(canvas);
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
        ai.o2 o2Var;
        u4.d1 K;
        int i3 = this.f5324f3;
        Object obj = this.f5325g3;
        switch (i3) {
            case 1:
                if (((ei.k2) obj).f11157g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (((gi.d3) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    uk ukVar = (uk) obj;
                    if (motionEvent.getY() < ukVar.f38801t0 && (o2Var = ukVar.K) != null && o2Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.f55540a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                li0 li0Var = (li0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && li0Var.getPullingLeftProgress() > 0.95f) {
                        li0.a(li0Var);
                    } else if (li0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = li0Var.f35779z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(li0Var.C0, 0.0f);
                        li0Var.f35779z0 = ofFloat;
                        ofFloat.addUpdateListener(new y50(li0Var, 6));
                        li0Var.f35779z0.setDuration(150L);
                        li0Var.f35779z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                LinearLayout linearLayout = ((tl0) obj).f38489f;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.j1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void invalidate() {
        switch (this.f5324f3) {
            case 1:
                super.invalidate();
                ((ei.k2) this.f5325g3).invalidate();
                return;
            case 12:
                super.invalidate();
                View view = ((nq) this.f5325g3).fragmentView;
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
    public void k0(int i3) {
        switch (this.f5324f3) {
            case 21:
                if (i3 == 0) {
                    ((x90) this.f5325g3).f40292e.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l0(int i3) {
        boolean z10;
        switch (this.f5324f3) {
            case 5:
                return;
            case 17:
                am amVar = (am) this.f5325g3;
                amVar.invalidate();
                amVar.f38416b.M1(amVar, i3);
                zl zlVar = amVar.f31898w;
                boolean z11 = true;
                int i10 = 0;
                if (zlVar.f41072y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = zlVar.d();
                    if (d.length == zlVar.f41072y.length) {
                        while (true) {
                            if (i10 < d.length) {
                                if (d[i10] == zlVar.f41072y[i10]) {
                                    i10++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    zlVar.f41072y = zlVar.d();
                }
                if (z10) {
                    zlVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((x90) this.f5325g3).f40292e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5324f3) {
            case 10:
                super.onAttachedToWindow();
                kg.i1 i1Var = ((wm) this.f5325g3).f51255b4;
                if (i1Var != null) {
                    hs.f(i1Var.f17047r).c(i1Var, 326);
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
        switch (this.f5324f3) {
            case 10:
                super.onDetachedFromWindow();
                kg.i1 i1Var = ((wm) this.f5325g3).f51255b4;
                if (i1Var != null) {
                    org.telegram.messenger.g0.r(i1Var.F);
                    hs.f(i1Var.f17047r).n(i1Var, 326);
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
        boolean z10;
        switch (this.f5324f3) {
            case 2:
                is p10 = is.p();
                gi.t1 t1Var = (gi.t1) this.f5325g3;
                boolean q10 = p10.q(motionEvent, t1Var.f13601b, t1Var.f13604f, this.f38460o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            case 3:
                if (((gi.d3) this.f5325g3).L) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (((ip) this.f5325g3).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f5325g3).f38416b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                if (((am) this.f5325g3).K != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((ey) this.f5325g3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                boolean q11 = is.p().q(motionEvent, ((zs0) this.f5325g3).f41097j1, null, this.f38460o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q11) {
                    return false;
                }
                return true;
            case 27:
                xv0 xv0Var = (xv0) this.f5325g3;
                if (xv0Var.J1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q12 = is.p().q(motionEvent, xv0Var.k1, xv0Var.f40509e2, this.f38460o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        zi ziVar;
        switch (this.f5324f3) {
            case 0:
                ((p1) this.f5325g3).I0();
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 9:
                org.telegram.ui.kb kbVar = (org.telegram.ui.kb) this.f5325g3;
                if (kbVar.f46885w != null && kbVar.f46889y != null && (i13 = kbVar.O0) >= 0) {
                    if (kbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.hb hbVar = kbVar.F;
                            if (i14 < hbVar.d) {
                                if (i14 >= hbVar.f45890f && i14 < hbVar.h) {
                                    ArrayList arrayList = hbVar.f45891n.f46876p0;
                                    ziVar = (zi) arrayList.get((arrayList.size() - (i14 - hbVar.f45890f)) - 1);
                                } else {
                                    ziVar = null;
                                }
                                if (ziVar != null && ziVar.T == kbVar.N0) {
                                    i13 = i14;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    kbVar.f46889y.i1(i13, kbVar.P0, true);
                    kbVar.O0 = -1;
                    kbVar.N0 = 0L;
                }
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 13:
                ((org.telegram.ui.Components.ma) this.f5325g3).I0();
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z10, i3, i10, i11, i12);
                PhotoViewer.v1().z0();
                return;
            case 16:
                super.onLayout(z10, i3, i10, i11, i12);
                uk ukVar = (uk) this.f5325g3;
                uk.a0(ukVar);
                ukVar.i0();
                return;
            case 21:
                x90 x90Var = (x90) this.f5325g3;
                int i15 = x90Var.f40285a;
                if (x90Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    x90Var.L = false;
                }
                super.onLayout(z10, i3, i10, i11, i12);
                x90Var.j();
                j1 j1Var = x90Var.f40293f;
                if (x90Var.V) {
                    if (j1Var.computeVerticalScrollRange() > j1Var.computeVerticalScrollExtent()) {
                        x90Var.postDelayed(new o90(x90Var, 0), 0L);
                    }
                    x90Var.V = false;
                }
                if (x90Var.O && i15 == 0) {
                    int i16 = x90Var.M;
                    int i17 = x90Var.N;
                    x90Var.O = false;
                    post(new k2.u(this, i16, i17, 13));
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                ((hl0) this.f5325g3).a();
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f5324f3) {
            case 1:
                int size = View.MeasureSpec.getSize(i3);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f5324f3) {
            case 11:
                if (((ip) this.f5325g3).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f5325g3).f38416b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 17:
                if (((am) this.f5325g3).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5324f3) {
            case 6:
                if (!((org.telegram.ui.i1) this.f5325g3).f46029r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((cz) this.f5325g3).f32863q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((zs0) this.f5325g3).f41100o1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((xv0) this.f5325g3).Y1) {
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
        switch (this.f5324f3) {
            case 19:
                super.setAlpha(f10);
                ((bz) this.f5325g3).invalidate();
                return;
            case 29:
                super.setAlpha(f10);
                ((m61) this.f5325g3).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f5324f3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public j1(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f5324f3 = i3;
        this.f5325g3 = obj;
    }

    public j1(ey eyVar, Context context, cy cyVar) {
        super(context, null);
        this.f5324f3 = 18;
        this.f5325g3 = eyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f27972i6, this.f38460o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        kg.y yVar = new kg.y(8);
        yVar.j1(0);
        setLayoutManager(yVar);
        setAdapter(cyVar);
    }

    private final void z1(int i3) {
    }
}
