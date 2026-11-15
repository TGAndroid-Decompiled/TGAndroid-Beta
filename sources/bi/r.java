package bi;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import c8.ja;
import di.fc;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class r extends fc {
    public final y f3815n0;

    public r(y yVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3815n0 = yVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        y yVar = this.f3815n0;
        Context context = yVar.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, yVar.J0);
        String M0 = hd.M0(2131750343, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = hd.a0(null, null, 2131750342, Integer.valueOf(yVar.f3994h2.d.gifts_per_round));
        u uVar = new u(context, yVar.J0, i5.c.g(context, 2131232753));
        uVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(uVar, org.telegram.ui.ActionBar.j6.f28957j5, yVar.J0);
        org.telegram.ui.ActionBar.q6.l(uVar, 34, org.telegram.ui.ActionBar.j6.Oi, yVar.J0);
        uVar.setHintText(hd.M0(2131750341, null));
        uVar.setFocusable(true);
        uVar.setInputType(2);
        uVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        org.telegram.ui.ActionBar.q6.F(uVar, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, yVar.J0);
        uVar.setImeOptions(268435462);
        uVar.setBackgroundDrawable(null);
        uVar.l1 = org.telegram.messenger.g0.L(24.0f);
        uVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        uVar.addTextChangedListener(new v(0, yVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(uVar, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.f29614a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(hd.M0(2131750345, null), new ab.g(3, yVar, uVar));
        alertDialog$Builder.h(hd.M0(2131752589, null), new a3.l(19));
        org.telegram.ui.ActionBar.t1[] t1VarArr = {t1Var};
        if (Q != null) {
            org.telegram.messenger.g0.Z2(W, Q.getClassGuid());
        }
        t1VarArr[0].setOnDismissListener(new k(uVar, Q, W, 0));
        t1VarArr[0].setOnShowListener(new l(uVar, 0));
        t1VarArr[0].show();
        View d = t1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        t1VarArr[0].f29639k0 = false;
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
        y.d1(this.f3815n0, i7);
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        y.d1(this.f3815n0, i7);
    }
}
