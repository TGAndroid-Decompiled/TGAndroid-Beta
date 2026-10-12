package di;

import android.text.Editable;
import android.text.TextWatcher;
public final class n8 implements TextWatcher {
    public final x6 f7469a;
    public final t8 f7470b;

    public n8(t8 t8Var, x6 x6Var) {
        this.f7470b = t8Var;
        this.f7469a = x6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f7469a.run();
        t8 t8Var = this.f7470b;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
        if (t8Var.f7840c0) {
            return;
        }
        if (t8Var.f7841d0 && editable != null) {
            String substring = editable.toString().substring(8);
            t8Var.f7840c0 = true;
            j3Var.f21368b.setText(substring);
            org.telegram.ui.Cells.h3 h3Var = j3Var.f21368b;
            h3Var.setSelection(0, h3Var.getText().length());
            t8Var.f7840c0 = false;
            t8Var.f7841d0 = false;
            t8.T(t8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        t8.T(t8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        t8 t8Var = this.f7470b;
        if (t8Var.f7840c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        t8Var.f7841d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
