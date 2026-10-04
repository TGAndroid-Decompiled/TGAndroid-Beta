package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kj0;
public final class b6 {
    public final Paint f636a;
    public final Paint f637b;
    public final Paint f638c;
    public final Drawable d;
    public final Drawable f639e;
    public final ColorDrawable f640f;
    public final com.google.firebase.messaging.n f641g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f642i = new RectF();
    public final RectF f643j = new RectF();
    public final RectF f644k;
    public final Paint f645l;
    public final Drawable f646m;
    public final Drawable f647n;
    public final Drawable f648o;
    public final Drawable f649p;
    public final Drawable f650q;
    public final Drawable f651r;
    public final Drawable f652s;
    public final kj0 f653t;
    public final kj0 f654u;

    public b6(Context context) {
        new RectF();
        this.f644k = new RectF();
        this.f645l = new Paint();
        this.f646m = context.getDrawable(R.drawable.media_share);
        this.f648o = context.getDrawable(R.drawable.media_like);
        this.f647n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f649p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f650q = context.getDrawable(R.drawable.media_more);
        this.f651r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f652s = context.getDrawable(R.drawable.msg_delete);
        this.f654u = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        kj0 kj0Var = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f653t = kj0Var;
        kj0Var.N(20, false, true);
        kj0Var.stop();
        Paint paint = new Paint(1);
        this.f636a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f637b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f639e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f638c = paint3;
        paint3.setColor(k10);
        this.f640f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        kj0 kj0Var = this.f654u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            kj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            kj0Var.P(i11);
        } else if (z10) {
            if (kj0Var.f28124a0 > 20) {
                kj0Var.N(0, false, false);
            }
            kj0Var.P(20);
            kj0Var.start();
        } else {
            int i12 = kj0Var.f28124a0;
            if (i12 != 0 && i12 < 43) {
                kj0Var.P(43);
                kj0Var.start();
            }
        }
    }
}
