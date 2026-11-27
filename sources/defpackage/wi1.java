package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wi1 implements TextWatcher {
    public final ij1 a;

    public wi1(ij1 ij1Var) {
        this.a = ij1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ij1 ij1Var = this.a;
        oi1 oi1Var = ij1Var.f1;
        xs0 xs0Var = ij1Var.O0;
        if (ij1Var.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        ij1Var.N0 = parseLong;
        long j = ij1Var.D0.amount;
        int i = (parseLong > j ? 1 : (parseLong == j ? 0 : -1));
        boolean z = true;
        if (i > 0) {
            ij1Var.N0 = j;
            ij1Var.L0 = true;
            xs0Var.setText(Long.toString(j));
            xs0Var.setSelection(xs0Var.getText().length());
            ij1Var.L0 = false;
        }
        if (ij1Var.N0 != ij1Var.D0.amount) {
            z = false;
        }
        ij1Var.M0 = z;
        hl.r(oi1Var);
        oi1Var.run();
        ij1Var.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
