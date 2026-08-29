package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public final class a extends c implements vd.b {
    public final vd.a d;
    public final int[] f5627e;
    public final Drawable f5628f;
    public final TextPaint h;
    public StaticLayout f5629n;
    public int f5630r;
    public int f5631s;

    public a(Context context, c6 c6Var) {
        super(c6Var);
        this.d = new vd.a(0, this, jr.h, 320L, false);
        this.f5627e = new int[]{16842910, 16842919};
        this.f5628f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(g6.P2);
        int v02 = g6.v0(g6.f23152i6, c6Var);
        if (this.f5644b != v02) {
            g6.B1(this.f5643a, v02, false);
            this.f5644b = v02;
        }
        b();
        c();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f5643a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f5628f;
        drawable.setAlpha((int) ((1.0f - this.d.f49505e) * this.f5645c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f49505e) * this.f5645c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f5643a.draw(canvas);
        r.b(canvas, this.f5628f, 1.0f - this.d.f49505e);
        if (this.f5629n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f5629n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f5631s != i10) {
            this.f5631s = i10;
            this.h.setColor(i10);
            this.f5628f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float dp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        r.d(this.f5628f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f5629n != null && this.f5630r == width) {
            return;
        }
        this.f5630r = width;
        this.f5629n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
