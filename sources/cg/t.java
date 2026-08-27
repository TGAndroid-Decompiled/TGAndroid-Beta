package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p71;

public final class t extends p71 {
    public final Path P;
    public final Paint Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final i2 U;
    public final c6 V;
    public final d1 W;

    public final x f2818a0;

    public t(x xVar, Context context, i2 i2Var, c6 c6Var, d1 d1Var) {
        super(context, null);
        this.f2818a0 = xVar;
        this.U = i2Var;
        this.V = c6Var;
        this.W = d1Var;
        this.P = new Path();
        this.Q = new Paint(1);
        this.T = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp;
        float f10;
        x xVar = this.f2818a0;
        t tVar = xVar.f2851b;
        int iV0 = g6.v0(g6.f23124h5, this.V);
        Paint paint = this.Q;
        paint.setColor(iV0);
        if (!this.R) {
            if (this.T || xVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        d1 d1Var = this.W;
        int i11 = d1Var.f2647o0;
        if (d1Var.f31853e.getVisibility() == 0) {
            iDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        } else {
            iDp = 0;
        }
        int iDp2 = AndroidUtilities.dp(10.0f) + Math.max(i10, i11 - iDp);
        i2 i2Var = this.U;
        int iMax = Math.max(0, i2Var.f2723p0 - (i2Var.f2717i0.f34812c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int iAbs = Math.abs(iDp2 - iMax);
        if (tVar.getCurrentPosition() == 0) {
            float positionAnimated = tVar.getPositionAnimated() * iAbs;
            f10 = iDp2 < iMax ? iDp2 + positionAnimated : iDp2 - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - tVar.getPositionAnimated()) * iAbs;
            f10 = iMax < iDp2 ? iMax + positionAnimated2 : iMax - positionAnimated2;
        }
        int i12 = (int) f10;
        float fDp = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i12, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
        canvas.save();
        Path path = this.P;
        path.rewind();
        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return (this.T || this.f2818a0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return this.f2818a0.f2851b.getCurrentPosition() == 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.S;
        x xVar = this.f2818a0;
        if (z11 != xVar.isKeyboardVisible()) {
            boolean zIsKeyboardVisible = xVar.isKeyboardVisible();
            this.S = zIsKeyboardVisible;
            if (zIsKeyboardVisible) {
                this.U.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.R = false;
        this.f2818a0.f2851b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        x xVar = this.f2818a0;
        t tVar = xVar.f2851b;
        float positionAnimated = tVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.R = false;
        } else if (!this.R) {
            this.R = true;
            if (xVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(xVar.f2852c.getContainerView());
            }
        }
        tVar.invalidate();
    }
}
