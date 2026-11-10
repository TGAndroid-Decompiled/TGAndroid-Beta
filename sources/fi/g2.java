package fi;

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
import bi.nd;
public final class g2 extends f2 {
    public Drawable f12060i;
    public Drawable f12061j;
    public StaticLayout f12062k;
    public float f12063l;
    public float f12064m;
    public Paint f12065n;
    public final nd f12066o;

    public g2(nd ndVar, int i7, int i10, String str) {
        super(ndVar);
        this.f12066o = ndVar;
        this.f11953a = i7;
        Drawable mutate = ndVar.getContext().getResources().getDrawable(i10).mutate();
        this.f12060i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ndVar.f4439c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f22567q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12062k = staticLayout;
        this.f12063l = staticLayout.getLineCount() > 0 ? this.f12062k.getLineWidth(0) : 0.0f;
        this.f12064m = this.f12062k.getLineCount() > 0 ? this.f12062k.getLineLeft(0) : 0.0f;
        this.f11954b = org.telegram.messenger.g0.N(45.6f) + this.f12063l;
        this.f11955c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f11957f;
        rectF.set(f10, f11, this.f11954b + f10, this.f11955c + f11);
        float a10 = this.f11958g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f12066o.f4438b);
        if (this.f12061j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f12060i == null) {
            org.telegram.messenger.e6 f12 = org.telegram.messenger.i6.f(null);
            this.f12060i = f12;
            if (com.google.android.recaptcha.internal.a.u(f12)) {
                f12.f22195a = false;
            }
        }
        if (this.f12060i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f12060i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f11955c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f11955c / 2.0f) + rectF.top + L));
            this.f12060i.draw(canvas);
        }
        if (this.f12061j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f11955c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f12065n);
            this.f12061j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f11955c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f11955c) - org.telegram.messenger.g0.L(5.0f)));
            this.f12061j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f12060i != null) {
            i7 = 28;
        }
        canvas.translate((f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f12064m, ((this.f11955c / 2.0f) + rectF.top) - (this.f12062k.getHeight() / 2.0f));
        this.f12062k.draw(canvas);
        canvas.restore();
    }

    public g2(nd ndVar, CharSequence charSequence) {
        super(ndVar);
        this.f12066o = ndVar;
        this.f11953a = 5;
        TextPaint textPaint = (TextPaint) ndVar.f4439c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f22567q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12062k = staticLayout;
        this.f12063l = staticLayout.getLineCount() > 0 ? this.f12062k.getLineWidth(0) : 0.0f;
        this.f12064m = this.f12062k.getLineCount() > 0 ? this.f12062k.getLineLeft(0) : 0.0f;
        this.f11954b = org.telegram.messenger.g0.N(12.0f) + this.f12063l;
        this.f11955c = org.telegram.messenger.g0.N(36.0f);
    }
}
