package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.w70;
public final class h1 extends LinearLayout implements z5 {
    public final e6 f18326a;
    public final w70 f18327b;
    public final ImageReceiver f18328c;
    public final TextView d;
    public boolean f18329e;

    public h1(Context context, e6 e6Var) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f18328c = imageReceiver;
        this.f18326a = e6Var;
        setOrientation(1);
        w70 w70Var = new w70();
        this.f18327b = w70Var;
        int i14 = k6.G6;
        int w02 = k6.w0(i14, e6Var);
        w70Var.g(k6.r1(0.05f, w02), k6.r1(0.15f, w02), k6.r1(0.1f, w02), k6.r1(0.3f, w02));
        w70Var.k(4.0f);
        w70Var.f39944x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        r6.V(textView, i14, e6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = bd.f21784a0;
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
        addView(textView, mf.t(-1, -2, 55, i10, 10, i11, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(bd.f21784a0 ? 5 : 3);
        org.telegram.messenger.camera.q.o(textView2, k6.f28290z6, e6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = bd.f21784a0;
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
        addView(textView2, mf.t(-1, -2, 55, i12, 0, i13, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f18328c.p0(ac.p(e20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22607p)))), "44_44", this.f18327b, 0L, null, null, 0);
            } else {
                this.f18328c.w0(null);
            }
        }
        this.f18329e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f10;
        if (bd.f21784a0) {
            width = org.telegram.messenger.g0.L(16.0f);
        } else {
            width = getWidth() - org.telegram.messenger.g0.L(60.0f);
        }
        float f11 = width;
        ImageReceiver imageReceiver = this.f18328c;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18329e) {
            Paint W0 = k6.W0("paintDivider", this.f18326a);
            if (W0 == null) {
                W0 = k6.f28002k0;
            }
            Paint paint = W0;
            float f12 = 21.33f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!bd.f21784a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width2 - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        w70 w70Var = this.f18327b;
        if (w70Var != null) {
            try {
                int w02 = k6.w0(k6.G6, this.f18326a);
                w70Var.g(k6.r1(0.05f, w02), k6.r1(0.15f, w02), k6.r1(0.1f, w02), k6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18327b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
