package gh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class a extends c implements xd.b {
    public final xd.a d;
    public final int[] f7124e;
    public final Drawable f7125f;
    public final TextPaint h;
    public StaticLayout f7126n;
    public int f7127r;
    public int f7128s;

    public a(Context context, g6 g6Var) {
        super(g6Var);
        this.d = new xd.a(0, this, pr.h, 320L, false);
        this.f7124e = new int[]{16842910, 16842919};
        this.f7125f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(k6.P2);
        int v02 = k6.v0(k6.f21750i6, g6Var);
        if (this.f7141b != v02) {
            k6.B1(this.f7140a, v02, false);
            this.f7141b = v02;
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
        this.f7140a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f7125f;
        drawable.setAlpha((int) ((1.0f - this.d.f50504e) * this.f7142c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f50504e) * this.f7142c));
    }

    public final void d(boolean z4, boolean z10) {
        this.d.a(z4, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f7140a.draw(canvas);
        r.b(canvas, this.f7125f, 1.0f - this.d.f50504e);
        if (this.f7126n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f7126n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f7128s != i10) {
            this.f7128s = i10;
            this.h.setColor(i10);
            this.f7125f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        r.d(this.f7125f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f7126n != null && this.f7127r == width) {
            return;
        }
        this.f7127r = width;
        this.f7126n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
