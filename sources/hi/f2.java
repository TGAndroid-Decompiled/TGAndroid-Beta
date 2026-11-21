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
import org.telegram.messenger.n10;
public final class f2 extends e2 {
    public Drawable f14627i;
    public Drawable f14628j;
    public StaticLayout f14629k;
    public float f14630l;
    public float f14631m;
    public Paint f14632n;
    public final yb f14633o;

    public f2(yb ybVar, int i7, int i10, String str) {
        super(ybVar);
        this.f14633o = ybVar;
        this.f14583a = i7;
        Drawable mutate = ybVar.getContext().getResources().getDrawable(i10).mutate();
        this.f14627i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ybVar.f10117c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f24146q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14629k = staticLayout;
        this.f14630l = staticLayout.getLineCount() > 0 ? this.f14629k.getLineWidth(0) : 0.0f;
        this.f14631m = this.f14629k.getLineCount() > 0 ? this.f14629k.getLineLeft(0) : 0.0f;
        this.f14584b = org.telegram.messenger.g0.N(45.6f) + this.f14630l;
        this.f14585c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f14587f;
        rectF.set(f10, f11, this.f14584b + f10, this.f14585c + f11);
        float a10 = this.f14588g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f14633o.f10116b);
        if (this.f14628j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f14627i == null) {
            org.telegram.messenger.f6 f12 = org.telegram.messenger.j6.f(null);
            this.f14627i = f12;
            if (com.google.android.gms.internal.vision.e2.s(f12)) {
                f12.f23876a = false;
            }
        }
        if (this.f14627i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f14627i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f14585c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f14585c / 2.0f) + rectF.top + L));
            this.f14627i.draw(canvas);
        }
        if (this.f14628j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f14585c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f14632n);
            this.f14628j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f14585c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f14585c) - org.telegram.messenger.g0.L(5.0f)));
            this.f14628j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f14627i != null) {
            i7 = 28;
        }
        n10.k(this.f14629k.getHeight(), 2.0f, (this.f14585c / 2.0f) + rectF.top, (f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f14631m, canvas);
        this.f14629k.draw(canvas);
        canvas.restore();
    }

    public f2(yb ybVar, CharSequence charSequence) {
        super(ybVar);
        this.f14633o = ybVar;
        this.f14583a = 5;
        TextPaint textPaint = (TextPaint) ybVar.f10117c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f24146q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14629k = staticLayout;
        this.f14630l = staticLayout.getLineCount() > 0 ? this.f14629k.getLineWidth(0) : 0.0f;
        this.f14631m = this.f14629k.getLineCount() > 0 ? this.f14629k.getLineLeft(0) : 0.0f;
        this.f14584b = org.telegram.messenger.g0.N(12.0f) + this.f14630l;
        this.f14585c = org.telegram.messenger.g0.N(36.0f);
    }
}
