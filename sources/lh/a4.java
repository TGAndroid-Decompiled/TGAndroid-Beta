package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class a4 {
    public final Paint f15314a;
    public final Paint f15315b;
    public final Paint f15316c;
    public final Drawable d;
    public final Drawable f15317e;
    public final ColorDrawable f15318f;
    public final bg.c2 f15319g = new bg.c2(8);
    public final RectF h = new RectF();
    public final RectF f15320i = new RectF();
    public final RectF f15321j = new RectF();
    public final RectF f15322k;
    public final Paint f15323l;
    public final Drawable f15324m;
    public final Drawable f15325n;
    public final Drawable f15326o;
    public final Drawable f15327p;
    public final Drawable f15328q;
    public final Drawable f15329r;
    public final Drawable f15330s;
    public final xi0 f15331t;
    public final xi0 f15332u;

    public a4(Context context) {
        new RectF();
        this.f15322k = new RectF();
        this.f15323l = new Paint();
        this.f15324m = context.getDrawable(R.drawable.media_share);
        this.f15326o = context.getDrawable(R.drawable.media_like);
        this.f15325n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f15327p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f15328q = context.getDrawable(R.drawable.media_more);
        this.f15329r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f15330s = context.getDrawable(R.drawable.msg_delete);
        this.f15332u = new xi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        xi0 xi0Var = new xi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f15331t = xi0Var;
        xi0Var.L(20, false, true);
        xi0Var.stop();
        Paint paint = new Paint(1);
        this.f15314a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f15315b = paint2;
        paint2.setColor(-1);
        int k9 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f15317e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f15316c = paint3;
        paint3.setColor(k9);
        this.f15318f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        xi0 xi0Var = this.f15332u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            xi0Var.L(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            xi0Var.N(i11);
        } else if (z10) {
            if (xi0Var.X > 20) {
                xi0Var.L(0, false, false);
            }
            xi0Var.N(20);
            xi0Var.start();
        } else {
            int i12 = xi0Var.X;
            if (i12 != 0 && i12 < 43) {
                xi0Var.N(43);
                xi0Var.start();
            }
        }
    }
}
