package ih;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mi0;
public final class f4 {
    public final Paint f11413a;
    public final Paint f11414b;
    public final Paint f11415c;
    public final Drawable d;
    public final Drawable f11416e;
    public final ColorDrawable f11417f;
    public final com.google.firebase.messaging.m f11418g = new com.google.firebase.messaging.m(7);
    public final RectF h = new RectF();
    public final RectF f11419i = new RectF();
    public final RectF f11420j = new RectF();
    public final RectF f11421k;
    public final Paint f11422l;
    public final Drawable f11423m;
    public final Drawable f11424n;
    public final Drawable f11425o;
    public final Drawable f11426p;
    public final Drawable f11427q;
    public final Drawable f11428r;
    public final Drawable f11429s;
    public final mi0 f11430t;
    public final mi0 f11431u;

    public f4(Context context) {
        new RectF();
        this.f11421k = new RectF();
        this.f11422l = new Paint();
        this.f11423m = context.getDrawable(R.drawable.media_share);
        this.f11425o = context.getDrawable(R.drawable.media_like);
        this.f11424n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f11426p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f11427q = context.getDrawable(R.drawable.media_more);
        this.f11428r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f11429s = context.getDrawable(R.drawable.msg_delete);
        this.f11431u = new mi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        mi0 mi0Var = new mi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f11430t = mi0Var;
        mi0Var.L(20, false, true);
        mi0Var.stop();
        Paint paint = new Paint(1);
        this.f11413a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f11414b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f11416e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f11415c = paint3;
        paint3.setColor(k10);
        this.f11417f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i9;
        int i10 = 20;
        mi0 mi0Var = this.f11431u;
        if (!z11) {
            if (z10) {
                i9 = 20;
            } else {
                i9 = 0;
            }
            mi0Var.L(i9, false, false);
            if (!z10) {
                i10 = 0;
            }
            mi0Var.N(i10);
        } else if (z10) {
            if (mi0Var.X > 20) {
                mi0Var.L(0, false, false);
            }
            mi0Var.N(20);
            mi0Var.start();
        } else {
            int i11 = mi0Var.X;
            if (i11 != 0 && i11 < 43) {
                mi0Var.N(43);
                mi0Var.start();
            }
        }
    }
}
