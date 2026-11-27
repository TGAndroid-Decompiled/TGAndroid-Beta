package defpackage;

import android.view.View;
public final class fla implements View.OnClickListener {
    public final byte a;
    public final jla b;

    public fla(jla jlaVar, byte b) {
        this.a = b;
        this.b = jlaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        jla jlaVar = this.b;
        switch (b) {
            case 0:
                if (!jlaVar.M && jlaVar.L) {
                    jlaVar.o(true);
                    return;
                }
                d6 d6Var = jlaVar.f0;
                if (d6Var != null) {
                    d6Var.b(-1);
                    return;
                }
                return;
            case 1:
                if (jlaVar.s.length() != 0) {
                    jlaVar.s.setText("");
                } else if (jlaVar.C()) {
                    jlaVar.n();
                }
                jlaVar.s.requestFocus();
                hl.E3(jlaVar.s);
                return;
            default:
                if (jlaVar.s.length() != 0) {
                    jlaVar.s.setText("");
                    return;
                } else if (jlaVar.C()) {
                    jlaVar.n();
                    return;
                } else {
                    jlaVar.o(true);
                    return;
                }
        }
    }
}
