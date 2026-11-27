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
public class vic extends FrameLayout {
    public static final yf3 V = new yf3((byte) 4);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final pn K;
    public final float L;
    public nic M;
    public lic N;
    public final ce0 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final vnb a;
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

    public vic(Context context, vnb vnbVar) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.K = new pn(null);
        this.O = new ce0(this, (byte) 16);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.a = vnbVar;
        this.L = hl.Z0(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static d79 n(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof d79) {
                    return (d79) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    n(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public void A(int i, boolean z) {
        z(i);
    }

    public boolean C(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vic.C(android.view.MotionEvent):boolean");
    }

    public final boolean D(android.view.MotionEvent r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vic.D(android.view.MotionEvent, boolean):boolean");
    }

    public final void E(boolean z) {
        int i;
        int intValue;
        onTouchEvent(null);
        nic nicVar = this.M;
        nicVar.getClass();
        if (!(nicVar instanceof h71)) {
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
                G(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                G(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.x.playTogether(J(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.x.playTogether(J(view8, 0.0f));
            }
            y(true);
            lic licVar = this.N;
            licVar.a = 0.0f;
            licVar.w.i1();
            this.N.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new jic(this, (byte) 2));
            this.x.playTogether(ofFloat);
            this.x.setInterpolator(V);
            this.x.setDuration(220L);
            this.x.addListener(new kic(this, (byte) 2));
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

    public final boolean F(int i) {
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
            L(1);
            A(i, z);
            View[] viewArr = this.e;
            View view = viewArr[0];
            if (view != null) {
                i2 = view.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            if (z) {
                G(viewArr[1], i2);
            } else {
                G(viewArr[1], -i2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new jic(this, (byte) 0));
            this.T.addListener(new kic(this, (byte) 0));
            this.T.setDuration(getManualScrollDuration());
            this.T.setInterpolator(k43.h);
            this.T.start();
            return true;
        }
        return false;
    }

    public void G(View view, float f) {
        int i;
        int round = Math.round(f);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.e[0] && (i = round2 - round) != 0) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i2 < arrayList.size()) {
                    ((ly4) arrayList.get(i2)).a.h(i, 0);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void H() {
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
        t(view2, view, i2, i);
    }

    public int I() {
        return 16;
    }

    public final ValueAnimator J(View view, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f);
        ofFloat.addUpdateListener(new ai2(this, view, (byte) 2));
        ofFloat.addListener(new mic(this, view, f));
        return ofFloat;
    }

    public final void K() {
        int[] iArr = this.f;
        if (iArr[0] != this.M.h(this.b)) {
            L(0);
            View[] viewArr = this.e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            G(viewArr[0], 0.0f);
            y(true);
        }
    }

    public final void L(int i) {
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
                nic nicVar = this.M;
                nicVar.b(viewArr[i], i2, nicVar.h(i2));
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

    public boolean f(MotionEvent motionEvent) {
        return true;
    }

    public float getAvailableTranslationX() {
        return hl.q.x;
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

    public boolean i(MotionEvent motionEvent) {
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
                    animatorSet.playTogether(J(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.x.playTogether(J(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    animatorSet.playTogether(J(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.x.playTogether(J(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f = viewArr[0].getMeasuredWidth() - Math.abs(x);
                boolean z3 = this.E;
                AnimatorSet animatorSet2 = this.x;
                if (z3) {
                    animatorSet2.playTogether(J(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.x.playTogether(J(view6, 0.0f));
                    }
                } else {
                    animatorSet2.playTogether(J(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.x.playTogether(J(view7, 0.0f));
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
                ofFloat.addUpdateListener(new jic(this, (byte) 3));
                this.x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.x.playTogether(ofFloat2);
            this.x.setInterpolator(V);
            getMeasuredWidth();
            this.x.setDuration(Math.max(150, Math.min((int) (((f / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.x.addListener(new kic(this, (byte) 3));
            this.x.start();
            this.y = true;
            this.I = false;
            y(false);
        } else {
            this.J = false;
            lic licVar = this.N;
            if (licVar != null) {
                licVar.setEnabled(true);
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
                G(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.E) {
                        i = 1;
                    }
                    G(view, measuredWidth * i);
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
                G(view2, measuredWidth2 * i);
                View view3 = viewArr[1];
                if (view3 != null) {
                    G(view3, 0.0f);
                }
                z = true;
            }
            z = false;
        }
        y(true);
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

    public final uic l(int i, boolean z) {
        lic licVar = new lic(this, getContext(), z, i, this.a);
        this.N = licVar;
        licVar.r = I();
        this.N.setDelegate(new ve9(this, (byte) 19));
        m(false);
        return this.N;
    }

    public final void m(boolean z) {
        lic licVar;
        if (this.M != null && (licVar = this.N) != null) {
            licVar.c();
            for (int i = 0; i < this.M.e(); i++) {
                this.M.getClass();
                this.N.a(this.M.f(i), this.M.g(i));
            }
            b();
            if (z) {
                gw9 gw9Var = this.N.w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) k43.f);
                TransitionManager.beginDelayedTransition(gw9Var, transitionSet);
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
        lic licVar = this.N;
        if (licVar != null && licVar.K) {
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
        return C(motionEvent);
    }

    public final float p(int i) {
        if (getMeasuredWidth() == 0) {
            return ete.b(1 - Math.abs(getCurrentPosition() - i), 0, 1);
        }
        return ete.a(1.0f - Math.abs(getPositionAnimated() - i), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean s() {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public void setAdapter(nic nicVar) {
        this.M = nicVar;
        int h = nicVar.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = nicVar.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h2 = nicVar.h(0);
            iArr[0] = h2;
            viewArr[0] = nicVar.d(h2);
        }
        nicVar.b(viewArr[0], this.b, iArr[0]);
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
            y(false);
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
            L(0);
            t(viewArr[0], view2, this.b, i2);
            G(viewArr[0], 0.0f);
            lic licVar = this.N;
            if (licVar != null) {
                licVar.f(this.c, this.d, this.b);
            }
            y(true);
        }
    }

    public final void y(boolean z) {
        Iterator it = this.R.iterator();
        if (!it.hasNext()) {
            x(z);
            return;
        }
        throw qu6.l(it);
    }

    public void b() {
    }

    public void q() {
    }

    public void v() {
    }

    public void w() {
    }

    public void B(int i) {
    }

    public void x(boolean z) {
    }

    public void z(int i) {
    }

    public void t(View view, View view2, int i, int i2) {
    }
}
