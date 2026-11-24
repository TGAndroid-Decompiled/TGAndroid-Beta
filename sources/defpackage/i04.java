package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class i04 extends FrameLayout implements tjb {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final t14 d;

    public i04(t14 t14Var, Context context) {
        super(context);
        this.d = t14Var;
        ykb ykbVar = zkb.a;
        hn hnVar = new hn(getContext(), false, false, false);
        hnVar.b(0.3f, 250L, s33.h);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        int i = bkb.Ii;
        wjb wjbVar = t14Var.a2;
        zkb.U(hnVar, i, wjbVar);
        hnVar.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(sjb.e(t14Var.y(bkb.Ei), 8.0f));
        frameLayout.addView(hnVar, nme.e(-1, -2, 17));
        addView(frameLayout, nme.c(-1.0f, -1));
        ah8 ah8Var = new ah8(wjbVar, getContext(), false);
        ah8Var.setIcon(2131624309);
        addView(ah8Var, nme.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(6.0f), gl.L(11.0f), gl.L(6.0f), gl.L(11.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gl.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int y = this.d.y(bkb.Ei);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null && (y != this.a || this.b != bkb.I.o())) {
                this.b = bkb.I.o();
                this.a = y;
                bkb.F1(frameLayout.getBackground(), y, false);
                bkb.F1(frameLayout.getBackground(), sjb.b(y), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
