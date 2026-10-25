package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class j1 implements TextWatcher {
    public final k1 f4861a;

    public j1(k1 k1Var) {
        this.f4861a = k1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        bg.a i10;
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
        k1 k1Var = this.f4861a;
        if (!z10) {
            i10 = bg.a.h(editable.toString(), k1Var.E.f3978a);
        } else {
            i10 = bg.a.i(0L, k1Var.E.f3978a);
        }
        k1Var.n(i10, false, false, true);
        k1Var.f4933b.c(k1Var.f4934c.isFocused(), true ^ TextUtils.isEmpty(k1Var.f4934c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
