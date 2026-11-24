package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class ni1 implements TextWatcher {
    public final zi1 a;

    public ni1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        zi1 zi1Var = this.a;
        fi1 fi1Var = zi1Var.f1;
        ps0 ps0Var = zi1Var.O0;
        if (zi1Var.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        zi1Var.N0 = parseLong;
        long j = zi1Var.D0.amount;
        int i = (parseLong > j ? 1 : (parseLong == j ? 0 : -1));
        boolean z = true;
        if (i > 0) {
            zi1Var.N0 = j;
            zi1Var.L0 = true;
            ps0Var.setText(Long.toString(j));
            ps0Var.setSelection(ps0Var.getText().length());
            zi1Var.L0 = false;
        }
        if (zi1Var.N0 != zi1Var.D0.amount) {
            z = false;
        }
        zi1Var.M0 = z;
        gl.r(fi1Var);
        fi1Var.run();
        zi1Var.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
