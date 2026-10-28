package fi;

import android.text.Editable;
import android.text.TextWatcher;
public final class z7 implements TextWatcher {
    public final e2.q0 f12073a;
    public final f8 f12074b;

    public z7(f8 f8Var, e2.q0 q0Var) {
        this.f12074b = f8Var;
        this.f12073a = q0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f12073a.run();
        f8 f8Var = this.f12074b;
        org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
        if (f8Var.f10868c0) {
            return;
        }
        if (f8Var.f10869d0 && editable != null) {
            String substring = editable.toString().substring(8);
            f8Var.f10868c0 = true;
            g3Var.d.setText(substring);
            org.telegram.ui.Cells.e3 e3Var = g3Var.d;
            e3Var.setSelection(0, e3Var.getText().length());
            f8Var.f10868c0 = false;
            f8Var.f10869d0 = false;
            f8.S(f8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        f8.S(f8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        f8 f8Var = this.f12074b;
        if (f8Var.f10868c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        f8Var.f10869d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
