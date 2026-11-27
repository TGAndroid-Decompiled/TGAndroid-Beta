package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public final class wg8 extends lh8 implements s84 {
    public final fm0 d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public wg8(Context context, vnb vnbVar) {
        super(vnbVar);
        this.d = new fm0(0, this, k43.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f = c00.e(context, 2131232504);
        this.h = new TextPaint(aob.P2);
        int v0 = aob.v0(aob.i6, vnbVar);
        if (this.b != v0) {
            aob.F1(this.a, v0, false);
            this.b = v0;
        }
        b();
        c();
    }

    @Override
    public final void a(int i) {
        this.a.setAlpha(i);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void d(boolean z, boolean z2) {
        this.d.a(z, z2);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.a.draw(canvas);
        br3.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(hl.L(44.0f) + bounds.left, hl.L(13.66f) + bounds.top);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i) {
        if (this.s != i) {
            this.s = i;
            this.h.setColor(i);
            this.f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = hl.L(22.33f) + rect.left;
        hl.L(27.0f);
        br3.d(this.f, L, exactCenterY, 17);
        int width = rect.width() - hl.L(56.0f);
        if (this.n != null && this.r == width) {
            return;
        }
        this.r = width;
        this.n = new StaticLayout(ob6.M0(2131746911, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
