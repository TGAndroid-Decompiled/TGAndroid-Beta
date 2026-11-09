package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class c8 {
    public static CharSequence[] f8882y;
    public int f8883a;
    public Long f8884b;
    public Integer f8885c;
    public Integer d;
    public boolean f8886e;
    public TLRPC.Document f8888g;
    public SpannableStringBuilder f8891k;
    public String f8892l;
    public boolean f8893m;
    public ny0 f8894n;
    public ny0 f8895o;
    public boolean f8896p;
    public boolean f8897q;
    public View f8898r;
    public Runnable f8899s;
    public int f8903x;
    public boolean f8887f = true;
    public final org.telegram.ui.Components.w5 h = new org.telegram.ui.Components.w5(0, 350, xq.h);
    public final ic f8889i = new ic((View) null);
    public final org.telegram.ui.Cells.y f8890j = org.telegram.ui.ActionBar.l6.a0(553648127, 0, 0);
    public final Paint f8900t = new Paint(1);
    public final Paint f8901u = new Paint(1);
    public final Path v = new Path();
    public final RectF f8902w = new RectF();

    public static CharSequence d() {
        if (f8882y == null) {
            f8882y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f8882y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            wp wpVar = new wp(2131231188, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            wpVar.G = 1.0f;
            wpVar.f40120r = -org.telegram.messenger.g0.L(1.0f);
            wpVar.f40121s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f8882y[0]).setSpan(wpVar, 0, 1, 33);
        }
        return f8882y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f8894n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f8891k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f8888g;
            if (document != null) {
                f11 = 12.0f;
            } else {
                f11 = 14.0f;
            }
            if (document != null) {
                o4 = null;
            } else {
                o4 = org.telegram.messenger.g0.o();
            }
            this.f8894n = new ny0(spannableStringBuilder, f11, o4);
        }
        if (this.f8895o == null || this.f8893m) {
            String str2 = this.f8892l;
            if (str2 != null) {
                str = str2;
            }
            this.f8895o = new ny0(str, 14.0f, null);
        }
        float d = this.h.d(this.f8887f);
        Paint paint = this.f8900t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f8894n.f36541c, this.f8895o.f36541c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f8903x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f8902w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f8889i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f8890j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f8901u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        ny0 ny0Var = this.f8894n;
        float f14 = L;
        ny0Var.f36552p = f14;
        ny0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        ny0 ny0Var2 = this.f8895o;
        ny0Var2.f36552p = f14;
        ny0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f8887f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f8896p && !this.f8897q && this.f8884b != null && this.f8885c != null && this.f8898r != null) {
            this.f8897q = true;
            qp.s1(this.f8883a).P1().g0(this.f8885c.intValue(), this.f8884b.longValue(), new ai.i(this, 14));
        }
    }

    public final void e(float f10, float f11, boolean z9) {
        this.f8889i.c(z9);
        int[] iArr = z9 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f8890j;
        yVar.setState(iArr);
        if (z9) {
            yVar.setHotspot(f10, f11);
        }
    }
}
