package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class jsc extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final TextView c;
    public final TextView d;

    public jsc(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(10.0f));
        addView(bf0Var, qoe.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = wi8.m(linearLayout, textView, qoe.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.c.setTextColor(cmb.v0(i, ylbVar));
        this.d.setTextColor(cmb.v0(cmb.y6, ylbVar));
    }
}
