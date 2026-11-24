package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.a;
public final class m98 extends View {
    public final Paint a;
    public final gn b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final gn h;
    public String n;
    public boolean r;
    public final lm s;
    public boolean w;
    public int x;

    public m98(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        s33 s33Var = s33.h;
        this.s = new lm(this, 0L, 350L, s33Var);
        paint.setColor(2130706432);
        gn gnVar = new gn(false, true, true);
        this.b = gnVar;
        gnVar.n(0.3f, 320L, s33Var);
        gnVar.u(-1);
        gnVar.w(gl.L(14.0f));
        gnVar.x(gl.o());
        gnVar.setCallback(this);
        gnVar.t("0", true, true);
        Point point = gl.q;
        gnVar.N = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTypeface(gl.o());
        c();
        gn gnVar2 = new gn(false, true, true);
        this.h = gnVar2;
        gnVar2.n(0.3f, 320L, s33Var);
        gnVar2.u(-1);
        gnVar2.w(gl.L(14.0f));
        gnVar2.x(gl.o());
        gnVar2.setCallback(this);
        gnVar2.t("0", true, true);
        gnVar2.N = point.x;
    }

    public final void a(int i, int i2) {
        b(i, i2, true);
    }

    public final void b(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        boolean z3 = false;
        int max = Math.max(0, i);
        int max2 = Math.max(max, i2);
        if (k96.D0().B != null && !TextUtils.equals(this.n, k96.D0().B.c)) {
            c();
        }
        if (k96.a0) {
            i3 = max2;
        } else {
            i3 = max;
        }
        String format = String.format("%d", Integer.valueOf(i3));
        if (z && !this.w && !k96.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.t(format, z2, true);
        if (!k96.a0) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z && !this.w && !k96.a0) {
            z3 = true;
        }
        this.h.t(format2, z3, true);
        this.w = !z;
    }

    public final void c() {
        this.n = k96.D0().B.c;
        StaticLayout staticLayout = new StaticLayout(k96.M0(2131747636, null).replace("%1$d", "").replace("%2$d", ""), this.c, gl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f = this.d.getLineDescent(0);
            return;
        }
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public final void d(boolean z, boolean z2) {
        float f;
        if (this.r != z) {
            this.r = z;
            if (!z) {
                this.w = true;
            }
            if (!z2) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.s.e(true, f);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.r) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.s.e(false, f);
        if (e <= 0.0f) {
            return;
        }
        gn gnVar = this.b;
        float c = gnVar.c() + this.e;
        gn gnVar2 = this.h;
        float c2 = gnVar2.c() + c + gl.L(18.0f);
        float f2 = ((1.0f - e) * (-gl.L(8.0f))) + this.x;
        RectF rectF = gl.P;
        rectF.set((getWidth() - c2) / 2.0f, gl.N(10.0f) + f2, (getWidth() + c2) / 2.0f, gl.N(33.0f) + f2);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e));
        canvas.drawRoundRect(rectF, gl.N(12.0f), gl.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c2) / 2.0f) + gl.L(9.0f), f2 + gl.L(9.5f));
        gnVar.setBounds(0, 0, (int) gnVar.c(), gl.L(23.0f));
        int i = (int) (e * 255.0f);
        gnVar.C = i;
        gnVar.draw(canvas);
        canvas.translate(gnVar.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (gl.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        gnVar2.setBounds(0, 0, (int) gnVar2.c(), gl.L(23.0f));
        gnVar2.C = i;
        gnVar2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.x = a.getCurrentActionBarHeight() + gl.m;
        this.b.N = size;
        this.h.N = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ug8.E(43.0f, this.x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
