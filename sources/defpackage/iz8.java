package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class iz8 implements TextView.OnEditorActionListener {
    public final a52 a;
    public final int b;
    public final oz8 c;
    public final TextView d;
    public final jv0 e;
    public final qac f;
    public final he[] g;
    public final View h;

    public iz8(a52 a52Var, int i, oz8 oz8Var, TextView textView, jv0 jv0Var, qac qacVar, he[] heVarArr, View view) {
        this.a = a52Var;
        this.b = i;
        this.c = oz8Var;
        this.d = textView;
        this.e = jv0Var;
        this.f = qacVar;
        this.g = heVarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        if (i != 6) {
            return false;
        }
        a52 a52Var = this.a;
        String obj = a52Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            pz8 f = pz8.f(this.b);
            oz8 oz8Var = this.c;
            if (oz8Var == null) {
                i2 = -1;
            } else {
                i2 = oz8Var.a;
            }
            oz8 d = f.d(obj);
            if (d != null && d.a != i2) {
                gm.z3(a52Var);
                this.d.setText(jb6.M0(2131752615, null));
                this.e.a(Boolean.TRUE);
                return true;
            }
            this.f.a(obj);
            he[] heVarArr = this.g;
            he heVar = heVarArr[0];
            if (heVar != null) {
                heVar.dismiss();
            }
            if (heVarArr[0] == lz8.f) {
                lz8.f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        gm.z3(a52Var);
        return true;
    }
}
