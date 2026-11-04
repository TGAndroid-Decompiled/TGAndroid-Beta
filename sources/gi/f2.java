package gi;

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
import ci.fc;
public final class f2 extends e2 {
    public Drawable f12686i;
    public Drawable f12687j;
    public StaticLayout f12688k;
    public float f12689l;
    public float f12690m;
    public Paint f12691n;
    public final fc f12692o;

    public f2(fc fcVar, int i3, int i10, String str) {
        super(fcVar);
        this.f12692o = fcVar;
        this.f12651a = i3;
        Drawable mutate = fcVar.getContext().getResources().getDrawable(i10).mutate();
        this.f12686i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) fcVar.f5142c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f22608q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12688k = staticLayout;
        this.f12689l = staticLayout.getLineCount() > 0 ? this.f12688k.getLineWidth(0) : 0.0f;
        this.f12690m = this.f12688k.getLineCount() > 0 ? this.f12688k.getLineLeft(0) : 0.0f;
        this.f12652b = org.telegram.messenger.g0.N(45.6f) + this.f12689l;
        this.f12653c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f12655f;
        rectF.set(f10, f11, this.f12652b + f10, this.f12653c + f11);
        float a10 = this.f12656g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f12692o.f5141b);
        if (this.f12687j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i3 = 0;
        if (this.f12686i == null) {
            org.telegram.messenger.e6 f12 = org.telegram.messenger.i6.f(null);
            this.f12686i = f12;
            if (com.google.android.recaptcha.internal.a.u(f12)) {
                f12.f22319a = false;
            }
        }
        if (this.f12686i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f12686i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f12653c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f12653c / 2.0f) + rectF.top + L));
            this.f12686i.draw(canvas);
        }
        if (this.f12687j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f12653c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f12691n);
            this.f12687j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f12653c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f12653c) - org.telegram.messenger.g0.L(5.0f)));
            this.f12687j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f12686i != null) {
            i3 = 28;
        }
        canvas.translate((f13 + org.telegram.messenger.g0.L(i3 + 6)) - this.f12690m, ((this.f12653c / 2.0f) + rectF.top) - (this.f12688k.getHeight() / 2.0f));
        this.f12688k.draw(canvas);
        canvas.restore();
    }

    public f2(fc fcVar, CharSequence charSequence) {
        super(fcVar);
        this.f12692o = fcVar;
        this.f12651a = 5;
        TextPaint textPaint = (TextPaint) fcVar.f5142c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f22608q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12688k = staticLayout;
        this.f12689l = staticLayout.getLineCount() > 0 ? this.f12688k.getLineWidth(0) : 0.0f;
        this.f12690m = this.f12688k.getLineCount() > 0 ? this.f12688k.getLineLeft(0) : 0.0f;
        this.f12652b = org.telegram.messenger.g0.N(12.0f) + this.f12689l;
        this.f12653c = org.telegram.messenger.g0.N(36.0f);
    }
}
