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
import org.telegram.messenger.at;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w71;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a10;
import org.telegram.ui.h00;
import org.telegram.ui.h50;
import org.telegram.ui.h8;
import org.telegram.ui.iq;
import org.telegram.ui.jx;
import org.telegram.ui.kt;
import org.telegram.ui.pb;
import org.telegram.ui.pr;
import org.telegram.ui.qx;
import org.telegram.ui.sb;
import org.telegram.ui.un;
import org.telegram.ui.w8;
import org.telegram.ui.y00;
import org.telegram.ui.y6;
import org.telegram.ui.yy;
import org.telegram.ui.zz;
public final class b1 extends uk0 {
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
                bi biVar = ((h1) this.f469f3).f30964b;
                int L = org.telegram.messenger.i0.L(30.0f) + biVar.V3[0];
                if (!biVar.X1) {
                    i10 = org.telegram.messenger.i0.f16166m;
                } else {
                    i10 = 0;
                }
                if (f7 < L + i10) {
                    return false;
                }
                return true;
            case 10:
                bi biVar2 = ((ej) this.f469f3).f30964b;
                int L2 = org.telegram.messenger.i0.L(30.0f) + biVar2.V3[0];
                if (!biVar2.X1) {
                    i11 = org.telegram.messenger.i0.f16166m;
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
                if (tzVar.isEnabled() && !((qx) tzVar.J).f40919b.f44165j2) {
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
                if (((tz) this.f469f3).f30763n) {
                    int L = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF = ((rz) view).f30110f;
                    float f11 = L;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((w71) this.f469f3).f32154n) {
                    int L2 = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF2 = ((u71) view).f30893c;
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
                if (getAdapter() != null && ((f61) this.f469f3).f26101y1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i10) {
        zz zzVar;
        switch (this.f468e3) {
            case 19:
                return 0;
            case 25:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f469f3);
                p6 p6Var = this.f31008n2;
                if (i10 == b02) {
                    return Integer.valueOf(t6.r1(0.1f, t6.w0(t6.f21154p7, p6Var)));
                }
                return Integer.valueOf(t6.w0(t6.f21021i6, p6Var));
            case 26:
                ArrayList arrayList = ((h00) this.f469f3).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    zzVar = (zz) arrayList.get(i10);
                } else {
                    zzVar = null;
                }
                p6 p6Var2 = this.f31008n2;
                if (zzVar != null && zzVar.f44262l) {
                    return Integer.valueOf(t6.r1(0.12f, t6.w0(t6.f21154p7, p6Var2)));
                }
                return Integer.valueOf(t6.w0(t6.f21021i6, p6Var2));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f468e3) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (((w71) this.f469f3).V) {
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
        fj fjVar;
        ArrayList arrayList;
        b1 b1Var;
        ua0 ua0Var;
        int i10;
        b1 b1Var2;
        boolean z11;
        fj currentMessagesGroup;
        fj currentMessagesGroup2;
        Canvas canvas2 = canvas;
        switch (this.f468e3) {
            case 3:
                super.dispatchDraw(canvas);
                ((h8) this.f469f3).F = false;
                return;
            case 16:
                ua0 ua0Var2 = (ua0) this.f469f3;
                w8 w8Var = ua0Var2.f30912b;
                boolean z12 = false;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).u3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                fj fjVar2 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != fjVar2)) {
                        fjVar2 = currentMessagesGroup2;
                    }
                }
                int i13 = 0;
                while (i13 < 3) {
                    ab0 ab0Var = ua0Var2.f30915c0;
                    ArrayList arrayList2 = ab0Var.E;
                    b1 b1Var3 = ua0Var2.f30916f;
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
                                        org.telegram.messenger.ej ejVar = currentMessagesGroup.f15744m;
                                        if ((i13 != 0 || currentMessagesGroup.d.size() != 1) && ((i13 != 1 || ejVar.f15576i) && ((i13 != 0 || !q1Var.getMessageObject().Z) && ((i13 != 1 || q1Var.getMessageObject().Z) && ((i13 != i14 || q1Var.f22786xa) && (i13 == i14 || !q1Var.f22786xa)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ejVar.f15571a = r12;
                                                ejVar.f15572b = r12;
                                                ejVar.f15573c = r12;
                                                ejVar.d = r12;
                                                ejVar.f15579l = r12;
                                                ejVar.f15578k = r12;
                                                ejVar.f15580m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ejVar.f15578k = q1Var.F2();
                                            ejVar.f15579l = q1Var.E2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().f15166l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().f15166l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i16 = backgroundDrawableBottom;
                                            if (q1Var.f22786xa) {
                                                ejVar.f15580m = q1Var;
                                            }
                                            int i17 = ejVar.f15572b;
                                            if (i17 == 0 || backgroundDrawableTop < i17) {
                                                ejVar.f15572b = backgroundDrawableTop;
                                            }
                                            int i18 = ejVar.d;
                                            if (i18 == 0 || i16 > i18) {
                                                ejVar.d = i16;
                                            }
                                            int i19 = ejVar.f15571a;
                                            if (i19 == 0 || backgroundDrawableLeft < i19) {
                                                ejVar.f15571a = backgroundDrawableLeft;
                                            }
                                            int i20 = ejVar.f15573c;
                                            if (i20 == 0 || backgroundDrawableRight > i20) {
                                                ejVar.f15573c = backgroundDrawableRight;
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
                                    fj fjVar3 = (fj) arrayList2.get(i21);
                                    if (fjVar3 == null) {
                                        arrayList = arrayList2;
                                        b1Var2 = b1Var3;
                                        z11 = z13;
                                        ua0Var = ua0Var2;
                                        i10 = i21;
                                    } else {
                                        org.telegram.messenger.ej ejVar2 = fjVar3.f15744m;
                                        float P1 = ejVar2.f15580m.P1(z13);
                                        float f7 = ejVar2.f15571a + P1 + ejVar2.e;
                                        float f10 = ejVar2.f15572b + ejVar2.f15574f;
                                        float f11 = ejVar2.f15575g + ejVar2.f15573c + P1;
                                        float f12 = ejVar2.d + ejVar2.h;
                                        if (!ejVar2.f15577j) {
                                            f10 += ejVar2.f15580m.getTranslationY();
                                            f12 += ejVar2.f15580m.getTranslationY();
                                        }
                                        if (f10 < (-org.telegram.messenger.i0.L(20.0f))) {
                                            f10 = -org.telegram.messenger.i0.L(20.0f);
                                        }
                                        float f13 = f10;
                                        if (f12 > org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight()) {
                                            f12 = org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight();
                                        }
                                        float f14 = f12;
                                        if (ejVar2.f15580m.getScaleX() == 1.0f && ejVar2.f15580m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas2.save();
                                            fjVar = fjVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var3;
                                            canvas2.scale(ejVar2.f15580m.getScaleX(), ejVar2.f15580m.getScaleY(), c3.i0.B(f11, f7, 2.0f, f7), c3.i0.B(f14, f13, 2.0f, f13));
                                        } else {
                                            fjVar = fjVar3;
                                            arrayList = arrayList2;
                                            b1Var = b1Var3;
                                        }
                                        ua0Var = ua0Var2;
                                        fj fjVar4 = fjVar;
                                        i10 = i21;
                                        b1Var2 = b1Var;
                                        z11 = true;
                                        ejVar2.f15580m.I0(canvas2, (int) f7, (int) f13, (int) f11, (int) f14, ejVar2.f15578k, ejVar2.f15579l, false, 0);
                                        ejVar2.f15580m = null;
                                        ejVar2.f15582o = fjVar4.f15737c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i22 = 0; i22 < childCount; i22++) {
                                                View childAt4 = b1Var2.getChildAt(i22);
                                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt4;
                                                    if (q1Var2.getCurrentMessagesGroup() == fjVar4) {
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
                jx jxVar = (jx) this.f469f3;
                s4.a0 a0Var = jxVar.f26873e0;
                s4.j jVar = jxVar.f26871c0;
                an0 an0Var = jxVar.f26872d0;
                if (an0Var != null && jVar != null && a0Var != null && an0Var.m0) {
                    canvas2.save();
                    invalidate();
                    int b10 = an0Var.b() - 1;
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
                if (an0Var != null && jVar != null && a0Var != null && an0Var.m0) {
                    canvas2.restore();
                }
                if (an0Var != null && an0Var.f55716o0 != null) {
                    canvas2.save();
                    canvas2.translate(an0Var.f55716o0.getLeft(), an0Var.f55716o0.getTranslationY() + an0Var.f55716o0.getTop());
                    an0Var.f55716o0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            case 27:
                if (getAdapter() == ((y00) this.f469f3).U) {
                    for (int i24 = 0; i24 < getChildCount(); i24++) {
                        if (T(getChildAt(i24)).f47912f == 1) {
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
                h50 h50Var = (h50) this.f469f3;
                if (h50Var.f37704z0 != null && h50Var.A0 >= 1.0f) {
                    canvas2.save();
                    canvas2.translate(0.0f, -(h50Var.f37704z0.getMeasuredHeight() - h50.m1(h50Var).getMeasuredHeight()));
                    h50Var.f37704z0.draw(canvas2);
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
                nj0 nj0Var = (nj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && nj0Var.getPullingLeftProgress() > 0.95f) {
                        nj0.a(nj0Var);
                    } else if (nj0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = nj0Var.f28902y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(nj0Var.B0, 0.0f);
                        nj0Var.f28902y0 = ofFloat;
                        ofFloat.addUpdateListener(new r60(nj0Var, 6));
                        nj0Var.f28902y0.setDuration(150L);
                        nj0Var.f28902y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                LinearLayout linearLayout = ((sm0) obj).f30338f;
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
                jmVar.f30964b.L1(jmVar, i10);
                im imVar = jmVar.f27457w;
                boolean z11 = true;
                int i11 = 0;
                if (imVar.f27125y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = imVar.d();
                    if (d.length == imVar.f27125y.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == imVar.f27125y[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    imVar.f27125y = imVar.d();
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
                zf.b1 b1Var = ((un) this.f469f3).f41992a4;
                if (b1Var != null) {
                    at.f(b1Var.f55465r).c(b1Var, 326);
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
                zf.b1 b1Var = ((un) this.f469f3).f41992a4;
                if (b1Var != null) {
                    org.telegram.messenger.i0.r(b1Var.E);
                    at.f(b1Var.f55465r).n(b1Var, 326);
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f469f3).f30964b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
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
                boolean q6 = kt.p().q(motionEvent, ((eu0) this.f469f3).f25928i1, null, this.f31008n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                    return false;
                }
                return true;
            case 22:
                dx0 dx0Var = (dx0) this.f469f3;
                if (dx0Var.I1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q10 = kt.p().q(motionEvent, dx0Var.f25619j1, dx0Var.f25612d2, this.f31008n2);
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
        kj kjVar;
        switch (this.f468e3) {
            case 4:
                sb sbVar = (sb) this.f469f3;
                if (sbVar.f41329w != null && sbVar.f41333y != null && (i14 = sbVar.N0) >= 0) {
                    if (sbVar.M0 != 0) {
                        int i15 = 0;
                        while (true) {
                            pb pbVar = sbVar.E;
                            if (i15 < pbVar.d) {
                                if (i15 >= pbVar.f40442f && i15 < pbVar.h) {
                                    ArrayList arrayList = pbVar.f40443n.f41319o0;
                                    kjVar = (kj) arrayList.get((arrayList.size() - (i15 - pbVar.f40442f)) - 1);
                                } else {
                                    kjVar = null;
                                }
                                if (kjVar != null && kjVar.T == sbVar.M0) {
                                    i14 = i15;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    sbVar.f41333y.i1(i14, sbVar.O0, true);
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
                int i16 = ua0Var.f30910a;
                if (ua0Var.K) {
                    if (i16 != 0) {
                        v0(0);
                    }
                    ua0Var.K = false;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                ua0Var.j();
                b1 b1Var = ua0Var.f30916f;
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
                ((hm0) this.f469f3).a();
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((qi) this.f469f3).f30964b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
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
                    org.telegram.messenger.i0.h3(new yy(this, 3), 250L);
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
                if (!((org.telegram.ui.j1) this.f469f3).f38246r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 15:
                if (!((uz) this.f469f3).f31123p1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((eu0) this.f469f3).f25932n1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((dx0) this.f469f3).X1) {
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
                ((w71) this.f469f3).invalidate();
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
                if ((view instanceof a10) && ((a10) view).getDraggingProgress() > 0.0f) {
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
        a7.m(this, 20, t6.f21021i6, this.f31008n2);
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
