package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class d14 extends FrameLayout implements snb {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final o24 d;

    public d14(o24 o24Var, Context context) {
        super(context);
        this.d = o24Var;
        xob xobVar = yob.a;
        in inVar = new in(getContext(), false, false, false);
        inVar.b(0.3f, 250L, k43.h);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        int i = aob.Ji;
        vnb vnbVar = o24Var.a2;
        yob.U(inVar, i, vnbVar);
        inVar.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(rnb.e(o24Var.y(aob.Fi), 8.0f));
        frameLayout.addView(inVar, tre.e(-1, -2, 17));
        addView(frameLayout, tre.c(-1.0f, -1));
        ok8 ok8Var = new ok8(vnbVar, getContext(), false);
        ok8Var.setIcon(2131624310);
        addView(ok8Var, tre.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(hl.L(6.0f), hl.L(11.0f), hl.L(6.0f), hl.L(11.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + hl.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int y = this.d.y(aob.Fi);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null && (y != this.a || this.b != aob.I.o())) {
                this.b = aob.I.o();
                this.a = y;
                aob.F1(frameLayout.getBackground(), y, false);
                aob.F1(frameLayout.getBackground(), rnb.b(y), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
