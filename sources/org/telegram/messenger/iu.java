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
public final class iu extends xt {
    public final TL_iv.pageBlockMath X;
    public final Bitmap Y;
    public final int Z;
    public final int f23579a0;
    public final int f23580b0;
    public final int f23581c0;
    public final int f23582d0;
    public int f23583e0;
    public float f23584f0;
    public int f23585g0;
    public boolean f23586h0;
    public int f23587i0;
    public final Paint f23588j0;
    public int f23589k0;
    public int f23590l0;
    public VelocityTracker m0;
    public OverScroller f23591n0;
    public final mi.b0 f23592o0;

    public iu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockMath pageblockmath) {
        super(cvVar, rect, i3);
        mi.q qVar;
        this.f23588j0 = new Paint(3);
        this.f23592o0 = new mi.b0(this, 9);
        this.X = pageblockmath;
        int i10 = this.f26436c;
        this.f23580b0 = i10;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            qVar = mi.q.a(pageblockmath.source, g0.L(cvVar.M + 4), false);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            this.Y = qVar.f19824a;
            this.Z = qVar.f19825b;
            this.f23579a0 = qVar.f19826c;
        }
        int D = k5.D(0.0f, 2, this.Z);
        this.f23581c0 = D;
        this.f23582d0 = Math.max(0, D - i10);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return k5.D(8.0f, 2, rect.top + this.f23579a0) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return Math.min(this.f23580b0, this.f23581c0) + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f23586h0) {
            OverScroller overScroller = this.f23591n0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        float f10;
        Canvas canvas2;
        int i10;
        int i11;
        Bitmap bitmap = this.Y;
        if (bitmap == null) {
            return;
        }
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        Paint paint = this.f23588j0;
        paint.setColor(w02);
        int D = k5.D(8.0f, 2, this.f23579a0);
        int i12 = this.f23582d0;
        Rect rect = this.f26435b;
        if (i12 > 0) {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-cvVar.S, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, D, 255, 31);
            canvas2.save();
            canvas2.translate(g0.L(0.0f) - this.f23583e0, g0.L(8.0f));
        } else {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((cvVar.C / 2.0f) - rect.left) - (this.Z / 2.0f), g0.L(8.0f));
        }
        float f11 = f10;
        canvas2.drawBitmap(bitmap, f11, f11, paint);
        if (i12 > 0) {
            canvas2.restore();
            RectF rectF = g0.P;
            float f12 = D;
            rectF.set(-i10, f11, g0.L(12.0f) + (-cvVar.S), f12);
            cvVar.f22087z.w(canvas2, rectF, 0, 1.0f);
            rectF.set(i11 - g0.L(12.0f), f11, ((cvVar.C + cvVar.T) - rect.left) - rect.right, f12);
            cvVar.f22087z.w(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i3 = 0;
        int i10 = this.f23582d0;
        if (i10 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.f23587i0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f23587i0 = viewConfiguration.getScaledTouchSlop();
                    this.f23589k0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f23590l0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.f23591n0 == null && this.W != null) {
                    this.f23591n0 = new OverScroller(this.W.getContext());
                }
                OverScroller overScroller = this.f23591n0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f23591n0.forceFinished(true);
                }
                this.f23584f0 = motionEvent.getX();
                this.f23585g0 = this.f23583e0;
                this.f23586h0 = false;
                VelocityTracker velocityTracker2 = this.m0;
                if (velocityTracker2 == null) {
                    this.m0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.m0.addMovement(motionEvent);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.m0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f23584f0;
                if (!this.f23586h0 && Math.abs(x10) > this.f23587i0) {
                    this.f23586h0 = true;
                    a0(true);
                }
                if (this.f23586h0) {
                    int i11 = (int) (this.f23585g0 - x10);
                    if (i11 >= 0) {
                        i3 = i11;
                    }
                    if (i3 <= i10) {
                        i10 = i3;
                    }
                    if (i10 != this.f23583e0) {
                        this.f23583e0 = i10;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f23586h0;
                this.f23586h0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.m0) != null && this.f23591n0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.m0.computeCurrentVelocity(1000, this.f23590l0);
                        float f10 = -this.m0.getXVelocity();
                        if (Math.abs(f10) > this.f23589k0) {
                            this.f23591n0.fling(this.f23583e0, 0, (int) f10, 0, 0, this.f23582d0, 0, 0);
                            this.W.postOnAnimation(this.f23592o0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.m0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.m0 = null;
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
        TL_iv.pageBlockMath pageblockmath = this.X;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            spannableStringBuilder.append((CharSequence) pageblockmath.source);
        }
    }
}
