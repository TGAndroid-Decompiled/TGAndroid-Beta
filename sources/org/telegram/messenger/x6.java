package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class x6 implements TextView.OnEditorActionListener {
    public final w6 f19402a;
    public final int f19403b;
    public final kj f19404c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.x1[] e;
    public final View f19405f;
    public final a7 f19406g;

    public x6(a7 a7Var, w6 w6Var, int i10, kj kjVar, boolean z10, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.f19406g = a7Var;
        this.f19402a = w6Var;
        this.f19403b = i10;
        this.f19404c = kjVar;
        this.d = z10;
        this.e = x1VarArr;
        this.f19405f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        String charSequence;
        if (i10 != 6) {
            return false;
        }
        w6 w6Var = this.f19402a;
        if (w6Var.getText().toString().length() > this.f19403b) {
            i0.E3(w6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {w6Var.getText()};
        a7 a7Var = this.f19406g;
        tL_textWithEntities.entities = vi.b0(a7Var.f14575a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        a7Var.a(this.f19404c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.e;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == a7.f14574i) {
            a7.f14574i = null;
        }
        View view = this.f19405f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
