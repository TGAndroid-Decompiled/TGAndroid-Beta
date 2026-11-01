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
public final class iv extends ru {
    public static Paint m0;
    public static Paint f16349n0;
    public final boolean W;
    public final ArrayList X;
    public final int Y;
    public final int Z;
    public int f16350a0;
    public float f16351b0;
    public boolean f16352c0;
    public boolean f16353d0;
    public float f16354e0;
    public float f16355f0;
    public int f16356g0;
    public int f16357h0;
    public int f16358i0;
    public VelocityTracker f16359j0;
    public ValueAnimator f16360k0;
    public final Path f16361l0;

    public iv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
        super(wvVar, rect, i10);
        ku kuVar;
        this.X = new ArrayList();
        this.f16361l0 = new Path();
        this.W = z10;
        for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i11);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                kuVar = new ku(wvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                kuVar = new ku(wvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                kuVar = null;
            }
            if (kuVar != null) {
                this.X.add(kuVar);
            }
        }
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            this.Z = 0;
            this.Y = 0;
            return;
        }
        this.Y = this.f17969c;
        int size = arrayList.size();
        int i12 = 0;
        float f7 = 0.0f;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            float f10 = ((ku) obj).E;
            if (f10 <= 0.0f) {
                f10 = 1.0f;
            }
            f7 += f10;
        }
        int max = (int) (this.Y / Math.max(0.5f, f7 / arrayList.size()));
        Point point = i0.f16172q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.Z = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            ((ku) obj2).l(0, 0, this.Y, this.Z);
        }
    }

    @Override
    public final void A(int i10, Rect rect) {
        Rect rect2 = this.f17968b;
        int i11 = rect2.left;
        int i12 = ((int) this.M) + rect2.top;
        rect.set(i11, i12, this.Y + i11, this.Z + i12);
    }

    @Override
    public final int B() {
        return !this.X.isEmpty();
    }

    @Override
    public final CharSequence E(int i10) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.f16350a0, arrayList.size() - 1));
        return TextUtils.concat(((ku) arrayList.get(max)).f(), ", ", dd.a0(null, null, 2131747845, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override
    public final int H() {
        return this.Z;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return rect.left + this.f17969c + rect.right;
    }

    @Override
    public final boolean P() {
        if (!this.f16352c0) {
            ValueAnimator valueAnimator = this.f16360k0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ku kuVar = (ku) obj;
            View view = this.V;
            kuVar.S = view;
            ImageReceiver imageReceiver = kuVar.f16790c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = kuVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            kuVar.d(view);
            kuVar.m(view, false);
        }
    }

    @Override
    public final boolean T(int i10, View view) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((ku) arrayList.get(Math.max(0, Math.min(this.f16350a0, arrayList.size() - 1)))).j(view);
    }

    @Override
    public final void U() {
        int i10 = 0;
        Z(false);
        this.f16352c0 = false;
        this.f16353d0 = false;
        VelocityTracker velocityTracker = this.f16359j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16359j0 = null;
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ku kuVar = (ku) obj;
            kuVar.f16790c.R();
            kuVar.d.R();
            kuVar.e = null;
            b6.q(kuVar.f16788a.f19329a).v(kuVar);
        }
    }

    @Override
    public final void V(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iv.V(android.graphics.Canvas):void");
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f17968b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.X;
        try {
            if (actionMasked == 0) {
                if (this.f16356g0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f16356g0 = viewConfiguration.getScaledTouchSlop();
                    this.f16357h0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f16358i0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f16354e0 = motionEvent.getX();
                this.f16355f0 = motionEvent.getY();
                this.f16352c0 = false;
                this.f16353d0 = false;
                VelocityTracker velocityTracker2 = this.f16359j0;
                if (velocityTracker2 == null) {
                    this.f16359j0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f16359j0.addMovement(motionEvent);
                Z(true);
                ValueAnimator valueAnimator = this.f16360k0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f16360k0 = null;
                }
                int i10 = this.f16350a0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ((ku) arrayList.get(this.f16350a0)).k(this.V, motionEvent);
                }
            } else {
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    if (!this.f16353d0) {
                        VelocityTracker velocityTracker3 = this.f16359j0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - this.f16354e0;
                        float y3 = motionEvent.getY() - this.f16355f0;
                        if (!this.f16352c0 && Math.abs(y3) > this.f16356g0 && Math.abs(y3) > Math.abs(x10)) {
                            this.f16353d0 = true;
                            int i11 = this.f16350a0;
                            if (i11 >= 0 && i11 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((ku) arrayList.get(this.f16350a0)).k(this.V, obtain);
                                obtain.recycle();
                            }
                            Z(false);
                        } else {
                            if (!this.f16352c0 && Math.abs(x10) > this.f16356g0 && Math.abs(x10) > Math.abs(y3)) {
                                this.f16352c0 = true;
                                int i12 = this.f16350a0;
                                if (i12 >= 0 && i12 < arrayList.size()) {
                                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                    obtain2.setAction(3);
                                    ((ku) arrayList.get(this.f16350a0)).k(this.V, obtain2);
                                    obtain2.recycle();
                                }
                            }
                            if (this.f16352c0) {
                                float f10 = (-x10) / this.Y;
                                int i13 = this.f16350a0;
                                if (i13 == 0 && f10 < 0.0f) {
                                    f10 *= 0.3f;
                                }
                                if (i13 == arrayList.size() - 1 && f10 > 0.0f) {
                                    f10 *= 0.3f;
                                }
                                this.f16351b0 = f10;
                                View view2 = this.V;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i14 = this.f16350a0;
                                if (i14 >= 0 && i14 < arrayList.size()) {
                                    k10 = ((ku) arrayList.get(this.f16350a0)).k(this.V, motionEvent);
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
                        boolean z10 = this.f16353d0;
                        this.f16353d0 = false;
                        if (!z10 && actionMasked == 1 && (velocityTracker = this.f16359j0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.f16359j0.computeCurrentVelocity(1000, this.f16358i0);
                            float xVelocity = this.f16359j0.getXVelocity();
                            float yVelocity = this.f16359j0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.f16357h0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f7 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker4 = this.f16359j0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f16359j0 = null;
                        }
                        Z(false);
                        if (!z10) {
                            if (this.f16352c0) {
                                this.f16352c0 = false;
                                h0(f7);
                            } else {
                                int i15 = this.f16350a0;
                                if (i15 >= 0 && i15 < arrayList.size()) {
                                    k10 = ((ku) arrayList.get(this.f16350a0)).k(this.V, motionEvent);
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

    public final void h0(float f7) {
        int i10;
        int i11;
        int i12 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        ArrayList arrayList = this.X;
        if (i12 >= 0 || this.f16350a0 >= arrayList.size() - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.f16350a0 <= 0) {
                if (this.f16351b0 <= 0.5f || this.f16350a0 >= arrayList.size() - 1) {
                    if (this.f16351b0 >= -0.5f || this.f16350a0 <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i13 = i10 + this.f16350a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f16351b0, i13 - i11);
            this.f16360k0 = ofFloat;
            ofFloat.setDuration(420L);
            this.f16360k0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f16360k0.addUpdateListener(new g(this, 2));
            this.f16360k0.addListener(new bi.d5(this, i13, 1));
            this.f16360k0.start();
        }
        i10 = 1;
        int i132 = i10 + this.f16350a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f16351b0, i132 - i11);
        this.f16360k0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.f16360k0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f16360k0.addUpdateListener(new g(this, 2));
        this.f16360k0.addListener(new bi.d5(this, i132, 1));
        this.f16360k0.start();
    }
}
