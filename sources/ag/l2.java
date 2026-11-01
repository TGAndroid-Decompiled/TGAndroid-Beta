package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.t80;
import w7.b6;
public final class l2 extends LinearLayout implements k6 {
    public final p6 f624a;
    public final t80 f625b;
    public final ImageReceiver f626c;
    public final TextView d;
    public boolean e;

    public l2(Context context, p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f626c = imageReceiver;
        this.f624a = p6Var;
        setOrientation(1);
        t80 t80Var = new t80();
        this.f625b = t80Var;
        int i15 = t6.G6;
        int w02 = t6.w0(i15, p6Var);
        t80Var.g(t6.r1(0.05f, w02), t6.r1(0.15f, w02), t6.r1(0.1f, w02), t6.r1(0.3f, w02));
        t80Var.k(4.0f);
        t80Var.f30592x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        a7.V(textView, i15, p6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = dd.X;
        if (z10) {
            i11 = 70;
        } else {
            i11 = 18;
        }
        if (z10) {
            i12 = 18;
        } else {
            i12 = 70;
        }
        addView(textView, b6.t(-1, -2, 55, i11, 10, i12, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(dd.X ? 5 : 3);
        a30.p(textView2, t6.f21331z6, p6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = dd.X;
        if (z11) {
            i13 = 70;
        } else {
            i13 = 18;
        }
        if (z11) {
            i14 = 18;
        } else {
            i14 = 70;
        }
        addView(textView2, b6.t(-1, -2, 55, i13, 0, i14, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f626c.p0(jc.p(c30.b(tL_businessLocation.geo_point, org.telegram.messenger.i0.L(44.0f), org.telegram.messenger.i0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.f16171p)))), "44_44", this.f625b, 0L, null, null, 0);
            } else {
                this.f626c.w0(null);
            }
        }
        this.e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f7;
        if (dd.X) {
            width = org.telegram.messenger.i0.L(16.0f);
        } else {
            width = getWidth() - org.telegram.messenger.i0.L(60.0f);
        }
        float f10 = width;
        ImageReceiver imageReceiver = this.f626c;
        imageReceiver.y0(f10, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(44.0f), org.telegram.messenger.i0.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = t6.W0("paintDivider", this.f624a);
            if (W0 == null) {
                W0 = t6.f21053k0;
            }
            Paint paint = W0;
            float f11 = 21.33f;
            if (dd.X) {
                f7 = 0.0f;
            } else {
                f7 = 21.33f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!dd.X) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width2 - org.telegram.messenger.i0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        t80 t80Var = this.f625b;
        if (t80Var != null) {
            try {
                int w02 = t6.w0(t6.G6, this.f624a);
                t80Var.g(t6.r1(0.05f, w02), t6.r1(0.15f, w02), t6.r1(0.1f, w02), t6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f625b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
