package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class l24 extends FrameLayout implements vlb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final e34 e;

    public l24(e34 e34Var, Context context) {
        super(context);
        this.e = e34Var;
        zmb zmbVar = anb.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231219);
        int i = cmb.Cf;
        ylb ylbVar = e34Var.a2;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        td4.v(16.0f, 2131747941, 1, textView, null);
        anb.X(textView, i, ylbVar);
        addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, ylbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(e34Var.x(cmb.g6));
        addView(radialProgressView, qoe.e(-2, -2, 17));
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
        e34 e34Var = this.e;
        int measuredHeight = e34Var.i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (wi8.D(8.0f, measuredHeight - e34Var.c1, 3) * 1.7f);
        } else {
            L = measuredHeight - gm.L(80.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.x(cmb.g6));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
