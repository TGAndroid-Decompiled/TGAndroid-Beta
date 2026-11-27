package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class vuc extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final TextView c;
    public final TextView d;

    public vuc(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(10.0f));
        addView(de0Var, tre.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ik8.m(linearLayout, textView, tre.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.c.setTextColor(aob.v0(i, vnbVar));
        this.d.setTextColor(aob.v0(aob.z6, vnbVar));
    }
}
