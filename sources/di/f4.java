package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class f4 {
    public final Paint f8980a;
    public final Paint f8981b;
    public final Paint f8982c;
    public final Drawable d;
    public final Drawable f8983e;
    public final ColorDrawable f8984f;
    public final a8.b8 f8985g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f8986i = new RectF();
    public final RectF f8987j = new RectF();
    public final RectF f8988k;
    public final Paint f8989l;
    public final Drawable f8990m;
    public final Drawable f8991n;
    public final Drawable f8992o;
    public final Drawable f8993p;
    public final Drawable f8994q;
    public final Drawable f8995r;
    public final Drawable f8996s;
    public final zg0 f8997t;
    public final zg0 f8998u;

    public f4(Context context) {
        new RectF();
        this.f8988k = new RectF();
        this.f8989l = new Paint();
        this.f8990m = context.getDrawable(2131231757);
        this.f8992o = context.getDrawable(2131231743);
        this.f8991n = context.getDrawable(2131231754);
        Drawable drawable = context.getDrawable(2131231744);
        this.f8993p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f8994q = context.getDrawable(2131231749);
        this.f8995r = context.getDrawable(2131231896);
        this.f8996s = context.getDrawable(2131232108);
        this.f8998u = new zg0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        zg0 zg0Var = new zg0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f8997t = zg0Var;
        zg0Var.N(20, false, true);
        zg0Var.stop();
        Paint paint = new Paint(1);
        this.f8980a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f8981b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232722);
        this.f8983e = context.getDrawable(2131232721);
        Paint paint3 = new Paint();
        this.f8982c = paint3;
        paint3.setColor(o4);
        this.f8984f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        int i10 = 20;
        zg0 zg0Var = this.f8998u;
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
            if (zg0Var.f40970a0 > 20) {
                zg0Var.N(0, false, false);
            }
            zg0Var.P(20);
            zg0Var.start();
        } else {
            int i11 = zg0Var.f40970a0;
            if (i11 != 0 && i11 < 43) {
                zg0Var.P(43);
                zg0Var.start();
            }
        }
    }
}
