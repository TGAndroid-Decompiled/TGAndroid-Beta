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
import org.telegram.ui.Components.dk0;
public final class c6 {
    public final Paint f759a;
    public final Paint f760b;
    public final Paint f761c;
    public final Drawable d;
    public final Drawable f762e;
    public final ColorDrawable f763f;
    public final com.google.firebase.messaging.n f764g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f765i = new RectF();
    public final RectF f766j = new RectF();
    public final RectF f767k;
    public final Paint f768l;
    public final Drawable f769m;
    public final Drawable f770n;
    public final Drawable f771o;
    public final Drawable f772p;
    public final Drawable f773q;
    public final Drawable f774r;
    public final Drawable f775s;
    public final dk0 f776t;
    public final dk0 f777u;

    public c6(Context context) {
        new RectF();
        this.f767k = new RectF();
        this.f768l = new Paint();
        this.f769m = context.getDrawable(R.drawable.media_share);
        this.f771o = context.getDrawable(R.drawable.media_like);
        this.f770n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f772p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f773q = context.getDrawable(R.drawable.media_more);
        this.f774r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f775s = context.getDrawable(R.drawable.msg_delete);
        this.f777u = new dk0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        dk0 dk0Var = new dk0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f776t = dk0Var;
        dk0Var.N(20, false, true);
        dk0Var.stop();
        Paint paint = new Paint(1);
        this.f759a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f760b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f762e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f761c = paint3;
        paint3.setColor(k10);
        this.f763f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        dk0 dk0Var = this.f777u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            dk0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            dk0Var.P(i11);
        } else if (z10) {
            if (dk0Var.f25726a0 > 20) {
                dk0Var.N(0, false, false);
            }
            dk0Var.P(20);
            dk0Var.start();
        } else {
            int i12 = dk0Var.f25726a0;
            if (i12 != 0 && i12 < 43) {
                dk0Var.P(43);
                dk0Var.start();
            }
        }
    }
}
