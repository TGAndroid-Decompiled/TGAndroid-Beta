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
    public p2 f5468a;
    public int f5469b;
    public cg.h0 f5470c;
    public boolean d;
    public Paint e;
    public LinearGradient f5471f;
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
        this.f5468a = new p2(i10);
        a();
    }

    public void a() {
        p2 p2Var = this.f5468a;
        p2Var.N = 100;
        p2Var.M = true;
        p2Var.G = true;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.f5441r = 4;
        p2Var.f5445w = 0.98f;
        p2Var.v = 0.98f;
        p2Var.f5444u = 0.98f;
        p2Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5471f = linearGradient;
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
        this.f5470c = h0Var;
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
        cg.h0 h0Var = this.f5470c;
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
            this.f5468a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f5471f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f5471f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f5468a.f5431g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f5468a.f5427a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f5468a.f5427a.offset((getMeasuredWidth() - this.f5468a.f5427a.width()) / 2.0f, (getMeasuredHeight() - this.f5468a.f5427a.height()) / 2.0f);
        this.f5468a.f5428b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f5469b != measuredHeight) {
            this.f5469b = measuredHeight;
            this.f5468a.f();
        }
    }

    public void setPaused(boolean z4) {
        p2 p2Var = this.f5468a;
        if (z4 == p2Var.f5431g) {
            return;
        }
        p2Var.f5431g = z4;
        if (z4) {
            p2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f5468a.f5437n.size(); i10++) {
            o2 o2Var = (o2) this.f5468a.f5437n.get(i10);
            o2Var.f5400a = (System.currentTimeMillis() - this.f5468a.Q) + o2Var.f5400a;
        }
        invalidate();
    }
}
