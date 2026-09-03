package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
public final class c4 {
    public final Paint f16919a;
    public final Paint f16920b;
    public final Paint f16921c;
    public final Drawable d;
    public final Drawable f16922e;
    public final ColorDrawable f16923f;
    public final a9.a f16924g = new a9.a(9);
    public final RectF h = new RectF();
    public final RectF f16925i = new RectF();
    public final RectF f16926j = new RectF();
    public final RectF f16927k;
    public final Paint f16928l;
    public final Drawable f16929m;
    public final Drawable f16930n;
    public final Drawable f16931o;
    public final Drawable f16932p;
    public final Drawable f16933q;
    public final Drawable f16934r;
    public final Drawable f16935s;
    public final hj0 f16936t;
    public final hj0 f16937u;

    public c4(Context context) {
        new RectF();
        this.f16927k = new RectF();
        this.f16928l = new Paint();
        this.f16929m = context.getDrawable(R.drawable.media_share);
        this.f16931o = context.getDrawable(R.drawable.media_like);
        this.f16930n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f16932p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f16933q = context.getDrawable(R.drawable.media_more);
        this.f16934r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f16935s = context.getDrawable(R.drawable.msg_delete);
        this.f16937u = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f16936t = hj0Var;
        hj0Var.L(20, false, true);
        hj0Var.stop();
        Paint paint = new Paint(1);
        this.f16919a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f16920b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f16922e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f16921c = paint3;
        paint3.setColor(k10);
        this.f16923f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        int i11 = 20;
        hj0 hj0Var = this.f16937u;
        if (!z10) {
            if (z4) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            hj0Var.L(i10, false, false);
            if (!z4) {
                i11 = 0;
            }
            hj0Var.N(i11);
        } else if (z4) {
            if (hj0Var.Y > 20) {
                hj0Var.L(0, false, false);
            }
            hj0Var.N(20);
            hj0Var.start();
        } else {
            int i12 = hj0Var.Y;
            if (i12 != 0 && i12 < 43) {
                hj0Var.N(43);
                hj0Var.start();
            }
        }
    }
}
