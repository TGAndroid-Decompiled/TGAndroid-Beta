package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f25735a;
    public final int f25736b;
    public final ij f25737c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u1[] f25738e;
    public final View f25739f;
    public final x6 f25740g;

    public u6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f25740g = x6Var;
        this.f25735a = t6Var;
        this.f25736b = i7;
        this.f25737c = ijVar;
        this.d = z9;
        this.f25738e = u1VarArr;
        this.f25739f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f25735a;
        if (t6Var.getText().toString().length() > this.f25736b) {
            g0.F3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f25740g;
        tL_textWithEntities.entities = ui.b0(x6Var.f26446a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f25737c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f25738e;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == x6.f26445i) {
            x6.f26445i = null;
        }
        View view = this.f25739f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
