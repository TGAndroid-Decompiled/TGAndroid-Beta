package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.m81;
public final class t extends m81 {
    public final Path Q;
    public final Paint R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public final f2 V;
    public final g6 W;
    public final b1 f7607a0;
    public final x f7608b0;

    public t(x xVar, Context context, f2 f2Var, g6 g6Var, b1 b1Var) {
        super(context, null);
        this.f7608b0 = xVar;
        this.V = f2Var;
        this.W = g6Var;
        this.f7607a0 = b1Var;
        this.Q = new Path();
        this.R = new Paint(1);
        this.U = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        x xVar = this.f7608b0;
        t tVar = xVar.f7661b;
        int v02 = k6.v0(k6.f21731h5, this.W);
        Paint paint = this.R;
        paint.setColor(v02);
        if (this.S) {
            int i12 = -AndroidUtilities.dp(16.0f);
            b1 b1Var = this.f7607a0;
            int i13 = b1Var.f7416p0;
            if (b1Var.f31015e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            f2 f2Var = this.V;
            int i14 = f2Var.f7485q0;
            if (f2Var.f7479j0.f33725c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (tVar.getCurrentPosition() == 0) {
                float positionAnimated = tVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f10 = dp + positionAnimated;
                } else {
                    f10 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - tVar.getPositionAnimated()) * abs;
                if (max < dp) {
                    f10 = max + positionAnimated2;
                } else {
                    f10 = max - positionAnimated2;
                }
            }
            int i15 = (int) f10;
            float dp2 = AndroidUtilities.dp(14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, i15, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            Path path = this.Q;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.U || xVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.U && !this.f7608b0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f7608b0.f7661b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = this.T;
        x xVar = this.f7608b0;
        if (z10 != xVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = xVar.isKeyboardVisible();
            this.T = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.V.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.S = false;
        this.f7608b0.f7661b.invalidate();
    }

    @Override
    public final void w(boolean z4) {
        x xVar = this.f7608b0;
        t tVar = xVar.f7661b;
        float positionAnimated = tVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.S) {
                this.S = true;
                if (xVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(xVar.f7662c.getContainerView());
                }
            }
        } else {
            this.S = false;
        }
        tVar.invalidate();
    }
}
