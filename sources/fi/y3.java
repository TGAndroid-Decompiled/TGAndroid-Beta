package fi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class y3 {
    public final Paint f12527a;
    public final Paint f12528b;
    public final Paint f12529c;
    public final Drawable d;
    public final Drawable f12530e;
    public final ColorDrawable f12531f;
    public final a8.b8 f12532g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12533i = new RectF();
    public final RectF f12534j = new RectF();
    public final RectF f12535k;
    public final Paint f12536l;
    public final Drawable f12537m;
    public final Drawable f12538n;
    public final Drawable f12539o;
    public final Drawable f12540p;
    public final Drawable f12541q;
    public final Drawable f12542r;
    public final Drawable f12543s;
    public final ch0 f12544t;
    public final ch0 f12545u;

    public y3(Context context) {
        new RectF();
        this.f12535k = new RectF();
        this.f12536l = new Paint();
        this.f12537m = context.getDrawable(2131231757);
        this.f12539o = context.getDrawable(2131231743);
        this.f12538n = context.getDrawable(2131231754);
        Drawable drawable = context.getDrawable(2131231744);
        this.f12540p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12541q = context.getDrawable(2131231749);
        this.f12542r = context.getDrawable(2131231896);
        this.f12543s = context.getDrawable(2131232109);
        this.f12545u = new ch0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        ch0 ch0Var = new ch0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12544t = ch0Var;
        ch0Var.N(20, false, true);
        ch0Var.stop();
        Paint paint = new Paint(1);
        this.f12527a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12528b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232723);
        this.f12530e = context.getDrawable(2131232722);
        Paint paint3 = new Paint();
        this.f12529c = paint3;
        paint3.setColor(o4);
        this.f12531f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        ch0 ch0Var = this.f12545u;
        if (!z11) {
            if (z10) {
                i7 = 20;
            } else {
                i7 = 0;
            }
            ch0Var.N(i7, false, false);
            if (!z10) {
                i10 = 0;
            }
            ch0Var.P(i10);
        } else if (z10) {
            if (ch0Var.f33573b0 > 20) {
                ch0Var.N(0, false, false);
            }
            ch0Var.P(20);
            ch0Var.start();
        } else {
            int i11 = ch0Var.f33573b0;
            if (i11 != 0 && i11 < 43) {
                ch0Var.P(43);
                ch0Var.start();
            }
        }
    }
}
