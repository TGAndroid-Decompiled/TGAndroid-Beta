package di;

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
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.kw;
import org.telegram.ui.np;
import org.telegram.ui.ns;
import org.telegram.ui.rq;
import org.telegram.ui.tw;
public final class b1 extends ek0 {
    public final int f8544f3;
    public final Object f8545g3;

    public b1(int i7, Context context, Object obj) {
        super(context, null);
        this.f8544f3 = i7;
        this.f8545g3 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        int i10;
        switch (this.f8544f3) {
            case 4:
                ui uiVar = ((kg.h0) this.f8545g3).f37520b;
                int L = org.telegram.messenger.g0.L(30.0f) + uiVar.Z3[0];
                if (!uiVar.f40371b2) {
                    i7 = org.telegram.messenger.g0.f24040m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            case 15:
                ui uiVar2 = ((vj) this.f8545g3).f37520b;
                int L2 = org.telegram.messenger.g0.L(30.0f) + uiVar2.Z3[0];
                if (!uiVar2.f40371b2) {
                    i10 = org.telegram.messenger.g0.f24040m;
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
        switch (this.f8544f3) {
            case 7:
                if (view != ((org.telegram.ui.x6) this.f8545g3).X) {
                    return true;
                }
                return false;
            case 19:
                rz rzVar = (rz) this.f8545g3;
                if (rzVar.isEnabled() && !((tw) rzVar.K).f52405b.f46752l2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.f8544f3) {
            case 0:
                ((h1) this.f8545g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.sa) this.f8545g3).K0(view, f10, f11);
            case 19:
                if (((rz) this.f8545g3).f39408n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((pz) view).f38699f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((i71) this.f8545g3).f36211n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((g71) view).f35446c;
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
        switch (this.f8544f3) {
            case 28:
                if (getAdapter() != null && ((r51) this.f8545g3).C1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f8544f3) {
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
        switch (this.f8544f3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (((i71) this.f8545g3).W) {
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
        fi.r0 r0Var;
        boolean z10;
        bj bjVar;
        ArrayList arrayList;
        b1 b1Var;
        qa0 qa0Var;
        int i7;
        b1 b1Var2;
        boolean z11;
        bj currentMessagesGroup;
        bj currentMessagesGroup2;
        switch (this.f8544f3) {
            case 1:
                fi.a2 a2Var = (fi.a2) this.f8545g3;
                int i10 = -1;
                if (!a2Var.f12609g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof fi.m0) && (r0Var = ((fi.m0) childAt).L) != null) {
                                i10 = r0Var.f12517a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > a2Var.G) {
                    a2Var.G = i10;
                    fi.a aVar = a2Var.f11749j0.H1;
                    if (aVar != null) {
                        aVar.setCount(a2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                ef efVar = (ef) this.f8545g3;
                b1 b1Var3 = efVar.f18993c;
                if (b1Var3.getLayoutManager() != null && b1Var3.getAdapter() != null && b1Var3.getAdapter().b() != 0) {
                    float L = efVar.h - org.telegram.messenger.g0.L(8.0f);
                    efVar.f18994e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = efVar.f18997r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), efVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.i8) this.f8545g3).G = false;
                return;
            case 21:
                qa0 qa0Var2 = (qa0) this.f8545g3;
                org.telegram.ui.w8 w8Var = qa0Var2.f38854b;
                boolean z12 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt2).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                bj bjVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.r1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.r1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != bjVar2)) {
                        bjVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    wa0 wa0Var = qa0Var2.f38858d0;
                    ArrayList arrayList2 = wa0Var.F;
                    b1 b1Var4 = qa0Var2.f38860f;
                    wa0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || b1Var4.W1) {
                        int i16 = z12 ? 1 : 0;
                        ?? r12 = z12;
                        while (true) {
                            boolean z13 = true;
                            if (i16 < childCount) {
                                View childAt4 = b1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt4;
                                    if (childAt4.getY() <= b1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = r1Var.getCurrentMessagesGroup()) != null) {
                                        aj ajVar = currentMessagesGroup.f23120m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || ajVar.f22925i) && ((i14 != 0 || !r1Var.getMessageObject().Z) && ((i14 != 1 || r1Var.getMessageObject().Z) && ((i14 != i15 || r1Var.f31697za) && (i14 == i15 || !r1Var.f31697za)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ajVar.f22919a = r12;
                                                ajVar.f22920b = r12;
                                                ajVar.f22921c = r12;
                                                ajVar.d = r12;
                                                ajVar.f22928l = r12;
                                                ajVar.f22927k = r12;
                                                ajVar.f22929m = r1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ajVar.f22927k = r1Var.L2();
                                            ajVar.f22928l = r1Var.K2();
                                            int backgroundDrawableLeft = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                                            int backgroundDrawableRight = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                                            int backgroundDrawableTop = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                                            int backgroundDrawableBottom = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                                            if ((r1Var.getCurrentPosition().f28101l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((r1Var.getCurrentPosition().f28101l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (r1Var.f31697za) {
                                                ajVar.f22929m = r1Var;
                                            }
                                            int i18 = ajVar.f22920b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                ajVar.f22920b = backgroundDrawableTop;
                                            }
                                            int i19 = ajVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                ajVar.d = i17;
                                            }
                                            int i20 = ajVar.f22919a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                ajVar.f22919a = backgroundDrawableLeft;
                                            }
                                            int i21 = ajVar.f22921c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                ajVar.f22921c = backgroundDrawableRight;
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
                                    bj bjVar3 = (bj) arrayList2.get(i22);
                                    if (bjVar3 == null) {
                                        arrayList = arrayList2;
                                        b1Var2 = b1Var4;
                                        z11 = z13;
                                        qa0Var = qa0Var2;
                                        i7 = i22;
                                    } else {
                                        aj ajVar2 = bjVar3.f23120m;
                                        float S1 = ajVar2.f22929m.S1(z13);
                                        float f10 = ajVar2.f22919a + S1 + ajVar2.f22922e;
                                        float f11 = ajVar2.f22920b + ajVar2.f22923f;
                                        float f12 = ajVar2.f22924g + ajVar2.f22921c + S1;
                                        float f13 = ajVar2.d + ajVar2.h;
                                        if (!ajVar2.f22926j) {
                                            f11 += ajVar2.f22929m.getTranslationY();
                                            f13 += ajVar2.f22929m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        if (ajVar2.f22929m.getScaleX() == 1.0f && ajVar2.f22929m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas.save();
                                            bjVar = bjVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var4;
                                            canvas.scale(ajVar2.f22929m.getScaleX(), ajVar2.f22929m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                                        } else {
                                            bjVar = bjVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var4;
                                        }
                                        qa0Var = qa0Var2;
                                        bj bjVar4 = bjVar;
                                        i7 = i22;
                                        b1Var2 = b1Var;
                                        z11 = true;
                                        ajVar2.f22929m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, ajVar2.f22927k, ajVar2.f22928l, false, 0);
                                        ajVar2.f22929m = null;
                                        ajVar2.f22931o = bjVar4.f23112c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = b1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.r1) {
                                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt5;
                                                    if (r1Var2.getCurrentMessagesGroup() == bjVar4) {
                                                        int left = r1Var2.getLeft();
                                                        int top = r1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    b1Var4 = b1Var2;
                                    qa0Var2 = qa0Var;
                                    arrayList2 = arrayList;
                                    z13 = z11;
                                }
                            }
                        }
                    }
                    i14++;
                    qa0Var2 = qa0Var2;
                    z12 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                kw kwVar = (kw) this.f8545g3;
                v4.c0 c0Var = kwVar.f40504f0;
                v4.k kVar = kwVar.f40502d0;
                nm0 nm0Var = kwVar.f40503e0;
                if (nm0Var != null && kVar != null && c0Var != null && nm0Var.f17510n0) {
                    canvas.save();
                    invalidate();
                    int b10 = nm0Var.b() - 1;
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
                if (nm0Var != null && kVar != null && c0Var != null && nm0Var.f17510n0) {
                    canvas.restore();
                }
                if (nm0Var != null && nm0Var.f17512p0 != null) {
                    canvas.save();
                    canvas.translate(nm0Var.f17512p0.getLeft(), nm0Var.f17512p0.getTranslationY() + nm0Var.f17512p0.getTop());
                    nm0Var.f17512p0.draw(canvas);
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
        bi.e3 e3Var;
        v4.f1 K;
        int i7 = this.f8544f3;
        Object obj = this.f8545g3;
        switch (i7) {
            case 1:
                if (((fi.a2) obj).f12609g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (((hi.d3) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    ml mlVar = (ml) obj;
                    if (motionEvent.getY() < mlVar.f37568t0 && (e3Var = mlVar.K) != null && e3Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.f59165a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                xi0 xi0Var = (xi0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && xi0Var.getPullingLeftProgress() > 0.95f) {
                        xi0.a(xi0Var);
                    } else if (xi0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = xi0Var.f42148z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(xi0Var.C0, 0.0f);
                        xi0Var.f42148z0 = ofFloat;
                        ofFloat.addUpdateListener(new h60(xi0Var, 7));
                        xi0Var.f42148z0.setDuration(150L);
                        xi0Var.f42148z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                LinearLayout linearLayout = ((em0) obj).f34906f;
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
        throw new UnsupportedOperationException("Method not decompiled: di.b1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void invalidate() {
        switch (this.f8544f3) {
            case 1:
                super.invalidate();
                ((fi.a2) this.f8545g3).invalidate();
                return;
            case 12:
                super.invalidate();
                View view = ((rq) this.f8545g3).fragmentView;
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
        switch (this.f8544f3) {
            case 21:
                if (i7 == 0) {
                    ((qa0) this.f8545g3).f38859e.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l0(int i7) {
        boolean z10;
        switch (this.f8544f3) {
            case 4:
                return;
            case 17:
                rm rmVar = (rm) this.f8545g3;
                rmVar.invalidate();
                rmVar.f37520b.N1(rmVar, i7);
                qm qmVar = rmVar.f39283w;
                boolean z11 = true;
                int i10 = 0;
                if (qmVar.f38954y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = qmVar.d();
                    if (d.length == qmVar.f38954y.length) {
                        while (true) {
                            if (i10 < d.length) {
                                if (d[i10] == qmVar.f38954y[i10]) {
                                    i10++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    qmVar.f38954y = qmVar.d();
                }
                if (z10) {
                    qmVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((qa0) this.f8545g3).f38859e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8544f3) {
            case 10:
                super.onAttachedToWindow();
                jg.l1 l1Var = ((bn) this.f8545g3).f45969b4;
                if (l1Var != null) {
                    ls.f(l1Var.f17596r).c(l1Var, 329);
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
        switch (this.f8544f3) {
            case 10:
                super.onDetachedFromWindow();
                jg.l1 l1Var = ((bn) this.f8545g3).f45969b4;
                if (l1Var != null) {
                    org.telegram.messenger.g0.r(l1Var.F);
                    ls.f(l1Var.f17596r).n(l1Var, 329);
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
        switch (this.f8544f3) {
            case 2:
                ns p10 = ns.p();
                hi.t1 t1Var = (hi.t1) this.f8545g3;
                boolean q10 = p10.q(motionEvent, t1Var.f15495b, t1Var.f15498f, this.f34873o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            case 3:
                if (((hi.d3) this.f8545g3).L) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (((np) this.f8545g3).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((hj) this.f8545g3).f37520b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                if (((rm) this.f8545g3).K != null) {
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
                    ((ty) this.f8545g3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                boolean q11 = ns.p().q(motionEvent, ((mt0) this.f8545g3).f37628m1, null, this.f34873o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q11) {
                    return false;
                }
                return true;
            case 27:
                kw0 kw0Var = (kw0) this.f8545g3;
                if (kw0Var.M1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q12 = ns.p().q(motionEvent, kw0Var.n1, kw0Var.f37011h2, this.f34873o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        gj gjVar;
        switch (this.f8544f3) {
            case 0:
                ((h1) this.f8545g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.f8545g3;
                if (lbVar.f49572w != null && lbVar.f49576y != null && (i13 = lbVar.O0) >= 0) {
                    if (lbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.ib ibVar = lbVar.F;
                            if (i14 < ibVar.d) {
                                if (i14 >= ibVar.f48717f && i14 < ibVar.h) {
                                    ArrayList arrayList = ibVar.f48718n.f49563p0;
                                    gjVar = (gj) arrayList.get((arrayList.size() - (i14 - ibVar.f48717f)) - 1);
                                } else {
                                    gjVar = null;
                                }
                                if (gjVar != null && gjVar.T == lbVar.N0) {
                                    i13 = i14;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    lbVar.f49576y.i1(i13, lbVar.P0, true);
                    lbVar.O0 = -1;
                    lbVar.N0 = 0L;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 13:
                ((org.telegram.ui.Components.sa) this.f8545g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                ml mlVar = (ml) this.f8545g3;
                ml.a0(mlVar);
                mlVar.i0();
                return;
            case 21:
                qa0 qa0Var = (qa0) this.f8545g3;
                int i15 = qa0Var.f38852a;
                if (qa0Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    qa0Var.L = false;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                qa0Var.j();
                b1 b1Var = qa0Var.f38860f;
                if (qa0Var.V) {
                    if (b1Var.computeVerticalScrollRange() > b1Var.computeVerticalScrollExtent()) {
                        qa0Var.postDelayed(new ha0(qa0Var, 0), 0L);
                    }
                    qa0Var.V = false;
                }
                if (qa0Var.O && i15 == 0) {
                    int i16 = qa0Var.M;
                    int i17 = qa0Var.N;
                    qa0Var.O = false;
                    post(new jg.q(this, i16, i17, 14));
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((sl0) this.f8545g3).a();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f8544f3) {
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
        switch (this.f8544f3) {
            case 11:
                if (((np) this.f8545g3).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((hj) this.f8545g3).f37520b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 17:
                if (((rm) this.f8545g3).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f8544f3) {
            case 6:
                if (!((org.telegram.ui.h1) this.f8545g3).f48200r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((sz) this.f8545g3).f39734t1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((mt0) this.f8545g3).f37632r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((kw0) this.f8545g3).f37006b2) {
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
        switch (this.f8544f3) {
            case 19:
                super.setAlpha(f10);
                ((rz) this.f8545g3).invalidate();
                return;
            case 29:
                super.setAlpha(f10);
                ((i71) this.f8545g3).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f8544f3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public b1(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f8544f3 = i7;
        this.f8545g3 = obj;
    }

    public b1(ty tyVar, Context context, ry ryVar) {
        super(context, null);
        this.f8544f3 = 18;
        this.f8545g3 = tyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.f29473i6, this.f34873o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(ryVar);
    }

    private final void z1(int i7) {
    }
}
