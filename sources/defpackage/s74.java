package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class s74 implements TextView.OnEditorActionListener {
    public final r74 a;
    public final int b;
    public final k27 c;
    public final boolean d;
    public final hd[] e;
    public final View f;
    public final v74 g;

    public s74(v74 v74Var, r74 r74Var, int i, k27 k27Var, boolean z, hd[] hdVarArr, View view) {
        this.g = v74Var;
        this.a = r74Var;
        this.b = i;
        this.c = k27Var;
        this.d = z;
        this.e = hdVarArr;
        this.f = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String charSequence;
        if (i != 6) {
            return false;
        }
        r74 r74Var = this.a;
        if (r74Var.getText().toString().length() > this.b) {
            gl.A3(r74Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {r74Var.getText()};
        v74 v74Var = this.g;
        tL_textWithEntities.entities = hq6.d0(v74Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        v74Var.a(this.c, tL_textWithEntities, this.d);
        hd[] hdVarArr = this.e;
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            hdVar.dismiss();
        }
        if (hdVarArr[0] == v74.i) {
            v74.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
