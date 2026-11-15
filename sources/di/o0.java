package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class o0 implements TextWatcher {
    public final p0 f9128a;

    public o0(p0 p0Var) {
        this.f9128a = p0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        cg.a i7;
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
        p0 p0Var = this.f9128a;
        if (!z10) {
            i7 = cg.a.h(editable.toString(), p0Var.f9196j2.f4988a);
        } else {
            i7 = cg.a.i(0L, p0Var.f9196j2.f4988a);
        }
        p0Var.f1(i7, false, false, true);
        p0Var.Z1.c(p0Var.f9188a2.isFocused(), true ^ TextUtils.isEmpty(p0Var.f9188a2.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
