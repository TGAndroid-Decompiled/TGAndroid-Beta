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
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wy0;
public final class s7 {
    public static CharSequence[] f12536y;
    public int f12537a;
    public Long f12538b;
    public Integer f12539c;
    public Integer d;
    public boolean f12540e;
    public TLRPC.Document f12542g;
    public SpannableStringBuilder f12545k;
    public String f12546l;
    public boolean f12547m;
    public wy0 f12548n;
    public wy0 f12549o;
    public boolean f12550p;
    public boolean f12551q;
    public View f12552r;
    public Runnable f12553s;
    public int f12557x;
    public boolean f12541f = true;
    public final org.telegram.ui.Components.c6 h = new org.telegram.ui.Components.c6(0, 350, kr.h);
    public final lc f12543i = new lc((View) null);
    public final org.telegram.ui.Cells.y f12544j = org.telegram.ui.ActionBar.n6.a0(553648127, 0, 0);
    public final Paint f12554t = new Paint(1);
    public final Paint f12555u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12556w = new RectF();

    public static CharSequence d() {
        if (f12536y == null) {
            f12536y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12536y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            kq kqVar = new kq(2131231191, 0);
            kqVar.c(org.telegram.messenger.g0.L(16.0f));
            kqVar.H = 1.0f;
            kqVar.f36853r = -org.telegram.messenger.g0.L(1.0f);
            kqVar.f36854s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12536y[0]).setSpan(kqVar, 0, 1, 33);
        }
        return f12536y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12548n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12545k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12542g;
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
            this.f12548n = new wy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12549o == null || this.f12547m) {
            String str2 = this.f12546l;
            if (str2 != null) {
                str = str2;
            }
            this.f12549o = new wy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12541f);
        Paint paint = this.f12554t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12548n.f41763c, this.f12549o.f41763c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12557x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12556w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12543i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12544j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12555u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        wy0 wy0Var = this.f12548n;
        float f14 = L;
        wy0Var.f41774p = f14;
        wy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        wy0 wy0Var2 = this.f12549o;
        wy0Var2.f41774p = f14;
        wy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12541f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12550p && !this.f12551q && this.f12538b != null && this.f12539c != null && this.f12552r != null) {
            this.f12551q = true;
            mp.u1(this.f12537a).R1().g0(this.f12539c.intValue(), this.f12538b.longValue(), new ai.d0(this, 19));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12543i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12544j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
