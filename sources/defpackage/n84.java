package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class n84 implements TextView.OnEditorActionListener {
    public final m84 a;
    public final int b;
    public final r47 c;
    public final boolean d;
    public final id[] e;
    public final View f;
    public final q84 g;

    public n84(q84 q84Var, m84 m84Var, int i, r47 r47Var, boolean z, id[] idVarArr, View view) {
        this.g = q84Var;
        this.a = m84Var;
        this.b = i;
        this.c = r47Var;
        this.d = z;
        this.e = idVarArr;
        this.f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String charSequence;
        if (i != 6) {
            return false;
        }
        m84 m84Var = this.a;
        if (m84Var.getText().toString().length() > this.b) {
            hl.z3(m84Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {m84Var.getText()};
        q84 q84Var = this.g;
        tL_textWithEntities.entities = ls6.d0(q84Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        q84Var.a(this.c, tL_textWithEntities, this.d);
        id[] idVarArr = this.e;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
        }
        if (idVarArr[0] == q84.i) {
            q84.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
