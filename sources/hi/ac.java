package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
public final class ac extends View {
    public final nh0 f14203a;
    public final org.telegram.ui.Components.m6 f14204b;
    public final Paint f14205c;
    public final Paint d;
    public final org.telegram.ui.Components.lc f14206e;
    public boolean f14207f;
    public final org.telegram.ui.Components.c6 h;

    public ac(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f14205c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f14206e = new org.telegram.ui.Components.lc(this);
        kr krVar = kr.h;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 240L, krVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        nh0 nh0Var = new nh0(2131624043, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f14203a = nh0Var;
        nh0Var.R(this);
        nh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        nh0Var.h = true;
        nh0Var.P(0);
        nh0Var.J(true);
        nh0Var.start();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, false);
        this.f14204b = m6Var;
        m6Var.n(0.3f, 250L, krVar);
        m6Var.N = org.telegram.messenger.g0.f24226q.x;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.u(-1);
        m6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        m6Var.t(gd.N0(2131743698, null), true, true);
        m6Var.f37394b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        this.f14206e.c(z10);
        if (!z10 && !z11) {
            i7 = 2131743698;
        } else {
            i7 = 2131743697;
        }
        boolean z12 = true;
        this.f14204b.t(gd.N0(i7, null), true, true);
        int i10 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f14207f = z12;
        nh0 nh0Var = this.f14203a;
        if (z12) {
            if (nh0Var.f37801b0 > 34) {
                nh0Var.N(0, false, false);
            }
            nh0Var.P(33);
            nh0Var.start();
        } else {
            if (z11) {
                i10 = 66;
            }
            nh0Var.P(i10);
            nh0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f14207f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f14205c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        nh0 nh0Var = this.f14203a;
        nh0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        nh0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.f14204b;
        m6Var.setBounds(0, L3, width2, height2);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14204b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
