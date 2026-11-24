package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class f9c extends LinearLayout implements vlb {
    public final ylb a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public int r;

    public f9c(Context context, ylb ylbVar) {
        super(context);
        setOrientation(0);
        this.a = ylbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, qoe.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gm.L(10.0f), 0, gm.L(10.0f));
        addView(linearLayout, qoe.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = m;
        m.setTextSize(1, 13.0f);
        linearLayout.addView(m, qoe.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, qoe.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i;
        int i2;
        int i3;
        if (this.n) {
            i = cmb.p7;
        } else if (this.h) {
            i = cmb.m6;
        } else {
            i = cmb.F6;
        }
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        int i4 = this.r;
        ImageView imageView = this.f;
        ImageView imageView2 = this.b;
        if (v0 != i4 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.r = v0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(v0, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        }
        if (this.n) {
            i2 = cmb.o7;
        } else if (this.h) {
            i2 = cmb.m6;
        } else {
            i2 = cmb.F6;
        }
        this.d.setTextColor(cmb.v0(i2, ylbVar));
        if (this.n) {
            i3 = cmb.o7;
        } else if (this.h) {
            i3 = cmb.m6;
        } else {
            i3 = cmb.x6;
        }
        this.e.setTextColor(cmb.v0(i3, ylbVar));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
