package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f26784a;
    public final int f26785b;
    public final gj f26786c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.t1[] f26787e;
    public final View f26788f;
    public final x6 f26789g;

    public u6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f26789g = x6Var;
        this.f26784a = t6Var;
        this.f26785b = i7;
        this.f26786c = gjVar;
        this.d = z10;
        this.f26787e = t1VarArr;
        this.f26788f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f26784a;
        if (t6Var.getText().toString().length() > this.f26785b) {
            g0.E3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f26789g;
        tL_textWithEntities.entities = si.b0(x6Var.f27466a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f26786c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f26787e;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == x6.f27465i) {
            x6.f27465i = null;
        }
        View view = this.f26788f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
