package fg;

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
public class p2 extends View {
    public o2 f6501a;
    public int f6502b;
    public dg.h0 f6503c;
    public boolean d;
    public Paint f6504e;
    public LinearGradient f6505f;
    public Matrix h;

    public p2(Context context) {
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
        this.f6501a = new o2(i10);
        a();
    }

    public void a() {
        o2 o2Var = this.f6501a;
        o2Var.N = 100;
        o2Var.M = true;
        o2Var.G = true;
        o2Var.K = true;
        o2Var.H = true;
        o2Var.f6466r = 4;
        o2Var.f6470w = 0.98f;
        o2Var.v = 0.98f;
        o2Var.f6469u = 0.98f;
        o2Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f6504e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f6505f = linearGradient;
        this.f6504e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg.h0 h0Var = new dg.h0(this, 6);
        this.f6503c = h0Var;
        LiteMode.addOnPowerSaverAppliedListener(h0Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg.h0 h0Var = this.f6503c;
        if (h0Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(h0Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f6504e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f6501a.d(canvas2);
            if (this.f6504e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f6505f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f6504e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f6505f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f6504e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f6501a.f6456g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f6501a.f6451a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f6501a.f6451a.offset((getMeasuredWidth() - this.f6501a.f6451a.width()) / 2.0f, (getMeasuredHeight() - this.f6501a.f6451a.height()) / 2.0f);
        this.f6501a.f6452b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f6502b != measuredHeight) {
            this.f6502b = measuredHeight;
            this.f6501a.f();
        }
    }

    public void setPaused(boolean z4) {
        o2 o2Var = this.f6501a;
        if (z4 == o2Var.f6456g) {
            return;
        }
        o2Var.f6456g = z4;
        if (z4) {
            o2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f6501a.f6462n.size(); i10++) {
            n2 n2Var = (n2) this.f6501a.f6462n.get(i10);
            n2Var.f6421a = (System.currentTimeMillis() - this.f6501a.Q) + n2Var.f6421a;
        }
        invalidate();
    }
}
