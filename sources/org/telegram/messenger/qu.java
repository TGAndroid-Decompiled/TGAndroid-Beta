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
public final class qu extends zt {
    public static Paint f26452n0;
    public static Paint f26453o0;
    public final boolean X;
    public final ArrayList Y;
    public final int Z;
    public final int f26454a0;
    public int f26455b0;
    public float f26456c0;
    public boolean f26457d0;
    public boolean f26458e0;
    public float f26459f0;
    public float f26460g0;
    public int f26461h0;
    public int f26462i0;
    public int f26463j0;
    public VelocityTracker f26464k0;
    public ValueAnimator f26465l0;
    public final Path m0;

    public qu(ev evVar, Rect rect, int i7, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
        super(evVar, rect, i7);
        st stVar;
        this.Y = new ArrayList();
        this.m0 = new Path();
        this.X = z10;
        for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i10);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                stVar = new st(evVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                stVar = new st(evVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                stVar = null;
            }
            if (stVar != null) {
                this.Y.add(stVar);
            }
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            this.f26454a0 = 0;
            this.Z = 0;
            return;
        }
        this.Z = this.f28351c;
        int size = arrayList.size();
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float f11 = ((st) obj).F;
            if (f11 <= 0.0f) {
                f11 = 1.0f;
            }
            f10 += f11;
        }
        int max = (int) (this.Z / Math.max(0.5f, f10 / arrayList.size()));
        Point point = g0.f24118q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.f26454a0 = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((st) obj2).l(0, 0, this.Z, this.f26454a0);
        }
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f28350b;
        int i10 = rect2.left;
        int i11 = ((int) this.N) + rect2.top;
        rect.set(i10, i11, this.Z + i10, this.f26454a0 + i11);
    }

    @Override
    public final int B() {
        return !this.Y.isEmpty();
    }

    @Override
    public final CharSequence E(int i7) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.f26455b0, arrayList.size() - 1));
        return TextUtils.concat(((st) arrayList.get(max)).f(), ", ", gd.a0(null, null, 2131747636, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override
    public final int I() {
        return this.f26454a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28350b;
        return rect.left + this.f28351c + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f26457d0) {
            ValueAnimator valueAnimator = this.f26465l0;
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            st stVar = (st) obj;
            View view = this.W;
            stVar.T = view;
            ImageReceiver imageReceiver = stVar.f26850c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = stVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            stVar.d(view);
            stVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i7, View view) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((st) arrayList.get(Math.max(0, Math.min(this.f26455b0, arrayList.size() - 1)))).j(view);
    }

    @Override
    public final void V() {
        int i7 = 0;
        a0(false);
        this.f26457d0 = false;
        this.f26458e0 = false;
        VelocityTracker velocityTracker = this.f26464k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26464k0 = null;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            st stVar = (st) obj;
            stVar.f26850c.R();
            stVar.d.R();
            stVar.f26851e = null;
            a6.q(stVar.f26848a.f23767a).v(stVar);
        }
    }

    @Override
    public final void W(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qu.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f28350b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.Y;
        try {
            if (actionMasked == 0) {
                if (this.f26461h0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f26461h0 = viewConfiguration.getScaledTouchSlop();
                    this.f26462i0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f26463j0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f26459f0 = motionEvent.getX();
                this.f26460g0 = motionEvent.getY();
                this.f26457d0 = false;
                this.f26458e0 = false;
                VelocityTracker velocityTracker2 = this.f26464k0;
                if (velocityTracker2 == null) {
                    this.f26464k0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f26464k0.addMovement(motionEvent);
                a0(true);
                ValueAnimator valueAnimator = this.f26465l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f26465l0 = null;
                }
                int i7 = this.f26455b0;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    ((st) arrayList.get(this.f26455b0)).k(this.W, motionEvent);
                }
            } else {
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    if (!this.f26458e0) {
                        VelocityTracker velocityTracker3 = this.f26464k0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - this.f26459f0;
                        float y10 = motionEvent.getY() - this.f26460g0;
                        if (!this.f26457d0 && Math.abs(y10) > this.f26461h0 && Math.abs(y10) > Math.abs(x10)) {
                            this.f26458e0 = true;
                            int i10 = this.f26455b0;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((st) arrayList.get(this.f26455b0)).k(this.W, obtain);
                                obtain.recycle();
                            }
                            a0(false);
                        } else {
                            if (!this.f26457d0 && Math.abs(x10) > this.f26461h0 && Math.abs(x10) > Math.abs(y10)) {
                                this.f26457d0 = true;
                                int i11 = this.f26455b0;
                                if (i11 >= 0 && i11 < arrayList.size()) {
                                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                    obtain2.setAction(3);
                                    ((st) arrayList.get(this.f26455b0)).k(this.W, obtain2);
                                    obtain2.recycle();
                                }
                            }
                            if (this.f26457d0) {
                                float f11 = (-x10) / this.Z;
                                int i12 = this.f26455b0;
                                if (i12 == 0 && f11 < 0.0f) {
                                    f11 *= 0.3f;
                                }
                                if (i12 == arrayList.size() - 1 && f11 > 0.0f) {
                                    f11 *= 0.3f;
                                }
                                this.f26456c0 = f11;
                                View view2 = this.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i13 = this.f26455b0;
                                if (i13 >= 0 && i13 < arrayList.size()) {
                                    k10 = ((st) arrayList.get(this.f26455b0)).k(this.W, motionEvent);
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
                        boolean z10 = this.f26458e0;
                        this.f26458e0 = false;
                        if (!z10 && actionMasked == 1 && (velocityTracker = this.f26464k0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.f26464k0.computeCurrentVelocity(1000, this.f26463j0);
                            float xVelocity = this.f26464k0.getXVelocity();
                            float yVelocity = this.f26464k0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.f26462i0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f10 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker4 = this.f26464k0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f26464k0 = null;
                        }
                        a0(false);
                        if (!z10) {
                            if (this.f26457d0) {
                                this.f26457d0 = false;
                                i0(f10);
                            } else {
                                int i14 = this.f26455b0;
                                if (i14 >= 0 && i14 < arrayList.size()) {
                                    k10 = ((st) arrayList.get(this.f26455b0)).k(this.W, motionEvent);
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
        int i7;
        int i10;
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ArrayList arrayList = this.Y;
        if (i11 >= 0 || this.f26455b0 >= arrayList.size() - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.f26455b0 <= 0) {
                if (this.f26456c0 <= 0.5f || this.f26455b0 >= arrayList.size() - 1) {
                    if (this.f26456c0 >= -0.5f || this.f26455b0 <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i12 = i7 + this.f26455b0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26456c0, i12 - i10);
            this.f26465l0 = ofFloat;
            ofFloat.setDuration(420L);
            this.f26465l0.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f26465l0.addUpdateListener(new g(this, 2));
            this.f26465l0.addListener(new ki.f2(this, i12, 3));
            this.f26465l0.start();
        }
        i7 = 1;
        int i122 = i7 + this.f26455b0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f26456c0, i122 - i10);
        this.f26465l0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.f26465l0.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f26465l0.addUpdateListener(new g(this, 2));
        this.f26465l0.addListener(new ki.f2(this, i122, 3));
        this.f26465l0.start();
    }
}
