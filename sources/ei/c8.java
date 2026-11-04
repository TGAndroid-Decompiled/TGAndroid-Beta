package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class c8 {
    public static CharSequence[] f10160y;
    public int f10161a;
    public Long f10162b;
    public Integer f10163c;
    public Integer d;
    public boolean f10164e;
    public TLRPC.Document f10166g;
    public SpannableStringBuilder f10169k;
    public String f10170l;
    public boolean f10171m;
    public ly0 f10172n;
    public ly0 f10173o;
    public boolean f10174p;
    public boolean f10175q;
    public View f10176r;
    public Runnable f10177s;
    public int f10181x;
    public boolean f10165f = true;
    public final org.telegram.ui.Components.u5 h = new org.telegram.ui.Components.u5(0, 350, xq.h);
    public final gc f10167i = new gc((View) null);
    public final org.telegram.ui.Cells.y f10168j = org.telegram.ui.ActionBar.k6.a0(553648127, 0, 0);
    public final Paint f10178t = new Paint(1);
    public final Paint f10179u = new Paint(1);
    public final Path v = new Path();
    public final RectF f10180w = new RectF();

    public static CharSequence d() {
        if (f10160y == null) {
            f10160y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f10160y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            wp wpVar = new wp(2131231188, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            wpVar.H = 1.0f;
            wpVar.f40045r = -org.telegram.messenger.g0.L(1.0f);
            wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f10160y[0]).setSpan(wpVar, 0, 1, 33);
        }
        return f10160y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o10;
        String str = "";
        if (this.f10172n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f10169k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f10166g;
            if (document != null) {
                f11 = 12.0f;
            } else {
                f11 = 14.0f;
            }
            if (document != null) {
                o10 = null;
            } else {
                o10 = org.telegram.messenger.g0.o();
            }
            this.f10172n = new ly0(spannableStringBuilder, f11, o10);
        }
        if (this.f10173o == null || this.f10171m) {
            String str2 = this.f10170l;
            if (str2 != null) {
                str = str2;
            }
            this.f10173o = new ly0(str, 14.0f, null);
        }
        float d = this.h.d(this.f10165f);
        Paint paint = this.f10178t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f10172n.f35918c, this.f10173o.f35918c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f10181x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f10180w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f10167i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f10168j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f10179u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        ly0 ly0Var = this.f10172n;
        float f14 = L;
        ly0Var.f35929p = f14;
        ly0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        ly0 ly0Var2 = this.f10173o;
        ly0Var2.f35929p = f14;
        ly0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f10165f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f10174p && !this.f10175q && this.f10162b != null && this.f10163c != null && this.f10176r != null) {
            this.f10175q = true;
            hp.s1(this.f10161a).P1().g0(this.f10163c.intValue(), this.f10162b.longValue(), new ai.v2(this, 17));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f10167i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f10168j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
