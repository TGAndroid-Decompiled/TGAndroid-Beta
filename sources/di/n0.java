package di;

import android.text.Editable;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final o0 f9344a;

    public n0(o0 o0Var) {
        this.f9344a = o0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        cg.a j3;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        o0 o0Var = this.f9344a;
        if (!z10) {
            j3 = cg.a.i(editable.toString(), o0Var.B1.f5266a);
        } else {
            j3 = cg.a.j(0L, o0Var.B1.f5266a);
        }
        o0Var.K0(j3, false, false, true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
