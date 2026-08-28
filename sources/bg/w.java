package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n71;
public final class w extends n71 {
    public final Path P;
    public final Paint Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final q2 U;
    public final b6 V;
    public final h1 W;
    public final a0 f1984a0;

    public w(a0 a0Var, Context context, q2 q2Var, b6 b6Var, h1 h1Var) {
        super(context, null);
        this.f1984a0 = a0Var;
        this.U = q2Var;
        this.V = b6Var;
        this.W = h1Var;
        this.P = new Path();
        this.Q = new Paint(1);
        this.T = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        a0 a0Var = this.f1984a0;
        w wVar = a0Var.f1691b;
        int v02 = f6.v0(f6.f23072h5, this.V);
        Paint paint = this.Q;
        paint.setColor(v02);
        if (this.R) {
            int i11 = -AndroidUtilities.dp(16.0f);
            h1 h1Var = this.W;
            int i12 = h1Var.f1821o0;
            if (h1Var.f32408e.getVisibility() == 0) {
                i9 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i9 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i11, i12 - i9);
            q2 q2Var = this.U;
            int i13 = q2Var.f1937p0;
            if (q2Var.f1931i0.f34854c == 1.0f) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int max = Math.max(0, i13 - i10);
            int abs = Math.abs(dp - max);
            if (wVar.getCurrentPosition() == 0) {
                float positionAnimated = wVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f10 = dp + positionAnimated;
                } else {
                    f10 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - wVar.getPositionAnimated()) * abs;
                if (max < dp) {
                    f10 = max + positionAnimated2;
                } else {
                    f10 = max - positionAnimated2;
                }
            }
            int i14 = (int) f10;
            float dp2 = AndroidUtilities.dp(14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, i14, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
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
        if (this.T || a0Var.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.T && !this.f1984a0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f1984a0.f1691b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        boolean z11 = this.S;
        a0 a0Var = this.f1984a0;
        if (z11 != a0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = a0Var.isKeyboardVisible();
            this.S = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.U.W(true);
            }
        }
    }

    @Override
    public final void u() {
        this.R = false;
        this.f1984a0.f1691b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        a0 a0Var = this.f1984a0;
        w wVar = a0Var.f1691b;
        float positionAnimated = wVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.R) {
                this.R = true;
                if (a0Var.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(a0Var.f1692c.getContainerView());
                }
            }
        } else {
            this.R = false;
        }
        wVar.invalidate();
    }
}
