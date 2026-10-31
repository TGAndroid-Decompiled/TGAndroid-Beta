package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a00;
import org.telegram.ui.b10;
import org.telegram.ui.h8;
import org.telegram.ui.i00;
import org.telegram.ui.i50;
import org.telegram.ui.iq;
import org.telegram.ui.kx;
import org.telegram.ui.lt;
import org.telegram.ui.pb;
import org.telegram.ui.pr;
import org.telegram.ui.rx;
import org.telegram.ui.sb;
import org.telegram.ui.un;
import org.telegram.ui.w8;
import org.telegram.ui.y6;
import org.telegram.ui.z00;
import org.telegram.ui.zy;
public final class b1 extends tk0 {
    public final int f468e3;
    public final Object f469f3;

    public b1(Object obj, Context context, int i10) {
        super(context, null);
        this.f468e3 = i10;
        this.f469f3 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.f468e3) {
            case 0:
                bi biVar = ((h1) this.f469f3).f30947b;
                int L = org.telegram.messenger.i0.L(30.0f) + biVar.V3[0];
                if (!biVar.X1) {
                    i10 = org.telegram.messenger.i0.f16020m;
                } else {
                    i10 = 0;
                }
                if (f7 < L + i10) {
                    return false;
                }
                return true;
            case 10:
                bi biVar2 = ((ej) this.f469f3).f30947b;
                int L2 = org.telegram.messenger.i0.L(30.0f) + biVar2.V3[0];
                if (!biVar2.X1) {
                    i11 = org.telegram.messenger.i0.f16020m;
                } else {
                    i11 = 0;
                }
                if (f7 < L2 + i11) {
                    return false;
                }
                return true;
            default:
                return super.E0(f7);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.f468e3) {
            case 2:
                if (view != ((y6) this.f469f3).W) {
                    return true;
                }
                return false;
            case 14:
                tz tzVar = (tz) this.f469f3;
                if (tzVar.isEnabled() && !((rx) tzVar.J).f41307b.f35822j2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.f468e3) {
            case 8:
                return ((ha) this.f469f3).J0(view, f7, f10);
            case 14:
                if (((tz) this.f469f3).f30717n) {
                    int L = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF = ((rz) view).f30055f;
                    float f11 = L;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((v71) this.f469f3).f31176n) {
                    int L2 = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF2 = ((t71) view).f30475c;
                    float f12 = L2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public boolean R0() {
        switch (this.f468e3) {
            case 23:
                if (getAdapter() != null && ((e61) this.f469f3).f25732y1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i10) {
        a00 a00Var;
        switch (this.f468e3) {
            case 19:
                return 0;
            case 25:
                int a02 = DataSettingsActivity.a0((DataSettingsActivity) this.f469f3);
                p6 p6Var = this.f30625n2;
                if (i10 == a02) {
                    return Integer.valueOf(t6.r1(0.1f, t6.w0(t6.f21153p7, p6Var)));
                }
                return Integer.valueOf(t6.w0(t6.f21020i6, p6Var));
            case 26:
                ArrayList arrayList = ((i00) this.f469f3).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    a00Var = (a00) arrayList.get(i10);
                } else {
                    a00Var = null;
                }
                p6 p6Var2 = this.f30625n2;
                if (a00Var != null && a00Var.f35501l) {
                    return Integer.valueOf(t6.r1(0.12f, t6.w0(t6.f21153p7, p6Var2)));
                }
                return Integer.valueOf(t6.w0(t6.f21020i6, p6Var2));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f468e3) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (((v71) this.f469f3).V) {
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
                super.addView(view, i10, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        org.telegram.messenger.ej ejVar;
        ArrayList arrayList;
        b1 b1Var;
        ua0 ua0Var;
        int i10;
        b1 b1Var2;
        boolean z11;
        org.telegram.messenger.ej currentMessagesGroup;
        org.telegram.messenger.ej currentMessagesGroup2;
        Canvas canvas2 = canvas;
        switch (this.f468e3) {
            case 3:
                super.dispatchDraw(canvas);
                ((h8) this.f469f3).F = false;
                return;
            case 16:
                ua0 ua0Var2 = (ua0) this.f469f3;
                w8 w8Var = ua0Var2.f30878b;
                boolean z12 = false;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).u3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                org.telegram.messenger.ej ejVar2 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != ejVar2)) {
                        ejVar2 = currentMessagesGroup2;
                    }
                }
                int i13 = 0;
                while (i13 < 3) {
                    ab0 ab0Var = ua0Var2.f30881c0;
                    ArrayList arrayList2 = ab0Var.E;
                    b1 b1Var3 = ua0Var2.f30882f;
                    ab0Var.E.clear();
                    int i14 = 2;
                    if (i13 != 2 || b1Var3.V1) {
                        int i15 = z12 ? 1 : 0;
                        ?? r12 = z12;
                        while (true) {
                            boolean z13 = true;
                            if (i15 < childCount) {
                                View childAt3 = b1Var3.getChildAt(i15);
                                if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt3;
                                    if (childAt3.getY() <= b1Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        dj djVar = currentMessagesGroup.f15403m;
                                        if ((i13 != 0 || currentMessagesGroup.d.size() != 1) && ((i13 != 1 || djVar.f15246i) && ((i13 != 0 || !q1Var.getMessageObject().Z) && ((i13 != 1 || q1Var.getMessageObject().Z) && ((i13 != i14 || q1Var.f22785xa) && (i13 == i14 || !q1Var.f22785xa)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                djVar.f15241a = r12;
                                                djVar.f15242b = r12;
                                                djVar.f15243c = r12;
                                                djVar.d = r12;
                                                djVar.f15249l = r12;
                                                djVar.f15248k = r12;
                                                djVar.f15250m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            djVar.f15248k = q1Var.F2();
                                            djVar.f15249l = q1Var.E2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().f14783l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().f14783l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i16 = backgroundDrawableBottom;
                                            if (q1Var.f22785xa) {
                                                djVar.f15250m = q1Var;
                                            }
                                            int i17 = djVar.f15242b;
                                            if (i17 == 0 || backgroundDrawableTop < i17) {
                                                djVar.f15242b = backgroundDrawableTop;
                                            }
                                            int i18 = djVar.d;
                                            if (i18 == 0 || i16 > i18) {
                                                djVar.d = i16;
                                            }
                                            int i19 = djVar.f15241a;
                                            if (i19 == 0 || backgroundDrawableLeft < i19) {
                                                djVar.f15241a = backgroundDrawableLeft;
                                            }
                                            int i20 = djVar.f15243c;
                                            if (i20 == 0 || backgroundDrawableRight > i20) {
                                                djVar.f15243c = backgroundDrawableRight;
                                            }
                                        }
                                    }
                                }
                                i15++;
                                i14 = 2;
                                r12 = 0;
                            } else {
                                int i21 = 0;
                                while (i21 < arrayList2.size()) {
                                    org.telegram.messenger.ej ejVar3 = (org.telegram.messenger.ej) arrayList2.get(i21);
                                    if (ejVar3 == null) {
                                        arrayList = arrayList2;
                                        b1Var2 = b1Var3;
                                        z11 = z13;
                                        ua0Var = ua0Var2;
                                        i10 = i21;
                                    } else {
                                        dj djVar2 = ejVar3.f15403m;
                                        float P1 = djVar2.f15250m.P1(z13);
                                        float f7 = djVar2.f15241a + P1 + djVar2.e;
                                        float f10 = djVar2.f15242b + djVar2.f15244f;
                                        float f11 = djVar2.f15245g + djVar2.f15243c + P1;
                                        float f12 = djVar2.d + djVar2.h;
                                        if (!djVar2.f15247j) {
                                            f10 += djVar2.f15250m.getTranslationY();
                                            f12 += djVar2.f15250m.getTranslationY();
                                        }
                                        if (f10 < (-org.telegram.messenger.i0.L(20.0f))) {
                                            f10 = -org.telegram.messenger.i0.L(20.0f);
                                        }
                                        float f13 = f10;
                                        if (f12 > org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight()) {
                                            f12 = org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight();
                                        }
                                        float f14 = f12;
                                        if (djVar2.f15250m.getScaleX() == 1.0f && djVar2.f15250m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas2.save();
                                            ejVar = ejVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var3;
                                            canvas2.scale(djVar2.f15250m.getScaleX(), djVar2.f15250m.getScaleY(), c3.i0.B(f11, f7, 2.0f, f7), c3.i0.B(f14, f13, 2.0f, f13));
                                        } else {
                                            ejVar = ejVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var3;
                                        }
                                        ua0Var = ua0Var2;
                                        org.telegram.messenger.ej ejVar4 = ejVar;
                                        i10 = i21;
                                        b1Var2 = b1Var;
                                        z11 = true;
                                        djVar2.f15250m.I0(canvas2, (int) f7, (int) f13, (int) f11, (int) f14, djVar2.f15248k, djVar2.f15249l, false, 0);
                                        djVar2.f15250m = null;
                                        djVar2.f15252o = ejVar4.f15396c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i22 = 0; i22 < childCount; i22++) {
                                                View childAt4 = b1Var2.getChildAt(i22);
                                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt4;
                                                    if (q1Var2.getCurrentMessagesGroup() == ejVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt4.setPivotX(((f11 - f7) / 2.0f) + (f7 - left));
                                                        childAt4.setPivotY(((f14 - f13) / 2.0f) + (f13 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i21 = i10 + 1;
                                    canvas2 = canvas;
                                    b1Var3 = b1Var2;
                                    ua0Var2 = ua0Var;
                                    arrayList2 = arrayList;
                                    z13 = z11;
                                }
                            }
                        }
                    }
                    i13++;
                    canvas2 = canvas;
                    ua0Var2 = ua0Var2;
                    z12 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 20:
                kx kxVar = (kx) this.f469f3;
                s4.a0 a0Var = kxVar.f26452e0;
                s4.j jVar = kxVar.f26450c0;
                zm0 zm0Var = kxVar.f26451d0;
                if (zm0Var != null && jVar != null && a0Var != null && zm0Var.m0) {
                    canvas2.save();
                    invalidate();
                    int b10 = zm0Var.b() - 1;
                    int i23 = 0;
                    while (true) {
                        if (i23 < getChildCount()) {
                            View childAt5 = getChildAt(i23);
                            if (RecyclerView.R(childAt5) == b10) {
                                canvas2.clipRect(0.0f, 0.0f, getWidth(), childAt5.getTranslationY() + childAt5.getBottom());
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (zm0Var != null && jVar != null && a0Var != null && zm0Var.m0) {
                    canvas2.restore();
                }
                if (zm0Var != null && zm0Var.f55698o0 != null) {
                    canvas2.save();
                    canvas2.translate(zm0Var.f55698o0.getLeft(), zm0Var.f55698o0.getTranslationY() + zm0Var.f55698o0.getTop());
                    zm0Var.f55698o0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            case 27:
                if (getAdapter() == ((z00) this.f469f3).U) {
                    for (int i24 = 0; i24 < getChildCount(); i24++) {
                        if (T(getChildAt(i24)).f47901f == 1) {
                            canvas2.save();
                            canvas2.translate(getChildAt(i24).getX(), (getChildAt(i24).getY() - getChildAt(i24).getMeasuredHeight()) + org.telegram.messenger.i0.L(2.0f));
                            getChildAt(i24).draw(canvas2);
                            canvas2.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                i50 i50Var = (i50) this.f469f3;
                if (i50Var.f38178z0 != null && i50Var.A0 >= 1.0f) {
                    canvas2.save();
                    canvas2.translate(0.0f, -(i50Var.f38178z0.getMeasuredHeight() - i50.l1(i50Var).getMeasuredHeight()));
                    i50Var.f38178z0.draw(canvas2);
                    canvas2.restore();
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
        int i10 = this.f468e3;
        Object obj = this.f469f3;
        switch (i10) {
            case 17:
                mj0 mj0Var = (mj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && mj0Var.getPullingLeftProgress() > 0.95f) {
                        mj0.a(mj0Var);
                    } else if (mj0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = mj0Var.f28541y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(mj0Var.B0, 0.0f);
                        mj0Var.f28541y0 = ofFloat;
                        ofFloat.addUpdateListener(new r60(mj0Var, 6));
                        mj0Var.f28541y0.setDuration(150L);
                        mj0Var.f28541y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                LinearLayout linearLayout = ((rm0) obj).f29959f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: ag.b1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void invalidate() {
        switch (this.f468e3) {
            case 7:
                super.invalidate();
                View view = ((pr) this.f469f3).fragmentView;
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
    public void k0(int i10) {
        switch (this.f468e3) {
            case 16:
                if (i10 == 0) {
                    ((ua0) this.f469f3).e.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l0(int i10) {
        boolean z10;
        switch (this.f468e3) {
            case 0:
                return;
            case 12:
                jm jmVar = (jm) this.f469f3;
                jmVar.invalidate();
                jmVar.f30947b.L1(jmVar, i10);
                im imVar = jmVar.f27404w;
                boolean z11 = true;
                int i11 = 0;
                if (imVar.f27017y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = imVar.d();
                    if (d.length == imVar.f27017y.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == imVar.f27017y[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    imVar.f27017y = imVar.d();
                }
                if (z10) {
                    imVar.invalidate();
                    return;
                }
                return;
            case 16:
                ((ua0) this.f469f3).e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f468e3) {
            case 5:
                super.onAttachedToWindow();
                zf.b1 b1Var = ((un) this.f469f3).f42182a4;
                if (b1Var != null) {
                    zs.f(b1Var.f55447r).c(b1Var, 326);
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
        switch (this.f468e3) {
            case 5:
                super.onDetachedFromWindow();
                zf.b1 b1Var = ((un) this.f469f3).f42182a4;
                if (b1Var != null) {
                    org.telegram.messenger.i0.r(b1Var.E);
                    zs.f(b1Var.f55447r).n(b1Var, 326);
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
        switch (this.f468e3) {
            case 6:
                if (((iq) this.f469f3).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f469f3).f30947b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((jm) this.f469f3).J != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((vy) this.f469f3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 21:
                boolean q6 = lt.p().q(motionEvent, ((du0) this.f469f3).f25535i1, null, this.f30625n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                    return false;
                }
                return true;
            case 22:
                cx0 cx0Var = (cx0) this.f469f3;
                if (cx0Var.I1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q10 = lt.p().q(motionEvent, cx0Var.f25206j1, cx0Var.f25199d2, this.f30625n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        jj jjVar;
        switch (this.f468e3) {
            case 4:
                sb sbVar = (sb) this.f469f3;
                if (sbVar.f41453w != null && sbVar.f41457y != null && (i14 = sbVar.N0) >= 0) {
                    if (sbVar.M0 != 0) {
                        int i15 = 0;
                        while (true) {
                            pb pbVar = sbVar.E;
                            if (i15 < pbVar.d) {
                                if (i15 >= pbVar.f40562f && i15 < pbVar.h) {
                                    ArrayList arrayList = pbVar.f40563n.f41443o0;
                                    jjVar = (jj) arrayList.get((arrayList.size() - (i15 - pbVar.f40562f)) - 1);
                                } else {
                                    jjVar = null;
                                }
                                if (jjVar != null && jjVar.T == sbVar.M0) {
                                    i14 = i15;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    sbVar.f41457y.i1(i14, sbVar.O0, true);
                    sbVar.N0 = -1;
                    sbVar.M0 = 0L;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 8:
                ((ha) this.f469f3).I0();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.v1().z0();
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                ((bl) this.f469f3).h0();
                return;
            case 16:
                ua0 ua0Var = (ua0) this.f469f3;
                int i16 = ua0Var.f30876a;
                if (ua0Var.K) {
                    if (i16 != 0) {
                        v0(0);
                    }
                    ua0Var.K = false;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                ua0Var.j();
                b1 b1Var = ua0Var.f30882f;
                if (ua0Var.U) {
                    if (b1Var.computeVerticalScrollRange() > b1Var.computeVerticalScrollExtent()) {
                        ua0Var.postDelayed(new la0(ua0Var, 0), 0L);
                    }
                    ua0Var.U = false;
                }
                if (ua0Var.N && i16 == 0) {
                    int i17 = ua0Var.L;
                    int i18 = ua0Var.M;
                    ua0Var.N = false;
                    post(new i2.u(this, i17, i18, 12));
                    return;
                }
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((gm0) this.f469f3).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f468e3) {
            case 6:
                if (((iq) this.f469f3).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f469f3).f30947b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((jm) this.f469f3).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.i0.h3(new zy(this, 3), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.f468e3) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f468e3) {
            case 1:
                if (!((org.telegram.ui.j1) this.f469f3).f38409r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 15:
                if (!((uz) this.f469f3).f31096p1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((du0) this.f469f3).f25539n1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((cx0) this.f469f3).X1) {
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
    public void setAlpha(float f7) {
        switch (this.f468e3) {
            case 14:
                super.setAlpha(f7);
                ((tz) this.f469f3).invalidate();
                return;
            case 24:
                super.setAlpha(f7);
                ((v71) this.f469f3).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f468e3) {
            case 23:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f468e3) {
            case 28:
                if ((view instanceof b10) && ((b10) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public b1(Object obj, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.f468e3 = i10;
        this.f469f3 = obj;
    }

    public b1(vy vyVar, Context context, ty tyVar) {
        super(context, null);
        this.f468e3 = 13;
        this.f469f3 = vyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.i0.L(4.0f));
        a7.m(this, 20, t6.f21020i6, this.f30625n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        dh.f fVar = new dh.f(7);
        fVar.j1(0);
        setLayoutManager(fVar);
        setAdapter(tyVar);
    }

    private final void z1(int i10) {
    }
}
