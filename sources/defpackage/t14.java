package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class t14 extends FrameLayout implements vlb {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final e34 d;

    public t14(e34 e34Var, Context context) {
        super(context);
        this.d = e34Var;
        zmb zmbVar = anb.a;
        io ioVar = new io(getContext(), false, false, false);
        ioVar.b(0.3f, 250L, d53.h);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        int i = cmb.Ii;
        ylb ylbVar = e34Var.a2;
        anb.U(ioVar, i, ylbVar);
        ioVar.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(ulb.e(e34Var.x(cmb.Ei), 8.0f));
        frameLayout.addView(ioVar, qoe.e(-1, -2, 17));
        addView(frameLayout, qoe.c(-1.0f, -1));
        cj8 cj8Var = new cj8(ylbVar, getContext(), false);
        cj8Var.setIcon(2131624310);
        addView(cj8Var, qoe.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(6.0f), gm.L(11.0f), gm.L(6.0f), gm.L(11.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gm.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x = this.d.x(cmb.Ei);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null && (x != this.a || this.b != cmb.I.o())) {
                this.b = cmb.I.o();
                this.a = x;
                cmb.F1(frameLayout.getBackground(), x, false);
                cmb.F1(frameLayout.getBackground(), ulb.b(x), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
