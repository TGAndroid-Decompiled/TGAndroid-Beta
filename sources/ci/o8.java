package ci;

import android.text.Editable;
import android.text.TextWatcher;
public final class o8 implements TextWatcher {
    public final ai.ca f5691a;
    public final u8 f5692b;

    public o8(u8 u8Var, ai.ca caVar) {
        this.f5692b = u8Var;
        this.f5691a = caVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f5691a.run();
        u8 u8Var = this.f5692b;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
        if (u8Var.f6081c0) {
            return;
        }
        if (u8Var.f6082d0 && editable != null) {
            String substring = editable.toString().substring(8);
            u8Var.f6081c0 = true;
            j3Var.f22297b.setText(substring);
            org.telegram.ui.Cells.h3 h3Var = j3Var.f22297b;
            h3Var.setSelection(0, h3Var.getText().length());
            u8Var.f6081c0 = false;
            u8Var.f6082d0 = false;
            u8.T(u8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        u8.T(u8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        u8 u8Var = this.f5692b;
        if (u8Var.f6081c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        u8Var.f6082d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
