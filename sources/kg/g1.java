package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.d80;
public final class g1 extends LinearLayout implements z5 {
    public final e6 f17949a;
    public final d80 f17950b;
    public final ImageReceiver f17951c;
    public final TextView d;
    public boolean f17952e;

    public g1(Context context, e6 e6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17951c = imageReceiver;
        this.f17949a = e6Var;
        setOrientation(1);
        d80 d80Var = new d80();
        this.f17950b = d80Var;
        int i14 = j6.G6;
        int w02 = j6.w0(i14, e6Var);
        d80Var.g(j6.r1(0.05f, w02), j6.r1(0.15f, w02), j6.r1(0.1f, w02), j6.r1(0.3f, w02));
        d80Var.k(4.0f);
        d80Var.f33886x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        q6.U(textView, i14, e6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = hd.f24104a0;
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
        addView(textView, ja.t(-1, -2, 55, i10, 10, i11, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(hd.f24104a0 ? 5 : 3);
        i20.q(textView2, j6.f29260z6, e6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = hd.f24104a0;
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
        addView(textView2, ja.t(-1, -2, 55, i12, 0, i13, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f17951c.p0(gc.p(k20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f23610p)))), "44_44", this.f17950b, 0L, null, null, 0);
            } else {
                this.f17951c.w0(null);
            }
        }
        this.f17952e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f10;
        if (hd.f24104a0) {
            width = org.telegram.messenger.g0.L(16.0f);
        } else {
            width = getWidth() - org.telegram.messenger.g0.L(60.0f);
        }
        float f11 = width;
        ImageReceiver imageReceiver = this.f17951c;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f17952e) {
            Paint W0 = j6.W0("paintDivider", this.f17949a);
            if (W0 == null) {
                W0 = j6.f28972k0;
            }
            Paint paint = W0;
            float f12 = 21.33f;
            if (hd.f24104a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!hd.f24104a0) {
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
        d80 d80Var = this.f17950b;
        if (d80Var != null) {
            try {
                int w02 = j6.w0(j6.G6, this.f17949a);
                d80Var.g(j6.r1(0.05f, w02), j6.r1(0.15f, w02), j6.r1(0.1f, w02), j6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f17950b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
