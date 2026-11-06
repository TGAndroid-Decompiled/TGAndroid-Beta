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
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class c8 {
    public static CharSequence[] f8878y;
    public int f8879a;
    public Long f8880b;
    public Integer f8881c;
    public Integer d;
    public boolean f8882e;
    public TLRPC.Document f8884g;
    public SpannableStringBuilder f8887k;
    public String f8888l;
    public boolean f8889m;
    public my0 f8890n;
    public my0 f8891o;
    public boolean f8892p;
    public boolean f8893q;
    public View f8894r;
    public Runnable f8895s;
    public int f8899x;
    public boolean f8883f = true;
    public final org.telegram.ui.Components.w5 h = new org.telegram.ui.Components.w5(0, 350, xq.h);
    public final ic f8885i = new ic((View) null);
    public final org.telegram.ui.Cells.y f8886j = org.telegram.ui.ActionBar.k6.a0(553648127, 0, 0);
    public final Paint f8896t = new Paint(1);
    public final Paint f8897u = new Paint(1);
    public final Path v = new Path();
    public final RectF f8898w = new RectF();

    public static CharSequence d() {
        if (f8878y == null) {
            f8878y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f8878y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            wp wpVar = new wp(2131231188, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            wpVar.G = 1.0f;
            wpVar.f40070r = -org.telegram.messenger.g0.L(1.0f);
            wpVar.f40071s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f8878y[0]).setSpan(wpVar, 0, 1, 33);
        }
        return f8878y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f8890n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f8887k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f8884g;
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
            this.f8890n = new my0(spannableStringBuilder, f11, o4);
        }
        if (this.f8891o == null || this.f8889m) {
            String str2 = this.f8888l;
            if (str2 != null) {
                str = str2;
            }
            this.f8891o = new my0(str, 14.0f, null);
        }
        float d = this.h.d(this.f8883f);
        Paint paint = this.f8896t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f8890n.f36125c, this.f8891o.f36125c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f8899x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f8898w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f8885i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f8886j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f8897u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        my0 my0Var = this.f8890n;
        float f14 = L;
        my0Var.f36136p = f14;
        my0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        my0 my0Var2 = this.f8891o;
        my0Var2.f36136p = f14;
        my0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f8883f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f8892p && !this.f8893q && this.f8880b != null && this.f8881c != null && this.f8894r != null) {
            this.f8893q = true;
            qp.s1(this.f8879a).P1().g0(this.f8881c.intValue(), this.f8880b.longValue(), new ai.i(this, 14));
        }
    }

    public final void e(float f10, float f11, boolean z9) {
        this.f8885i.c(z9);
        int[] iArr = z9 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f8886j;
        yVar.setState(iArr);
        if (z9) {
            yVar.setHotspot(f10, f11);
        }
    }
}
