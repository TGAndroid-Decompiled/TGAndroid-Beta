package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.w71;
public final class r extends w71 {
    public final Path V;
    public final Paint W;
    public boolean f13214a0;
    public boolean f13215b0;
    public final boolean f13216c0;
    public final v1 f13217d0;
    public final p6 f13218e0;
    public final w0 f13219f0;
    public final v f13220g0;

    public r(v vVar, Context context, v1 v1Var, p6 p6Var, w0 w0Var) {
        super(context, null);
        this.f13220g0 = vVar;
        this.f13217d0 = v1Var;
        this.f13218e0 = p6Var;
        this.f13219f0 = w0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.f13216c0 = org.telegram.messenger.i0.Q1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        v vVar = this.f13220g0;
        r rVar = vVar.f13246i1;
        int w02 = t6.w0(t6.f21001h5, this.f13218e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (this.f13214a0) {
            int i12 = -org.telegram.messenger.i0.L(16.0f);
            w0 w0Var = this.f13219f0;
            int i13 = w0Var.f13274k2;
            if (w0Var.l1.getVisibility() == 0) {
                i10 = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            int L = org.telegram.messenger.i0.L(10.0f) + Math.max(i12, i13 - i10);
            v1 v1Var = this.f13217d0;
            int i14 = v1Var.f13259l2;
            if (v1Var.f13252e2.f30445c == 1.0f) {
                i11 = org.telegram.messenger.i0.f16020m;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(L - max);
            if (rVar.getCurrentPosition() == 0) {
                float positionAnimated = rVar.getPositionAnimated() * abs;
                if (L < max) {
                    f7 = L + positionAnimated;
                } else {
                    f7 = L - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - rVar.getPositionAnimated()) * abs;
                if (max < L) {
                    f7 = max + positionAnimated2;
                } else {
                    f7 = max - positionAnimated2;
                }
            }
            int i15 = (int) f7;
            float L2 = org.telegram.messenger.i0.L(14.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, i15, getWidth(), org.telegram.messenger.i0.L(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            Path path = this.V;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f13216c0 || vVar.f13248k1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f13216c0 && !this.f13220g0.f13248k1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f13220g0.f13246i1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.f13215b0;
        boolean z12 = this.f13220g0.d;
        if (z11 != z12) {
            this.f13215b0 = z12;
            if (z12) {
                this.f13217d0.j1(true);
            }
        }
    }

    @Override
    public final void u() {
        this.f13214a0 = false;
        this.f13220g0.f13246i1.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        v vVar = this.f13220g0;
        r rVar = vVar.f13246i1;
        float positionAnimated = rVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f13214a0) {
                this.f13214a0 = true;
                if (vVar.d) {
                    org.telegram.messenger.i0.v1(vVar.f13247j1.f21586b);
                }
            }
        } else {
            this.f13214a0 = false;
        }
        rVar.invalidate();
    }
}
