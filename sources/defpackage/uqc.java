package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class uqc extends LinearLayout implements vlb {
    public final ylb a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public uqc(Context context, ylb ylbVar) {
        super(context);
        setOrientation(0);
        this.a = ylbVar;
        setPadding(gm.L(20.0f), 0, gm.L(13.0f), 0);
        LinearLayout i = hg9.i(context, 1);
        i.setPadding(0, gm.L(10.0f), 0, gm.L(10.0f));
        addView(i, qoe.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.n1("fonts/rmono.ttf"));
        TextView m = wi8.m(i, textView, qoe.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        i.addView(m, qoe.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230876);
        addView(imageView, qoe.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.b.setTextColor(cmb.v0(i, ylbVar));
        int i2 = cmb.y6;
        this.c.setTextColor(cmb.v0(i2, ylbVar));
        this.d.setColorFilter(new PorterDuffColorFilter(cmb.v0(i2, ylbVar), PorterDuff.Mode.SRC_IN));
    }
}
