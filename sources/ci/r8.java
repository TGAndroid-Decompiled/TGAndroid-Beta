package ci;

import android.text.Editable;
import android.text.TextWatcher;
public final class r8 implements TextWatcher {
    public final ai.ba f5460a;
    public final x8 f5461b;

    public r8(x8 x8Var, ai.ba baVar) {
        this.f5461b = x8Var;
        this.f5460a = baVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f5460a.run();
        x8 x8Var = this.f5461b;
        org.telegram.ui.Cells.j3 j3Var = x8Var.Y;
        if (x8Var.f5765c0) {
            return;
        }
        if (x8Var.f5766d0 && editable != null) {
            String substring = editable.toString().substring(8);
            x8Var.f5765c0 = true;
            j3Var.f20455b.setText(substring);
            org.telegram.ui.Cells.h3 h3Var = j3Var.f20455b;
            h3Var.setSelection(0, h3Var.getText().length());
            x8Var.f5765c0 = false;
            x8Var.f5766d0 = false;
            x8.S(x8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        x8.S(x8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        x8 x8Var = this.f5461b;
        if (x8Var.f5765c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        x8Var.f5766d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
