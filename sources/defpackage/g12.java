package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class g12 extends FrameLayout implements tjb {
    public final wjb a;
    public final TextView b;
    public final TextView c;

    public g12(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setPadding(0, gl.L(42.0f), 0, gl.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.r(-1, -2, 17));
        be0 be0Var = new be0(context);
        be0Var.setImageDrawable(new oy8(2131624315, gl.L(120.0f), gl.L(120.0f)));
        linearLayout.addView(be0Var, nme.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        linearLayout.addView(m, nme.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.x6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.b.setTextColor(bkb.v0(i, wjbVar));
        this.c.setTextColor(bkb.v0(bkb.x6, wjbVar));
    }
}
