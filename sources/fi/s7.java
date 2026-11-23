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
    public static CharSequence[] f12525y;
    public int f12526a;
    public Long f12527b;
    public Integer f12528c;
    public Integer d;
    public boolean f12529e;
    public TLRPC.Document f12531g;
    public SpannableStringBuilder f12534k;
    public String f12535l;
    public boolean f12536m;
    public xy0 f12537n;
    public xy0 f12538o;
    public boolean f12539p;
    public boolean f12540q;
    public View f12541r;
    public Runnable f12542s;
    public int f12546x;
    public boolean f12530f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, nr.h);
    public final mc f12532i = new mc((View) null);
    public final org.telegram.ui.Cells.y f12533j = org.telegram.ui.ActionBar.m6.a0(553648127, 0, 0);
    public final Paint f12543t = new Paint(1);
    public final Paint f12544u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12545w = new RectF();

    public static CharSequence d() {
        if (f12525y == null) {
            f12525y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12525y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(2131231188, 0);
            nqVar.c(org.telegram.messenger.g0.L(16.0f));
            nqVar.H = 1.0f;
            nqVar.f37907r = -org.telegram.messenger.g0.L(1.0f);
            nqVar.f37908s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12525y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f12525y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12537n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12534k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12531g;
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
            this.f12537n = new xy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12538o == null || this.f12536m) {
            String str2 = this.f12535l;
            if (str2 != null) {
                str = str2;
            }
            this.f12538o = new xy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12530f);
        Paint paint = this.f12543t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12537n.f42224c, this.f12538o.f42224c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12546x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12545w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12532i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12533j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12544u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        xy0 xy0Var = this.f12537n;
        float f14 = L;
        xy0Var.f42235p = f14;
        xy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        xy0 xy0Var2 = this.f12538o;
        xy0Var2.f42235p = f14;
        xy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12530f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12539p && !this.f12540q && this.f12527b != null && this.f12528c != null && this.f12541r != null) {
            this.f12540q = true;
            np.u1(this.f12526a).R1().g0(this.f12528c.intValue(), this.f12527b.longValue(), new ai.c0(this, 19));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12532i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12533j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
