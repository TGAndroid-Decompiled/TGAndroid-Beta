package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class x6 implements TextView.OnEditorActionListener {
    public final w6 f19214a;
    public final int f19215b;
    public final jj f19216c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.x1[] e;
    public final View f19217f;
    public final a7 f19218g;

    public x6(a7 a7Var, w6 w6Var, int i10, jj jjVar, boolean z10, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.f19218g = a7Var;
        this.f19214a = w6Var;
        this.f19215b = i10;
        this.f19216c = jjVar;
        this.d = z10;
        this.e = x1VarArr;
        this.f19217f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        String charSequence;
        if (i10 != 6) {
            return false;
        }
        w6 w6Var = this.f19214a;
        if (w6Var.getText().toString().length() > this.f19215b) {
            i0.E3(w6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {w6Var.getText()};
        a7 a7Var = this.f19218g;
        tL_textWithEntities.entities = ui.b0(a7Var.f14585a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        a7Var.a(this.f19216c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.e;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == a7.f14584i) {
            a7.f14584i = null;
        }
        View view = this.f19217f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
