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
    public final Paint f3248a;
    public final Paint f3249b;
    public final Paint f3250c;
    public final Drawable d;
    public final Drawable f3251e;
    public final ColorDrawable f3252f;
    public final com.google.firebase.messaging.n f3253g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f3254i = new RectF();
    public final RectF f3255j = new RectF();
    public final RectF f3256k;
    public final Paint f3257l;
    public final Drawable f3258m;
    public final Drawable f3259n;
    public final Drawable f3260o;
    public final Drawable f3261p;
    public final Drawable f3262q;
    public final Drawable f3263r;
    public final Drawable f3264s;
    public final xi0 f3265t;
    public final xi0 f3266u;

    public l5(Context context) {
        new RectF();
        this.f3256k = new RectF();
        this.f3257l = new Paint();
        this.f3258m = context.getDrawable(R.drawable.media_share);
        this.f3260o = context.getDrawable(R.drawable.media_like);
        this.f3259n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f3261p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f3262q = context.getDrawable(R.drawable.media_more);
        this.f3263r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f3264s = context.getDrawable(R.drawable.msg_delete);
        this.f3266u = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        xi0 xi0Var = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f3265t = xi0Var;
        xi0Var.L(20, false, true);
        xi0Var.stop();
        Paint paint = new Paint(1);
        this.f3248a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f3249b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f3251e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f3250c = paint3;
        paint3.setColor(k10);
        this.f3252f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        xi0 xi0Var = this.f3266u;
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
            if (xi0Var.f32553b0 > 20) {
                xi0Var.L(0, false, false);
            }
            xi0Var.N(20);
            xi0Var.start();
        } else {
            int i12 = xi0Var.f32553b0;
            if (i12 != 0 && i12 < 43) {
                xi0Var.N(43);
                xi0Var.start();
            }
        }
    }
}
