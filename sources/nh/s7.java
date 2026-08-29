package nh;

import android.text.Editable;
import android.text.TextWatcher;
public final class s7 implements TextWatcher {
    public final b6 f18550a;
    public final y7 f18551b;

    public s7(y7 y7Var, b6 b6Var) {
        this.f18551b = y7Var;
        this.f18550a = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f18550a.run();
        y7 y7Var = this.f18551b;
        org.telegram.ui.Cells.g3 g3Var = y7Var.U;
        if (y7Var.Y) {
            return;
        }
        if (y7Var.Z && editable != null) {
            String substring = editable.toString().substring(8);
            y7Var.Y = true;
            g3Var.f24387b.setText(substring);
            org.telegram.ui.Cells.e3 e3Var = g3Var.f24387b;
            e3Var.setSelection(0, e3Var.getText().length());
            y7Var.Y = false;
            y7Var.Z = false;
            y7.S(y7Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        y7.S(y7Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        y7 y7Var = this.f18551b;
        if (y7Var.Y) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        y7Var.Z = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
