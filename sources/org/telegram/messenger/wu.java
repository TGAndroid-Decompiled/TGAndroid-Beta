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
public final class wu extends fu {
    public static Paint m0;
    public static Paint f26370n0;
    public final boolean W;
    public final ArrayList X;
    public final int Y;
    public final int Z;
    public int f26371a0;
    public float f26372b0;
    public boolean f26373c0;
    public boolean f26374d0;
    public float f26375e0;
    public float f26376f0;
    public int f26377g0;
    public int f26378h0;
    public int f26379i0;
    public VelocityTracker f26380j0;
    public ValueAnimator f26381k0;
    public final Path f26382l0;

    public wu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z9) {
        super(kvVar, rect, i7);
        yt ytVar;
        this.X = new ArrayList();
        this.f26382l0 = new Path();
        this.W = z9;
        for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i10);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                ytVar = new yt(kvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                ytVar = new yt(kvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                ytVar = null;
            }
            if (ytVar != null) {
                this.X.add(ytVar);
            }
        }
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            this.Z = 0;
            this.Y = 0;
            return;
        }
        this.Y = this.f22452c;
        int size = arrayList.size();
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float f11 = ((yt) obj).E;
            if (f11 <= 0.0f) {
                f11 = 1.0f;
            }
            f10 += f11;
        }
        int max = (int) (this.Y / Math.max(0.5f, f10 / arrayList.size()));
        Point point = g0.f22544q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.Z = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((yt) obj2).l(0, 0, this.Y, this.Z);
        }
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f22451b;
        int i10 = rect2.left;
        int i11 = ((int) this.M) + rect2.top;
        rect.set(i10, i11, this.Y + i10, this.Z + i11);
    }

    @Override
    public final int B() {
        return !this.X.isEmpty();
    }

    @Override
    public final CharSequence E(int i7) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.f26371a0, arrayList.size() - 1));
        return TextUtils.concat(((yt) arrayList.get(max)).f(), ", ", hd.a0(null, null, 2131747828, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override
    public final int I() {
        return this.Z;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22451b;
        return rect.left + this.f22452c + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f26373c0) {
            ValueAnimator valueAnimator = this.f26381k0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            View view = this.V;
            ytVar.S = view;
            ImageReceiver imageReceiver = ytVar.f26714c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ytVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ytVar.d(view);
            ytVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i7, View view) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((yt) arrayList.get(Math.max(0, Math.min(this.f26371a0, arrayList.size() - 1)))).j(view);
    }

    @Override
    public final void V() {
        int i7 = 0;
        a0(false);
        this.f26373c0 = false;
        this.f26374d0 = false;
        VelocityTracker velocityTracker = this.f26380j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26380j0 = null;
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            ytVar.f26714c.R();
            ytVar.d.R();
            ytVar.f26715e = null;
            z5.q(ytVar.f26712a.f23763a).v(ytVar);
        }
    }

    @Override
    public final void W(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wu.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f22451b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.X;
        try {
            if (actionMasked == 0) {
                if (this.f26377g0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f26377g0 = viewConfiguration.getScaledTouchSlop();
                    this.f26378h0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f26379i0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f26375e0 = motionEvent.getX();
                this.f26376f0 = motionEvent.getY();
                this.f26373c0 = false;
                this.f26374d0 = false;
                VelocityTracker velocityTracker2 = this.f26380j0;
                if (velocityTracker2 == null) {
                    this.f26380j0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f26380j0.addMovement(motionEvent);
                a0(true);
                ValueAnimator valueAnimator = this.f26381k0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f26381k0 = null;
                }
                int i7 = this.f26371a0;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    ((yt) arrayList.get(this.f26371a0)).k(this.V, motionEvent);
                }
            } else {
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    if (!this.f26374d0) {
                        VelocityTracker velocityTracker3 = this.f26380j0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - this.f26375e0;
                        float y10 = motionEvent.getY() - this.f26376f0;
                        if (!this.f26373c0 && Math.abs(y10) > this.f26377g0 && Math.abs(y10) > Math.abs(x10)) {
                            this.f26374d0 = true;
                            int i10 = this.f26371a0;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((yt) arrayList.get(this.f26371a0)).k(this.V, obtain);
                                obtain.recycle();
                            }
                            a0(false);
                        } else {
                            if (!this.f26373c0 && Math.abs(x10) > this.f26377g0 && Math.abs(x10) > Math.abs(y10)) {
                                this.f26373c0 = true;
                                int i11 = this.f26371a0;
                                if (i11 >= 0 && i11 < arrayList.size()) {
                                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                    obtain2.setAction(3);
                                    ((yt) arrayList.get(this.f26371a0)).k(this.V, obtain2);
                                    obtain2.recycle();
                                }
                            }
                            if (this.f26373c0) {
                                float f11 = (-x10) / this.Y;
                                int i12 = this.f26371a0;
                                if (i12 == 0 && f11 < 0.0f) {
                                    f11 *= 0.3f;
                                }
                                if (i12 == arrayList.size() - 1 && f11 > 0.0f) {
                                    f11 *= 0.3f;
                                }
                                this.f26372b0 = f11;
                                View view2 = this.V;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i13 = this.f26371a0;
                                if (i13 >= 0 && i13 < arrayList.size()) {
                                    k10 = ((yt) arrayList.get(this.f26371a0)).k(this.V, motionEvent);
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
                        boolean z9 = this.f26374d0;
                        this.f26374d0 = false;
                        if (!z9 && actionMasked == 1 && (velocityTracker = this.f26380j0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.f26380j0.computeCurrentVelocity(1000, this.f26379i0);
                            float xVelocity = this.f26380j0.getXVelocity();
                            float yVelocity = this.f26380j0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.f26378h0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f10 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker4 = this.f26380j0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f26380j0 = null;
                        }
                        a0(false);
                        if (!z9) {
                            if (this.f26373c0) {
                                this.f26373c0 = false;
                                i0(f10);
                            } else {
                                int i14 = this.f26371a0;
                                if (i14 >= 0 && i14 < arrayList.size()) {
                                    k10 = ((yt) arrayList.get(this.f26371a0)).k(this.V, motionEvent);
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
        ArrayList arrayList = this.X;
        if (i11 >= 0 || this.f26371a0 >= arrayList.size() - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.f26371a0 <= 0) {
                if (this.f26372b0 <= 0.5f || this.f26371a0 >= arrayList.size() - 1) {
                    if (this.f26372b0 >= -0.5f || this.f26371a0 <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i12 = i7 + this.f26371a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26372b0, i12 - i10);
            this.f26381k0 = ofFloat;
            ofFloat.setDuration(420L);
            this.f26381k0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f26381k0.addUpdateListener(new g(this, 2));
            this.f26381k0.addListener(new hi.m2(this, i12, 3));
            this.f26381k0.start();
        }
        i7 = 1;
        int i122 = i7 + this.f26371a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f26372b0, i122 - i10);
        this.f26381k0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.f26381k0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f26381k0.addUpdateListener(new g(this, 2));
        this.f26381k0.addListener(new hi.m2(this, i122, 3));
        this.f26381k0.start();
    }
}
