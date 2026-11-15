package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class v7 {
    public static CharSequence[] f12427y;
    public int f12428a;
    public Long f12429b;
    public Integer f12430c;
    public Integer d;
    public boolean f12431e;
    public TLRPC.Document f12433g;
    public SpannableStringBuilder f12436k;
    public String f12437l;
    public boolean f12438m;
    public oy0 f12439n;
    public oy0 f12440o;
    public boolean f12441p;
    public boolean f12442q;
    public View f12443r;
    public Runnable f12444s;
    public int f12448x;
    public boolean f12432f = true;
    public final org.telegram.ui.Components.u5 h = new org.telegram.ui.Components.u5(0, 350, er.h);
    public final dc f12434i = new dc((View) null);
    public final org.telegram.ui.Cells.y f12435j = org.telegram.ui.ActionBar.j6.a0(553648127, 0, 0);
    public final Paint f12445t = new Paint(1);
    public final Paint f12446u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12447w = new RectF();

    public static CharSequence d() {
        if (f12427y == null) {
            f12427y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12427y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            eq eqVar = new eq(2131231188, 0);
            eqVar.c(org.telegram.messenger.g0.L(16.0f));
            eqVar.H = 1.0f;
            eqVar.f34415r = -org.telegram.messenger.g0.L(1.0f);
            eqVar.f34416s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12427y[0]).setSpan(eqVar, 0, 1, 33);
        }
        return f12427y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12439n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12436k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12433g;
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
            this.f12439n = new oy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12440o == null || this.f12438m) {
            String str2 = this.f12437l;
            if (str2 != null) {
                str = str2;
            }
            this.f12440o = new oy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12432f);
        Paint paint = this.f12445t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12439n.f38105c, this.f12440o.f38105c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12448x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12447w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12434i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12435j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12446u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        oy0 oy0Var = this.f12439n;
        float f14 = L;
        oy0Var.f38116p = f14;
        oy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        oy0 oy0Var2 = this.f12440o;
        oy0Var2.f38116p = f14;
        oy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12432f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12441p && !this.f12442q && this.f12429b != null && this.f12430c != null && this.f12443r != null) {
            this.f12442q = true;
            np.s1(this.f12428a).P1().g0(this.f12430c.intValue(), this.f12429b.longValue(), new ai.f0(this, 18));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12434i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12435j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
