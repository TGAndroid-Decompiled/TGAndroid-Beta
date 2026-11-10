package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class g4 {
    public final Paint f9018a;
    public final Paint f9019b;
    public final Paint f9020c;
    public final Drawable d;
    public final Drawable f9021e;
    public final ColorDrawable f9022f;
    public final a8.b8 f9023g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f9024i = new RectF();
    public final RectF f9025j = new RectF();
    public final RectF f9026k;
    public final Paint f9027l;
    public final Drawable f9028m;
    public final Drawable f9029n;
    public final Drawable f9030o;
    public final Drawable f9031p;
    public final Drawable f9032q;
    public final Drawable f9033r;
    public final Drawable f9034s;
    public final zg0 f9035t;
    public final zg0 f9036u;

    public g4(Context context) {
        new RectF();
        this.f9026k = new RectF();
        this.f9027l = new Paint();
        this.f9028m = context.getDrawable(2131231757);
        this.f9030o = context.getDrawable(2131231743);
        this.f9029n = context.getDrawable(2131231754);
        Drawable drawable = context.getDrawable(2131231744);
        this.f9031p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f9032q = context.getDrawable(2131231749);
        this.f9033r = context.getDrawable(2131231896);
        this.f9034s = context.getDrawable(2131232108);
        this.f9036u = new zg0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        zg0 zg0Var = new zg0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f9035t = zg0Var;
        zg0Var.N(20, false, true);
        zg0Var.stop();
        Paint paint = new Paint(1);
        this.f9018a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f9019b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232722);
        this.f9021e = context.getDrawable(2131232721);
        Paint paint3 = new Paint();
        this.f9020c = paint3;
        paint3.setColor(o4);
        this.f9022f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        int i10 = 20;
        zg0 zg0Var = this.f9036u;
        if (!z10) {
            if (z9) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            zg0Var.N(i7, false, false);
            if (!z9) {
                i10 = 0;
            }
            zg0Var.P(i10);
        } else if (z9) {
            if (zg0Var.f40962a0 > 20) {
                zg0Var.N(0, false, false);
            }
            zg0Var.P(20);
            zg0Var.start();
        } else {
            int i11 = zg0Var.f40962a0;
            if (i11 != 0 && i11 < 43) {
                zg0Var.P(43);
                zg0Var.start();
            }
        }
    }
}
