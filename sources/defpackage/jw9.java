package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class jw9 implements TextView.OnEditorActionListener {
    public final iw9 a;
    public final int b;
    public final TLRPC.Reaction c;
    public final id[] d;
    public final View e;

    public jw9(iw9 iw9Var, int i, TLRPC.Reaction reaction, id[] idVarArr, View view) {
        this.a = iw9Var;
        this.b = i;
        this.c = reaction;
        this.d = idVarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        iw9 iw9Var = this.a;
        String obj = iw9Var.getText().toString();
        if (obj.length() > 12) {
            hl.z3(iw9Var);
            return true;
        }
        uc7.s1(this.b).w4(w49.d(this.c), obj);
        id[] idVarArr = this.d;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
        }
        if (idVarArr[0] == ow9.I) {
            ow9.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
