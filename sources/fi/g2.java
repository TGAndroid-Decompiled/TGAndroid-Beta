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
    public Drawable f12056i;
    public Drawable f12057j;
    public StaticLayout f12058k;
    public float f12059l;
    public float f12060m;
    public Paint f12061n;
    public final nd f12062o;

    public g2(nd ndVar, int i7, int i10, String str) {
        super(ndVar);
        this.f12062o = ndVar;
        this.f11949a = i7;
        Drawable mutate = ndVar.getContext().getResources().getDrawable(i10).mutate();
        this.f12056i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ndVar.f4439c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f22563q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12058k = staticLayout;
        this.f12059l = staticLayout.getLineCount() > 0 ? this.f12058k.getLineWidth(0) : 0.0f;
        this.f12060m = this.f12058k.getLineCount() > 0 ? this.f12058k.getLineLeft(0) : 0.0f;
        this.f11950b = org.telegram.messenger.g0.N(45.6f) + this.f12059l;
        this.f11951c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f11953f;
        rectF.set(f10, f11, this.f11950b + f10, this.f11951c + f11);
        float a10 = this.f11954g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f12062o.f4438b);
        if (this.f12057j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f12056i == null) {
            org.telegram.messenger.e6 f12 = org.telegram.messenger.i6.f(null);
            this.f12056i = f12;
            if (com.google.android.recaptcha.internal.a.u(f12)) {
                f12.f22191a = false;
            }
        }
        if (this.f12056i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f12056i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f11951c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f11951c / 2.0f) + rectF.top + L));
            this.f12056i.draw(canvas);
        }
        if (this.f12057j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f11951c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f12061n);
            this.f12057j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f11951c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f11951c) - org.telegram.messenger.g0.L(5.0f)));
            this.f12057j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f12056i != null) {
            i7 = 28;
        }
        canvas.translate((f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f12060m, ((this.f11951c / 2.0f) + rectF.top) - (this.f12058k.getHeight() / 2.0f));
        this.f12058k.draw(canvas);
        canvas.restore();
    }

    public g2(nd ndVar, CharSequence charSequence) {
        super(ndVar);
        this.f12062o = ndVar;
        this.f11949a = 5;
        TextPaint textPaint = (TextPaint) ndVar.f4439c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f22563q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12058k = staticLayout;
        this.f12059l = staticLayout.getLineCount() > 0 ? this.f12058k.getLineWidth(0) : 0.0f;
        this.f12060m = this.f12058k.getLineCount() > 0 ? this.f12058k.getLineLeft(0) : 0.0f;
        this.f11950b = org.telegram.messenger.g0.N(12.0f) + this.f12059l;
        this.f11951c = org.telegram.messenger.g0.N(36.0f);
    }
}
