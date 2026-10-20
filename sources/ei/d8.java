package ei;

import android.text.Editable;
import android.text.TextWatcher;
public final class d8 implements TextWatcher {
    public final p6 f8898a;
    public final j8 f8899b;

    public d8(j8 j8Var, p6 p6Var) {
        this.f8899b = j8Var;
        this.f8898a = p6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f8898a.run();
        j8 j8Var = this.f8899b;
        org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
        if (j8Var.f9269c0) {
            return;
        }
        if (j8Var.f9270d0 && editable != null) {
            String substring = editable.toString().substring(8);
            j8Var.f9269c0 = true;
            i3Var.f22402b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f22402b;
            g3Var.setSelection(0, g3Var.getText().length());
            j8Var.f9269c0 = false;
            j8Var.f9270d0 = false;
            j8.T(j8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        j8.T(j8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        j8 j8Var = this.f8899b;
        if (j8Var.f9269c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        j8Var.f9270d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
