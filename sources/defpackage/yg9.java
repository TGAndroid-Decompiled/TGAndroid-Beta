package defpackage;

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
public final class yg9 extends mg9 {
    public final TL_iv.pageBlockMath X;
    public final Bitmap Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final int c0;
    public final int d0;
    public int e0;
    public float f0;
    public int g0;
    public boolean h0;
    public int i0;
    public final Paint j0;
    public int k0;
    public int l0;
    public VelocityTracker m0;
    public OverScroller n0;
    public final bg7 o0;

    public yg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockMath pageblockmath) {
        super(rh9Var, rect, i);
        lx5 lx5Var;
        this.j0 = new Paint(3);
        this.o0 = new bg7(this, (byte) 18);
        this.X = pageblockmath;
        int i2 = this.c;
        this.b0 = i2;
        if (!TextUtils.isEmpty(pageblockmath.source)) {
            lx5Var = lx5.a(pageblockmath.source, gl.L(rh9Var.M + 4), false);
        } else {
            lx5Var = null;
        }
        if (lx5Var != null) {
            this.Y = lx5Var.a;
            this.Z = lx5Var.b;
            this.a0 = lx5Var.c;
        }
        int L = this.Z + (gl.L(0.0f) << 1);
        this.c0 = L;
        this.d0 = Math.max(0, L - i2);
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.a0 + (gl.L(8.0f) << 1) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.b0, this.c0) + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (!this.h0) {
            OverScroller overScroller = this.n0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        float f;
        Canvas canvas2;
        int i2;
        int i3;
        Bitmap bitmap = this.Y;
        if (bitmap == null) {
            return;
        }
        rh9 rh9Var = this.a;
        boolean D = rh9Var.D();
        xl3 xl3Var = rh9Var.z;
        if (D) {
            i = bkb.Vc;
        } else {
            i = bkb.Uc;
        }
        int v0 = bkb.v0(i, rh9Var.D);
        Paint paint = this.j0;
        paint.setColor(v0);
        int L = this.a0 + (gl.L(8.0f) << 1);
        int i4 = this.d0;
        Rect rect = this.b;
        if (i4 > 0) {
            f = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-rh9Var.S, 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, L, 255, 31);
            canvas2.save();
            canvas2.translate(gl.L(0.0f) - this.e0, gl.L(8.0f));
        } else {
            f = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((rh9Var.C / 2.0f) - rect.left) - (this.Z / 2.0f), gl.L(8.0f));
        }
        float f2 = f;
        canvas2.drawBitmap(bitmap, f2, f2, paint);
        if (i4 > 0) {
            canvas2.restore();
            RectF rectF = gl.P;
            float f3 = L;
            rectF.set(-rh9Var.S, f2, gl.L(12.0f) + i2, f3);
            xl3Var.s(canvas2, rectF, 0, 1.0f);
            rectF.set(i3 - gl.L(12.0f), f2, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, f3);
            xl3Var.s(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i = 0;
        int i2 = this.d0;
        if (i2 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.i0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.i0 = viewConfiguration.getScaledTouchSlop();
                    this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                OverScroller overScroller = this.n0;
                if (overScroller == null && this.W != null) {
                    overScroller = new OverScroller(this.W.getContext());
                    this.n0 = overScroller;
                }
                if (overScroller != null && !overScroller.isFinished()) {
                    this.n0.forceFinished(true);
                }
                this.f0 = motionEvent.getX();
                this.g0 = this.e0;
                this.h0 = false;
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
                float x = motionEvent.getX() - this.f0;
                if (!this.h0 && Math.abs(x) > this.i0) {
                    this.h0 = true;
                    a0(true);
                }
                if (this.h0) {
                    int i3 = (int) (this.g0 - x);
                    if (i3 >= 0) {
                        i = i3;
                    }
                    if (i <= i2) {
                        i2 = i;
                    }
                    if (i2 != this.e0) {
                        this.e0 = i2;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z = this.h0;
                this.h0 = false;
                if (z) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.m0) != null && this.n0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.m0.computeCurrentVelocity(1000, this.l0);
                        float f = -this.m0.getXVelocity();
                        if (Math.abs(f) > this.k0) {
                            this.n0.fling(this.e0, 0, (int) f, 0, 0, this.d0, 0, 0);
                            this.W.postOnAnimation(this.o0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.m0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.m0 = null;
                }
                if (z || actionMasked == 1) {
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
