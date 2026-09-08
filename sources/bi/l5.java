package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class l5 {
    public final Paint f3275a;
    public final Paint f3276b;
    public final Paint f3277c;
    public final Drawable d;
    public final Drawable f3278e;
    public final ColorDrawable f3279f;
    public final com.google.firebase.messaging.n f3280g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f3281i = new RectF();
    public final RectF f3282j = new RectF();
    public final RectF f3283k;
    public final Paint f3284l;
    public final Drawable f3285m;
    public final Drawable f3286n;
    public final Drawable f3287o;
    public final Drawable f3288p;
    public final Drawable f3289q;
    public final Drawable f3290r;
    public final Drawable f3291s;
    public final xi0 f3292t;
    public final xi0 f3293u;

    public l5(Context context) {
        new RectF();
        this.f3283k = new RectF();
        this.f3284l = new Paint();
        this.f3285m = context.getDrawable(R.drawable.media_share);
        this.f3287o = context.getDrawable(R.drawable.media_like);
        this.f3286n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f3288p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f3289q = context.getDrawable(R.drawable.media_more);
        this.f3290r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f3291s = context.getDrawable(R.drawable.msg_delete);
        this.f3293u = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        xi0 xi0Var = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f3292t = xi0Var;
        xi0Var.L(20, false, true);
        xi0Var.stop();
        Paint paint = new Paint(1);
        this.f3275a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f3276b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f3278e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f3277c = paint3;
        paint3.setColor(k10);
        this.f3279f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        xi0 xi0Var = this.f3293u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            xi0Var.L(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            xi0Var.N(i11);
        } else if (z10) {
            if (xi0Var.f32580b0 > 20) {
                xi0Var.L(0, false, false);
            }
            xi0Var.N(20);
            xi0Var.start();
        } else {
            int i12 = xi0Var.f32580b0;
            if (i12 != 0 && i12 < 43) {
                xi0Var.N(43);
                xi0Var.start();
            }
        }
    }
}
