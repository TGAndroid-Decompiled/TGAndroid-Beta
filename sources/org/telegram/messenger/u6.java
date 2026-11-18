package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f27123a;
    public final int f27124b;
    public final fj f27125c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u1[] f27126e;
    public final View f27127f;
    public final x6 f27128g;

    public u6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f27128g = x6Var;
        this.f27123a = t6Var;
        this.f27124b = i7;
        this.f27125c = fjVar;
        this.d = z10;
        this.f27126e = u1VarArr;
        this.f27127f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f27123a;
        if (t6Var.getText().toString().length() > this.f27124b) {
            g0.D3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f27128g;
        tL_textWithEntities.entities = ri.d0(x6Var.f27821a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f27125c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f27126e;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == x6.f27820i) {
            x6.f27820i = null;
        }
        View view = this.f27127f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
