package org.telegram.messenger;

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
import org.telegram.tgnet.tl.TL_iv;
public final class ou extends xt {
    public static Paint f24599n0;
    public static Paint f24600o0;
    public final boolean X;
    public final ArrayList Y;
    public final int Z;
    public final int f24601a0;
    public int f24602b0;
    public float f24603c0;
    public boolean f24604d0;
    public boolean f24605e0;
    public float f24606f0;
    public float f24607g0;
    public int f24608h0;
    public int f24609i0;
    public int f24610j0;
    public VelocityTracker f24611k0;
    public ValueAnimator f24612l0;
    public final Path m0;

    public ou(cv cvVar, Rect rect, int i3, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
        super(cvVar, rect, i3);
        qt qtVar;
        this.Y = new ArrayList();
        this.m0 = new Path();
        this.X = z10;
        for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i10);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                qtVar = new qt(cvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                qtVar = new qt(cvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                qtVar = null;
            }
            if (qtVar != null) {
                this.Y.add(qtVar);
            }
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            this.f24601a0 = 0;
            this.Z = 0;
            return;
        }
        this.Z = this.f26436c;
        int size = arrayList.size();
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float f11 = ((qt) obj).F;
            if (f11 <= 0.0f) {
                f11 = 1.0f;
            }
            f10 += f11;
        }
        int max = (int) (this.Z / Math.max(0.5f, f10 / arrayList.size()));
        Point point = g0.f22608q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.f24601a0 = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((qt) obj2).l(0, 0, this.Z, this.f24601a0);
        }
    }

    @Override
    public final void A(int i3, Rect rect) {
        Rect rect2 = this.f26435b;
        int i10 = rect2.left;
        int i11 = ((int) this.N) + rect2.top;
        rect.set(i10, i11, this.Z + i10, this.f24601a0 + i11);
    }

    @Override
    public final int B() {
        return !this.Y.isEmpty();
    }

    @Override
    public final CharSequence E(int i3) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.f24602b0, arrayList.size() - 1));
        return TextUtils.concat(((qt) arrayList.get(max)).f(), ", ", bd.a0(null, null, 2131747837, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override
    public final int I() {
        return this.f24601a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return rect.left + this.f26436c + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f24604d0) {
            ValueAnimator valueAnimator = this.f24612l0;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            View view = this.W;
            qtVar.T = view;
            ImageReceiver imageReceiver = qtVar.f24952c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = qtVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            qtVar.d(view);
            qtVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i3, View view) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((qt) arrayList.get(Math.max(0, Math.min(this.f24602b0, arrayList.size() - 1)))).j(view);
    }

    @Override
    public final void V() {
        int i3 = 0;
        a0(false);
        this.f24604d0 = false;
        this.f24605e0 = false;
        VelocityTracker velocityTracker = this.f24611k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24611k0 = null;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            qtVar.f24952c.R();
            qtVar.d.R();
            qtVar.f24953e = null;
            z5.q(qtVar.f24950a.f22065a).v(qtVar);
        }
    }

    @Override
    public final void W(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ou.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f26435b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.Y;
        try {
            if (actionMasked == 0) {
                if (this.f24608h0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f24608h0 = viewConfiguration.getScaledTouchSlop();
                    this.f24609i0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f24610j0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f24606f0 = motionEvent.getX();
                this.f24607g0 = motionEvent.getY();
                this.f24604d0 = false;
                this.f24605e0 = false;
                VelocityTracker velocityTracker2 = this.f24611k0;
                if (velocityTracker2 == null) {
                    this.f24611k0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f24611k0.addMovement(motionEvent);
                a0(true);
                ValueAnimator valueAnimator = this.f24612l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f24612l0 = null;
                }
                int i3 = this.f24602b0;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ((qt) arrayList.get(this.f24602b0)).k(this.W, motionEvent);
                }
            } else {
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    if (!this.f24605e0) {
                        VelocityTracker velocityTracker3 = this.f24611k0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - this.f24606f0;
                        float y9 = motionEvent.getY() - this.f24607g0;
                        if (!this.f24604d0 && Math.abs(y9) > this.f24608h0 && Math.abs(y9) > Math.abs(x10)) {
                            this.f24605e0 = true;
                            int i10 = this.f24602b0;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((qt) arrayList.get(this.f24602b0)).k(this.W, obtain);
                                obtain.recycle();
                            }
                            a0(false);
                        } else {
                            if (!this.f24604d0 && Math.abs(x10) > this.f24608h0 && Math.abs(x10) > Math.abs(y9)) {
                                this.f24604d0 = true;
                                int i11 = this.f24602b0;
                                if (i11 >= 0 && i11 < arrayList.size()) {
                                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                    obtain2.setAction(3);
                                    ((qt) arrayList.get(this.f24602b0)).k(this.W, obtain2);
                                    obtain2.recycle();
                                }
                            }
                            if (this.f24604d0) {
                                float f11 = (-x10) / this.Z;
                                int i12 = this.f24602b0;
                                if (i12 == 0 && f11 < 0.0f) {
                                    f11 *= 0.3f;
                                }
                                if (i12 == arrayList.size() - 1 && f11 > 0.0f) {
                                    f11 *= 0.3f;
                                }
                                this.f24603c0 = f11;
                                View view2 = this.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i13 = this.f24602b0;
                                if (i13 >= 0 && i13 < arrayList.size()) {
                                    k10 = ((qt) arrayList.get(this.f24602b0)).k(this.W, motionEvent);
                                    motionEvent.offsetLocation(rect.left, rect.top);
                                    return k10;
                                }
                                motionEvent.offsetLocation(rect.left, rect.top);
                                return false;
                            }
                        }
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.f24605e0;
                        this.f24605e0 = false;
                        if (!z10 && actionMasked == 1 && (velocityTracker = this.f24611k0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.f24611k0.computeCurrentVelocity(1000, this.f24610j0);
                            float xVelocity = this.f24611k0.getXVelocity();
                            float yVelocity = this.f24611k0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.f24609i0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f10 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker4 = this.f24611k0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f24611k0 = null;
                        }
                        a0(false);
                        if (!z10) {
                            if (this.f24604d0) {
                                this.f24604d0 = false;
                                i0(f10);
                            } else {
                                int i14 = this.f24602b0;
                                if (i14 >= 0 && i14 < arrayList.size()) {
                                    k10 = ((qt) arrayList.get(this.f24602b0)).k(this.W, motionEvent);
                                    motionEvent.offsetLocation(rect.left, rect.top);
                                    return k10;
                                }
                            }
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return false;
                }
            }
            return true;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void i0(float f10) {
        int i3;
        int i10;
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ArrayList arrayList = this.Y;
        if (i11 >= 0 || this.f24602b0 >= arrayList.size() - 1) {
            i3 = -1;
            if (f10 <= 0.0f || this.f24602b0 <= 0) {
                if (this.f24603c0 <= 0.5f || this.f24602b0 >= arrayList.size() - 1) {
                    if (this.f24603c0 >= -0.5f || this.f24602b0 <= 0) {
                        i3 = 0;
                    }
                }
            }
            int i12 = i3 + this.f24602b0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f24603c0, i12 - i10);
            this.f24612l0 = ofFloat;
            ofFloat.setDuration(420L);
            this.f24612l0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f24612l0.addUpdateListener(new g(this, 2));
            this.f24612l0.addListener(new ii.m2(this, i12, 3));
            this.f24612l0.start();
        }
        i3 = 1;
        int i122 = i3 + this.f24602b0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f24603c0, i122 - i10);
        this.f24612l0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.f24612l0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f24612l0.addUpdateListener(new g(this, 2));
        this.f24612l0.addListener(new ii.m2(this, i122, 3));
        this.f24612l0.start();
    }
}
