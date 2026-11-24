package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f3b {
    public static CharSequence[] y;
    public int a;
    public Long b;
    public Integer c;
    public Integer d;
    public boolean e;
    public TLRPC.Document g;
    public SpannableStringBuilder k;
    public String l;
    public boolean m;
    public tgb n;
    public tgb o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final lm h = new lm(0, 350, s33.h);
    public final n41 i = new n41((View) null);
    public final ff0 j = bkb.Y(553648127, 0, 0);
    public final Paint t = new Paint(1);
    public final Paint u = new Paint(1);
    public final Path v = new Path();
    public final RectF w = new RectF();

    public static CharSequence d() {
        CharSequence[] charSequenceArr = y;
        if (charSequenceArr == null) {
            charSequenceArr = new CharSequence[2];
            y = charSequenceArr;
        }
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            cm2 cm2Var = new cm2(2131231191, 0);
            cm2Var.c(gl.L(16.0f));
            cm2Var.H = 1.0f;
            cm2Var.r = -gl.L(1.0f);
            cm2Var.s = gl.L(1.0f);
            ((SpannableStringBuilder) y[0]).setSpan(cm2Var, 0, 1, 33);
        }
        return y[0];
    }

    public final void a(Canvas canvas, float f) {
        Typeface o;
        float f2;
        String str = "";
        if (this.n == null) {
            SpannableStringBuilder spannableStringBuilder = this.k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            if (this.g != null) {
                o = null;
                f2 = 12.0f;
            } else {
                o = gl.o();
                f2 = 14.0f;
            }
            this.n = new tgb(spannableStringBuilder, f2, o);
        }
        if (this.o == null || this.m) {
            String str2 = this.l;
            if (str2 != null) {
                str = str2;
            }
            this.o = new tgb(str, 14.0f, null);
        }
        float d = this.h.d(this.f);
        Paint paint = this.t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f, Math.max(this.n.c, this.o.c) + gl.U1(d, gl.L(20.0f), gl.L(18.0f)));
        this.x = min;
        int U1 = gl.U1(d, gl.L(42.0f), gl.L(22.0f));
        float f3 = min;
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, f3, U1);
        canvas.save();
        float a = this.i.a(0.02f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float U12 = gl.U1(d, gl.L(5.0f), gl.L(11.0f));
        canvas.drawRoundRect(rectF, U12, U12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, U12, U12, Path.Direction.CW);
        canvas.clipPath(path);
        ff0 ff0Var = this.j;
        ff0Var.setBounds(0, 0, min, U1);
        ff0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, gl.L(3.0f), gl.L(42.0f));
        RectF rectF2 = gl.P;
        rectF2.set(0.0f, 0.0f, gl.L(10.0f), gl.L(42.0f));
        Paint paint2 = this.u;
        paint2.setColor(-1);
        float f4 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f4));
        canvas.drawRoundRect(rectF2, gl.L(5.0f), gl.L(5.0f), paint2);
        canvas.restore();
        int L = min - gl.L(20.0f);
        if (f3 < f) {
            L = (int) Math.min(gl.L(12.0f) + L, f - gl.L(20.0f));
        }
        tgb tgbVar = this.n;
        float f5 = L;
        tgbVar.p = f5;
        tgbVar.c(gl.U1(d, gl.L(10.0f), gl.L(7.0f)), gl.U1(d, gl.L(12.0f), gl.L(11.0f)), 1.0f, -1, canvas);
        tgb tgbVar2 = this.o;
        tgbVar2.p = f5;
        tgbVar2.c(gl.L(10.0f), gl.L(30.0f), f4, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f;
        if (this.f) {
            f = 22.0f;
        } else {
            f = 42.0f;
        }
        return gl.L(f);
    }

    public final void c() {
        if (!this.p && !this.q && this.b != null && this.c != null && this.r != null) {
            this.q = true;
            na7.q1(this.a).M1().f0(this.c.intValue(), this.b.longValue(), new ae9(this, (byte) 14));
        }
    }

    public final void e(float f, float f2, boolean z) {
        this.i.c(z);
        int[] iArr = z ? new int[]{16842919, 16842910} : new int[0];
        ff0 ff0Var = this.j;
        ff0Var.setState(iArr);
        if (z) {
            ff0Var.setHotspot(f, f2);
        }
    }
}
