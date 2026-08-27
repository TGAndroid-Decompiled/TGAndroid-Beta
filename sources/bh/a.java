package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import gf.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

public final class a extends c implements ud.b {
    public final ud.a d;

    public final int[] f2166e;

    public final Drawable f2167f;
    public final TextPaint h;

    public StaticLayout f2168n;

    public int f2169r;

    public int f2170s;

    public a(Context context, c6 c6Var) {
        super(c6Var);
        this.d = new ud.a(0, this, er.h, 320L, false);
        this.f2166e = new int[]{16842910, 16842919};
        this.f2167f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(g6.P2);
        int iV0 = g6.v0(g6.f23144i6, c6Var);
        if (this.f2183b != iV0) {
            g6.B1(this.f2182a, iV0, false);
            this.f2183b = iV0;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f2182a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        this.f2167f.setAlpha((int) ((1.0f - this.d.f48497e) * this.f2184c));
    }

    public final void c() {
        this.h.setAlpha((int) ((1.0f - this.d.f48497e) * this.f2184c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f2182a.draw(canvas);
        s.b(canvas, this.f2167f, 1.0f - this.d.f48497e);
        if (this.f2168n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f2168n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f2170s != i10) {
            this.f2170s = i10;
            this.h.setColor(i10);
            this.f2167f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fExactCenterY = rect.exactCenterY();
        float fDp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        s.d(this.f2167f, fDp, fExactCenterY, 17);
        int iWidth = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f2168n == null || this.f2169r != iWidth) {
            this.f2169r = iWidth;
            this.f2168n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
