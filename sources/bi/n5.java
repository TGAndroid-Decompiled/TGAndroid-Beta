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
import org.telegram.ui.Components.yj0;
public final class n5 {
    public final Paint f3359a;
    public final Paint f3360b;
    public final Paint f3361c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f3362f;
    public final com.google.firebase.messaging.m f3363g = new com.google.firebase.messaging.m(4);
    public final RectF h = new RectF();
    public final RectF f3364i = new RectF();
    public final RectF f3365j = new RectF();
    public final RectF f3366k;
    public final Paint f3367l;
    public final Drawable f3368m;
    public final Drawable f3369n;
    public final Drawable f3370o;
    public final Drawable f3371p;
    public final Drawable f3372q;
    public final Drawable f3373r;
    public final Drawable f3374s;
    public final yj0 f3375t;
    public final yj0 f3376u;

    public n5(Context context) {
        new RectF();
        this.f3366k = new RectF();
        this.f3367l = new Paint();
        this.f3368m = context.getDrawable(R.drawable.media_share);
        this.f3370o = context.getDrawable(R.drawable.media_like);
        this.f3369n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f3371p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f3372q = context.getDrawable(R.drawable.media_more);
        this.f3373r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f3374s = context.getDrawable(R.drawable.msg_delete);
        this.f3376u = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        yj0 yj0Var = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f3375t = yj0Var;
        yj0Var.N(20, false, true);
        yj0Var.stop();
        Paint paint = new Paint(1);
        this.f3359a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f3360b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f3361c = paint3;
        paint3.setColor(k10);
        this.f3362f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        yj0 yj0Var = this.f3376u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            yj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            yj0Var.P(i11);
        } else if (z10) {
            if (yj0Var.f31602a0 > 20) {
                yj0Var.N(0, false, false);
            }
            yj0Var.P(20);
            yj0Var.start();
        } else {
            int i12 = yj0Var.f31602a0;
            if (i12 != 0 && i12 < 43) {
                yj0Var.P(43);
                yj0Var.start();
            }
        }
    }
}
