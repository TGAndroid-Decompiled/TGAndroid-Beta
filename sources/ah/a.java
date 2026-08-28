package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import ff.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
public final class a extends c implements td.b {
    public final td.a d;
    public final int[] f242e;
    public final Drawable f243f;
    public final TextPaint h;
    public StaticLayout f244n;
    public int f245r;
    public int f246s;

    public a(Context context, b6 b6Var) {
        super(b6Var);
        this.d = new td.a(0, this, gr.h, 320L, false);
        this.f242e = new int[]{16842910, 16842919};
        this.f243f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(f6.P2);
        int v02 = f6.v0(f6.f23092i6, b6Var);
        if (this.f259b != v02) {
            f6.B1(this.f258a, v02, false);
            this.f259b = v02;
        }
        b();
        c();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i9) {
        this.f258a.setAlpha(i9);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f243f;
        drawable.setAlpha((int) ((1.0f - this.d.f47775e) * this.f260c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f47775e) * this.f260c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f258a.draw(canvas);
        s.b(canvas, this.f243f, 1.0f - this.d.f47775e);
        if (this.f244n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f244n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i9) {
        if (this.f246s != i9) {
            this.f246s = i9;
            this.h.setColor(i9);
            this.f243f.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
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
        s.d(this.f243f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f244n != null && this.f245r == width) {
            return;
        }
        this.f245r = width;
        this.f244n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
