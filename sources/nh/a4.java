package nh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
public final class a4 {
    public final Paint f15052a;
    public final Paint f15053b;
    public final Paint f15054c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f15055f;
    public final a9.a f15056g = new a9.a(9);
    public final RectF h = new RectF();
    public final RectF f15057i = new RectF();
    public final RectF f15058j = new RectF();
    public final RectF f15059k;
    public final Paint f15060l;
    public final Drawable f15061m;
    public final Drawable f15062n;
    public final Drawable f15063o;
    public final Drawable f15064p;
    public final Drawable f15065q;
    public final Drawable f15066r;
    public final Drawable f15067s;
    public final gj0 f15068t;
    public final gj0 f15069u;

    public a4(Context context) {
        new RectF();
        this.f15059k = new RectF();
        this.f15060l = new Paint();
        this.f15061m = context.getDrawable(R.drawable.media_share);
        this.f15063o = context.getDrawable(R.drawable.media_like);
        this.f15062n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f15064p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f15065q = context.getDrawable(R.drawable.media_more);
        this.f15066r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f15067s = context.getDrawable(R.drawable.msg_delete);
        this.f15069u = new gj0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        gj0 gj0Var = new gj0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f15068t = gj0Var;
        gj0Var.L(20, false, true);
        gj0Var.stop();
        Paint paint = new Paint(1);
        this.f15052a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f15053b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f15054c = paint3;
        paint3.setColor(k10);
        this.f15055f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        int i11 = 20;
        gj0 gj0Var = this.f15069u;
        if (!z10) {
            if (z4) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            gj0Var.L(i10, false, false);
            if (!z4) {
                i11 = 0;
            }
            gj0Var.N(i11);
        } else if (z4) {
            if (gj0Var.Y > 20) {
                gj0Var.L(0, false, false);
            }
            gj0Var.N(20);
            gj0Var.start();
        } else {
            int i12 = gj0Var.Y;
            if (i12 != 0 && i12 < 43) {
                gj0Var.N(43);
                gj0Var.start();
            }
        }
    }
}
