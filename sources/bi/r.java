package bi;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import di.jc;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class r extends jc {
    public final y f3989n0;

    public r(y yVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f3989n0 = yVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        y yVar = this.f3989n0;
        Context context = yVar.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, yVar.J0);
        String M0 = gd.M0(2131750327, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = gd.a0(null, null, 2131750326, Integer.valueOf(yVar.f4199h2.d.gifts_per_round));
        u uVar = new u(context, yVar.J0, i5.c.g(context, 2131232754));
        uVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(uVar, org.telegram.ui.ActionBar.n6.f29502j5, yVar.J0);
        org.telegram.ui.ActionBar.u6.l(uVar, 34, org.telegram.ui.ActionBar.n6.Oi, yVar.J0);
        uVar.setHintText(gd.M0(2131750325, null));
        uVar.setFocusable(true);
        uVar.setInputType(2);
        uVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        org.telegram.ui.ActionBar.u6.F(uVar, org.telegram.ui.ActionBar.n6.f29523k6, org.telegram.ui.ActionBar.n6.f29541l6, org.telegram.ui.ActionBar.n6.f29615p7, yVar.J0);
        uVar.setImeOptions(268435462);
        uVar.setBackgroundDrawable(null);
        uVar.l1 = org.telegram.messenger.g0.L(24.0f);
        uVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        uVar.addTextChangedListener(new v(0, yVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(uVar, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f30024a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(gd.M0(2131750329, null), new ab.g(2, yVar, uVar));
        alertDialog$Builder.h(gd.M0(2131752578, null), new a3.l(19));
        org.telegram.ui.ActionBar.u1[] u1VarArr = {u1Var};
        if (Q != null) {
            org.telegram.messenger.g0.Y2(W, Q.getClassGuid());
        }
        u1VarArr[0].setOnDismissListener(new k(uVar, Q, W, 0));
        u1VarArr[0].setOnShowListener(new l(uVar, 0));
        u1VarArr[0].show();
        View d = u1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        u1VarArr[0].f30049k0 = false;
        uVar.setSelection(uVar.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i7) {
        y.e1(this.f3989n0, i7);
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        y.e1(this.f3989n0, i7);
    }
}
