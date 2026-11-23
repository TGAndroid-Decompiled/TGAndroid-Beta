package hi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import di.yb;
import org.telegram.messenger.o10;
public final class f2 extends e2 {
    public Drawable f14630i;
    public Drawable f14631j;
    public StaticLayout f14632k;
    public float f14633l;
    public float f14634m;
    public Paint f14635n;
    public final yb f14636o;

    public f2(yb ybVar, int i7, int i10, String str) {
        super(ybVar);
        this.f14636o = ybVar;
        this.f14586a = i7;
        Drawable mutate = ybVar.getContext().getResources().getDrawable(i10).mutate();
        this.f14630i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ybVar.f10120c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f24046q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14632k = staticLayout;
        this.f14633l = staticLayout.getLineCount() > 0 ? this.f14632k.getLineWidth(0) : 0.0f;
        this.f14634m = this.f14632k.getLineCount() > 0 ? this.f14632k.getLineLeft(0) : 0.0f;
        this.f14587b = org.telegram.messenger.g0.N(45.6f) + this.f14633l;
        this.f14588c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f14590f;
        rectF.set(f10, f11, this.f14587b + f10, this.f14588c + f11);
        float a10 = this.f14591g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f14636o.f10119b);
        if (this.f14631j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f14630i == null) {
            org.telegram.messenger.f6 f12 = org.telegram.messenger.j6.f(null);
            this.f14630i = f12;
            if (com.google.android.gms.internal.vision.e2.s(f12)) {
                f12.f23871a = false;
            }
        }
        if (this.f14630i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f14630i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f14588c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f14588c / 2.0f) + rectF.top + L));
            this.f14630i.draw(canvas);
        }
        if (this.f14631j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f14588c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f14635n);
            this.f14631j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f14588c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f14588c) - org.telegram.messenger.g0.L(5.0f)));
            this.f14631j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f14630i != null) {
            i7 = 28;
        }
        o10.k(this.f14632k.getHeight(), 2.0f, (this.f14588c / 2.0f) + rectF.top, (f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f14634m, canvas);
        this.f14632k.draw(canvas);
        canvas.restore();
    }

    public f2(yb ybVar, CharSequence charSequence) {
        super(ybVar);
        this.f14636o = ybVar;
        this.f14586a = 5;
        TextPaint textPaint = (TextPaint) ybVar.f10120c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f24046q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14632k = staticLayout;
        this.f14633l = staticLayout.getLineCount() > 0 ? this.f14632k.getLineWidth(0) : 0.0f;
        this.f14634m = this.f14632k.getLineCount() > 0 ? this.f14632k.getLineLeft(0) : 0.0f;
        this.f14587b = org.telegram.messenger.g0.N(12.0f) + this.f14633l;
        this.f14588c = org.telegram.messenger.g0.N(36.0f);
    }
}
