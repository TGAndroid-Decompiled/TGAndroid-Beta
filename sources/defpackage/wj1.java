package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wj1 implements TextWatcher {
    public final ik1 a;

    public wj1(ik1 ik1Var) {
        this.a = ik1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ik1 ik1Var = this.a;
        nj1 nj1Var = ik1Var.f1;
        vc vcVar = ik1Var.O0;
        if (ik1Var.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        ik1Var.N0 = parseLong;
        long j = ik1Var.D0.amount;
        int i = (parseLong > j ? 1 : (parseLong == j ? 0 : -1));
        boolean z = true;
        if (i > 0) {
            ik1Var.N0 = j;
            ik1Var.L0 = true;
            vcVar.setText(Long.toString(j));
            vcVar.setSelection(vcVar.getText().length());
            ik1Var.L0 = false;
        }
        if (ik1Var.N0 != ik1Var.D0.amount) {
            z = false;
        }
        ik1Var.M0 = z;
        gm.r(nj1Var);
        nj1Var.run();
        ik1Var.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
