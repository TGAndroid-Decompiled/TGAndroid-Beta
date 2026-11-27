package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class u09 implements TextView.OnEditorActionListener {
    public final f42 a;
    public final int b;
    public final a19 c;
    public final TextView d;
    public final ku0 e;
    public final pcc f;
    public final id[] g;
    public final View h;

    public u09(f42 f42Var, int i, a19 a19Var, TextView textView, ku0 ku0Var, pcc pccVar, id[] idVarArr, View view) {
        this.a = f42Var;
        this.b = i;
        this.c = a19Var;
        this.d = textView;
        this.e = ku0Var;
        this.f = pccVar;
        this.g = idVarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        if (i != 6) {
            return false;
        }
        f42 f42Var = this.a;
        String obj = f42Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b19 f = b19.f(this.b);
            a19 a19Var = this.c;
            if (a19Var == null) {
                i2 = -1;
            } else {
                i2 = a19Var.a;
            }
            a19 d = f.d(obj);
            if (d != null && d.a != i2) {
                hl.z3(f42Var);
                this.d.setText(ob6.M0(2131752643, null));
                this.e.a(Boolean.TRUE);
                return true;
            }
            this.f.a(obj);
            id[] idVarArr = this.g;
            id idVar = idVarArr[0];
            if (idVar != null) {
                idVar.dismiss();
            }
            if (idVarArr[0] == x09.f) {
                x09.f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        hl.z3(f42Var);
        return true;
    }
}
