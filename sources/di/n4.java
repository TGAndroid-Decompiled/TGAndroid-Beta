package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xj0;
public final class n4 {
    public final Paint f8817a;
    public final Paint f8818b;
    public final Paint f8819c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f8820f;
    public final aa.m0 f8821g = new aa.m0(6);
    public final RectF h = new RectF();
    public final RectF f8822i = new RectF();
    public final RectF f8823j = new RectF();
    public final RectF f8824k;
    public final Paint f8825l;
    public final Drawable f8826m;
    public final Drawable f8827n;
    public final Drawable f8828o;
    public final Drawable f8829p;
    public final Drawable f8830q;
    public final Drawable f8831r;
    public final Drawable f8832s;
    public final xj0 f8833t;
    public final xj0 f8834u;

    public n4(Context context) {
        new RectF();
        this.f8824k = new RectF();
        this.f8825l = new Paint();
        this.f8826m = context.getDrawable(R.drawable.media_share);
        this.f8828o = context.getDrawable(R.drawable.media_like);
        this.f8827n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f8829p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f8830q = context.getDrawable(R.drawable.media_more);
        this.f8831r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f8832s = context.getDrawable(R.drawable.msg_delete);
        this.f8834u = new xj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        xj0 xj0Var = new xj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f8833t = xj0Var;
        xj0Var.N(20, false, true);
        xj0Var.stop();
        Paint paint = new Paint(1);
        this.f8817a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f8818b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f8819c = paint3;
        paint3.setColor(o10);
        this.f8820f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        xj0 xj0Var = this.f8834u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            xj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            xj0Var.P(i11);
        } else if (z10) {
            if (xj0Var.f34733a0 > 20) {
                xj0Var.N(0, false, false);
            }
            xj0Var.P(20);
            xj0Var.start();
        } else {
            int i12 = xj0Var.f34733a0;
            if (i12 != 0 && i12 < 43) {
                xj0Var.P(43);
                xj0Var.start();
            }
        }
    }
}
