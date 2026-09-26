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
import org.telegram.ui.Components.ij0;
public final class b6 {
    public final Paint f586a;
    public final Paint f587b;
    public final Paint f588c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f589f;
    public final com.google.firebase.messaging.n f590g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f591i = new RectF();
    public final RectF f592j = new RectF();
    public final RectF f593k;
    public final Paint f594l;
    public final Drawable f595m;
    public final Drawable f596n;
    public final Drawable f597o;
    public final Drawable f598p;
    public final Drawable f599q;
    public final Drawable f600r;
    public final Drawable f601s;
    public final ij0 f602t;
    public final ij0 f603u;

    public b6(Context context) {
        new RectF();
        this.f593k = new RectF();
        this.f594l = new Paint();
        this.f595m = context.getDrawable(R.drawable.media_share);
        this.f597o = context.getDrawable(R.drawable.media_like);
        this.f596n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f598p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f599q = context.getDrawable(R.drawable.media_more);
        this.f600r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f601s = context.getDrawable(R.drawable.msg_delete);
        this.f603u = new ij0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        ij0 ij0Var = new ij0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f602t = ij0Var;
        ij0Var.N(20, false, true);
        ij0Var.stop();
        Paint paint = new Paint(1);
        this.f586a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f587b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f588c = paint3;
        paint3.setColor(k10);
        this.f589f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        ij0 ij0Var = this.f603u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            ij0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            ij0Var.P(i11);
        } else if (z10) {
            if (ij0Var.f25068a0 > 20) {
                ij0Var.N(0, false, false);
            }
            ij0Var.P(20);
            ij0Var.start();
        } else {
            int i12 = ij0Var.f25068a0;
            if (i12 != 0 && i12 < 43) {
                ij0Var.P(43);
                ij0Var.start();
            }
        }
    }
}
