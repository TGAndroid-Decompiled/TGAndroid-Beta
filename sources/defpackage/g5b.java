package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g5b {
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
    public uib n;
    public uib o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final ln h = new ln(0, 350, d53.h);
    public final u51 i = new u51((View) null);
    public final fg0 j = cmb.Y(553648127, 0, 0);
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
            pn2 pn2Var = new pn2(2131231192, 0);
            pn2Var.c(gm.L(16.0f));
            pn2Var.H = 1.0f;
            pn2Var.r = -gm.L(1.0f);
            pn2Var.s = gm.L(1.0f);
            ((SpannableStringBuilder) y[0]).setSpan(pn2Var, 0, 1, 33);
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
                o = gm.o();
                f2 = 14.0f;
            }
            this.n = new uib(spannableStringBuilder, f2, o);
        }
        if (this.o == null || this.m) {
            String str2 = this.l;
            if (str2 != null) {
                str = str2;
            }
            this.o = new uib(str, 14.0f, null);
        }
        float d = this.h.d(this.f);
        Paint paint = this.t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f, Math.max(this.n.c, this.o.c) + gm.U1(d, gm.L(20.0f), gm.L(18.0f)));
        this.x = min;
        int U1 = gm.U1(d, gm.L(42.0f), gm.L(22.0f));
        float f3 = min;
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, f3, U1);
        canvas.save();
        float a = this.i.a(0.02f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float U12 = gm.U1(d, gm.L(5.0f), gm.L(11.0f));
        canvas.drawRoundRect(rectF, U12, U12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, U12, U12, Path.Direction.CW);
        canvas.clipPath(path);
        fg0 fg0Var = this.j;
        fg0Var.setBounds(0, 0, min, U1);
        fg0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, gm.L(3.0f), gm.L(42.0f));
        RectF rectF2 = gm.P;
        rectF2.set(0.0f, 0.0f, gm.L(10.0f), gm.L(42.0f));
        Paint paint2 = this.u;
        paint2.setColor(-1);
        float f4 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f4));
        canvas.drawRoundRect(rectF2, gm.L(5.0f), gm.L(5.0f), paint2);
        canvas.restore();
        int L = min - gm.L(20.0f);
        if (f3 < f) {
            L = (int) Math.min(gm.L(12.0f) + L, f - gm.L(20.0f));
        }
        uib uibVar = this.n;
        float f5 = L;
        uibVar.p = f5;
        uibVar.c(gm.U1(d, gm.L(10.0f), gm.L(7.0f)), gm.U1(d, gm.L(12.0f), gm.L(11.0f)), 1.0f, -1, canvas);
        uib uibVar2 = this.o;
        uibVar2.p = f5;
        uibVar2.c(gm.L(10.0f), gm.L(30.0f), f4, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f;
        if (this.f) {
            f = 22.0f;
        } else {
            f = 42.0f;
        }
        return gm.L(f);
    }

    public final void c() {
        if (!this.p && !this.q && this.b != null && this.c != null && this.r != null) {
            this.q = true;
            oc7.r1(this.a).N1().f0(this.c.intValue(), this.b.longValue(), new eg9(this, (byte) 14));
        }
    }

    public final void e(float f, float f2, boolean z) {
        this.i.c(z);
        int[] iArr = z ? new int[]{16842919, 16842910} : new int[0];
        fg0 fg0Var = this.j;
        fg0Var.setState(iArr);
        if (z) {
            fg0Var.setHotspot(f, f2);
        }
    }
}
