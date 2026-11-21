package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 implements TextView.OnEditorActionListener {
    public final t6 f27151a;
    public final int f27152b;
    public final fj f27153c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.t1[] f27154e;
    public final View f27155f;
    public final x6 f27156g;

    public u6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f27156g = x6Var;
        this.f27151a = t6Var;
        this.f27152b = i7;
        this.f27153c = fjVar;
        this.d = z10;
        this.f27154e = t1VarArr;
        this.f27155f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        String charSequence;
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.f27151a;
        if (t6Var.getText().toString().length() > this.f27152b) {
            g0.D3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.f27156g;
        tL_textWithEntities.entities = ri.d0(x6Var.f27849a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(this.f27153c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f27154e;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == x6.f27848i) {
            x6.f27848i = null;
        }
        View view = this.f27155f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
