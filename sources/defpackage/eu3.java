package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class eu3 implements TextWatcher {
    public final int a;
    public final qu3 b;
    public final boolean c;
    public final gu3 d;

    public eu3(gu3 gu3Var, int i, qu3 qu3Var, boolean z) {
        this.d = gu3Var;
        this.a = i;
        this.b = qu3Var;
        this.c = z;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        gu3 gu3Var = this.d;
        boolean z = gu3Var.a;
        int i = this.a;
        if (!z) {
            if (i > 0 && editable != null && editable.length() > i) {
                gu3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i);
                qu3 qu3Var = this.b;
                qu3Var.setText(subSequence);
                qu3Var.setSelection(qu3Var.length());
                gu3Var.a = false;
            }
            gu3Var.b(editable);
        }
        if (this.c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        ho hoVar = gu3Var.y;
        if (hoVar != null && i > 0) {
            hoVar.a();
            gu3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
