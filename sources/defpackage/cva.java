package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cva extends LinearLayout {
    public final int a;
    public final wjb b;
    public final be0 c;
    public final jia d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public cva(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = i;
        this.b = wjbVar;
        setOrientation(0);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(46.0f));
        addView(be0Var, nme.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        int i2 = bkb.F6;
        zkb.W(jiaVar, i2, wjbVar);
        jiaVar.setTextSize(16);
        jiaVar.setTypeface(gl.o());
        kk7.i(jiaVar);
        linearLayout.addView(jiaVar, nme.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView m = ug8.m(linearLayout, textView, nme.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = m;
        int i3 = bkb.y6;
        zkb.X(m, i3, wjbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, nme.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        tb4.w(textView2, i2, wjbVar, 1, 16.0f);
        textView2.setGravity(5);
        TextView m2 = ug8.m(linearLayout2, textView2, nme.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = m2;
        zkb.X(m2, i3, wjbVar);
        m2.setTextSize(1, 13.0f);
        m2.setGravity(5);
        linearLayout2.addView(m2, nme.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(gl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.r) {
            f = 68.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
    }
}
