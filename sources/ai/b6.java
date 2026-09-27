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
import org.telegram.ui.Components.kj0;
public final class b6 {
    public final Paint f589a;
    public final Paint f590b;
    public final Paint f591c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f592f;
    public final com.google.firebase.messaging.n f593g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f594i = new RectF();
    public final RectF f595j = new RectF();
    public final RectF f596k;
    public final Paint f597l;
    public final Drawable f598m;
    public final Drawable f599n;
    public final Drawable f600o;
    public final Drawable f601p;
    public final Drawable f602q;
    public final Drawable f603r;
    public final Drawable f604s;
    public final kj0 f605t;
    public final kj0 f606u;

    public b6(Context context) {
        new RectF();
        this.f596k = new RectF();
        this.f597l = new Paint();
        this.f598m = context.getDrawable(R.drawable.media_share);
        this.f600o = context.getDrawable(R.drawable.media_like);
        this.f599n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f601p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f602q = context.getDrawable(R.drawable.media_more);
        this.f603r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f604s = context.getDrawable(R.drawable.msg_delete);
        this.f606u = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        kj0 kj0Var = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f605t = kj0Var;
        kj0Var.N(20, false, true);
        kj0Var.stop();
        Paint paint = new Paint(1);
        this.f589a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f590b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f591c = paint3;
        paint3.setColor(k10);
        this.f592f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        kj0 kj0Var = this.f606u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            kj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            kj0Var.P(i11);
        } else if (z10) {
            if (kj0Var.f25746a0 > 20) {
                kj0Var.N(0, false, false);
            }
            kj0Var.P(20);
            kj0Var.start();
        } else {
            int i12 = kj0Var.f25746a0;
            if (i12 != 0 && i12 < 43) {
                kj0Var.P(43);
                kj0Var.start();
            }
        }
    }
}
