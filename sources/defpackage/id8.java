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
public final class id8 extends xd8 implements x74 {
    public final fm0 d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public id8(Context context, wjb wjbVar) {
        super(wjbVar);
        this.d = new fm0(0, this, s33.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f = b00.d(context, 2131232493);
        this.h = new TextPaint(bkb.O2);
        int v0 = bkb.v0(bkb.h6, wjbVar);
        if (this.b != v0) {
            bkb.F1(this.a, v0, false);
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
        kq3.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(gl.L(44.0f) + bounds.left, gl.L(13.66f) + bounds.top);
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
        float L = gl.L(22.33f) + rect.left;
        gl.L(27.0f);
        kq3.d(this.f, L, exactCenterY, 17);
        int width = rect.width() - gl.L(56.0f);
        if (this.n != null && this.r == width) {
            return;
        }
        this.r = width;
        this.n = new StaticLayout(k96.M0(2131746991, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void D(float f, int i) {
    }
}
