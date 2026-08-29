package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class s2 extends View {
    public r2 f3367a;
    public int f3368b;
    public ag.i0 f3369c;
    public boolean d;
    public Paint f3370e;
    public LinearGradient f3371f;
    public Matrix h;

    public s2(Context context) {
        super(context);
        int i10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = 200;
        } else if (SharedConfig.getDevicePerformanceClass() == 1) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        this.d = true;
        this.f3367a = new r2(i10);
        a();
    }

    public void a() {
        r2 r2Var = this.f3367a;
        r2Var.N = 100;
        r2Var.M = true;
        r2Var.G = true;
        r2Var.K = true;
        r2Var.H = true;
        r2Var.f3345r = 4;
        r2Var.f3349w = 0.98f;
        r2Var.v = 0.98f;
        r2Var.f3348u = 0.98f;
        r2Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f3370e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f3371f = linearGradient;
        this.f3370e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ag.i0 i0Var = new ag.i0(this, 6);
        this.f3369c = i0Var;
        LiteMode.addOnPowerSaverAppliedListener(i0Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ag.i0 i0Var = this.f3369c;
        if (i0Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(i0Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f3370e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f3367a.d(canvas2);
            if (this.f3370e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f3371f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f3370e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f3371f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f3370e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f3367a.f3335g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f3367a.f3330a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f3367a.f3330a.offset((getMeasuredWidth() - this.f3367a.f3330a.width()) / 2.0f, (getMeasuredHeight() - this.f3367a.f3330a.height()) / 2.0f);
        this.f3367a.f3331b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f3368b != measuredHeight) {
            this.f3368b = measuredHeight;
            this.f3367a.f();
        }
    }

    public void setPaused(boolean z10) {
        r2 r2Var = this.f3367a;
        if (z10 == r2Var.f3335g) {
            return;
        }
        r2Var.f3335g = z10;
        if (z10) {
            r2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f3367a.f3341n.size(); i10++) {
            q2 q2Var = (q2) this.f3367a.f3341n.get(i10);
            q2Var.f3289a = (System.currentTimeMillis() - this.f3367a.Q) + q2Var.f3289a;
        }
        invalidate();
    }
}
