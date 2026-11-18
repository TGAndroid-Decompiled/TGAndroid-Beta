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
    public final Paint f12680a;
    public final Paint f12681b;
    public final Paint f12682c;
    public final Drawable d;
    public final Drawable f12683e;
    public final ColorDrawable f12684f;
    public final a8.b8 f12685g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12686i = new RectF();
    public final RectF f12687j = new RectF();
    public final RectF f12688k;
    public final Paint f12689l;
    public final Drawable f12690m;
    public final Drawable f12691n;
    public final Drawable f12692o;
    public final Drawable f12693p;
    public final Drawable f12694q;
    public final Drawable f12695r;
    public final Drawable f12696s;
    public final mh0 f12697t;
    public final mh0 f12698u;

    public w3(Context context) {
        new RectF();
        this.f12688k = new RectF();
        this.f12689l = new Paint();
        this.f12690m = context.getDrawable(2131231758);
        this.f12692o = context.getDrawable(2131231744);
        this.f12691n = context.getDrawable(2131231755);
        Drawable drawable = context.getDrawable(2131231745);
        this.f12693p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12694q = context.getDrawable(2131231750);
        this.f12695r = context.getDrawable(2131231897);
        this.f12696s = context.getDrawable(2131232110);
        this.f12698u = new mh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        mh0 mh0Var = new mh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12697t = mh0Var;
        mh0Var.N(20, false, true);
        mh0Var.stop();
        Paint paint = new Paint(1);
        this.f12680a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12681b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232724);
        this.f12683e = context.getDrawable(2131232723);
        Paint paint3 = new Paint();
        this.f12682c = paint3;
        paint3.setColor(o4);
        this.f12684f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        mh0 mh0Var = this.f12698u;
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
