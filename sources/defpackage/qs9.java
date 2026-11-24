package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class qs9 implements TextView.OnEditorActionListener {
    public final ps9 a;
    public final int b;
    public final TLRPC.Reaction c;
    public final hd[] d;
    public final View e;

    public qs9(ps9 ps9Var, int i, TLRPC.Reaction reaction, hd[] hdVarArr, View view) {
        this.a = ps9Var;
        this.b = i;
        this.c = reaction;
        this.d = hdVarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        ps9 ps9Var = this.a;
        String obj = ps9Var.getText().toString();
        if (obj.length() > 12) {
            gl.z3(ps9Var);
            return true;
        }
        na7.q1(this.b).o4(h19.d(this.c), obj);
        hd[] hdVarArr = this.d;
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            hdVar.dismiss();
        }
        if (hdVarArr[0] == vs9.I) {
            vs9.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
