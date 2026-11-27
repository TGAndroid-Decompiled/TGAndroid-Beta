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
public final class js8 extends tu8 {
    public final Drawable R;
    public final Drawable S;
    public final pkb T;
    public pkb U;
    public final Paint V;
    public final Path W;
    public float a0;
    public final DecimalFormat b0;

    public js8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = c00.e(context, 2131232596);
        this.S = c00.e(context, 2131232597);
        this.T = new pkb(ob6.M0(2131744812, null).concat(":"), 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.N(1.16f));
        path.moveTo(0.0f, -hl.N(3.33f));
        path.lineTo(hl.N(3.16f), 0.0f);
        path.lineTo(0.0f, hl.N(3.33f));
        setBalance(0L);
    }

    @Override
    public final void b(Canvas canvas, float f) {
        Drawable drawable;
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-hl.L(20.0f)) * this.a0);
        float f2 = f * 0.85f;
        this.T.c(0.0f, height, f2, this.F, canvas);
        canvas.translate(this.T.j() + hl.L(4.0f), 0.0f);
        if (!this.G && this.H < 0.8f) {
            drawable = this.R;
        } else {
            drawable = this.S;
        }
        int L = hl.L(13.0f);
        int i = ((int) height) - (L / 2);
        drawable.setBounds(0, i, L, i + L);
        drawable.setAlpha((int) (255.0f * f));
        drawable.draw(canvas);
        canvas.translate(hl.L(2.0f) + L, 0.0f);
        this.U.c(0.0f, height, f, this.F, canvas);
        canvas.translate(hl.N(4.8f) + this.U.j(), height);
        int p1 = aob.p1(f2, this.F);
        Paint paint = this.V;
        paint.setColor(p1);
        canvas.drawPath(this.W, paint);
    }

    @Override
    public final float c(float f) {
        pkb pkbVar = this.T;
        pkbVar.p = -1.0f;
        this.U.p = -1.0f;
        float max = Math.max(0.0f, f - hl.L(43.0f));
        pkbVar.p = Math.max(0.0f, max - this.U.j());
        this.U.p = Math.max(0.0f, max - pkbVar.j());
        return this.U.j() + pkbVar.j() + hl.L(27.0f);
    }

    public void setBalance(long j) {
        String format = this.b0.format(new BigDecimal(c.t(j, false)));
        this.U = new pkb(format, 11.0f, hl.o());
        setContentDescription(ob6.M0(2131744812, null) + ": " + format);
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
