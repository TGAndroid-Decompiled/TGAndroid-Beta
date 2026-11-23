package fi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nh0;
public final class w3 {
    public final Paint f12684a;
    public final Paint f12685b;
    public final Paint f12686c;
    public final Drawable d;
    public final Drawable f12687e;
    public final ColorDrawable f12688f;
    public final a8.b8 f12689g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12690i = new RectF();
    public final RectF f12691j = new RectF();
    public final RectF f12692k;
    public final Paint f12693l;
    public final Drawable f12694m;
    public final Drawable f12695n;
    public final Drawable f12696o;
    public final Drawable f12697p;
    public final Drawable f12698q;
    public final Drawable f12699r;
    public final Drawable f12700s;
    public final nh0 f12701t;
    public final nh0 f12702u;

    public w3(Context context) {
        new RectF();
        this.f12692k = new RectF();
        this.f12693l = new Paint();
        this.f12694m = context.getDrawable(2131231761);
        this.f12696o = context.getDrawable(2131231747);
        this.f12695n = context.getDrawable(2131231758);
        Drawable drawable = context.getDrawable(2131231748);
        this.f12697p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12698q = context.getDrawable(2131231753);
        this.f12699r = context.getDrawable(2131231900);
        this.f12700s = context.getDrawable(2131232113);
        this.f12702u = new nh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        nh0 nh0Var = new nh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12701t = nh0Var;
        nh0Var.N(20, false, true);
        nh0Var.stop();
        Paint paint = new Paint(1);
        this.f12684a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12685b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232727);
        this.f12687e = context.getDrawable(2131232726);
        Paint paint3 = new Paint();
        this.f12686c = paint3;
        paint3.setColor(o4);
        this.f12688f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        nh0 nh0Var = this.f12702u;
        if (!z11) {
            if (z10) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            nh0Var.N(i7, false, false);
            if (!z10) {
                i10 = 0;
            }
            nh0Var.P(i10);
        } else if (z10) {
            if (nh0Var.f37801b0 > 20) {
                nh0Var.N(0, false, false);
            }
            nh0Var.P(20);
            nh0Var.start();
        } else {
            int i11 = nh0Var.f37801b0;
            if (i11 != 0 && i11 < 43) {
                nh0Var.P(43);
                nh0Var.start();
            }
        }
    }
}
