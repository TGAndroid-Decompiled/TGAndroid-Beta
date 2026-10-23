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
import org.telegram.ui.Components.vj0;
public final class n4 {
    public final Paint f5630a;
    public final Paint f5631b;
    public final Paint f5632c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f5633f;
    public final com.google.firebase.messaging.l f5634g = new com.google.firebase.messaging.l(4);
    public final RectF h = new RectF();
    public final RectF f5635i = new RectF();
    public final RectF f5636j = new RectF();
    public final RectF f5637k;
    public final Paint f5638l;
    public final Drawable f5639m;
    public final Drawable f5640n;
    public final Drawable f5641o;
    public final Drawable f5642p;
    public final Drawable f5643q;
    public final Drawable f5644r;
    public final Drawable f5645s;
    public final vj0 f5646t;
    public final vj0 f5647u;

    public n4(Context context) {
        new RectF();
        this.f5637k = new RectF();
        this.f5638l = new Paint();
        this.f5639m = context.getDrawable(R.drawable.media_share);
        this.f5641o = context.getDrawable(R.drawable.media_like);
        this.f5640n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f5642p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f5643q = context.getDrawable(R.drawable.media_more);
        this.f5644r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f5645s = context.getDrawable(R.drawable.msg_delete);
        this.f5647u = new vj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        vj0 vj0Var = new vj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f5646t = vj0Var;
        vj0Var.N(20, false, true);
        vj0Var.stop();
        Paint paint = new Paint(1);
        this.f5630a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f5631b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f5632c = paint3;
        paint3.setColor(o10);
        this.f5633f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        vj0 vj0Var = this.f5647u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            vj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            vj0Var.P(i11);
        } else if (z10) {
            if (vj0Var.f31269a0 > 20) {
                vj0Var.N(0, false, false);
            }
            vj0Var.P(20);
            vj0Var.start();
        } else {
            int i12 = vj0Var.f31269a0;
            if (i12 != 0 && i12 < 43) {
                vj0Var.P(43);
                vj0Var.start();
            }
        }
    }
}
