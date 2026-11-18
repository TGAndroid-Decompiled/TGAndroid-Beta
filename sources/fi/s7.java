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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.vy0;
public final class s7 {
    public static CharSequence[] f12533y;
    public int f12534a;
    public Long f12535b;
    public Integer f12536c;
    public Integer d;
    public boolean f12537e;
    public TLRPC.Document f12539g;
    public SpannableStringBuilder f12542k;
    public String f12543l;
    public boolean f12544m;
    public vy0 f12545n;
    public vy0 f12546o;
    public boolean f12547p;
    public boolean f12548q;
    public View f12549r;
    public Runnable f12550s;
    public int f12554x;
    public boolean f12538f = true;
    public final org.telegram.ui.Components.c6 h = new org.telegram.ui.Components.c6(0, 350, lr.h);
    public final mc f12540i = new mc((View) null);
    public final org.telegram.ui.Cells.y f12541j = org.telegram.ui.ActionBar.n6.a0(553648127, 0, 0);
    public final Paint f12551t = new Paint(1);
    public final Paint f12552u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12553w = new RectF();

    public static CharSequence d() {
        if (f12533y == null) {
            f12533y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12533y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            lq lqVar = new lq(2131231188, 0);
            lqVar.c(org.telegram.messenger.g0.L(16.0f));
            lqVar.H = 1.0f;
            lqVar.f37198r = -org.telegram.messenger.g0.L(1.0f);
            lqVar.f37199s = org.telegram.messenger.g0.L(1.0f);
            ((SpannableStringBuilder) f12533y[0]).setSpan(lqVar, 0, 1, 33);
        }
        return f12533y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface o4;
        String str = "";
        if (this.f12545n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12542k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12539g;
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
            this.f12545n = new vy0(spannableStringBuilder, f11, o4);
        }
        if (this.f12546o == null || this.f12544m) {
            String str2 = this.f12543l;
            if (str2 != null) {
                str = str2;
            }
            this.f12546o = new vy0(str, 14.0f, null);
        }
        float d = this.h.d(this.f12538f);
        Paint paint = this.f12551t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12545n.f41482c, this.f12546o.f41482c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.f12554x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f12 = min;
        RectF rectF = this.f12553w;
        rectF.set(0.0f, 0.0f, f12, W1);
        canvas.save();
        float a10 = this.f12540i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f12541j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.f12552u;
        paint2.setColor(-1);
        float f13 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f12 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        vy0 vy0Var = this.f12545n;
        float f14 = L;
        vy0Var.f41493p = f14;
        vy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        vy0 vy0Var2 = this.f12546o;
        vy0Var2.f41493p = f14;
        vy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12538f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c() {
        if (!this.f12547p && !this.f12548q && this.f12535b != null && this.f12536c != null && this.f12549r != null) {
            this.f12548q = true;
            mp.u1(this.f12534a).R1().g0(this.f12536c.intValue(), this.f12535b.longValue(), new ai.g0(this, 19));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12540i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f12541j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
