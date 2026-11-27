package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class w12 extends FrameLayout implements snb {
    public final vnb a;
    public final TextView b;
    public final TextView c;

    public w12(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setPadding(0, hl.L(42.0f), 0, hl.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.r(-1, -2, 17));
        de0 de0Var = new de0(context);
        de0Var.setImageDrawable(new b29(2131624315, hl.L(120.0f), hl.L(120.0f)));
        linearLayout.addView(de0Var, tre.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        linearLayout.addView(m, tre.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.y6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.b.setTextColor(aob.v0(i, vnbVar));
        this.c.setTextColor(aob.v0(aob.y6, vnbVar));
    }
}
