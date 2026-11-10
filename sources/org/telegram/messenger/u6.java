package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f25739a;
    public final int f25740b;
    public final ij f25741c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u1[] f25742e;
    public final View f25743f;
    public final x6 f25744g;

    public u6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f25744g = x6Var;
        this.f25739a = t6Var;
        this.f25740b = i7;
        this.f25741c = ijVar;
        this.d = z9;
        this.f25742e = u1VarArr;
        this.f25743f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f25739a;
        if (t6Var.getText().toString().length() > this.f25740b) {
            g0.F3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f25744g;
        tL_textWithEntities.entities = ui.b0(x6Var.f26450a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f25741c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f25742e;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == x6.f26449i) {
            x6.f26449i = null;
        }
        View view = this.f25743f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
