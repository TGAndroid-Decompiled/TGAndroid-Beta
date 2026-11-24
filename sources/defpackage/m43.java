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
public final class m43 {
    public boolean C;
    public final l43 a;
    public final WindowManager b;
    public final st c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final i43 m;
    public final t09 n;
    public final ArrayList o;
    public sr8 p;
    public boolean q;
    public final d r;
    public final wjb s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final byte y;
    public il0 z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();
    public final int[] A = new int[2];
    public final on B = new on(null);
    public final HashSet D = new HashSet();
    public final ArrayList E = new ArrayList();
    public int F = 0;

    public m43(int i, d dVar, ArrayList arrayList, HashSet hashSet, t09 t09Var, wjb wjbVar, boolean z) {
        Context context;
        boolean z2;
        boolean z3;
        int i2;
        this.y = i;
        this.o = arrayList;
        this.r = dVar;
        this.s = wjbVar;
        if (dVar != null) {
            context = dVar.getContext();
        } else {
            context = t09Var.getContext();
        }
        Context context2 = context;
        st stVar = new st(this, context2);
        this.c = stVar;
        stVar.setOnClickListener(new x91(this, (byte) 22));
        if (i != 2 && i != 4 && i != 5 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.d = z2;
        l43 l43Var = new l43(this, context2);
        this.a = l43Var;
        boolean z4 = z2;
        int windowType = t09Var.getWindowType();
        if (i != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        i43 i43Var = new i43(this, dVar, context2, windowType, z3, wjbVar, t09Var, dVar);
        this.m = i43Var;
        i43Var.setOutlineProvider(new j43(this));
        i43Var.setClipToOutline(true);
        boolean z5 = t09Var.h1;
        boolean z6 = t09Var.i1;
        if (i43Var.M1 != z5) {
            i43Var.M1 = z5;
            i43Var.N1 = z6;
            rw9 rw9Var = i43Var.i0;
            if (rw9Var != null) {
                rw9Var.invalidate();
            }
            hw9 hw9Var = i43Var.j0;
            if (hw9Var != null) {
                hw9Var.invalidate();
            }
        }
        i43Var.setOnLongPressedListener(new qx4(t09Var));
        int i3 = 16;
        i43Var.setOnRecentClearedListener(new o5f((byte) 16));
        i43Var.setRecentReactions(arrayList);
        i43Var.setSelectedReactions(hashSet);
        i43Var.setDrawBackground(false);
        i43Var.r(null);
        l43Var.addView(i43Var, nme.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i == 5) {
            l43Var.setClipChildren(false);
            l43Var.setClipToPadding(false);
            stVar.setClipChildren(false);
            stVar.setClipToPadding(false);
            i3 = 2;
        }
        if (i == 5) {
            i2 = 85;
        } else {
            i2 = 48;
        }
        int i4 = i2;
        float f = i3;
        stVar.addView(l43Var, nme.d(-1, -1.0f, i4, f, f, f, 16.0f));
        stVar.setClipChildren(false);
        if (i == 1 || (t09Var.getDelegate() != null && t09Var.getDelegate().C())) {
            i43Var.setBackgroundDelegate(new v82(this, t09Var, (byte) 13));
        }
        if (z4) {
            ((ViewGroup) t09Var.getParent()).addView(stVar);
        } else {
            WindowManager.LayoutParams b = b(false);
            WindowManager windowManager = gl.W(context2).getWindowManager();
            this.b = windowManager;
            gl.t3(windowManager, stVar, b);
            windowManager.addView(stVar, b);
        }
        this.n = t09Var;
        t09Var.setOnSwitchedToLoopView(new g43(this, (byte) 0));
        t09Var.d1 = true;
        t09Var.invalidate();
        gl.e3(new gu2(this, t09Var, (byte) 23), 50L);
        if (i != 5) {
            kk7.e().k(kk7.i1, 7);
        }
    }

    public static void g(View view, float f) {
        if (view instanceof dx9) {
            ((dx9) view).setAnimatedScale(f);
        } else if (view instanceof zx3) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        View view;
        if (this.E.isEmpty()) {
            h(false);
            pg5.a();
            this.B.e();
            i43 i43Var = this.m;
            i43Var.setEnterAnimationInProgress(false);
            rw9 rw9Var = i43Var.i0;
            if (z) {
                i43Var.e0.m(false);
                rw9Var.invalidate();
                rw9Var.h1();
                i43Var.g0.a();
                i43Var.sendAccessibilityEvent(32);
                t09 t09Var = this.n;
                t09Var.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i < rw9Var.getChildCount()) {
                        if (rw9Var.getChildAt(i) instanceof dx9) {
                            view = rw9Var.getChildAt(i);
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
                    i43Var.performAccessibilityAction(64, null);
                }
                if (t09Var.getPullingLeftProgress() > 0.0f) {
                    t09Var.P0 = false;
                    ValueAnimator valueAnimator = t09Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    t09Var.C0 = 0.0f;
                    st stVar = t09Var.T;
                    if (stVar != null) {
                        stVar.invalidate();
                    }
                    t09Var.invalidate();
                } else {
                    t09Var.P0 = true;
                    ValueAnimator valueAnimator2 = t09Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    t09Var.C0 = 0.0f;
                    st stVar2 = t09Var.T;
                    if (stVar2 != null) {
                        stVar2.invalidate();
                    }
                    t09Var.invalidate();
                }
                hw9 hw9Var = i43Var.j0;
                for (int i2 = 0; i2 < rw9Var.i3.size(); i2++) {
                    vw9 vw9Var = (vw9) rw9Var.i3.get(i2);
                    for (int i3 = 0; i3 < vw9Var.P.size(); i3++) {
                        if (((dx9) vw9Var.P.get(i3)).b) {
                            ((dx9) vw9Var.P.get(i3)).b = false;
                            ((dx9) vw9Var.P.get(i3)).invalidate();
                            vw9Var.k();
                        }
                    }
                }
                rw9Var.invalidate();
                for (int i4 = 0; i4 < hw9Var.i3.size(); i4++) {
                    vw9 vw9Var2 = (vw9) hw9Var.i3.get(i4);
                    for (int i5 = 0; i5 < vw9Var2.P.size(); i5++) {
                        if (((dx9) vw9Var2.P.get(i5)).b) {
                            ((dx9) vw9Var2.P.get(i5)).b = false;
                            ((dx9) vw9Var2.P.get(i5)).invalidate();
                            vw9Var2.k();
                        }
                    }
                }
                hw9Var.invalidate();
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
        i43 i43Var = this.m;
        byte b = this.y;
        st stVar = this.c;
        int[] iArr = this.A;
        l43 l43Var = this.a;
        RectF rectF = this.f;
        t09 t09Var = this.n;
        rectF.set(t09Var.x);
        this.e = t09Var.E;
        int[] iArr2 = new int[2];
        if (z) {
            t09Var.getLocationOnScreen(iArr);
        }
        stVar.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - gl.L(44.0f)) - gl.L(52.0f);
        if (i43Var.P0) {
            i = gl.L(26.0f);
        } else {
            i = 0;
        }
        float topOffset = t09Var.getTopOffset() + (L - i);
        if (t09Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - gl.L(12.0f);
        }
        if (l43Var.getMeasuredHeight() + topOffset > stVar.getMeasuredHeight() - gl.L(32.0f)) {
            topOffset = (stVar.getMeasuredHeight() - gl.L(32.0f)) - l43Var.getMeasuredHeight();
        }
        if (topOffset < gl.L(16.0f)) {
            topOffset = gl.L(16.0f);
        }
        float f = 0.0f;
        if (b == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (b == 1) {
            r18 = 1;
            l43Var.setTranslationX(((stVar.getMeasuredWidth() - l43Var.getMeasuredWidth()) / 2.0f) - gl.L(16.0f));
        } else {
            boolean z6 = true;
            if (b != 2 && b != 4) {
                l43Var.setTranslationX((iArr[0] - iArr2[0]) - gl.L(2.0f));
                r18 = z6;
            } else {
                l43Var.setTranslationX((iArr[0] - iArr2[0]) - gl.L(18.0f));
                r18 = z6;
            }
        }
        if (!z) {
            this.t = l43Var.getTranslationY();
        } else {
            this.t = topOffset;
            l43Var.setTranslationY(topOffset);
        }
        float x = (iArr[0] - iArr2[0]) - l43Var.getX();
        this.g = x;
        float y = (iArr[r18] - iArr2[r18]) - l43Var.getY();
        this.h = y;
        rectF.offset(x, y);
        t09Var.setCustomEmojiEnterProgress(this.j);
        if (z) {
            if (gba.o() >= 2 && e66.e(8200)) {
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
        i43Var.setEnterAnimationInProgress(z3);
        cy3 cy3Var = i43Var.e0;
        if (z && this.w) {
            z4 = true;
        } else {
            z4 = false;
        }
        cy3Var.m(z4);
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
        valueAnimator.addUpdateListener(new d20((byte) 3, this, z));
        if (!z) {
            i();
        }
        this.x.addListener(new y7((byte) 27, this, z));
        if (b == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(s33.h);
        } else {
            boolean z7 = this.w;
            ValueAnimator valueAnimator3 = this.x;
            if (z7) {
                valueAnimator3.setDuration(450L);
                b00.n(0.5f, this.x);
            } else {
                valueAnimator3.setDuration(350L);
                this.x.setInterpolator(s33.f);
            }
        }
        l43Var.invalidate();
        h(true);
        if (!z) {
            t09Var.P0 = true;
            t09Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        } else {
            t09Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator4 = this.x;
            Objects.requireNonNull(valueAnimator4);
            mk2 mk2Var = new mk2(valueAnimator4, (byte) 16);
            pg5.f = this.w;
            pg5.e = true;
            pg5.g = false;
            if (pg5.d) {
                pg5.d = false;
            }
            pg5.c = mk2Var;
        }
        HashSet hashSet = pg5.a;
        yv2 yv2Var = fl5.z().p;
        if (((CountDownLatch) yv2Var.c) == null) {
            z5 = true;
            yv2Var.c = new CountDownLatch(1);
        } else {
            z5 = true;
        }
        pg5.b = z5;
        pg5.e = false;
        pg5.g = false;
    }

    public final void d() {
        if (!this.q) {
            t09 t09Var = this.n;
            if (t09Var != null) {
                ValueAnimator valueAnimator = t09Var.z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                t09Var.C0 = 0.0f;
                st stVar = t09Var.T;
                if (stVar != null) {
                    stVar.invalidate();
                }
                t09Var.invalidate();
            }
            m21.e();
            this.q = true;
            gl.t1(this.c);
            c(false);
            if (this.v) {
                d dVar = this.r;
                if (dVar instanceof mu1) {
                    ((mu1) dVar).W9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.q) {
            m21.e();
            this.q = true;
            st stVar = this.c;
            gl.t1(stVar);
            stVar.animate().alpha(0.0f).setDuration(150L).setListener(new k43(this, (byte) 1));
            if (this.v) {
                d dVar = this.r;
                if (dVar instanceof mu1) {
                    ((mu1) dVar).W9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.y != 5) {
            kk7.e().k(kk7.j1, 7);
        }
        gl.d3(new g43(this, (byte) 1));
    }

    public final void h(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        i43 i43Var = this.m;
        i43Var.i0.setLayerType(i, null);
        i43Var.g0.setLayerType(i, null);
        if (this.w) {
            for (int i2 = 0; i2 < Math.min(i43Var.e0.b.getChildCount(), 16); i2++) {
                i43Var.e0.b.getChildAt(i2).setLayerType(i, null);
            }
            return;
        }
        i43Var.f0.setLayerType(i, null);
        i43Var.e0.setLayerType(i, null);
    }

    public final void i() {
        int i = 0;
        while (true) {
            i43 i43Var = this.m;
            rw9 rw9Var = i43Var.i0;
            rw9 rw9Var2 = i43Var.i0;
            if (i < rw9Var.getChildCount()) {
                if (rw9Var2.getChildAt(i) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var2.getChildAt(i);
                    if (dx9Var.y != null) {
                        dx9Var.b = false;
                        dx9Var.invalidate();
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
        i43 i43Var = this.m;
        float y = i43Var.getY();
        ow9 ow9Var = i43Var.b0;
        float y2 = ow9Var.getY() + y;
        rw9 rw9Var = i43Var.i0;
        int y3 = (int) (rw9Var.getY() + y2);
        ArrayList arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = rw9Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i >= childCount) {
                break;
            }
            View childAt = rw9Var.getChildAt(i);
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
        int y4 = (int) (i43Var.e0.getY() + ow9Var.getY() + i43Var.getY());
        for (int i2 = 0; i2 < i43Var.e0.b.getChildCount(); i2++) {
            View childAt2 = i43Var.e0.b.getChildAt(i2);
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
            i43Var.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pk(this, arrayList, (byte) 10));
            this.E.add(ofFloat);
            ofFloat.addListener(new qw(this, ofFloat, z, (byte) 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(s33.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.w) {
            i43 i43Var = this.m;
            i43Var.g0.setAlpha(this.j);
            i43Var.i0.setAlpha(this.j);
            i43Var.j0.setAlpha(this.j);
            i43Var.e0.setAlpha(this.j);
            i43Var.f0.setAlpha(this.j);
        }
    }

    public final void l() {
        float f;
        i43 i43Var = this.m;
        ow9 ow9Var = i43Var.b0;
        ow9 ow9Var2 = i43Var.b0;
        boolean z = this.w;
        l43 l43Var = this.a;
        if (z) {
            f = 0.0f;
        } else {
            f = l43Var.f;
        }
        ow9Var.setTranslationX(f);
        ow9Var2.setTranslationY(l43Var.h);
        ow9Var2.setPivotX(l43Var.r);
        ow9Var2.setPivotY(l43Var.s);
        ow9Var2.setScaleX(l43Var.n);
        ow9Var2.setScaleY(l43Var.n);
    }
}
