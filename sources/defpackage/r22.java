package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class r22 extends FrameLayout implements vlb {
    public final ylb a;
    public final TextView b;
    public final TextView c;

    public r22(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setPadding(0, gm.L(42.0f), 0, gm.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.r(-1, -2, 17));
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(2131624315, gm.L(120.0f), gm.L(120.0f)));
        linearLayout.addView(bf0Var, qoe.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        linearLayout.addView(m, qoe.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.x6));
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
        this.c.setTextColor(cmb.v0(cmb.x6, ylbVar));
    }
}
