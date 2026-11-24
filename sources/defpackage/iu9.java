package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SecretMediaViewer;
public final class iu9 extends FrameLayout {
    public static final int E = 0;
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final tob d;
    public boolean e;
    public long f;
    public long h;
    public final oy8 n;
    public final TextPaint r;
    public StaticLayout s;
    public float w;
    public float x;
    public final SecretMediaViewer y;

    public iu9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.y = secretMediaViewer;
        this.c = new RectF();
        this.d = new tob();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gl.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(gl.L(2.0f));
        new Paint(1).setColor(2130706432);
        oy8 oy8Var = new oy8(2131624021, gl.L(16.0f), gl.L(16.0f));
        this.n = oy8Var;
        oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oy8Var.M(this);
        oy8Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        k27 k27Var = this.y.g0;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z = this.e;
                Paint paint = this.b;
                Paint paint2 = this.a;
                RectF rectF = this.c;
                if (z) {
                    canvas.save();
                    de9.n(this.x, 2.0f, rectF.centerY(), rectF.centerX() - (this.w / 2.0f), canvas);
                    this.s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f = 19.285715f;
                    for (int i = 0; i < 5; i++) {
                        canvas.drawArc(rectF, f + 270.0f, 12.857143f, false, paint2);
                        f += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - gl.L(1.0f);
                    float L = gl.L(8.0f);
                    oy8 oy8Var = this.n;
                    oy8Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    oy8Var.draw(canvas);
                    float f2 = max * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f2, false, paint2);
                    this.d.a(f2, 1.0f, canvas, paint, rectF);
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() - gl.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = gl.N(10.5f);
        this.c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
