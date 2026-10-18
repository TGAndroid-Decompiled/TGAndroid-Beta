package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uj0;
public final class m4 {
    public final Paint f5532a;
    public final Paint f5533b;
    public final Paint f5534c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f5535f;
    public final com.google.firebase.messaging.l f5536g = new com.google.firebase.messaging.l(4);
    public final RectF h = new RectF();
    public final RectF f5537i = new RectF();
    public final RectF f5538j = new RectF();
    public final RectF f5539k;
    public final Paint f5540l;
    public final Drawable f5541m;
    public final Drawable f5542n;
    public final Drawable f5543o;
    public final Drawable f5544p;
    public final Drawable f5545q;
    public final Drawable f5546r;
    public final Drawable f5547s;
    public final uj0 f5548t;
    public final uj0 f5549u;

    public m4(Context context) {
        new RectF();
        this.f5539k = new RectF();
        this.f5540l = new Paint();
        this.f5541m = context.getDrawable(R.drawable.media_share);
        this.f5543o = context.getDrawable(R.drawable.media_like);
        this.f5542n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f5544p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f5545q = context.getDrawable(R.drawable.media_more);
        this.f5546r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f5547s = context.getDrawable(R.drawable.msg_delete);
        this.f5549u = new uj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        uj0 uj0Var = new uj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f5548t = uj0Var;
        uj0Var.N(20, false, true);
        uj0Var.stop();
        Paint paint = new Paint(1);
        this.f5532a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f5533b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f5534c = paint3;
        paint3.setColor(o10);
        this.f5535f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        uj0 uj0Var = this.f5549u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            uj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            uj0Var.P(i11);
        } else if (z10) {
            if (uj0Var.f31001a0 > 20) {
                uj0Var.N(0, false, false);
            }
            uj0Var.P(20);
            uj0Var.start();
        } else {
            int i12 = uj0Var.f31001a0;
            if (i12 != 0 && i12 < 43) {
                uj0Var.P(43);
                uj0Var.start();
            }
        }
    }
}
