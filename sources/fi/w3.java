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
    public final Paint f12719a;
    public final Paint f12720b;
    public final Paint f12721c;
    public final Drawable d;
    public final Drawable f12722e;
    public final ColorDrawable f12723f;
    public final a8.b8 f12724g = new a8.b8(5);
    public final RectF h = new RectF();
    public final RectF f12725i = new RectF();
    public final RectF f12726j = new RectF();
    public final RectF f12727k;
    public final Paint f12728l;
    public final Drawable f12729m;
    public final Drawable f12730n;
    public final Drawable f12731o;
    public final Drawable f12732p;
    public final Drawable f12733q;
    public final Drawable f12734r;
    public final Drawable f12735s;
    public final oh0 f12736t;
    public final oh0 f12737u;

    public w3(Context context) {
        new RectF();
        this.f12727k = new RectF();
        this.f12728l = new Paint();
        this.f12729m = context.getDrawable(2131231758);
        this.f12731o = context.getDrawable(2131231744);
        this.f12730n = context.getDrawable(2131231755);
        Drawable drawable = context.getDrawable(2131231745);
        this.f12732p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f12733q = context.getDrawable(2131231750);
        this.f12734r = context.getDrawable(2131231897);
        this.f12735s = context.getDrawable(2131232110);
        this.f12737u = new oh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        oh0 oh0Var = new oh0(2131624089, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f12736t = oh0Var;
        oh0Var.N(20, false, true);
        oh0Var.stop();
        Paint paint = new Paint(1);
        this.f12719a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f12720b = paint2;
        paint2.setColor(-1);
        int o4 = i0.a.o(-16777216, 102);
        this.d = context.getDrawable(2131232724);
        this.f12722e = context.getDrawable(2131232723);
        Paint paint3 = new Paint();
        this.f12721c = paint3;
        paint3.setColor(o4);
        this.f12723f = new ColorDrawable(i0.a.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        int i10 = 20;
        oh0 oh0Var = this.f12737u;
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
            if (oh0Var.f38213b0 > 20) {
                oh0Var.N(0, false, false);
            }
            oh0Var.P(20);
            oh0Var.start();
        } else {
            int i11 = oh0Var.f38213b0;
            if (i11 != 0 && i11 < 43) {
                oh0Var.P(43);
                oh0Var.start();
            }
        }
    }
}
