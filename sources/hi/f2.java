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
import di.ub;
import org.telegram.messenger.i20;
public final class f2 extends e2 {
    public Drawable f14262i;
    public Drawable f14263j;
    public StaticLayout f14264k;
    public float f14265l;
    public float f14266m;
    public Paint f14267n;
    public final ub f14268o;

    public f2(ub ubVar, int i7, int i10, String str) {
        super(ubVar);
        this.f14268o = ubVar;
        this.f14228a = i7;
        Drawable mutate = ubVar.getContext().getResources().getDrawable(i10).mutate();
        this.f14262i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) ubVar.f9564c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.g0.f23611q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14264k = staticLayout;
        this.f14265l = staticLayout.getLineCount() > 0 ? this.f14264k.getLineWidth(0) : 0.0f;
        this.f14266m = this.f14264k.getLineCount() > 0 ? this.f14264k.getLineLeft(0) : 0.0f;
        this.f14229b = org.telegram.messenger.g0.N(45.6f) + this.f14265l;
        this.f14230c = org.telegram.messenger.g0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f14232f;
        rectF.set(f10, f11, this.f14229b + f10, this.f14230c + f11);
        float a10 = this.f14233g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), (Paint) this.f14268o.f9563b);
        if (this.f14263j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i7 = 0;
        if (this.f14262i == null) {
            org.telegram.messenger.f6 f12 = org.telegram.messenger.j6.f(null);
            this.f14262i = f12;
            if (com.google.android.gms.internal.vision.e2.s(f12)) {
                f12.f23449a = false;
            }
        }
        if (this.f14262i != null) {
            float L = org.telegram.messenger.g0.L(24.0f) / 2;
            this.f14262i.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(18.0f)) - L), (int) (((this.f14230c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.g0.L(18.0f) + L), (int) ((this.f14230c / 2.0f) + rectF.top + L));
            this.f14262i.draw(canvas);
        }
        if (this.f14263j != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(18.55f), ((rectF.top + this.f14230c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.55f), rectF.left + org.telegram.messenger.g0.L(29.45f), rectF.left + org.telegram.messenger.g0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f14267n);
            this.f14263j.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(18.0f)), (int) (((rectF.top + this.f14230c) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(30.0f)), (int) ((rectF.top + this.f14230c) - org.telegram.messenger.g0.L(5.0f)));
            this.f14263j.draw(canvas);
            canvas.restore();
        }
        float f13 = rectF.left;
        if (this.f14262i != null) {
            i7 = 28;
        }
        i20.j(this.f14264k.getHeight(), 2.0f, (this.f14230c / 2.0f) + rectF.top, (f13 + org.telegram.messenger.g0.L(i7 + 6)) - this.f14266m, canvas);
        this.f14264k.draw(canvas);
        canvas.restore();
    }

    public f2(ub ubVar, CharSequence charSequence) {
        super(ubVar);
        this.f14268o = ubVar;
        this.f14228a = 5;
        TextPaint textPaint = (TextPaint) ubVar.f9564c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.g0.f23611q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f14264k = staticLayout;
        this.f14265l = staticLayout.getLineCount() > 0 ? this.f14264k.getLineWidth(0) : 0.0f;
        this.f14266m = this.f14264k.getLineCount() > 0 ? this.f14264k.getLineLeft(0) : 0.0f;
        this.f14229b = org.telegram.messenger.g0.N(12.0f) + this.f14265l;
        this.f14230c = org.telegram.messenger.g0.N(36.0f);
    }
}
