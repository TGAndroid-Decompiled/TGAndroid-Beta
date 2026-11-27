package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class v14 extends FrameLayout implements snb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final o24 e;

    public v14(o24 o24Var, Context context) {
        super(context);
        this.e = o24Var;
        xob xobVar = yob.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231218);
        int i = aob.Df;
        vnb vnbVar = o24Var.a2;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        qd4.u(16.0f, 2131747938, 1, textView, null);
        yob.X(textView, i, vnbVar);
        addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, vnbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(o24Var.y(aob.h6));
        addView(radialProgressView, tre.e(-2, -2, 17));
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (this.d != z) {
            this.d = z;
            int i3 = 0;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            this.a.setVisibility(i);
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            this.b.setVisibility(i2);
            if (!z) {
                i3 = 8;
            }
            this.c.setVisibility(i3);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        o24 o24Var = this.e;
        int measuredHeight = o24Var.i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (ik8.D(8.0f, measuredHeight - o24Var.c1, 3) * 1.7f);
        } else {
            L = measuredHeight - hl.L(80.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.y(aob.h6));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
