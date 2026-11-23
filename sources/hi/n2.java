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
import org.telegram.messenger.m10;
public final class n2 extends m2 {
    public Drawable f14999i;
    public Drawable f15000j;
    public StaticLayout f15001k;
    public float f15002l;
    public float f15003m;
    public Paint f15004n;
    public final p2 f15005o;

    public n2(p2 p2Var, int i7, int i10, String str) {
        super(p2Var);
        this.f15005o = p2Var;
        this.f14880a = i7;
        Drawable mutate = p2Var.getContext().getResources().getDrawable(i10).mutate();
        this.f14999i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = p2Var.f15177b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f24226q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15001k = staticLayout;
        this.f15002l = staticLayout.getLineCount() > 0 ? this.f15001k.getLineWidth(0) : 0.0f;
        this.f15003m = this.f15001k.getLineCount() > 0 ? this.f15001k.getLineLeft(0) : 0.0f;
        this.f14881b = org.telegram.messenger.g0.N(45.6f) + this.f15002l;
        this.f14882c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f14884f;
        rectF.set(f10, f11, this.f14881b + f10, this.f14882c + f11);
        float a10 = this.f14885g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f15005o.f15176a);
        if (this.f15000j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f14999i == null) {
            org.telegram.messenger.f6 f12 = org.telegram.messenger.j6.f(null);
            this.f14999i = f12;
            if (com.google.android.gms.internal.vision.e2.s(f12)) {
                f12.f23959a = false;
            }
        }
        if (this.f14999i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f14999i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f14882c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f14882c / 2.0f) + rectF.top + L));
            this.f14999i.draw(canvas);
        }
        if (this.f15000j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f14882c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f15004n);
            this.f15000j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f14882c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f14882c) - org.telegram.messenger.g0.L(5.0f)));
            this.f15000j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f14999i != null) {
            i7 = 28;
        }
        m10.k(this.f15001k.getHeight(), 2.0f, (this.f14882c / 2.0f) + rectF.top, (f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f15003m, canvas);
        this.f15001k.draw(canvas);
        canvas.restore();
    }

    public n2(p2 p2Var, CharSequence charSequence) {
        super(p2Var);
        this.f15005o = p2Var;
        this.f14880a = 5;
        TextPaint textPaint = p2Var.f15177b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f24226q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15001k = staticLayout;
        this.f15002l = staticLayout.getLineCount() > 0 ? this.f15001k.getLineWidth(0) : 0.0f;
        this.f15003m = this.f15001k.getLineCount() > 0 ? this.f15001k.getLineLeft(0) : 0.0f;
        this.f14881b = org.telegram.messenger.g0.N(12.0f) + this.f15002l;
        this.f14882c = org.telegram.messenger.g0.N(36.0f);
    }
}
