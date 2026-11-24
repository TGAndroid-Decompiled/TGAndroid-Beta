package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
public class wgc extends FrameLayout {
    public static final rg3 V = new rg3((byte) 4);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final po K;
    public final float L;
    public ogc M;
    public mgc N;
    public final af0 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final ylb a;
    public int b;
    public float c;
    public int d;
    public final View[] e;
    public final int[] f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public VelocityTracker w;
    public AnimatorSet x;
    public boolean y;

    public wgc(Context context, ylb ylbVar) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.K = new po(null);
        this.O = new af0(this, (byte) 16);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.a = ylbVar;
        this.L = gm.Z0(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static r59 n(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof r59) {
                    return (r59) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    n(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public boolean B(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgc.B(android.view.MotionEvent):boolean");
    }

    public final boolean C(android.view.MotionEvent r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgc.C(android.view.MotionEvent, boolean):boolean");
    }

    public final void D(boolean z) {
        int i;
        int intValue;
        onTouchEvent(null);
        ogc ogcVar = this.M;
        ogcVar.getClass();
        if (!(ogcVar instanceof g81)) {
            z = false;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        if (view2 != null && view2.getTag() != null) {
            i = ((Integer) viewArr[1].getTag()).intValue();
        } else {
            i = 0;
        }
        if (this.M.e() == 0) {
            View view3 = viewArr[1];
            if (view3 != null) {
                removeView(view3);
                viewArr[1] = null;
            }
            View view4 = viewArr[0];
            if (view4 != null) {
                removeView(view4);
                viewArr[0] = null;
                return;
            }
            return;
        }
        if (this.b > this.M.e() - 1) {
            this.b = this.M.e() - 1;
        }
        int i2 = this.b;
        if (i2 < 0) {
            this.b = 0;
            i2 = 0;
        }
        int h = this.M.h(i2);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i) {
            z = false;
        }
        if (z) {
            this.N.getClass();
        }
        m(z);
        if (z) {
            this.x = new AnimatorSet();
            View view5 = viewArr[1];
            if (view5 != null) {
                F(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                F(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.x.playTogether(I(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.x.playTogether(I(view8, 0.0f));
            }
            x(true);
            mgc mgcVar = this.N;
            mgcVar.a = 0.0f;
            mgcVar.w.h1();
            this.N.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new kgc(this, (byte) 2));
            this.x.playTogether(ofFloat);
            this.x.setInterpolator(V);
            this.x.setDuration(220L);
            this.x.addListener(new lgc(this, (byte) 2));
            this.N.setEnabled(false);
            this.y = true;
            this.x.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final boolean E(int i) {
        boolean z;
        int i2;
        if (i != this.b) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                if (this.d != i) {
                    valueAnimator.cancel();
                    this.T = null;
                }
            }
            if (this.b < i) {
                z = true;
            } else {
                z = false;
            }
            this.E = z;
            this.d = i;
            K(1);
            z(i, z);
            View[] viewArr = this.e;
            View view = viewArr[0];
            if (view != null) {
                i2 = view.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            if (z) {
                F(viewArr[1], i2);
            } else {
                F(viewArr[1], -i2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new kgc(this, (byte) 0));
            this.T.addListener(new lgc(this, (byte) 0));
            this.T.setDuration(getManualScrollDuration());
            this.T.setInterpolator(d53.h);
            this.T.start();
            return true;
        }
        return false;
    }

    public void F(View view, float f) {
        int i;
        int round = Math.round(f);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.e[0] && (i = round2 - round) != 0) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i2 < arrayList.size()) {
                    ((iy4) arrayList.get(i2)).a.h(i, 0);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void G() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i = this.b;
        int i2 = this.d;
        this.b = i2;
        this.d = i;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i3 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i3;
        s(view2, view, i2, i);
    }

    public int H() {
        return 16;
    }

    public final ValueAnimator I(View view, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f);
        ofFloat.addUpdateListener(new x1b(this, view, (byte) 1));
        ofFloat.addListener(new ngc(this, view, f));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f;
        if (iArr[0] != this.M.h(this.b)) {
            K(0);
            View[] viewArr = this.e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            F(viewArr[0], 0.0f);
            x(true);
        }
    }

    public final void K(int i) {
        int i2;
        if (i == 0) {
            i2 = this.b;
        } else {
            i2 = this.d;
        }
        if (i2 >= 0 && i2 < this.M.e()) {
            View[] viewArr = this.e;
            View view = viewArr[i];
            float f = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f;
            if (view == null) {
                int h = this.M.h(i2);
                iArr[i] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.M.d(iArr[i]);
                } else {
                    sparseArray.remove(iArr[i]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                if (i != 0) {
                    f = getMeasuredWidth();
                }
                view2.setTranslationX(f);
                viewArr[i] = view2;
                this.M.b(view2, i2, iArr[i]);
                viewArr[i].setVisibility(0);
            } else if (iArr[i] == this.M.h(i2)) {
                this.M.b(viewArr[i], i2, iArr[i]);
                viewArr[i].setVisibility(0);
            } else {
                sparseArray.put(iArr[i], viewArr[i]);
                viewArr[i].setVisibility(8);
                removeView(viewArr[i]);
                int h2 = this.M.h(i2);
                iArr[i] = h2;
                View view3 = (View) sparseArray.get(h2);
                if (view3 == null) {
                    view3 = this.M.d(iArr[i]);
                } else {
                    sparseArray.remove(iArr[i]);
                }
                if (i != 0) {
                    f = getMeasuredWidth();
                }
                view3.setTranslationX(f);
                addView(view3);
                viewArr[i] = view3;
                view3.setVisibility(0);
                ogc ogcVar = this.M;
                ogcVar.b(viewArr[i], i2, ogcVar.h(i2));
            }
        }
    }

    public boolean c(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canScrollHorizontally(int i) {
        boolean z;
        if (i != 0) {
            if (!this.y && !this.I) {
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = this.b;
                if (z ? i2 != this.M.e() - 1 : i2 != 0) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean d(MotionEvent motionEvent) {
        return true;
    }

    public float getAvailableTranslationX() {
        return gm.q.x;
    }

    public int getCurrentPosition() {
        return this.b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f;
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f = (this.b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        } else {
            f = 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            return (this.d * Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f;
        }
        return f;
    }

    public View[] getViewPages() {
        return this.e;
    }

    public boolean h(MotionEvent motionEvent) {
        return c(motionEvent);
    }

    public final void j() {
        boolean z;
        float f;
        View view;
        View view2;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.e;
            float x = viewArr[0].getX();
            this.x = new AnimatorSet();
            float f2 = 0.0f;
            if (this.F != 0.0f) {
                if (this.E) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.G = z;
                    } else {
                        this.G = false;
                        z = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.G = z;
                }
            } else {
                if (Math.abs(x) < viewArr[0].getMeasuredWidth() / 3.0f) {
                    z = true;
                } else {
                    z = false;
                }
                this.G = z;
            }
            if (z) {
                f = Math.abs(x);
                boolean z2 = this.E;
                AnimatorSet animatorSet = this.x;
                if (z2) {
                    animatorSet.playTogether(I(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.x.playTogether(I(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    animatorSet.playTogether(I(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.x.playTogether(I(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f = viewArr[0].getMeasuredWidth() - Math.abs(x);
                boolean z3 = this.E;
                AnimatorSet animatorSet2 = this.x;
                if (z3) {
                    animatorSet2.playTogether(I(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.x.playTogether(I(view6, 0.0f));
                    }
                } else {
                    animatorSet2.playTogether(I(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.x.playTogether(I(view7, 0.0f));
                    }
                }
            } else {
                f = 0.0f;
            }
            if (this.d < 0) {
                float f3 = this.U;
                if (!this.G) {
                    f2 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
                ofFloat.addUpdateListener(new kgc(this, (byte) 3));
                this.x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.x.playTogether(ofFloat2);
            this.x.setInterpolator(V);
            getMeasuredWidth();
            this.x.setDuration(Math.max(150, Math.min((int) (((f / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.x.addListener(new lgc(this, (byte) 3));
            this.x.start();
            this.y = true;
            this.I = false;
            x(false);
        } else {
            this.J = false;
            mgc mgcVar = this.N;
            if (mgcVar != null) {
                mgcVar.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.w = null;
        }
    }

    public final boolean k() {
        boolean z;
        if (!this.y) {
            return false;
        }
        boolean z2 = this.G;
        int i = -1;
        View[] viewArr = this.e;
        if (z2) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                F(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.E) {
                        i = 1;
                    }
                    F(view, measuredWidth * i);
                }
                z = true;
            }
            z = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.E) {
                    i = 1;
                }
                F(view2, measuredWidth2 * i);
                View view3 = viewArr[1];
                if (view3 != null) {
                    F(view3, 0.0f);
                }
                z = true;
            }
            z = false;
        }
        x(true);
        if (z) {
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            this.y = false;
        }
        return this.y;
    }

    public final vgc l(int i, boolean z) {
        mgc mgcVar = new mgc(this, getContext(), z, i, this.a);
        this.N = mgcVar;
        mgcVar.r = H();
        this.N.setDelegate(new x59(this, (byte) 22));
        m(false);
        return this.N;
    }

    public final void m(boolean z) {
        mgc mgcVar;
        if (this.M != null && (mgcVar = this.N) != null) {
            mgcVar.c();
            for (int i = 0; i < this.M.e(); i++) {
                this.M.getClass();
                this.N.a(this.M.f(i), this.M.g(i));
            }
            b();
            if (z) {
                pu9 pu9Var = this.N.w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) d53.f);
                TransitionManager.beginDelayedTransition(pu9Var, transitionSet);
            }
            this.N.y.f();
        }
    }

    public final View o(ViewGroup viewGroup, float f, float f2) {
        View o;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.P;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (o = o((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return o;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mgc mgcVar = this.N;
        if (mgcVar != null && mgcVar.K) {
            return false;
        }
        if (k()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.I;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return B(motionEvent);
    }

    public final float p(int i) {
        if (getMeasuredWidth() == 0) {
            return pqe.b(1 - Math.abs(getCurrentPosition() - i), 0, 1);
        }
        return pqe.a(1.0f - Math.abs(getPositionAnimated() - i), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAdapter(ogc ogcVar) {
        this.M = ogcVar;
        int h = ogcVar.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = ogcVar.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h2 = ogcVar.h(0);
            iArr[0] = h2;
            viewArr[0] = ogcVar.d(h2);
        }
        ogcVar.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        m(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z) {
        this.Q = z;
    }

    public void setPosition(int i) {
        if (this.M == null) {
            this.b = i;
            x(false);
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i2 = this.b;
        if (i2 != i) {
            this.b = i;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            s(viewArr[0], view2, this.b, i2);
            F(viewArr[0], 0.0f);
            mgc mgcVar = this.N;
            if (mgcVar != null) {
                mgcVar.f(this.c, this.d, this.b);
            }
            x(true);
        }
    }

    public final void x(boolean z) {
        Iterator it = this.R.iterator();
        if (!it.hasNext()) {
            w(z);
            return;
        }
        throw kt6.l(it);
    }

    public void z(int i, boolean z) {
        y(i);
    }

    public void A(int i) {
    }

    public void b() {
    }

    public void q() {
    }

    public void t() {
    }

    public void v() {
    }

    public void w(boolean z) {
    }

    public void y(int i) {
    }

    public void s(View view, View view2, int i, int i2) {
    }
}
