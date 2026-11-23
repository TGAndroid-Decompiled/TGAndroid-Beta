package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.q80;
public final class i1 extends LinearLayout implements b6 {
    public final h6 f18382a;
    public final q80 f18383b;
    public final ImageReceiver f18384c;
    public final TextView d;
    public boolean f18385e;

    public i1(Context context, h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f18384c = imageReceiver;
        this.f18382a = h6Var;
        setOrientation(1);
        q80 q80Var = new q80();
        this.f18383b = q80Var;
        int i14 = m6.G6;
        int w02 = m6.w0(i14, h6Var);
        q80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
        q80Var.k(4.0f);
        q80Var.f38833x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        t6.U(textView, i14, h6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = hd.f24444a0;
        if (z10) {
            i10 = 70;
        } else {
            i10 = 18;
        }
        if (z10) {
            i11 = 18;
        } else {
            i11 = 70;
        }
        addView(textView, ma.t(-1, -2, 55, i10, 10, i11, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(hd.f24444a0 ? 5 : 3);
        o10.r(textView2, m6.f29792z6, h6Var, null, 2131752677);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = hd.f24444a0;
        if (z11) {
            i12 = 70;
        } else {
            i12 = 18;
        }
        if (z11) {
            i13 = 18;
        } else {
            i13 = 70;
        }
        addView(textView2, ma.t(-1, -2, 55, i12, 0, i13, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f18384c.p0(gc.p(i20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f24045p)))), "44_44", this.f18383b, 0L, null, null, 0);
            } else {
                this.f18384c.w0(null);
            }
        }
        this.f18385e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f10;
        if (hd.f24444a0) {
            width = org.telegram.messenger.g0.L(16.0f);
        } else {
            width = getWidth() - org.telegram.messenger.g0.L(60.0f);
        }
        float f11 = width;
        ImageReceiver imageReceiver = this.f18384c;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18385e) {
            Paint W0 = m6.W0("paintDivider", this.f18382a);
            if (W0 == null) {
                W0 = m6.f29504k0;
            }
            Paint paint = W0;
            float f12 = 21.33f;
            if (hd.f24444a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!hd.f24444a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width2 - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        q80 q80Var = this.f18383b;
        if (q80Var != null) {
            try {
                int w02 = m6.w0(m6.G6, this.f18382a);
                q80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18383b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
