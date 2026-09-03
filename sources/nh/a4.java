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
    public final Paint f15032a;
    public final Paint f15033b;
    public final Paint f15034c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f15035f;
    public final a9.a f15036g = new a9.a(9);
    public final RectF h = new RectF();
    public final RectF f15037i = new RectF();
    public final RectF f15038j = new RectF();
    public final RectF f15039k;
    public final Paint f15040l;
    public final Drawable f15041m;
    public final Drawable f15042n;
    public final Drawable f15043o;
    public final Drawable f15044p;
    public final Drawable f15045q;
    public final Drawable f15046r;
    public final Drawable f15047s;
    public final gj0 f15048t;
    public final gj0 f15049u;

    public a4(Context context) {
        new RectF();
        this.f15039k = new RectF();
        this.f15040l = new Paint();
        this.f15041m = context.getDrawable(R.drawable.media_share);
        this.f15043o = context.getDrawable(R.drawable.media_like);
        this.f15042n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f15044p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f15045q = context.getDrawable(R.drawable.media_more);
        this.f15046r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f15047s = context.getDrawable(R.drawable.msg_delete);
        this.f15049u = new gj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        gj0 gj0Var = new gj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f15048t = gj0Var;
        gj0Var.L(20, false, true);
        gj0Var.stop();
        Paint paint = new Paint(1);
        this.f15032a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f15033b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f15034c = paint3;
        paint3.setColor(k10);
        this.f15035f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        int i11 = 20;
        gj0 gj0Var = this.f15049u;
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
