package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class a14 extends FrameLayout implements tjb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final t14 e;

    public a14(t14 t14Var, Context context) {
        super(context);
        this.e = t14Var;
        ykb ykbVar = zkb.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231218);
        int i = bkb.Cf;
        wjb wjbVar = t14Var.a2;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        tb4.u(16.0f, 2131748015, 1, textView, null);
        zkb.X(textView, i, wjbVar);
        addView(textView, nme.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, wjbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(t14Var.y(bkb.g6));
        addView(radialProgressView, nme.e(-2, -2, 17));
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
        t14 t14Var = this.e;
        int measuredHeight = t14Var.i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (ug8.D(8.0f, measuredHeight - t14Var.c1, 3) * 1.7f);
        } else {
            L = measuredHeight - gl.L(80.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.y(bkb.g6));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
