package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ij0;
public final class c4 {
    public final Paint f16917a;
    public final Paint f16918b;
    public final Paint f16919c;
    public final Drawable d;
    public final Drawable f16920e;
    public final ColorDrawable f16921f;
    public final a9.a f16922g = new a9.a(9);
    public final RectF h = new RectF();
    public final RectF f16923i = new RectF();
    public final RectF f16924j = new RectF();
    public final RectF f16925k;
    public final Paint f16926l;
    public final Drawable f16927m;
    public final Drawable f16928n;
    public final Drawable f16929o;
    public final Drawable f16930p;
    public final Drawable f16931q;
    public final Drawable f16932r;
    public final Drawable f16933s;
    public final ij0 f16934t;
    public final ij0 f16935u;

    public c4(Context context) {
        new RectF();
        this.f16925k = new RectF();
        this.f16926l = new Paint();
        this.f16927m = context.getDrawable(R.drawable.media_share);
        this.f16929o = context.getDrawable(R.drawable.media_like);
        this.f16928n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f16930p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f16931q = context.getDrawable(R.drawable.media_more);
        this.f16932r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f16933s = context.getDrawable(R.drawable.msg_delete);
        this.f16935u = new ij0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        ij0 ij0Var = new ij0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f16934t = ij0Var;
        ij0Var.L(20, false, true);
        ij0Var.stop();
        Paint paint = new Paint(1);
        this.f16917a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f16918b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f16920e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f16919c = paint3;
        paint3.setColor(k10);
        this.f16921f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        int i11 = 20;
        ij0 ij0Var = this.f16935u;
        if (!z10) {
            if (z4) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            ij0Var.L(i10, false, false);
            if (!z4) {
                i11 = 0;
            }
            ij0Var.N(i11);
        } else if (z4) {
            if (ij0Var.Y > 20) {
                ij0Var.L(0, false, false);
            }
            ij0Var.N(20);
            ij0Var.start();
        } else {
            int i12 = ij0Var.Y;
            if (i12 != 0 && i12 < 43) {
                ij0Var.N(43);
                ij0Var.start();
            }
        }
    }
}
