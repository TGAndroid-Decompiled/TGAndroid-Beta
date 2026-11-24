package defpackage;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.ActionBar.d;
public final class x53 {
    public boolean C;
    public final w53 a;
    public final WindowManager b;
    public final su c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final t53 m;
    public final v29 n;
    public final ArrayList o;
    public pp8 p;
    public boolean q;
    public final d r;
    public final ylb s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final byte y;
    public im0 z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();
    public final int[] A = new int[2];
    public final po B = new po(null);
    public final HashSet D = new HashSet();
    public final ArrayList E = new ArrayList();
    public int F = 0;

    public x53(int i, d dVar, ArrayList arrayList, HashSet hashSet, v29 v29Var, ylb ylbVar, boolean z) {
        Context context;
        boolean z2;
        boolean z3;
        int i2;
        this.y = i;
        this.o = arrayList;
        this.r = dVar;
        this.s = ylbVar;
        if (dVar != null) {
            context = dVar.getContext();
        } else {
            context = v29Var.getContext();
        }
        Context context2 = context;
        su suVar = new su(this, context2);
        this.c = suVar;
        suVar.setOnClickListener(new k81(this, (byte) 25));
        if (i != 2 && i != 4 && i != 5 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.d = z2;
        w53 w53Var = new w53(this, context2);
        this.a = w53Var;
        boolean z4 = z2;
        int windowType = v29Var.getWindowType();
        if (i != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        t53 t53Var = new t53(this, dVar, context2, windowType, z3, ylbVar, v29Var, dVar);
        this.m = t53Var;
        t53Var.setOutlineProvider(new u53(this));
        t53Var.setClipToOutline(true);
        boolean z5 = v29Var.h1;
        boolean z6 = v29Var.i1;
        if (t53Var.M1 != z5) {
            t53Var.M1 = z5;
            t53Var.N1 = z6;
            ty9 ty9Var = t53Var.i0;
            if (ty9Var != null) {
                ty9Var.invalidate();
            }
            jy9 jy9Var = t53Var.j0;
            if (jy9Var != null) {
                jy9Var.invalidate();
            }
        }
        t53Var.setOnLongPressedListener(new ni6(v29Var, (byte) 22));
        int i3 = 16;
        t53Var.setOnRecentClearedListener(new q7f((byte) 16));
        t53Var.setRecentReactions(arrayList);
        t53Var.setSelectedReactions(hashSet);
        t53Var.setDrawBackground(false);
        t53Var.r(null);
        w53Var.addView(t53Var, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i == 5) {
            w53Var.setClipChildren(false);
            w53Var.setClipToPadding(false);
            suVar.setClipChildren(false);
            suVar.setClipToPadding(false);
            i3 = 2;
        }
        if (i == 5) {
            i2 = 85;
        } else {
            i2 = 48;
        }
        int i4 = i2;
        float f = i3;
        suVar.addView(w53Var, qoe.d(-1, -1.0f, i4, f, f, f, 16.0f));
        suVar.setClipChildren(false);
        if (i == 1 || (v29Var.getDelegate() != null && v29Var.getDelegate().s())) {
            t53Var.setBackgroundDelegate(new x92(this, v29Var, (byte) 14));
        }
        if (z4) {
            ((ViewGroup) v29Var.getParent()).addView(suVar);
        } else {
            WindowManager.LayoutParams b = b(false);
            WindowManager windowManager = gm.W(context2).getWindowManager();
            this.b = windowManager;
            gm.s3(windowManager, suVar, b);
            windowManager.addView(suVar, b);
        }
        this.n = v29Var;
        v29Var.setOnSwitchedToLoopView(new r53(this, (byte) 0));
        v29Var.d1 = true;
        v29Var.invalidate();
        gm.d3(new mv2(this, v29Var, (byte) 24), 50L);
        if (i != 5) {
            nm7.e().k(nm7.j1, 7);
        }
    }

    public static void g(View view, float f) {
        if (view instanceof fz9) {
            ((fz9) view).setAnimatedScale(f);
        } else if (view instanceof jz3) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        View view;
        if (this.E.isEmpty()) {
            h(false);
            oi5.a();
            this.B.e();
            t53 t53Var = this.m;
            t53Var.setEnterAnimationInProgress(false);
            ty9 ty9Var = t53Var.i0;
            if (z) {
                t53Var.e0.m(false);
                ty9Var.invalidate();
                ty9Var.h1();
                t53Var.g0.a();
                t53Var.sendAccessibilityEvent(32);
                v29 v29Var = this.n;
                v29Var.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i < ty9Var.getChildCount()) {
                        if (ty9Var.getChildAt(i) instanceof fz9) {
                            view = ty9Var.getChildAt(i);
                            break;
                        }
                        i++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    t53Var.performAccessibilityAction(64, null);
                }
                if (v29Var.getPullingLeftProgress() > 0.0f) {
                    v29Var.P0 = false;
                    ValueAnimator valueAnimator = v29Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    v29Var.C0 = 0.0f;
                    su suVar = v29Var.T;
                    if (suVar != null) {
                        suVar.invalidate();
                    }
                    v29Var.invalidate();
                } else {
                    v29Var.P0 = true;
                    ValueAnimator valueAnimator2 = v29Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    v29Var.C0 = 0.0f;
                    su suVar2 = v29Var.T;
                    if (suVar2 != null) {
                        suVar2.invalidate();
                    }
                    v29Var.invalidate();
                }
                jy9 jy9Var = t53Var.j0;
                for (int i2 = 0; i2 < ty9Var.i3.size(); i2++) {
                    xy9 xy9Var = (xy9) ty9Var.i3.get(i2);
                    for (int i3 = 0; i3 < xy9Var.P.size(); i3++) {
                        if (((fz9) xy9Var.P.get(i3)).b) {
                            ((fz9) xy9Var.P.get(i3)).b = false;
                            ((fz9) xy9Var.P.get(i3)).invalidate();
                            xy9Var.k();
                        }
                    }
                }
                ty9Var.invalidate();
                for (int i4 = 0; i4 < jy9Var.i3.size(); i4++) {
                    xy9 xy9Var2 = (xy9) jy9Var.i3.get(i4);
                    for (int i5 = 0; i5 < xy9Var2.P.size(); i5++) {
                        if (((fz9) xy9Var2.P.get(i5)).b) {
                            ((fz9) xy9Var2.P.get(i5)).b = false;
                            ((fz9) xy9Var2.P.get(i5)).invalidate();
                            xy9Var2.k();
                        }
                    }
                }
                jy9Var.invalidate();
                i();
                this.a.invalidate();
            }
        }
    }

    public final WindowManager.LayoutParams b(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        byte b = this.y;
        if (b != 0 && b != 3) {
            i = 99;
        } else {
            i = 1000;
        }
        layoutParams.type = i;
        layoutParams.softInputMode = 16;
        if (z) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z) {
        int i;
        ?? r18;
        boolean z2;
        boolean z3;
        boolean z4;
        ValueAnimator valueAnimator;
        boolean z5;
        t53 t53Var = this.m;
        byte b = this.y;
        su suVar = this.c;
        int[] iArr = this.A;
        w53 w53Var = this.a;
        RectF rectF = this.f;
        v29 v29Var = this.n;
        rectF.set(v29Var.x);
        this.e = v29Var.E;
        int[] iArr2 = new int[2];
        if (z) {
            v29Var.getLocationOnScreen(iArr);
        }
        suVar.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - gm.L(44.0f)) - gm.L(52.0f);
        if (t53Var.P0) {
            i = gm.L(26.0f);
        } else {
            i = 0;
        }
        float topOffset = v29Var.getTopOffset() + (L - i);
        if (v29Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - gm.L(12.0f);
        }
        if (w53Var.getMeasuredHeight() + topOffset > suVar.getMeasuredHeight() - gm.L(32.0f)) {
            topOffset = (suVar.getMeasuredHeight() - gm.L(32.0f)) - w53Var.getMeasuredHeight();
        }
        if (topOffset < gm.L(16.0f)) {
            topOffset = gm.L(16.0f);
        }
        float f = 0.0f;
        if (b == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (b == 1) {
            r18 = 1;
            w53Var.setTranslationX(((suVar.getMeasuredWidth() - w53Var.getMeasuredWidth()) / 2.0f) - gm.L(16.0f));
        } else {
            boolean z6 = true;
            if (b != 2 && b != 4) {
                w53Var.setTranslationX((iArr[0] - iArr2[0]) - gm.L(2.0f));
                r18 = z6;
            } else {
                w53Var.setTranslationX((iArr[0] - iArr2[0]) - gm.L(18.0f));
                r18 = z6;
            }
        }
        if (!z) {
            this.t = w53Var.getTranslationY();
        } else {
            this.t = topOffset;
            w53Var.setTranslationY(topOffset);
        }
        float x = (iArr[0] - iArr2[0]) - w53Var.getX();
        this.g = x;
        float y = (iArr[r18] - iArr2[r18]) - w53Var.getY();
        this.h = y;
        rectF.offset(x, y);
        v29Var.setCustomEmojiEnterProgress(this.j);
        if (z) {
            if (gda.o() >= 2 && e86.e(8200)) {
                z2 = r18;
            } else {
                z2 = false;
            }
            this.w = z2;
            this.k = false;
        } else {
            this.w = false;
            z2 = false;
        }
        if (z2) {
            z3 = r18;
            j(z3, 0.0f);
        } else {
            z3 = r18;
        }
        k();
        t53Var.setEnterAnimationInProgress(z3);
        mz3 mz3Var = t53Var.e0;
        if (z && this.w) {
            z4 = true;
        } else {
            z4 = false;
        }
        mz3Var.m(z4);
        this.B.d();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f2 = this.j;
        if (b == 4) {
            if (z) {
                f = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f2, f);
        } else {
            if (z) {
                f = 1.0f;
            }
            float[] fArr = {f2, f};
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.a = 0;
            timeAnimator.b = 0;
            timeAnimator.setFloatValues(fArr);
            valueAnimator = timeAnimator;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new d30((byte) 3, this, z));
        if (!z) {
            i();
        }
        this.x.addListener(new y7((byte) 27, this, z));
        if (b == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(d53.h);
        } else {
            boolean z7 = this.w;
            ValueAnimator valueAnimator3 = this.x;
            if (z7) {
                valueAnimator3.setDuration(450L);
                b10.n(0.5f, this.x);
            } else {
                valueAnimator3.setDuration(350L);
                this.x.setInterpolator(d53.f);
            }
        }
        w53Var.invalidate();
        h(true);
        if (!z) {
            v29Var.P0 = true;
            v29Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        } else {
            v29Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator4 = this.x;
            Objects.requireNonNull(valueAnimator4);
            xf2 xf2Var = new xf2(valueAnimator4, (byte) 21);
            oi5.f = this.w;
            oi5.e = true;
            oi5.g = false;
            if (oi5.d) {
                oi5.d = false;
            }
            oi5.c = xf2Var;
        }
        HashSet hashSet = oi5.a;
        ix2 ix2Var = fn5.z().p;
        if (((CountDownLatch) ix2Var.c) == null) {
            z5 = true;
            ix2Var.c = new CountDownLatch(1);
        } else {
            z5 = true;
        }
        oi5.b = z5;
        oi5.e = false;
        oi5.g = false;
    }

    public final void d() {
        if (!this.q) {
            v29 v29Var = this.n;
            if (v29Var != null) {
                ValueAnimator valueAnimator = v29Var.z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                v29Var.C0 = 0.0f;
                su suVar = v29Var.T;
                if (suVar != null) {
                    suVar.invalidate();
                }
                v29Var.invalidate();
            }
            u31.e();
            this.q = true;
            gm.t1(this.c);
            c(false);
            if (this.v) {
                d dVar = this.r;
                if (dVar instanceof yv1) {
                    ((yv1) dVar).ia(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.q) {
            u31.e();
            this.q = true;
            su suVar = this.c;
            gm.t1(suVar);
            suVar.animate().alpha(0.0f).setDuration(150L).setListener(new v53(this, (byte) 1));
            if (this.v) {
                d dVar = this.r;
                if (dVar instanceof yv1) {
                    ((yv1) dVar).ia(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.y != 5) {
            nm7.e().k(nm7.k1, 7);
        }
        gm.c3(new r53(this, (byte) 1));
    }

    public final void h(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        t53 t53Var = this.m;
        t53Var.i0.setLayerType(i, null);
        t53Var.g0.setLayerType(i, null);
        if (this.w) {
            for (int i2 = 0; i2 < Math.min(t53Var.e0.b.getChildCount(), 16); i2++) {
                t53Var.e0.b.getChildAt(i2).setLayerType(i, null);
            }
            return;
        }
        t53Var.f0.setLayerType(i, null);
        t53Var.e0.setLayerType(i, null);
    }

    public final void i() {
        int i = 0;
        while (true) {
            t53 t53Var = this.m;
            ty9 ty9Var = t53Var.i0;
            ty9 ty9Var2 = t53Var.i0;
            if (i < ty9Var.getChildCount()) {
                if (ty9Var2.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var2.getChildAt(i);
                    if (fz9Var.y != null) {
                        fz9Var.b = false;
                        fz9Var.invalidate();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void j(boolean z, float f) {
        RectF rectF;
        HashSet hashSet;
        t53 t53Var = this.m;
        float y = t53Var.getY();
        qy9 qy9Var = t53Var.b0;
        float y2 = qy9Var.getY() + y;
        ty9 ty9Var = t53Var.i0;
        int y3 = (int) (ty9Var.getY() + y2);
        ArrayList arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = ty9Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i >= childCount) {
                break;
            }
            View childAt = ty9Var.getChildAt(i);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y3;
                if (measuredHeight < rectF.bottom && measuredHeight > rectF.top && f != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                } else {
                    g(childAt, 0.0f);
                    z2 = true;
                }
            }
            i++;
        }
        int y4 = (int) (t53Var.e0.getY() + qy9Var.getY() + t53Var.getY());
        for (int i2 = 0; i2 < t53Var.e0.b.getChildCount(); i2++) {
            View childAt2 = t53Var.e0.b.getChildAt(i2);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y4;
                if (measuredHeight2 < rectF.bottom && measuredHeight2 > rectF.top && f != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                } else {
                    g(childAt2, 0.0f);
                    z2 = true;
                }
            }
        }
        if (z2) {
            t53Var.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pl(this, arrayList, (byte) 10));
            this.E.add(ofFloat);
            ofFloat.addListener(new qx(this, ofFloat, z, (byte) 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(d53.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.w) {
            t53 t53Var = this.m;
            t53Var.g0.setAlpha(this.j);
            t53Var.i0.setAlpha(this.j);
            t53Var.j0.setAlpha(this.j);
            t53Var.e0.setAlpha(this.j);
            t53Var.f0.setAlpha(this.j);
        }
    }

    public final void l() {
        float f;
        t53 t53Var = this.m;
        qy9 qy9Var = t53Var.b0;
        qy9 qy9Var2 = t53Var.b0;
        boolean z = this.w;
        w53 w53Var = this.a;
        if (z) {
            f = 0.0f;
        } else {
            f = w53Var.f;
        }
        qy9Var.setTranslationX(f);
        qy9Var2.setTranslationY(w53Var.h);
        qy9Var2.setPivotX(w53Var.r);
        qy9Var2.setPivotY(w53Var.s);
        qy9Var2.setScaleX(w53Var.n);
        qy9Var2.setScaleY(w53Var.n);
    }
}
