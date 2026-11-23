package fi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class w3 {
    public final Paint f12672a;
    public final Paint f12673b;
    public final Paint f12674c;
    public final Drawable d;
    public final Drawable f12675e;
    public final ColorDrawable f12676f;
    public final a8.b8 f12677g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12678i = new RectF();
    public final RectF f12679j = new RectF();
    public final RectF f12680k;
    public final Paint f12681l;
    public final Drawable f12682m;
    public final Drawable f12683n;
    public final Drawable f12684o;
    public final Drawable f12685p;
    public final Drawable f12686q;
    public final Drawable f12687r;
    public final Drawable f12688s;
    public final oh0 f12689t;
    public final oh0 f12690u;

    public w3(Context context) {
        new RectF();
        this.f12680k = new RectF();
        this.f12681l = new Paint();
        this.f12682m = context.getDrawable(2131231758);
        this.f12684o = context.getDrawable(2131231744);
        this.f12683n = context.getDrawable(2131231755);
        Drawable drawable = context.getDrawable(2131231745);
        this.f12685p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12686q = context.getDrawable(2131231750);
        this.f12687r = context.getDrawable(2131231897);
        this.f12688s = context.getDrawable(2131232110);
        this.f12690u = new oh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        oh0 oh0Var = new oh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12689t = oh0Var;
        oh0Var.N(20, false, true);
        oh0Var.stop();
        Paint paint = new Paint(1);
        this.f12672a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12673b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232724);
        this.f12675e = context.getDrawable(2131232723);
        Paint paint3 = new Paint();
        this.f12674c = paint3;
        paint3.setColor(o4);
        this.f12676f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        oh0 oh0Var = this.f12690u;
        if (!z11) {
            if (z10) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            oh0Var.N(i7, false, false);
            if (!z10) {
                i10 = 0;
            }
            oh0Var.P(i10);
        } else if (z10) {
            if (oh0Var.f38175b0 > 20) {
                oh0Var.N(0, false, false);
            }
            oh0Var.P(20);
            oh0Var.start();
        } else {
            int i11 = oh0Var.f38175b0;
            if (i11 != 0 && i11 < 43) {
                oh0Var.P(43);
                oh0Var.start();
            }
        }
    }
}
