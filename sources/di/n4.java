package di;

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
public final class n4 {
    public final Paint f8816a;
    public final Paint f8817b;
    public final Paint f8818c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f8819f;
    public final aa.m0 f8820g = new aa.m0(6);
    public final RectF h = new RectF();
    public final RectF f8821i = new RectF();
    public final RectF f8822j = new RectF();
    public final RectF f8823k;
    public final Paint f8824l;
    public final Drawable f8825m;
    public final Drawable f8826n;
    public final Drawable f8827o;
    public final Drawable f8828p;
    public final Drawable f8829q;
    public final Drawable f8830r;
    public final Drawable f8831s;
    public final yj0 f8832t;
    public final yj0 f8833u;

    public n4(Context context) {
        new RectF();
        this.f8823k = new RectF();
        this.f8824l = new Paint();
        this.f8825m = context.getDrawable(R.drawable.media_share);
        this.f8827o = context.getDrawable(R.drawable.media_like);
        this.f8826n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f8828p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f8829q = context.getDrawable(R.drawable.media_more);
        this.f8830r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f8831s = context.getDrawable(R.drawable.msg_delete);
        this.f8833u = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        yj0 yj0Var = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f8832t = yj0Var;
        yj0Var.N(20, false, true);
        yj0Var.stop();
        Paint paint = new Paint(1);
        this.f8816a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f8817b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f8818c = paint3;
        paint3.setColor(o10);
        this.f8819f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        yj0 yj0Var = this.f8833u;
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
            if (yj0Var.f35067a0 > 20) {
                yj0Var.N(0, false, false);
            }
            yj0Var.P(20);
            yj0Var.start();
        } else {
            int i12 = yj0Var.f35067a0;
            if (i12 != 0 && i12 < 43) {
                yj0Var.P(43);
                yj0Var.start();
            }
        }
    }
}
