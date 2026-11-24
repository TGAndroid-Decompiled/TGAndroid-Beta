package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class su9 implements TextView.OnEditorActionListener {
    public final ru9 a;
    public final int b;
    public final TLRPC.Reaction c;
    public final he[] d;
    public final View e;

    public su9(ru9 ru9Var, int i, TLRPC.Reaction reaction, he[] heVarArr, View view) {
        this.a = ru9Var;
        this.b = i;
        this.c = reaction;
        this.d = heVarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        ru9 ru9Var = this.a;
        String obj = ru9Var.getText().toString();
        if (obj.length() > 12) {
            gm.z3(ru9Var);
            return true;
        }
        oc7.r1(this.b).q4(k39.d(this.c), obj);
        he[] heVarArr = this.d;
        he heVar = heVarArr[0];
        if (heVar != null) {
            heVar.dismiss();
        }
        if (heVarArr[0] == xu9.I) {
            xu9.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
