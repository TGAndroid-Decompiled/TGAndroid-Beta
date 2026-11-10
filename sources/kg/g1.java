package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a80;
public final class g1 extends LinearLayout implements c6 {
    public final h6 f17390a;
    public final a80 f17391b;
    public final ImageReceiver f17392c;
    public final TextView d;
    public boolean f17393e;

    public g1(Context context, h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17392c = imageReceiver;
        this.f17390a = h6Var;
        setOrientation(1);
        a80 a80Var = new a80();
        this.f17391b = a80Var;
        int i14 = m6.G6;
        int w02 = m6.w0(i14, h6Var);
        a80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
        a80Var.k(4.0f);
        a80Var.f31792x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        t6.U(textView, i14, h6Var);
        textView.setTextSize(1, 16.0f);
        boolean z9 = id.f23161a0;
        if (z9) {
            i10 = 70;
        } else {
            i10 = 18;
        }
        if (z9) {
            i11 = 18;
        } else {
            i11 = 70;
        }
        addView(textView, ha.t(-1, -2, 55, i10, 10, i11, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(id.f23161a0 ? 5 : 3);
        org.telegram.messenger.camera.q.o(textView2, m6.f28300z6, h6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z10 = id.f23161a0;
        if (z10) {
            i12 = 70;
        } else {
            i12 = 18;
        }
        if (z10) {
            i13 = 18;
        } else {
            i13 = 70;
        }
        addView(textView2, ha.t(-1, -2, 55, i12, 0, i13, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z9) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f17392c.p0(hc.p(m20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22566p)))), "44_44", this.f17391b, 0L, null, null, 0);
            } else {
                this.f17392c.w0(null);
            }
        }
        this.f17393e = z9;
        setPadding(0, 0, 0, z9 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f10;
        if (id.f23161a0) {
            width = org.telegram.messenger.g0.L(16.0f);
        } else {
            width = getWidth() - org.telegram.messenger.g0.L(60.0f);
        }
        float f11 = width;
        ImageReceiver imageReceiver = this.f17392c;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f17393e) {
            Paint W0 = m6.W0("paintDivider", this.f17390a);
            if (W0 == null) {
                W0 = m6.f28013k0;
            }
            Paint paint = W0;
            float f12 = 21.33f;
            if (id.f23161a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!id.f23161a0) {
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
        a80 a80Var = this.f17391b;
        if (a80Var != null) {
            try {
                int w02 = m6.w0(m6.G6, this.f17390a);
                a80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f17391b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
