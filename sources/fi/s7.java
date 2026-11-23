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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class s7 {
    public static CharSequence[] f12574y;
    public int f12575a;
    public Long f12576b;
    public Integer f12577c;
    public Integer d;
    public boolean f12578e;
    public TLRPC.Document f12580g;
    public SpannableStringBuilder f12583k;
    public String f12584l;
    public boolean f12585m;
    public xy0 f12586n;
    public xy0 f12587o;
    public boolean f12588p;
    public boolean f12589q;
    public View f12590r;
    public Runnable f12591s;
    public int f12595x;
    public boolean f12579f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, nr.h);
    public final mc f12581i = new mc((View) null);
    public final org.telegram.ui.Cells.y f12582j = org.telegram.ui.ActionBar.m6.a0(553648127, 0, 0);
    public final Paint f12592t = new Paint(1);
    public final Paint f12593u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12594w = new RectF();

    public static CharSequence d() {
        if (f12574y == null) {
            f12574y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12574y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(2131231188, 0);
            nqVar.c(org.telegram.messenger.g0.L(16.0f));
            nqVar.H = 1.0f;
            nqVar.f37951r = -org.telegram.messenger.g0.L(1.0f);
            nqVar.f37952s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12574y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f12574y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12586n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12583k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12580g;
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
            this.f12586n = new xy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12587o == null || this.f12585m) {
            String str2 = this.f12584l;
            if (str2 != null) {
                str = str2;
            }
            this.f12587o = new xy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12579f);
        Paint paint = this.f12592t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12586n.f42247c, this.f12587o.f42247c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12595x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12594w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12581i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12582j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12593u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        xy0 xy0Var = this.f12586n;
        float f14 = L;
        xy0Var.f42258p = f14;
        xy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        xy0 xy0Var2 = this.f12587o;
        xy0Var2.f42258p = f14;
        xy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12579f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12588p && !this.f12589q && this.f12576b != null && this.f12577c != null && this.f12590r != null) {
            this.f12589q = true;
            np.u1(this.f12575a).R1().g0(this.f12577c.intValue(), this.f12576b.longValue(), new ai.h0(this, 19));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12581i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12582j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
