package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.ui.Wallet.c;
public final class xo8 extends jr8 {
    public final Drawable R;
    public final Drawable S;
    public final tgb T;
    public tgb U;
    public final Paint V;
    public final Path W;
    public float a0;
    public final DecimalFormat b0;

    public xo8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = b00.d(context, 2131232585);
        this.S = b00.d(context, 2131232586);
        this.T = new tgb(k96.M0(2131744918, null).concat(":"), 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.N(1.16f));
        path.moveTo(0.0f, -gl.N(3.33f));
        path.lineTo(gl.N(3.16f), 0.0f);
        path.lineTo(0.0f, gl.N(3.33f));
        setBalance(0L);
    }

    @Override
    public final void b(Canvas canvas, float f) {
        Drawable drawable;
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-gl.L(20.0f)) * this.a0);
        float f2 = f * 0.85f;
        this.T.c(0.0f, height, f2, this.F, canvas);
        canvas.translate(this.T.j() + gl.L(4.0f), 0.0f);
        if (!this.G && this.H < 0.8f) {
            drawable = this.R;
        } else {
            drawable = this.S;
        }
        int L = gl.L(13.0f);
        int i = ((int) height) - (L / 2);
        drawable.setBounds(0, i, L, i + L);
        drawable.setAlpha((int) (255.0f * f));
        drawable.draw(canvas);
        canvas.translate(gl.L(2.0f) + L, 0.0f);
        this.U.c(0.0f, height, f, this.F, canvas);
        canvas.translate(gl.N(4.8f) + this.U.j(), height);
        int p1 = bkb.p1(f2, this.F);
        Paint paint = this.V;
        paint.setColor(p1);
        canvas.drawPath(this.W, paint);
    }

    @Override
    public final float c(float f) {
        tgb tgbVar = this.T;
        tgbVar.p = -1.0f;
        this.U.p = -1.0f;
        float max = Math.max(0.0f, f - gl.L(43.0f));
        tgbVar.p = Math.max(0.0f, max - this.U.j());
        this.U.p = Math.max(0.0f, max - tgbVar.j());
        return this.U.j() + tgbVar.j() + gl.L(27.0f);
    }

    public void setBalance(long j) {
        String format = this.b0.format(new BigDecimal(c.t(j, false)));
        this.U = new tgb(format, 11.0f, gl.o());
        setContentDescription(k96.M0(2131744918, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f) {
        if (this.a0 == f) {
            return;
        }
        this.a0 = f;
        invalidate();
    }
}
