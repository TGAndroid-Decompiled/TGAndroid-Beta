package fi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mh0;
public final class w3 {
    public final Paint f12677a;
    public final Paint f12678b;
    public final Paint f12679c;
    public final Drawable d;
    public final Drawable f12680e;
    public final ColorDrawable f12681f;
    public final a8.b8 f12682g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12683i = new RectF();
    public final RectF f12684j = new RectF();
    public final RectF f12685k;
    public final Paint f12686l;
    public final Drawable f12687m;
    public final Drawable f12688n;
    public final Drawable f12689o;
    public final Drawable f12690p;
    public final Drawable f12691q;
    public final Drawable f12692r;
    public final Drawable f12693s;
    public final mh0 f12694t;
    public final mh0 f12695u;

    public w3(Context context) {
        new RectF();
        this.f12685k = new RectF();
        this.f12686l = new Paint();
        this.f12687m = context.getDrawable(2131231758);
        this.f12689o = context.getDrawable(2131231744);
        this.f12688n = context.getDrawable(2131231755);
        Drawable drawable = context.getDrawable(2131231745);
        this.f12690p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12691q = context.getDrawable(2131231750);
        this.f12692r = context.getDrawable(2131231897);
        this.f12693s = context.getDrawable(2131232110);
        this.f12695u = new mh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        mh0 mh0Var = new mh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12694t = mh0Var;
        mh0Var.N(20, false, true);
        mh0Var.stop();
        Paint paint = new Paint(1);
        this.f12677a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12678b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232724);
        this.f12680e = context.getDrawable(2131232723);
        Paint paint3 = new Paint();
        this.f12679c = paint3;
        paint3.setColor(o4);
        this.f12681f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        mh0 mh0Var = this.f12695u;
        if (!z11) {
            if (z10) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            mh0Var.N(i7, false, false);
            if (!z10) {
                i10 = 0;
            }
            mh0Var.P(i10);
        } else if (z10) {
            if (mh0Var.f37482b0 > 20) {
                mh0Var.N(0, false, false);
            }
            mh0Var.P(20);
            mh0Var.start();
        } else {
            int i11 = mh0Var.f37482b0;
            if (i11 != 0 && i11 < 43) {
                mh0Var.P(43);
                mh0Var.start();
            }
        }
    }
}
