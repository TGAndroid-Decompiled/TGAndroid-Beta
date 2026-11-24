package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class mk7 extends my0 {
    public final hs1 l1;
    public final ArrayList m1;
    public boolean n1;
    public FrameLayout o1;
    public Integer p1;

    public mk7(Context context, ylb ylbVar, View... viewArr) {
        super(1, ylbVar, context, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        kk7 kk7Var = new kk7(this, context);
        this.b = kk7Var;
        hs1 hs1Var = new hs1((byte) 3, context, this);
        this.l1 = hs1Var;
        int i = this.u0;
        hs1Var.setPadding(i, 0, i, gm.n);
        kk7Var.addView(hs1Var, qoe.e(-1, -1, 119));
    }

    @Override
    public final boolean C() {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void D0(lk7 lk7Var) {
        this.m1.add(lk7Var);
        if (this.n1) {
            hs1 hs1Var = this.l1;
            hs1Var.D(false);
            hs1Var.m(false);
        }
    }

    public final void E0(int i) {
        this.p1 = Integer.valueOf(i);
        s0(i);
        K(i);
        ((kk7) this.b).invalidate();
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void F0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.o1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.o1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.o1.setClipToPadding(false);
            this.b.addView(this.o1, qoe.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.o1.addView(linearLayout, qoe.e(-1, -2, 80));
        hs1 hs1Var = this.l1;
        int i = this.u0;
        hs1Var.setPadding(i, 0, i, 0);
        ((kk7) this.b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        hs1 hs1Var = this.l1;
        if (hs1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : hs1Var.getViewPages()) {
            if (view != null) {
                gm.t1(view);
            }
        }
        hs1Var.E(hs1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.n1) {
            this.n1 = true;
            this.l1.setAdapter(new fn2(this, (byte) 3));
        }
        super.show();
        Integer num = this.p1;
        if (num != null) {
            x0(num.intValue());
        }
    }
}
