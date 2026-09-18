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
import org.telegram.ui.Components.yi0;
public final class c6 {
    public final Paint f627a;
    public final Paint f628b;
    public final Paint f629c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f630f;
    public final com.google.firebase.messaging.n f631g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f632i = new RectF();
    public final RectF f633j = new RectF();
    public final RectF f634k;
    public final Paint f635l;
    public final Drawable f636m;
    public final Drawable f637n;
    public final Drawable f638o;
    public final Drawable f639p;
    public final Drawable f640q;
    public final Drawable f641r;
    public final Drawable f642s;
    public final yi0 f643t;
    public final yi0 f644u;

    public c6(Context context) {
        new RectF();
        this.f634k = new RectF();
        this.f635l = new Paint();
        this.f636m = context.getDrawable(R.drawable.media_share);
        this.f638o = context.getDrawable(R.drawable.media_like);
        this.f637n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f639p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f640q = context.getDrawable(R.drawable.media_more);
        this.f641r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f642s = context.getDrawable(R.drawable.msg_delete);
        this.f644u = new yi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        yi0 yi0Var = new yi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f643t = yi0Var;
        yi0Var.N(20, false, true);
        yi0Var.stop();
        Paint paint = new Paint(1);
        this.f627a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f628b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f629c = paint3;
        paint3.setColor(k10);
        this.f630f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        yi0 yi0Var = this.f644u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            yi0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            yi0Var.P(i11);
        } else if (z10) {
            if (yi0Var.f30222a0 > 20) {
                yi0Var.N(0, false, false);
            }
            yi0Var.P(20);
            yi0Var.start();
        } else {
            int i12 = yi0Var.f30222a0;
            if (i12 != 0 && i12 < 43) {
                yi0Var.P(43);
                yi0Var.start();
            }
        }
    }
}
