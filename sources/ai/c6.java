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
import org.telegram.ui.Components.fk0;
public final class c6 {
    public final Paint f757a;
    public final Paint f758b;
    public final Paint f759c;
    public final Drawable d;
    public final Drawable f760e;
    public final ColorDrawable f761f;
    public final com.google.firebase.messaging.n f762g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f763i = new RectF();
    public final RectF f764j = new RectF();
    public final RectF f765k;
    public final Paint f766l;
    public final Drawable f767m;
    public final Drawable f768n;
    public final Drawable f769o;
    public final Drawable f770p;
    public final Drawable f771q;
    public final Drawable f772r;
    public final Drawable f773s;
    public final fk0 f774t;
    public final fk0 f775u;

    public c6(Context context) {
        new RectF();
        this.f765k = new RectF();
        this.f766l = new Paint();
        this.f767m = context.getDrawable(R.drawable.media_share);
        this.f769o = context.getDrawable(R.drawable.media_like);
        this.f768n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f770p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f771q = context.getDrawable(R.drawable.media_more);
        this.f772r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f773s = context.getDrawable(R.drawable.msg_delete);
        this.f775u = new fk0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        fk0 fk0Var = new fk0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f774t = fk0Var;
        fk0Var.N(20, false, true);
        fk0Var.stop();
        Paint paint = new Paint(1);
        this.f757a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f758b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.f760e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f759c = paint3;
        paint3.setColor(k10);
        this.f761f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        fk0 fk0Var = this.f775u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            fk0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            fk0Var.P(i11);
        } else if (z10) {
            if (fk0Var.f26101a0 > 20) {
                fk0Var.N(0, false, false);
            }
            fk0Var.P(20);
            fk0Var.start();
        } else {
            int i12 = fk0Var.f26101a0;
            if (i12 != 0 && i12 < 43) {
                fk0Var.P(43);
                fk0Var.start();
            }
        }
    }
}
