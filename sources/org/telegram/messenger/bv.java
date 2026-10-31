package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import org.telegram.tgnet.tl.TL_iv;
public final class bv extends qu {
    public final TL_iv.pageBlockMath W;
    public final Bitmap X;
    public final int Y;
    public final int Z;
    public final int f14829a0;
    public final int f14830b0;
    public final int f14831c0;
    public int f14832d0;
    public float f14833e0;
    public int f14834f0;
    public boolean f14835g0;
    public int f14836h0;
    public final Paint f14837i0;
    public int f14838j0;
    public int f14839k0;
    public VelocityTracker f14840l0;
    public OverScroller m0;
    public final mg.c2 f14841n0;

    public bv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockMath pageblockmath) {
        super(vvVar, rect, i10);
        bi.u uVar;
        this.f14837i0 = new Paint(3);
        this.f14841n0 = new mg.c2(this, 8);
        this.W = pageblockmath;
        int i11 = this.f17623c;
        this.f14829a0 = i11;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            uVar = bi.u.a(pageblockmath.source, i0.L(vvVar.M + 4), false);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            this.X = uVar.f3369a;
            this.Y = uVar.f3370b;
            this.Z = uVar.f3371c;
        }
        int D = m5.D(0.0f, 2, this.Y);
        this.f14830b0 = D;
        this.f14831c0 = Math.max(0, D - i11);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return m5.D(8.0f, 2, rect.top + this.Z) + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return Math.min(this.f14829a0, this.f14830b0) + rect.left + rect.right;
    }

    @Override
    public final boolean P() {
        if (!this.f14835g0) {
            OverScroller overScroller = this.m0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        float f7;
        Canvas canvas2;
        int i11;
        int i12;
        Bitmap bitmap = this.X;
        if (bitmap == null) {
            return;
        }
        vv vvVar = this.f17621a;
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        Paint paint = this.f14837i0;
        paint.setColor(w02);
        int D = m5.D(8.0f, 2, this.Z);
        int i13 = this.f14831c0;
        Rect rect = this.f17622b;
        if (i13 > 0) {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-vvVar.S, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, D, 255, 31);
            canvas2.save();
            canvas2.translate(i0.L(0.0f) - this.f14832d0, i0.L(8.0f));
        } else {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((vvVar.C / 2.0f) - rect.left) - (this.Y / 2.0f), i0.L(8.0f));
        }
        float f10 = f7;
        canvas2.drawBitmap(bitmap, f10, f10, paint);
        if (i13 > 0) {
            canvas2.restore();
            RectF rectF = i0.P;
            float f11 = D;
            rectF.set(-i11, f10, i0.L(12.0f) + (-vvVar.S), f11);
            vvVar.f19007z.o(canvas2, rectF, 0, 1.0f);
            rectF.set(i12 - i0.L(12.0f), f10, ((vvVar.C + vvVar.T) - rect.left) - rect.right, f11);
            vvVar.f19007z.o(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i10 = 0;
        int i11 = this.f14831c0;
        if (i11 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.f14836h0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f14836h0 = viewConfiguration.getScaledTouchSlop();
                    this.f14838j0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f14839k0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.m0 == null && this.V != null) {
                    this.m0 = new OverScroller(this.V.getContext());
                }
                OverScroller overScroller = this.m0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.m0.forceFinished(true);
                }
                this.f14833e0 = motionEvent.getX();
                this.f14834f0 = this.f14832d0;
                this.f14835g0 = false;
                VelocityTracker velocityTracker2 = this.f14840l0;
                if (velocityTracker2 == null) {
                    this.f14840l0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f14840l0.addMovement(motionEvent);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.f14840l0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f14833e0;
                if (!this.f14835g0 && Math.abs(x10) > this.f14836h0) {
                    this.f14835g0 = true;
                    Z(true);
                }
                if (this.f14835g0) {
                    int i12 = (int) (this.f14834f0 - x10);
                    if (i12 >= 0) {
                        i10 = i12;
                    }
                    if (i10 <= i11) {
                        i11 = i10;
                    }
                    if (i11 != this.f14832d0) {
                        this.f14832d0 = i11;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f14835g0;
                this.f14835g0 = false;
                if (z10) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.f14840l0) != null && this.m0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f14840l0.computeCurrentVelocity(1000, this.f14839k0);
                        float f7 = -this.f14840l0.getXVelocity();
                        if (Math.abs(f7) > this.f14838j0) {
                            this.m0.fling(this.f14832d0, 0, (int) f7, 0, 0, this.f14831c0, 0, 0);
                            this.V.postOnAnimation(this.f14841n0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.f14840l0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f14840l0 = null;
                }
                if (z10 || actionMasked == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        TL_iv.pageBlockMath pageblockmath = this.W;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            spannableStringBuilder.append((CharSequence) pageblockmath.source);
        }
    }
}
