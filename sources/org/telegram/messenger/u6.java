package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f25653a;
    public final int f25654b;
    public final zi f25655c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.s1[] f25656e;
    public final View f25657f;
    public final x6 f25658g;

    public u6(x6 x6Var, t6 t6Var, int i3, zi ziVar, boolean z10, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.f25658g = x6Var;
        this.f25653a = t6Var;
        this.f25654b = i3;
        this.f25655c = ziVar;
        this.d = z10;
        this.f25656e = s1VarArr;
        this.f25657f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        String charSequence;
        if (i3 != 6) {
            return false;
        }
        t6 t6Var = this.f25653a;
        if (t6Var.getText().toString().length() > this.f25654b) {
            g0.F3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f25658g;
        tL_textWithEntities.entities = li.b0(x6Var.f26347a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f25655c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.f25656e;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
        }
        if (s1VarArr[0] == x6.f26346i) {
            x6.f26346i = null;
        }
        View view = this.f25657f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
