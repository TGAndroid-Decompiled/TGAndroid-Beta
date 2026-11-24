package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class eh9 extends mg9 {
    public static Paint n0;
    public static Paint o0;
    public final boolean X;
    public final ArrayList Y;
    public final int Z;
    public final int a0;
    public int b0;
    public float c0;
    public boolean d0;
    public boolean e0;
    public float f0;
    public float g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public ValueAnimator l0;
    public final Path m0;

    public eh9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z) {
        super(rh9Var, rect, i);
        gg9 gg9Var;
        this.Y = new ArrayList();
        this.m0 = new Path();
        this.X = z;
        for (int i2 = 0; i2 < pageblockslideshow.items.size(); i2++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i2);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                gg9Var = new gg9(rh9Var, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                gg9Var = new gg9(rh9Var, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                gg9Var = null;
            }
            if (gg9Var != null) {
                this.Y.add(gg9Var);
            }
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            this.Z = 0;
            return;
        }
        this.Z = this.c;
        int size = arrayList.size();
        int i3 = 0;
        float f = 0.0f;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            float f2 = ((gg9) obj).F;
            if (f2 <= 0.0f) {
                f2 = 1.0f;
            }
            f += f2;
        }
        int max = (int) (this.Z / Math.max(0.5f, f / arrayList.size()));
        Point point = gl.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.a0 = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((gg9) obj2).m(0, 0, this.Z, this.a0);
        }
    }

    @Override
    public final void A(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = rect2.left;
        int i3 = ((int) this.N) + rect2.top;
        rect.set(i2, i3, this.Z + i2, this.a0 + i3);
    }

    @Override
    public final int C() {
        return !this.Y.isEmpty();
    }

    @Override
    public final CharSequence E(int i) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.b0, arrayList.size() - 1));
        return TextUtils.concat(((gg9) arrayList.get(max)).f(), ", ", k96.a0(null, null, 2131747636, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override
    public final int I() {
        return this.a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.d0) {
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gg9 gg9Var = (gg9) obj;
            View view = this.W;
            gg9Var.T = view;
            ImageReceiver imageReceiver = gg9Var.c;
            imageReceiver.p0(view);
            imageReceiver.I();
            ImageReceiver imageReceiver2 = gg9Var.d;
            imageReceiver2.p0(view);
            imageReceiver2.I();
            gg9Var.d(view);
            gg9Var.n(view, false);
        }
    }

    @Override
    public final boolean U(int i, View view) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((gg9) arrayList.get(Math.max(0, Math.min(this.b0, arrayList.size() - 1)))).j(view);
    }

    @Override
    public final void V() {
        int i = 0;
        a0(false);
        this.d0 = false;
        this.e0 = false;
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gg9 gg9Var = (gg9) obj;
            gg9Var.c.K();
            gg9Var.d.K();
            gg9Var.e = null;
            up3.q(gg9Var.a.a).v(gg9Var);
        }
    }

    @Override
    public final void W(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh9.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean k;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.Y;
        try {
            if (actionMasked == 0) {
                if (this.h0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.h0 = viewConfiguration.getScaledTouchSlop();
                    this.i0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.j0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f0 = motionEvent.getX();
                this.g0 = motionEvent.getY();
                this.d0 = false;
                this.e0 = false;
                VelocityTracker velocityTracker2 = this.k0;
                if (velocityTracker2 == null) {
                    this.k0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.k0.addMovement(motionEvent);
                a0(true);
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.l0 = null;
                }
                int i = this.b0;
                if (i >= 0 && i < arrayList.size()) {
                    ((gg9) arrayList.get(this.b0)).k(this.W, motionEvent);
                }
            } else {
                float f = 0.0f;
                if (actionMasked == 2) {
                    if (!this.e0) {
                        VelocityTracker velocityTracker3 = this.k0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float x = motionEvent.getX() - this.f0;
                        float y = motionEvent.getY() - this.g0;
                        if (!this.d0 && Math.abs(y) > this.h0 && Math.abs(y) > Math.abs(x)) {
                            this.e0 = true;
                            int i2 = this.b0;
                            if (i2 >= 0 && i2 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((gg9) arrayList.get(this.b0)).k(this.W, obtain);
                                obtain.recycle();
                            }
                            a0(false);
                        } else {
                            if (!this.d0 && Math.abs(x) > this.h0 && Math.abs(x) > Math.abs(y)) {
                                this.d0 = true;
                                int i3 = this.b0;
                                if (i3 >= 0 && i3 < arrayList.size()) {
                                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                    obtain2.setAction(3);
                                    ((gg9) arrayList.get(this.b0)).k(this.W, obtain2);
                                    obtain2.recycle();
                                }
                            }
                            if (this.d0) {
                                float f2 = (-x) / this.Z;
                                int i4 = this.b0;
                                if (i4 == 0 && f2 < 0.0f) {
                                    f2 *= 0.3f;
                                }
                                if (i4 == arrayList.size() - 1 && f2 > 0.0f) {
                                    f2 *= 0.3f;
                                }
                                this.c0 = f2;
                                View view2 = this.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i5 = this.b0;
                                if (i5 >= 0 && i5 < arrayList.size()) {
                                    k = ((gg9) arrayList.get(this.b0)).k(this.W, motionEvent);
                                    return k;
                                }
                                return false;
                            }
                        }
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z = this.e0;
                        this.e0 = false;
                        if (!z && actionMasked == 1 && (velocityTracker = this.k0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.k0.computeCurrentVelocity(1000, this.j0);
                            float xVelocity = this.k0.getXVelocity();
                            float yVelocity = this.k0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.i0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker4 = this.k0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.k0 = null;
                        }
                        a0(false);
                        if (!z) {
                            if (this.d0) {
                                this.d0 = false;
                                i0(f);
                            } else {
                                int i6 = this.b0;
                                if (i6 >= 0 && i6 < arrayList.size()) {
                                    k = ((gg9) arrayList.get(this.b0)).k(this.W, motionEvent);
                                    return k;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void i0(float f) {
        int i;
        int i2;
        int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        ArrayList arrayList = this.Y;
        if (i3 >= 0 || this.b0 >= arrayList.size() - 1) {
            i = -1;
            if (f <= 0.0f || this.b0 <= 0) {
                if (this.c0 <= 0.5f || this.b0 >= arrayList.size() - 1) {
                    if (this.c0 >= -0.5f || this.b0 <= 0) {
                        i = 0;
                    }
                }
            }
            int i4 = i + this.b0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, i4 - i2);
            this.l0 = ofFloat;
            ofFloat.setDuration(420L);
            this.l0.setInterpolator(s33.h);
            this.l0.addUpdateListener(new x89(this, (byte) 3));
            this.l0.addListener(new cn(this, i4, (byte) 11));
            this.l0.start();
        }
        i = 1;
        int i42 = i + this.b0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.c0, i42 - i2);
        this.l0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.l0.setInterpolator(s33.h);
        this.l0.addUpdateListener(new x89(this, (byte) 3));
        this.l0.addListener(new cn(this, i42, (byte) 11));
        this.l0.start();
    }
}
