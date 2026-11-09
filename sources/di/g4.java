package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ah0;
public final class g4 {
    public final Paint f9013a;
    public final Paint f9014b;
    public final Paint f9015c;
    public final Drawable d;
    public final Drawable f9016e;
    public final ColorDrawable f9017f;
    public final a8.b8 f9018g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f9019i = new RectF();
    public final RectF f9020j = new RectF();
    public final RectF f9021k;
    public final Paint f9022l;
    public final Drawable f9023m;
    public final Drawable f9024n;
    public final Drawable f9025o;
    public final Drawable f9026p;
    public final Drawable f9027q;
    public final Drawable f9028r;
    public final Drawable f9029s;
    public final ah0 f9030t;
    public final ah0 f9031u;

    public g4(Context context) {
        new RectF();
        this.f9021k = new RectF();
        this.f9022l = new Paint();
        this.f9023m = context.getDrawable(2131231757);
        this.f9025o = context.getDrawable(2131231743);
        this.f9024n = context.getDrawable(2131231754);
        Drawable drawable = context.getDrawable(2131231744);
        this.f9026p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f9027q = context.getDrawable(2131231749);
        this.f9028r = context.getDrawable(2131231896);
        this.f9029s = context.getDrawable(2131232108);
        this.f9031u = new ah0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        ah0 ah0Var = new ah0(2131624088, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f9030t = ah0Var;
        ah0Var.N(20, false, true);
        ah0Var.stop();
        Paint paint = new Paint(1);
        this.f9013a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f9014b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232722);
        this.f9016e = context.getDrawable(2131232721);
        Paint paint3 = new Paint();
        this.f9015c = paint3;
        paint3.setColor(o4);
        this.f9017f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        int i10 = 20;
        ah0 ah0Var = this.f9031u;
        if (!z10) {
            if (z9) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            ah0Var.N(i7, false, false);
            if (!z9) {
                i10 = 0;
            }
            ah0Var.P(i10);
        } else if (z9) {
            if (ah0Var.f31820a0 > 20) {
                ah0Var.N(0, false, false);
            }
            ah0Var.P(20);
            ah0Var.start();
        } else {
            int i11 = ah0Var.f31820a0;
            if (i11 != 0 && i11 < 43) {
                ah0Var.P(43);
                ah0Var.start();
            }
        }
    }
}
