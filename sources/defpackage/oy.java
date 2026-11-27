package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class oy extends b0b {
    public final uy n0;

    public oy(uy uyVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.n0 = uyVar;
    }

    @Override
    public final boolean d(float f) {
        if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        uy uyVar = this.n0;
        Context context = uyVar.getContext();
        Activity W = hl.W(context);
        e Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uyVar.J0, context);
        String M0 = ob6.M0(2131750304, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.a0(null, null, 2131750303, Integer.valueOf(uyVar.g2.d.gifts_per_round));
        qy qyVar = new qy(context, uyVar.J0, c00.e(context, 2131232775));
        qyVar.setTextSize(1, 18.0f);
        yob.X(qyVar, aob.j5, uyVar.J0);
        yob.l(qyVar, 34, aob.Oi, uyVar.J0);
        qyVar.setHintText(ob6.M0(2131750302, null));
        qyVar.setFocusable(true);
        qyVar.setInputType(2);
        qyVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        yob.F(qyVar, aob.k6, aob.l6, aob.p7, uyVar.J0);
        qyVar.setImeOptions(268435462);
        qyVar.setBackgroundDrawable(null);
        qyVar.l1 = hl.L(24.0f);
        qyVar.setPadding(hl.L(24.0f), hl.L(6.0f), 0, hl.L(6.0f));
        qyVar.addTextChangedListener(new ry(uyVar, viewArr, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(qyVar, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        idVar.a = hl.L(300.0f);
        alertDialog$Builder.j(ob6.M0(2131750306, null), new o(uyVar, qyVar, (byte) 15));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new bg((byte) 29));
        id[] idVarArr = {idVar};
        if (Q != null) {
            hl.U2(W, Q.getClassGuid());
        }
        idVarArr[0].setOnDismissListener(new cf(qyVar, Q, W, (byte) 2));
        idVarArr[0].setOnShowListener(new ig(qyVar, (byte) 1));
        idVarArr[0].show();
        View c = idVarArr[0].c(-1);
        viewArr[0] = c;
        c.setAlpha(0.6f);
        idVarArr[0].k0 = false;
        qyVar.setSelection(qyVar.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - hl.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i) {
        this.n0.b1(i);
    }

    @Override
    public final void setValue(int i) {
        super.setValue(i);
        this.n0.b1(i);
    }
}
