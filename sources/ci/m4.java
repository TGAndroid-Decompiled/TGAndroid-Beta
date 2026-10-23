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
import org.telegram.ui.Components.yj0;
public final class m4 {
    public final Paint f5536a;
    public final Paint f5537b;
    public final Paint f5538c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f5539f;
    public final com.google.firebase.messaging.l f5540g = new com.google.firebase.messaging.l(4);
    public final RectF h = new RectF();
    public final RectF f5541i = new RectF();
    public final RectF f5542j = new RectF();
    public final RectF f5543k;
    public final Paint f5544l;
    public final Drawable f5545m;
    public final Drawable f5546n;
    public final Drawable f5547o;
    public final Drawable f5548p;
    public final Drawable f5549q;
    public final Drawable f5550r;
    public final Drawable f5551s;
    public final yj0 f5552t;
    public final yj0 f5553u;

    public m4(Context context) {
        new RectF();
        this.f5543k = new RectF();
        this.f5544l = new Paint();
        this.f5545m = context.getDrawable(R.drawable.media_share);
        this.f5547o = context.getDrawable(R.drawable.media_like);
        this.f5546n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f5548p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f5549q = context.getDrawable(R.drawable.media_more);
        this.f5550r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f5551s = context.getDrawable(R.drawable.msg_delete);
        this.f5553u = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        yj0 yj0Var = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f5552t = yj0Var;
        yj0Var.N(20, false, true);
        yj0Var.stop();
        Paint paint = new Paint(1);
        this.f5536a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f5537b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f5538c = paint3;
        paint3.setColor(o10);
        this.f5539f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        yj0 yj0Var = this.f5553u;
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
            if (yj0Var.f32933a0 > 20) {
                yj0Var.N(0, false, false);
            }
            yj0Var.P(20);
            yj0Var.start();
        } else {
            int i12 = yj0Var.f32933a0;
            if (i12 != 0 && i12 < 43) {
                yj0Var.P(43);
                yj0Var.start();
            }
        }
    }
}
