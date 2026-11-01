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
public final class cv extends ru {
    public final TL_iv.pageBlockMath W;
    public final Bitmap X;
    public final int Y;
    public final int Z;
    public final int f15212a0;
    public final int f15213b0;
    public final int f15214c0;
    public int f15215d0;
    public float f15216e0;
    public int f15217f0;
    public boolean f15218g0;
    public int f15219h0;
    public final Paint f15220i0;
    public int f15221j0;
    public int f15222k0;
    public VelocityTracker f15223l0;
    public OverScroller m0;
    public final mg.c2 f15224n0;

    public cv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockMath pageblockmath) {
        super(wvVar, rect, i10);
        bi.u uVar;
        this.f15220i0 = new Paint(3);
        this.f15224n0 = new mg.c2(this, 8);
        this.W = pageblockmath;
        int i11 = this.f17969c;
        this.f15212a0 = i11;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            uVar = bi.u.a(pageblockmath.source, i0.L(wvVar.M + 4), false);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            this.X = uVar.f3369a;
            this.Y = uVar.f3370b;
            this.Z = uVar.f3371c;
        }
        int D = m5.D(0.0f, 2, this.Y);
        this.f15213b0 = D;
        this.f15214c0 = Math.max(0, D - i11);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return m5.D(8.0f, 2, rect.top + this.Z) + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return Math.min(this.f15212a0, this.f15213b0) + rect.left + rect.right;
    }

    @Override
    public final boolean P() {
        if (!this.f15218g0) {
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
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        Paint paint = this.f15220i0;
        paint.setColor(w02);
        int D = m5.D(8.0f, 2, this.Z);
        int i13 = this.f15214c0;
        Rect rect = this.f17968b;
        if (i13 > 0) {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-wvVar.S, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, D, 255, 31);
            canvas2.save();
            canvas2.translate(i0.L(0.0f) - this.f15215d0, i0.L(8.0f));
        } else {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((wvVar.C / 2.0f) - rect.left) - (this.Y / 2.0f), i0.L(8.0f));
        }
        float f10 = f7;
        canvas2.drawBitmap(bitmap, f10, f10, paint);
        if (i13 > 0) {
            canvas2.restore();
            RectF rectF = i0.P;
            float f11 = D;
            rectF.set(-i11, f10, i0.L(12.0f) + (-wvVar.S), f11);
            wvVar.f19350z.o(canvas2, rectF, 0, 1.0f);
            rectF.set(i12 - i0.L(12.0f), f10, ((wvVar.C + wvVar.T) - rect.left) - rect.right, f11);
            wvVar.f19350z.o(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i10 = 0;
        int i11 = this.f15214c0;
        if (i11 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.f15219h0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f15219h0 = viewConfiguration.getScaledTouchSlop();
                    this.f15221j0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f15222k0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.m0 == null && this.V != null) {
                    this.m0 = new OverScroller(this.V.getContext());
                }
                OverScroller overScroller = this.m0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.m0.forceFinished(true);
                }
                this.f15216e0 = motionEvent.getX();
                this.f15217f0 = this.f15215d0;
                this.f15218g0 = false;
                VelocityTracker velocityTracker2 = this.f15223l0;
                if (velocityTracker2 == null) {
                    this.f15223l0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f15223l0.addMovement(motionEvent);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.f15223l0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f15216e0;
                if (!this.f15218g0 && Math.abs(x10) > this.f15219h0) {
                    this.f15218g0 = true;
                    Z(true);
                }
                if (this.f15218g0) {
                    int i12 = (int) (this.f15217f0 - x10);
                    if (i12 >= 0) {
                        i10 = i12;
                    }
                    if (i10 <= i11) {
                        i11 = i10;
                    }
                    if (i11 != this.f15215d0) {
                        this.f15215d0 = i11;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.f15218g0;
                this.f15218g0 = false;
                if (z10) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.f15223l0) != null && this.m0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f15223l0.computeCurrentVelocity(1000, this.f15222k0);
                        float f7 = -this.f15223l0.getXVelocity();
                        if (Math.abs(f7) > this.f15221j0) {
                            this.m0.fling(this.f15215d0, 0, (int) f7, 0, 0, this.f15214c0, 0, 0);
                            this.V.postOnAnimation(this.f15224n0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.f15223l0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f15223l0 = null;
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
