package kh;

import android.text.Editable;
import android.text.TextWatcher;
public final class e8 implements TextWatcher {
    public final ih.j7 f15164a;
    public final k8 f15165b;

    public e8(k8 k8Var, ih.j7 j7Var) {
        this.f15165b = k8Var;
        this.f15164a = j7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f15164a.run();
        k8 k8Var = this.f15165b;
        org.telegram.ui.Cells.j3 j3Var = k8Var.U;
        if (k8Var.Y) {
            return;
        }
        if (k8Var.Z && editable != null) {
            String substring = editable.toString().substring(8);
            k8Var.Y = true;
            j3Var.f24544b.setText(substring);
            org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
            h3Var.setSelection(0, h3Var.getText().length());
            k8Var.Y = false;
            k8Var.Z = false;
            k8.R(k8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        k8.R(k8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12;
        k8 k8Var = this.f15165b;
        if (k8Var.Y) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i9 == 8 && charSequence.subSequence(0, i9).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i9) && charSequence.subSequence(i9, i12).toString().startsWith("https://")) {
            z10 = true;
        }
        k8Var.Z = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
