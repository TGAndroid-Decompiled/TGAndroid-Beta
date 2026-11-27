package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class sk7 extends nx0 {
    public final ir1 l1;
    public final ArrayList m1;
    public boolean n1;
    public FrameLayout o1;
    public Integer p1;

    public sk7(Context context, vnb vnbVar, View... viewArr) {
        super(1, vnbVar, context, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        qk7 qk7Var = new qk7(this, context);
        this.b = qk7Var;
        ir1 ir1Var = new ir1((byte) 3, context, this);
        this.l1 = ir1Var;
        int i = this.u0;
        ir1Var.setPadding(i, 0, i, hl.n);
        qk7Var.addView(ir1Var, tre.e(-1, -1, 119));
    }

    @Override
    public final boolean D() {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void E0(rk7 rk7Var) {
        this.m1.add(rk7Var);
        if (this.n1) {
            ir1 ir1Var = this.l1;
            ir1Var.E(false);
            ir1Var.m(false);
        }
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void F0(int i) {
        this.p1 = Integer.valueOf(i);
        s0(i);
        K(i);
        ((qk7) this.b).invalidate();
    }

    public final void G0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.o1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.o1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.o1.setClipToPadding(false);
            this.b.addView(this.o1, tre.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.o1.addView(linearLayout, tre.e(-1, -2, 80));
        ir1 ir1Var = this.l1;
        int i = this.u0;
        ir1Var.setPadding(i, 0, i, 0);
        ((qk7) this.b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        ir1 ir1Var = this.l1;
        if (ir1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : ir1Var.getViewPages()) {
            if (view != null) {
                hl.t1(view);
            }
        }
        ir1Var.F(ir1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.n1) {
            this.n1 = true;
            this.l1.setAdapter(new mm2(this, (byte) 3));
        }
        super.show();
        Integer num = this.p1;
        if (num != null) {
            y0(num.intValue());
        }
    }
}
