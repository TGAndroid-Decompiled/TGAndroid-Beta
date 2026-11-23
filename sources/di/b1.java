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
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.jw;
import org.telegram.ui.np;
import org.telegram.ui.ns;
import org.telegram.ui.rq;
import org.telegram.ui.sw;
public final class b1 extends ek0 {
    public final int f8506f3;
    public final Object f8507g3;

    public b1(int i7, Context context, Object obj) {
        super(context, null);
        this.f8506f3 = i7;
        this.f8507g3 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        int i10;
        switch (this.f8506f3) {
            case 4:
                ti tiVar = ((kg.h0) this.f8507g3).f37135b;
                int L = org.telegram.messenger.g0.L(30.0f) + tiVar.Z3[0];
                if (!tiVar.f39959b2) {
                    i7 = org.telegram.messenger.g0.f24220m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            case 15:
                ti tiVar2 = ((uj) this.f8507g3).f37135b;
                int L2 = org.telegram.messenger.g0.L(30.0f) + tiVar2.Z3[0];
                if (!tiVar2.f39959b2) {
                    i10 = org.telegram.messenger.g0.f24220m;
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
        switch (this.f8506f3) {
            case 7:
                if (view != ((org.telegram.ui.y6) this.f8507g3).X) {
                    return true;
                }
                return false;
            case 19:
                oz ozVar = (oz) this.f8507g3;
                if (ozVar.isEnabled() && !((sw) ozVar.K).f52164b.f46579l2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.f8506f3) {
            case 0:
                ((h1) this.f8507g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ra) this.f8507g3).K0(view, f10, f11);
            case 19:
                if (((oz) this.f8507g3).f38306n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((mz) view).f37581f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((j71) this.f8507g3).f36339n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((h71) view).f35680c;
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
        switch (this.f8506f3) {
            case 28:
                if (getAdapter() != null && ((q51) this.f8507g3).C1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f8506f3) {
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
        switch (this.f8506f3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (((j71) this.f8507g3).W) {
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
        aj ajVar;
        ArrayList arrayList;
        b1 b1Var;
        na0 na0Var;
        int i7;
        b1 b1Var2;
        boolean z11;
        aj currentMessagesGroup;
        aj currentMessagesGroup2;
        switch (this.f8506f3) {
            case 1:
                fi.a2 a2Var = (fi.a2) this.f8507g3;
                int i10 = -1;
                if (!a2Var.f12571g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof fi.m0) && (r0Var = ((fi.m0) childAt).L) != null) {
                                i10 = r0Var.f12479a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > a2Var.G) {
                    a2Var.G = i10;
                    fi.a aVar = a2Var.f11711j0.H1;
                    if (aVar != null) {
                        aVar.setCount(a2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                ff ffVar = (ff) this.f8507g3;
                b1 b1Var3 = ffVar.f19061c;
                if (b1Var3.getLayoutManager() != null && b1Var3.getAdapter() != null && b1Var3.getAdapter().b() != 0) {
                    float L = ffVar.h - org.telegram.messenger.g0.L(8.0f);
                    ffVar.f19062e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = ffVar.f19065r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ffVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.f8507g3).G = false;
                return;
            case 21:
                na0 na0Var2 = (na0) this.f8507g3;
                org.telegram.ui.w8 w8Var = na0Var2.f37738b;
                boolean z12 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt2).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                aj ajVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.r1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.r1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != ajVar2)) {
                        ajVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    ta0 ta0Var = na0Var2.f37742d0;
                    ArrayList arrayList2 = ta0Var.F;
                    b1 b1Var4 = na0Var2.f37744f;
                    ta0Var.F.clear();
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
                                        zi ziVar = currentMessagesGroup.f23016m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || ziVar.f28398i) && ((i14 != 0 || !r1Var.getMessageObject().Z) && ((i14 != 1 || r1Var.getMessageObject().Z) && ((i14 != i15 || r1Var.f31747za) && (i14 == i15 || !r1Var.f31747za)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ziVar.f28392a = r12;
                                                ziVar.f28393b = r12;
                                                ziVar.f28394c = r12;
                                                ziVar.d = r12;
                                                ziVar.f28401l = r12;
                                                ziVar.f28400k = r12;
                                                ziVar.f28402m = r1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ziVar.f28400k = r1Var.L2();
                                            ziVar.f28401l = r1Var.K2();
                                            int backgroundDrawableLeft = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                                            int backgroundDrawableRight = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                                            int backgroundDrawableTop = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                                            int backgroundDrawableBottom = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                                            if ((r1Var.getCurrentPosition().f28005l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((r1Var.getCurrentPosition().f28005l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (r1Var.f31747za) {
                                                ziVar.f28402m = r1Var;
                                            }
                                            int i18 = ziVar.f28393b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                ziVar.f28393b = backgroundDrawableTop;
                                            }
                                            int i19 = ziVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                ziVar.d = i17;
                                            }
                                            int i20 = ziVar.f28392a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                ziVar.f28392a = backgroundDrawableLeft;
                                            }
                                            int i21 = ziVar.f28394c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                ziVar.f28394c = backgroundDrawableRight;
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
                                    aj ajVar3 = (aj) arrayList2.get(i22);
                                    if (ajVar3 == null) {
                                        arrayList = arrayList2;
                                        b1Var2 = b1Var4;
                                        z11 = z13;
                                        na0Var = na0Var2;
                                        i7 = i22;
                                    } else {
                                        zi ziVar2 = ajVar3.f23016m;
                                        float S1 = ziVar2.f28402m.S1(z13);
                                        float f10 = ziVar2.f28392a + S1 + ziVar2.f28395e;
                                        float f11 = ziVar2.f28393b + ziVar2.f28396f;
                                        float f12 = ziVar2.f28397g + ziVar2.f28394c + S1;
                                        float f13 = ziVar2.d + ziVar2.h;
                                        if (!ziVar2.f28399j) {
                                            f11 += ziVar2.f28402m.getTranslationY();
                                            f13 += ziVar2.f28402m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        if (ziVar2.f28402m.getScaleX() == 1.0f && ziVar2.f28402m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas.save();
                                            ajVar = ajVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var4;
                                            canvas.scale(ziVar2.f28402m.getScaleX(), ziVar2.f28402m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                                        } else {
                                            ajVar = ajVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var4;
                                        }
                                        na0Var = na0Var2;
                                        aj ajVar4 = ajVar;
                                        i7 = i22;
                                        b1Var2 = b1Var;
                                        z11 = true;
                                        ziVar2.f28402m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, ziVar2.f28400k, ziVar2.f28401l, false, 0);
                                        ziVar2.f28402m = null;
                                        ziVar2.f28404o = ajVar4.f23008c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = b1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.r1) {
                                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt5;
                                                    if (r1Var2.getCurrentMessagesGroup() == ajVar4) {
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
                                    na0Var2 = na0Var;
                                    arrayList2 = arrayList;
                                    z13 = z11;
                                }
                            }
                        }
                    }
                    i14++;
                    na0Var2 = na0Var2;
                    z12 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                jw jwVar = (jw) this.f8507g3;
                v4.c0 c0Var = jwVar.f40086f0;
                v4.l lVar = jwVar.f40084d0;
                mm0 mm0Var = jwVar.f40085e0;
                if (mm0Var != null && lVar != null && c0Var != null && mm0Var.f17578n0) {
                    canvas.save();
                    invalidate();
                    int b10 = mm0Var.b() - 1;
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
                if (mm0Var != null && lVar != null && c0Var != null && mm0Var.f17578n0) {
                    canvas.restore();
                }
                if (mm0Var != null && mm0Var.f17580p0 != null) {
                    canvas.save();
                    canvas.translate(mm0Var.f17580p0.getLeft(), mm0Var.f17580p0.getTranslationY() + mm0Var.f17580p0.getTop());
                    mm0Var.f17580p0.draw(canvas);
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
        bi.g3 g3Var;
        v4.f1 K;
        int i7 = this.f8506f3;
        Object obj = this.f8507g3;
        switch (i7) {
            case 1:
                if (((fi.a2) obj).f12571g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (((hi.m3) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    kl klVar = (kl) obj;
                    if (motionEvent.getY() < klVar.f36793t0 && (g3Var = klVar.K) != null && g3Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.f59245a.getTop())) {
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
                        ValueAnimator valueAnimator = xi0Var.f42054z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(xi0Var.C0, 0.0f);
                        xi0Var.f42054z0 = ofFloat;
                        ofFloat.addUpdateListener(new e60(xi0Var, 7));
                        xi0Var.f42054z0.setDuration(150L);
                        xi0Var.f42054z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                LinearLayout linearLayout = ((em0) obj).f34798f;
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
        switch (this.f8506f3) {
            case 1:
                super.invalidate();
                ((fi.a2) this.f8507g3).invalidate();
                return;
            case 12:
                super.invalidate();
                View view = ((rq) this.f8507g3).fragmentView;
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
        switch (this.f8506f3) {
            case 21:
                if (i7 == 0) {
                    ((na0) this.f8507g3).f37743e.V();
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
        switch (this.f8506f3) {
            case 4:
                return;
            case 17:
                pm pmVar = (pm) this.f8507g3;
                pmVar.invalidate();
                pmVar.f37135b.N1(pmVar, i7);
                om omVar = pmVar.f38512w;
                boolean z11 = true;
                int i10 = 0;
                if (omVar.f38217y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = omVar.d();
                    if (d.length == omVar.f38217y.length) {
                        while (true) {
                            if (i10 < d.length) {
                                if (d[i10] == omVar.f38217y[i10]) {
                                    i10++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    omVar.f38217y = omVar.d();
                }
                if (z10) {
                    omVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((na0) this.f8507g3).f37743e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8506f3) {
            case 10:
                super.onAttachedToWindow();
                jg.l1 l1Var = ((bn) this.f8507g3).f46137b4;
                if (l1Var != null) {
                    ks.f(l1Var.f17664r).c(l1Var, 329);
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
        switch (this.f8506f3) {
            case 10:
                super.onDetachedFromWindow();
                jg.l1 l1Var = ((bn) this.f8507g3).f46137b4;
                if (l1Var != null) {
                    org.telegram.messenger.g0.r(l1Var.F);
                    ks.f(l1Var.f17664r).n(l1Var, 329);
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
        switch (this.f8506f3) {
            case 2:
                ns p10 = ns.p();
                hi.b2 b2Var = (hi.b2) this.f8507g3;
                boolean q10 = p10.q(motionEvent, b2Var.f14215b, b2Var.f14218f, this.f34767o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            case 3:
                if (((hi.m3) this.f8507g3).L) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (((np) this.f8507g3).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((gj) this.f8507g3).f37135b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                if (((pm) this.f8507g3).K != null) {
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
                    ((qy) this.f8507g3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                boolean q11 = ns.p().q(motionEvent, ((lt0) this.f8507g3).f37213m1, null, this.f34767o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q11) {
                    return false;
                }
                return true;
            case 27:
                jw0 jw0Var = (jw0) this.f8507g3;
                if (jw0Var.M1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q12 = ns.p().q(motionEvent, jw0Var.n1, jw0Var.f36533h2, this.f34767o2);
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
        fj fjVar;
        switch (this.f8506f3) {
            case 0:
                ((h1) this.f8507g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.f8507g3;
                if (lbVar.f49707w != null && lbVar.f49711y != null && (i13 = lbVar.O0) >= 0) {
                    if (lbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.ib ibVar = lbVar.F;
                            if (i14 < ibVar.d) {
                                if (i14 >= ibVar.f48770f && i14 < ibVar.h) {
                                    ArrayList arrayList = ibVar.f48771n.f49698p0;
                                    fjVar = (fj) arrayList.get((arrayList.size() - (i14 - ibVar.f48770f)) - 1);
                                } else {
                                    fjVar = null;
                                }
                                if (fjVar != null && fjVar.T == lbVar.N0) {
                                    i13 = i14;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    lbVar.f49711y.i1(i13, lbVar.P0, true);
                    lbVar.O0 = -1;
                    lbVar.N0 = 0L;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 13:
                ((org.telegram.ui.Components.ra) this.f8507g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                kl klVar = (kl) this.f8507g3;
                kl.a0(klVar);
                klVar.i0();
                return;
            case 21:
                na0 na0Var = (na0) this.f8507g3;
                int i15 = na0Var.f37736a;
                if (na0Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    na0Var.L = false;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                na0Var.j();
                b1 b1Var = na0Var.f37744f;
                if (na0Var.V) {
                    if (b1Var.computeVerticalScrollRange() > b1Var.computeVerticalScrollExtent()) {
                        na0Var.postDelayed(new ea0(na0Var, 0), 0L);
                    }
                    na0Var.V = false;
                }
                if (na0Var.O && i15 == 0) {
                    int i16 = na0Var.M;
                    int i17 = na0Var.N;
                    na0Var.O = false;
                    post(new jg.q(this, i16, i17, 14));
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((sl0) this.f8507g3).a();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f8506f3) {
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
        switch (this.f8506f3) {
            case 11:
                if (((np) this.f8507g3).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((gj) this.f8507g3).f37135b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 17:
                if (((pm) this.f8507g3).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f8506f3) {
            case 6:
                if (!((org.telegram.ui.h1) this.f8507g3).f48400r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((pz) this.f8507g3).f38627t1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((lt0) this.f8507g3).f37217r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((jw0) this.f8507g3).f36528b2) {
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
        switch (this.f8506f3) {
            case 19:
                super.setAlpha(f10);
                ((oz) this.f8507g3).invalidate();
                return;
            case 29:
                super.setAlpha(f10);
                ((j71) this.f8507g3).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f8506f3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public b1(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f8506f3 = i7;
        this.f8507g3 = obj;
    }

    public b1(qy qyVar, Context context, oy oyVar) {
        super(context, null);
        this.f8506f3 = 18;
        this.f8507g3 = qyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.l(this, 20, org.telegram.ui.ActionBar.n6.f29543i6, this.f34767o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(oyVar);
    }

    private final void z1(int i7) {
    }
}
