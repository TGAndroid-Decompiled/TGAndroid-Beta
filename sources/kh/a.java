package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import fe.e;
import fe.f;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import rf.o;
public final class a extends c implements e {
    public final fe.b d;
    public final int[] e;
    public final Drawable f11369f;
    public final TextPaint h;
    public StaticLayout f11370n;
    public int f11371r;
    public int f11372s;

    public a(Context context, p6 p6Var) {
        super(p6Var);
        this.d = new fe.b(0, this, gr.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f11369f = i0.a.f(context, 2131232487);
        this.h = new TextPaint(t6.P2);
        int w02 = t6.w0(t6.f21020i6, p6Var);
        if (this.f11384b != w02) {
            t6.H1(this.f11383a, w02, false);
            this.f11384b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f11383a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f11369f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f11385c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f11385c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f11383a.draw(canvas);
        o.b(canvas, this.f11369f, 1.0f - this.d.e);
        if (this.f11370n != null) {
            canvas.save();
            canvas.translate(i0.L(44.0f) + bounds.left, i0.L(13.66f) + bounds.top);
            this.f11370n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f11372s != i10) {
            this.f11372s = i10;
            this.h.setColor(i10);
            this.f11369f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = i0.L(22.33f) + rect.left;
        i0.L(27.0f);
        i0.L(44.0f);
        o.d(this.f11369f, L, exactCenterY, 17);
        int width = rect.width() - i0.L(56.0f);
        if (this.f11370n != null && this.f11371r == width) {
            return;
        }
        this.f11371r = width;
        this.f11370n = new StaticLayout(cd.L0(2131747199, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void v(int i10, float f7, float f10, f fVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
