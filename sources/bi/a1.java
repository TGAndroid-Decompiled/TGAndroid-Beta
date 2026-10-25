package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class a1 implements TextWatcher {
    public final b1 f4250a;

    public a1(b1 b1Var) {
        this.f4250a = b1Var;
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
        b1 b1Var = this.f4250a;
        if (!z10) {
            i10 = bg.a.h(editable.toString(), b1Var.f4318n0.f3978a);
        } else {
            i10 = bg.a.i(0L, b1Var.f4318n0.f3978a);
        }
        b1Var.U(i10, false, false, true);
        b1Var.f4309d0.c(b1Var.f4310e0.isFocused(), true ^ TextUtils.isEmpty(b1Var.f4310e0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
