package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f26786a;
    public final int f26787b;
    public final gj f26788c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.t1[] f26789e;
    public final View f26790f;
    public final x6 f26791g;

    public u6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f26791g = x6Var;
        this.f26786a = t6Var;
        this.f26787b = i7;
        this.f26788c = gjVar;
        this.d = z10;
        this.f26789e = t1VarArr;
        this.f26790f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f26786a;
        if (t6Var.getText().toString().length() > this.f26787b) {
            g0.E3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f26791g;
        tL_textWithEntities.entities = si.b0(x6Var.f27467a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f26788c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f26789e;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == x6.f27466i) {
            x6.f27466i = null;
        }
        View view = this.f26790f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
