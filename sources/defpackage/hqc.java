package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class hqc extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final TextView c;
    public final TextView d;

    public hqc(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(10.0f));
        addView(be0Var, nme.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ug8.m(linearLayout, textView, nme.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = m;
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.c.setTextColor(bkb.v0(i, wjbVar));
        this.d.setTextColor(bkb.v0(bkb.y6, wjbVar));
    }
}
