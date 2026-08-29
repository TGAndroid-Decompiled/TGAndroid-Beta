package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.z71;
public final class u extends z71 {
    public final Path P;
    public final Paint Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final g2 U;
    public final c6 V;
    public final c1 W;
    public final y f6138a0;

    public u(y yVar, Context context, g2 g2Var, c6 c6Var, c1 c1Var) {
        super(context, null);
        this.f6138a0 = yVar;
        this.U = g2Var;
        this.V = c6Var;
        this.W = c1Var;
        this.P = new Path();
        this.Q = new Paint(1);
        this.T = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f9;
        y yVar = this.f6138a0;
        u uVar = yVar.f6191b;
        int v02 = g6.v0(g6.f23133h5, this.V);
        Paint paint = this.Q;
        paint.setColor(v02);
        if (this.R) {
            int i12 = -AndroidUtilities.dp(16.0f);
            c1 c1Var = this.W;
            int i13 = c1Var.f5948o0;
            if (c1Var.f34660e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            g2 g2Var = this.U;
            int i14 = g2Var.f6017p0;
            if (g2Var.f6011i0.f27666c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (uVar.getCurrentPosition() == 0) {
                float positionAnimated = uVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f9 = dp + positionAnimated;
                } else {
                    f9 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - uVar.getPositionAnimated()) * abs;
                if (max < dp) {
                    f9 = max + positionAnimated2;
                } else {
                    f9 = max - positionAnimated2;
                }
            }
            int i15 = (int) f9;
            float dp2 = AndroidUtilities.dp(14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, i15, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            Path path = this.P;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.T || yVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.T && !this.f6138a0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f6138a0.f6191b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.S;
        y yVar = this.f6138a0;
        if (z11 != yVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = yVar.isKeyboardVisible();
            this.S = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.U.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.R = false;
        this.f6138a0.f6191b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        y yVar = this.f6138a0;
        u uVar = yVar.f6191b;
        float positionAnimated = uVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.R) {
                this.R = true;
                if (yVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(yVar.f6192c.getContainerView());
                }
            }
        } else {
            this.R = false;
        }
        uVar.invalidate();
    }
}
