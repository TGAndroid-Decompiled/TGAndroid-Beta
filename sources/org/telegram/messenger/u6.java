package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f25729a;
    public final int f25730b;
    public final ij f25731c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u1[] f25732e;
    public final View f25733f;
    public final x6 f25734g;

    public u6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f25734g = x6Var;
        this.f25729a = t6Var;
        this.f25730b = i7;
        this.f25731c = ijVar;
        this.d = z9;
        this.f25732e = u1VarArr;
        this.f25733f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f25729a;
        if (t6Var.getText().toString().length() > this.f25730b) {
            g0.F3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f25734g;
        tL_textWithEntities.entities = ui.b0(x6Var.f26436a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f25731c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f25732e;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == x6.f26435i) {
            x6.f26435i = null;
        }
        View view = this.f25733f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
