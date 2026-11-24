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
public final class nz extends bya {
    public final tz n0;

    public nz(tz tzVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.n0 = tzVar;
    }

    @Override
    public final boolean d(float f) {
        if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        tz tzVar = this.n0;
        Context context = tzVar.getContext();
        Activity W = gm.W(context);
        d Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tzVar.J0, context);
        String M0 = jb6.M0(2131750276, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.a0(null, null, 2131750275, Integer.valueOf(tzVar.g2.d.gifts_per_round));
        pz pzVar = new pz(context, tzVar.J0, b10.d(context, 2131232769));
        pzVar.setTextSize(1, 18.0f);
        anb.X(pzVar, cmb.i5, tzVar.J0);
        anb.l(pzVar, 34, cmb.Ni, tzVar.J0);
        pzVar.setHintText(jb6.M0(2131750274, null));
        pzVar.setFocusable(true);
        pzVar.setInputType(2);
        pzVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        anb.F(pzVar, cmb.j6, cmb.k6, cmb.o7, tzVar.J0);
        pzVar.setImeOptions(268435462);
        pzVar.setBackgroundDrawable(null);
        pzVar.l1 = gm.L(24.0f);
        pzVar.setPadding(gm.L(24.0f), gm.L(6.0f), 0, gm.L(6.0f));
        pzVar.addTextChangedListener(new qz(tzVar, viewArr, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(pzVar, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        heVar.a = gm.L(300.0f);
        alertDialog$Builder.j(jb6.M0(2131750278, null), new o(tzVar, pzVar, (byte) 15));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new zg((byte) 29));
        he[] heVarArr = {heVar};
        if (Q != null) {
            gm.U2(W, Q.getClassGuid());
        }
        heVarArr[0].setOnDismissListener(new ah(pzVar, Q, W, (byte) 2));
        heVarArr[0].setOnShowListener(new jh(pzVar, (byte) 1));
        heVarArr[0].show();
        View c = heVarArr[0].c(-1);
        viewArr[0] = c;
        c.setAlpha(0.6f);
        heVarArr[0].k0 = false;
        pzVar.setSelection(pzVar.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - gm.L(48.0f)) {
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
