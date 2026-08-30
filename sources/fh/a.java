package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class a extends c implements xd.b {
    public final xd.a d;
    public final int[] e;
    public final Drawable f6191f;
    public final TextPaint h;
    public StaticLayout f6192n;
    public int f6193r;
    public int f6194s;

    public a(Context context, f6 f6Var) {
        super(f6Var);
        this.d = new xd.a(0, this, nr.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f6191f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(j6.P2);
        int v02 = j6.v0(j6.f19996i6, f6Var);
        if (this.f6206b != v02) {
            j6.B1(this.f6205a, v02, false);
            this.f6206b = v02;
        }
        b();
        c();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f6205a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f6191f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f6207c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f6207c));
    }

    public final void d(boolean z4, boolean z10) {
        this.d.a(z4, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f6205a.draw(canvas);
        r.b(canvas, this.f6191f, 1.0f - this.d.e);
        if (this.f6192n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f6192n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f6194s != i10) {
            this.f6194s = i10;
            this.h.setColor(i10);
            this.f6191f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        r.d(this.f6191f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f6192n != null && this.f6193r == width) {
            return;
        }
        this.f6193r = width;
        this.f6192n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
