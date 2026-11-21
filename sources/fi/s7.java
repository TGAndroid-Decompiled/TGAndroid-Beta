package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class s7 {
    public static CharSequence[] f12571y;
    public int f12572a;
    public Long f12573b;
    public Integer f12574c;
    public Integer d;
    public boolean f12575e;
    public TLRPC.Document f12577g;
    public SpannableStringBuilder f12580k;
    public String f12581l;
    public boolean f12582m;
    public xy0 f12583n;
    public xy0 f12584o;
    public boolean f12585p;
    public boolean f12586q;
    public View f12587r;
    public Runnable f12588s;
    public int f12592x;
    public boolean f12576f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, nr.h);
    public final mc f12578i = new mc((View) null);
    public final org.telegram.ui.Cells.y f12579j = org.telegram.ui.ActionBar.m6.a0(553648127, 0, 0);
    public final Paint f12589t = new Paint(1);
    public final Paint f12590u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12591w = new RectF();

    public static CharSequence d() {
        if (f12571y == null) {
            f12571y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12571y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(2131231188, 0);
            nqVar.c(org.telegram.messenger.g0.L(16.0f));
            nqVar.H = 1.0f;
            nqVar.f37946r = -org.telegram.messenger.g0.L(1.0f);
            nqVar.f37947s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12571y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f12571y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12583n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12580k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12577g;
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
            this.f12583n = new xy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12584o == null || this.f12582m) {
            String str2 = this.f12581l;
            if (str2 != null) {
                str = str2;
            }
            this.f12584o = new xy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12576f);
        Paint paint = this.f12589t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12583n.f42254c, this.f12584o.f42254c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12592x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12591w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12578i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12579j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12590u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        xy0 xy0Var = this.f12583n;
        float f14 = L;
        xy0Var.f42265p = f14;
        xy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        xy0 xy0Var2 = this.f12584o;
        xy0Var2.f42265p = f14;
        xy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12576f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12585p && !this.f12586q && this.f12573b != null && this.f12574c != null && this.f12587r != null) {
            this.f12586q = true;
            mp.u1(this.f12572a).R1().g0(this.f12574c.intValue(), this.f12573b.longValue(), new ai.h0(this, 19));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12578i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12579j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
