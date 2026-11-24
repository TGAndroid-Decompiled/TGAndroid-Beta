package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ny extends yva {
    public final ty n0;

    public ny(ty tyVar, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.n0 = tyVar;
    }

    @Override
    public final boolean d(float f) {
        if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        ty tyVar = this.n0;
        Context context = tyVar.getContext();
        Activity W = gl.W(context);
        d Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tyVar.J0, context);
        String M0 = k96.M0(2131750327, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.a0(null, null, 2131750326, Integer.valueOf(tyVar.g2.d.gifts_per_round));
        py pyVar = new py(context, tyVar.J0, b00.d(context, 2131232757));
        pyVar.setTextSize(1, 18.0f);
        zkb.X(pyVar, bkb.i5, tyVar.J0);
        zkb.l(pyVar, 34, bkb.Ni, tyVar.J0);
        pyVar.setHintText(k96.M0(2131750325, null));
        pyVar.setFocusable(true);
        pyVar.setInputType(2);
        pyVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        zkb.F(pyVar, bkb.j6, bkb.k6, bkb.o7, tyVar.J0);
        pyVar.setImeOptions(268435462);
        pyVar.setBackgroundDrawable(null);
        pyVar.l1 = gl.L(24.0f);
        pyVar.setPadding(gl.L(24.0f), gl.L(6.0f), 0, gl.L(6.0f));
        pyVar.addTextChangedListener(new qy(tyVar, viewArr, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(pyVar, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        hdVar.a = gl.L(300.0f);
        alertDialog$Builder.j(k96.M0(2131750329, null), new o(tyVar, pyVar, (byte) 15));
        alertDialog$Builder.g(k96.M0(2131752577, null), new ag((byte) 29));
        hd[] hdVarArr = {hdVar};
        if (Q != null) {
            gl.V2(W, Q.getClassGuid());
        }
        hdVarArr[0].setOnDismissListener(new bg(pyVar, Q, W, (byte) 2));
        hdVarArr[0].setOnShowListener(new jg(pyVar, (byte) 1));
        hdVarArr[0].show();
        View c = hdVarArr[0].c(-1);
        viewArr[0] = c;
        c.setAlpha(0.6f);
        hdVarArr[0].k0 = false;
        pyVar.setSelection(pyVar.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - gl.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i) {
        this.n0.a1(i);
    }

    @Override
    public final void setValue(int i) {
        super.setValue(i);
        this.n0.a1(i);
    }
}
