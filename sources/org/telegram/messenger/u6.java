package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f27221a;
    public final int f27222b;
    public final fj f27223c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.t1[] f27224e;
    public final View f27225f;
    public final x6 f27226g;

    public u6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f27226g = x6Var;
        this.f27221a = t6Var;
        this.f27222b = i7;
        this.f27223c = fjVar;
        this.d = z10;
        this.f27224e = t1VarArr;
        this.f27225f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f27221a;
        if (t6Var.getText().toString().length() > this.f27222b) {
            g0.D3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f27226g;
        tL_textWithEntities.entities = ri.d0(x6Var.f27916a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f27223c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f27224e;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == x6.f27915i) {
            x6.f27915i = null;
        }
        View view = this.f27225f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
