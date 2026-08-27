package jh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oi0;

public final class b4 {

    public final Paint f13082a;

    public final Paint f13083b;

    public final Paint f13084c;
    public final Drawable d;

    public final Drawable f13085e;

    public final ColorDrawable f13086f;

    public final com.google.firebase.messaging.m f13087g = new com.google.firebase.messaging.m(7);
    public final RectF h = new RectF();

    public final RectF f13088i = new RectF();

    public final RectF f13089j = new RectF();

    public final RectF f13090k;

    public final Paint f13091l;

    public final Drawable f13092m;

    public final Drawable f13093n;

    public final Drawable f13094o;

    public final Drawable f13095p;

    public final Drawable f13096q;

    public final Drawable f13097r;

    public final Drawable f13098s;

    public final oi0 f13099t;

    public final oi0 f13100u;

    public b4(Context context) {
        new RectF();
        this.f13090k = new RectF();
        this.f13091l = new Paint();
        this.f13092m = context.getDrawable(R.drawable.media_share);
        this.f13094o = context.getDrawable(R.drawable.media_like);
        this.f13093n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f13095p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f13096q = context.getDrawable(R.drawable.media_more);
        this.f13097r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f13098s = context.getDrawable(R.drawable.msg_delete);
        this.f13100u = new oi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        oi0 oi0Var = new oi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f13099t = oi0Var;
        oi0Var.L(20, false, true);
        oi0Var.stop();
        Paint paint = new Paint(1);
        this.f13082a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f13083b = paint2;
        paint2.setColor(-1);
        int iK = i0.b.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f13085e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f13084c = paint3;
        paint3.setColor(iK);
        this.f13086f = new ColorDrawable(i0.b.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        oi0 oi0Var = this.f13100u;
        if (!z11) {
            oi0Var.L(z10 ? 20 : 0, false, false);
            oi0Var.N(z10 ? 20 : 0);
            return;
        }
        if (z10) {
            if (oi0Var.X > 20) {
                oi0Var.L(0, false, false);
            }
            oi0Var.N(20);
            oi0Var.start();
            return;
        }
        int i10 = oi0Var.X;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        oi0Var.N(43);
        oi0Var.start();
    }
}
