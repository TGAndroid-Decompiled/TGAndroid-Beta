package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f27161a;
    public final int f27162b;
    public final gj f27163c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.t1[] f27164e;
    public final View f27165f;
    public final x6 f27166g;

    public u6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f27166g = x6Var;
        this.f27161a = t6Var;
        this.f27162b = i7;
        this.f27163c = gjVar;
        this.d = z10;
        this.f27164e = t1VarArr;
        this.f27165f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f27161a;
        if (t6Var.getText().toString().length() > this.f27162b) {
            g0.D3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f27166g;
        tL_textWithEntities.entities = si.d0(x6Var.f27852a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f27163c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f27164e;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == x6.f27851i) {
            x6.f27851i = null;
        }
        View view = this.f27165f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
