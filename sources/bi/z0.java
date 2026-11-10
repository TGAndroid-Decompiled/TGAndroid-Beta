package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class z0 implements TextWatcher {
    public final a1 f5141a;

    public z0(a1 a1Var) {
        this.f5141a = a1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        cg.a i7;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        a1 a1Var = this.f5141a;
        if (!z9) {
            i7 = cg.a.h(editable.toString(), a1Var.f3428i2.f6163a);
        } else {
            i7 = cg.a.i(0L, a1Var.f3428i2.f6163a);
        }
        a1Var.f1(i7, false, false, true);
        a1Var.Y1.c(a1Var.Z1.isFocused(), true ^ TextUtils.isEmpty(a1Var.Z1.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
