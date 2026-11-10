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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
public final class c8 {
    public static CharSequence[] f8887y;
    public int f8888a;
    public Long f8889b;
    public Integer f8890c;
    public Integer d;
    public boolean f8891e;
    public TLRPC.Document f8893g;
    public SpannableStringBuilder f8896k;
    public String f8897l;
    public boolean f8898m;
    public my0 f8899n;
    public my0 f8900o;
    public boolean f8901p;
    public boolean f8902q;
    public View f8903r;
    public Runnable f8904s;
    public int f8908x;
    public boolean f8892f = true;
    public final org.telegram.ui.Components.v5 h = new org.telegram.ui.Components.v5(0, 350, wq.h);
    public final hc f8894i = new hc((View) null);
    public final org.telegram.ui.Cells.y f8895j = org.telegram.ui.ActionBar.m6.a0(553648127, 0, 0);
    public final Paint f8905t = new Paint(1);
    public final Paint f8906u = new Paint(1);
    public final Path v = new Path();
    public final RectF f8907w = new RectF();

    public static CharSequence d() {
        if (f8887y == null) {
            f8887y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f8887y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            wp wpVar = new wp(2131231188, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            wpVar.G = 1.0f;
            wpVar.f40038r = -org.telegram.messenger.g0.L(1.0f);
            wpVar.f40039s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f8887y[0]).setSpan(wpVar, 0, 1, 33);
        }
        return f8887y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f8899n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f8896k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f8893g;
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
            this.f8899n = new my0(spannableStringBuilder, f11, o4);
        }
        if (this.f8900o == null || this.f8898m) {
            String str2 = this.f8897l;
            if (str2 != null) {
                str = str2;
            }
            this.f8900o = new my0(str, 14.0f, null);
        }
        float d = this.h.d(this.f8892f);
        Paint paint = this.f8905t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f8899n.f36133c, this.f8900o.f36133c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f8908x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f8907w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f8894i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f8895j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f8906u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        my0 my0Var = this.f8899n;
        float f14 = L;
        my0Var.f36144p = f14;
        my0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        my0 my0Var2 = this.f8900o;
        my0Var2.f36144p = f14;
        my0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f8892f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f8901p && !this.f8902q && this.f8889b != null && this.f8890c != null && this.f8903r != null) {
            this.f8902q = true;
            qp.s1(this.f8888a).P1().g0(this.f8890c.intValue(), this.f8889b.longValue(), new ai.i(this, 14));
        }
    }

    public final void e(float f10, float f11, boolean z9) {
        this.f8894i.c(z9);
        int[] iArr = z9 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f8895j;
        yVar.setState(iArr);
        if (z9) {
            yVar.setHotspot(f10, f11);
        }
    }
}
