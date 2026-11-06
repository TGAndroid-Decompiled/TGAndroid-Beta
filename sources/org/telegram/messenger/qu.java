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
public final class qu extends fu {
    public final TL_iv.pageBlockMath W;
    public final Bitmap X;
    public final int Y;
    public final int Z;
    public final int f25133a0;
    public final int f25134b0;
    public final int f25135c0;
    public int f25136d0;
    public float f25137e0;
    public int f25138f0;
    public boolean f25139g0;
    public int f25140h0;
    public final Paint f25141i0;
    public int f25142j0;
    public int f25143k0;
    public VelocityTracker f25144l0;
    public OverScroller m0;
    public final m.f3 f25145n0;

    public qu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockMath pageblockmath) {
        super(kvVar, rect, i7);
        li.q qVar;
        this.f25141i0 = new Paint(3);
        this.f25145n0 = new m.f3(this, 10);
        this.W = pageblockmath;
        int i10 = this.f22452c;
        this.f25133a0 = i10;
        if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
            qVar = li.q.a(pageblockmath.source, g0.L(kvVar.M + 4), false);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            this.X = qVar.f18778a;
            this.Y = qVar.f18779b;
            this.Z = qVar.f18780c;
        }
        int D = k5.D(0.0f, 2, this.Y);
        this.f25134b0 = D;
        this.f25135c0 = Math.max(0, D - i10);
    }

    @Override
    public final int I() {
        Rect rect = this.f22451b;
        return k5.D(8.0f, 2, rect.top + this.Z) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22451b;
        return Math.min(this.f25133a0, this.f25134b0) + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.f25139g0) {
            OverScroller overScroller = this.m0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        float f10;
        Canvas canvas2;
        int i10;
        int i11;
        Bitmap bitmap = this.X;
        if (bitmap == null) {
            return;
        }
        kv kvVar = this.f22450a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
        Paint paint = this.f25141i0;
        paint.setColor(w02);
        int D = k5.D(8.0f, 2, this.Z);
        int i12 = this.f25135c0;
        Rect rect = this.f22451b;
        if (i12 > 0) {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-kvVar.S, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, D, 255, 31);
            canvas2.save();
            canvas2.translate(g0.L(0.0f) - this.f25136d0, g0.L(8.0f));
        } else {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((kvVar.C / 2.0f) - rect.left) - (this.Y / 2.0f), g0.L(8.0f));
        }
        float f11 = f10;
        canvas2.drawBitmap(bitmap, f11, f11, paint);
        if (i12 > 0) {
            canvas2.restore();
            RectF rectF = g0.P;
            float f12 = D;
            rectF.set(-i10, f11, g0.L(12.0f) + (-kvVar.S), f12);
            kvVar.f23785z.m(canvas2, rectF, 0, 1.0f);
            rectF.set(i11 - g0.L(12.0f), f11, ((kvVar.C + kvVar.T) - rect.left) - rect.right, f12);
            kvVar.f23785z.m(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i7 = 0;
        int i10 = this.f25135c0;
        if (i10 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.f25140h0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.f25140h0 = viewConfiguration.getScaledTouchSlop();
                    this.f25142j0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f25143k0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.m0 == null && this.V != null) {
                    this.m0 = new OverScroller(this.V.getContext());
                }
                OverScroller overScroller = this.m0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.m0.forceFinished(true);
                }
                this.f25137e0 = motionEvent.getX();
                this.f25138f0 = this.f25136d0;
                this.f25139g0 = false;
                VelocityTracker velocityTracker2 = this.f25144l0;
                if (velocityTracker2 == null) {
                    this.f25144l0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f25144l0.addMovement(motionEvent);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.f25144l0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f25137e0;
                if (!this.f25139g0 && Math.abs(x10) > this.f25140h0) {
                    this.f25139g0 = true;
                    a0(true);
                }
                if (this.f25139g0) {
                    int i11 = (int) (this.f25138f0 - x10);
                    if (i11 >= 0) {
                        i7 = i11;
                    }
                    if (i7 <= i10) {
                        i10 = i7;
                    }
                    if (i10 != this.f25136d0) {
                        this.f25136d0 = i10;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z9 = this.f25139g0;
                this.f25139g0 = false;
                if (z9) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.f25144l0) != null && this.m0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f25144l0.computeCurrentVelocity(1000, this.f25143k0);
                        float f10 = -this.f25144l0.getXVelocity();
                        if (Math.abs(f10) > this.f25142j0) {
                            this.m0.fling(this.f25136d0, 0, (int) f10, 0, 0, this.f25135c0, 0, 0);
                            this.V.postOnAnimation(this.f25145n0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.f25144l0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f25144l0 = null;
                }
                if (z9 || actionMasked == 1) {
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
