package eg;

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
public class q2 extends View {
    public p2 f5457a;
    public int f5458b;
    public cg.h0 f5459c;
    public boolean d;
    public Paint e;
    public LinearGradient f5460f;
    public Matrix h;

    public q2(Context context) {
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
        this.f5457a = new p2(i10);
        a();
    }

    public void a() {
        p2 p2Var = this.f5457a;
        p2Var.N = 100;
        p2Var.M = true;
        p2Var.G = true;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.f5430r = 4;
        p2Var.f5434w = 0.98f;
        p2Var.v = 0.98f;
        p2Var.f5433u = 0.98f;
        p2Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5460f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cg.h0 h0Var = new cg.h0(this, 6);
        this.f5459c = h0Var;
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
        cg.h0 h0Var = this.f5459c;
        if (h0Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(h0Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f5457a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f5460f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f5460f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f5457a.f5420g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f5457a.f5416a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f5457a.f5416a.offset((getMeasuredWidth() - this.f5457a.f5416a.width()) / 2.0f, (getMeasuredHeight() - this.f5457a.f5416a.height()) / 2.0f);
        this.f5457a.f5417b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f5458b != measuredHeight) {
            this.f5458b = measuredHeight;
            this.f5457a.f();
        }
    }

    public void setPaused(boolean z4) {
        p2 p2Var = this.f5457a;
        if (z4 == p2Var.f5420g) {
            return;
        }
        p2Var.f5420g = z4;
        if (z4) {
            p2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f5457a.f5426n.size(); i10++) {
            o2 o2Var = (o2) this.f5457a.f5426n.get(i10);
            o2Var.f5389a = (System.currentTimeMillis() - this.f5457a.Q) + o2Var.f5389a;
        }
        invalidate();
    }
}
