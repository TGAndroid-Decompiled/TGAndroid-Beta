package ag;

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

public class k3 extends View {

    public j3 f540a;

    public int f541b;

    public n0 f542c;
    public boolean d;

    public Paint f543e;

    public LinearGradient f544f;
    public Matrix h;

    public k3(Context context) {
        super(context);
        int i10 = SharedConfig.getDevicePerformanceClass() == 2 ? 200 : SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        this.d = true;
        this.f540a = new j3(i10);
        a();
    }

    public void a() {
        j3 j3Var = this.f540a;
        j3Var.N = 100;
        j3Var.M = true;
        j3Var.G = true;
        j3Var.K = true;
        j3Var.H = true;
        j3Var.f514r = 4;
        j3Var.f518w = 0.98f;
        j3Var.v = 0.98f;
        j3Var.f517u = 0.98f;
        j3Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f543e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f544f = linearGradient;
        this.f543e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n0 n0Var = new n0(this, 1);
        this.f542c = n0Var;
        LiteMode.addOnPowerSaverAppliedListener(n0Var);
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        if (this.d != zIsEnabled) {
            this.d = zIsEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0 n0Var = this.f542c;
        if (n0Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(n0Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f543e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f540a.d(canvas2);
            if (this.f543e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f544f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f543e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f544f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f543e);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.f540a.f504g) {
                return;
            }
            invalidate();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f540a.f499a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f540a.f499a.offset((getMeasuredWidth() - this.f540a.f499a.width()) / 2.0f, (getMeasuredHeight() - this.f540a.f499a.height()) / 2.0f);
        this.f540a.f500b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f541b != measuredHeight) {
            this.f541b = measuredHeight;
            this.f540a.f();
        }
    }

    public void setPaused(boolean z10) {
        j3 j3Var = this.f540a;
        if (z10 == j3Var.f504g) {
            return;
        }
        j3Var.f504g = z10;
        if (z10) {
            j3Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f540a.f510n.size(); i10++) {
            i3 i3Var = (i3) this.f540a.f510n.get(i10);
            i3Var.f469a = (System.currentTimeMillis() - this.f540a.Q) + i3Var.f469a;
        }
        invalidate();
    }
}
