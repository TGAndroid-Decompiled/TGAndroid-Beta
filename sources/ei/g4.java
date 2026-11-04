package ei;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class g4 {
    public final Paint f10314a;
    public final Paint f10315b;
    public final Paint f10316c;
    public final Drawable d;
    public final Drawable f10317e;
    public final ColorDrawable f10318f;
    public final l2.e f10319g = new l2.e(3);
    public final RectF h = new RectF();
    public final RectF f10320i = new RectF();
    public final RectF f10321j = new RectF();
    public final RectF f10322k;
    public final Paint f10323l;
    public final Drawable f10324m;
    public final Drawable f10325n;
    public final Drawable f10326o;
    public final Drawable f10327p;
    public final Drawable f10328q;
    public final Drawable f10329r;
    public final Drawable f10330s;
    public final ch0 f10331t;
    public final ch0 f10332u;

    public g4(Context context) {
        new RectF();
        this.f10322k = new RectF();
        this.f10323l = new Paint();
        this.f10324m = context.getDrawable(2131231757);
        this.f10326o = context.getDrawable(2131231743);
        this.f10325n = context.getDrawable(2131231754);
        Drawable drawable = context.getDrawable(2131231744);
        this.f10327p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f10328q = context.getDrawable(2131231749);
        this.f10329r = context.getDrawable(2131231896);
        this.f10330s = context.getDrawable(2131232108);
        this.f10332u = new ch0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        ch0 ch0Var = new ch0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f10331t = ch0Var;
        ch0Var.N(20, false, true);
        ch0Var.stop();
        Paint paint = new Paint(1);
        this.f10314a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f10315b = paint2;
        paint2.setColor(-1);
        int o10 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232720);
        this.f10317e = context.getDrawable(2131232719);
        Paint paint3 = new Paint();
        this.f10316c = paint3;
        paint3.setColor(o10);
        this.f10318f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i3;
        int i10 = 20;
        ch0 ch0Var = this.f10332u;
        if (!z11) {
            if (z10) {
                i3 = 20;
            } else {
                i3 = 0;
            }
            ch0Var.N(i3, false, false);
            if (!z10) {
                i10 = 0;
            }
            ch0Var.P(i10);
        } else if (z10) {
            if (ch0Var.f32721b0 > 20) {
                ch0Var.N(0, false, false);
            }
            ch0Var.P(20);
            ch0Var.start();
        } else {
            int i11 = ch0Var.f32721b0;
            if (i11 != 0 && i11 < 43) {
                ch0Var.P(43);
                ch0Var.start();
            }
        }
    }
}
