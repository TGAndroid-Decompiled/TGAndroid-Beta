package ci;

import android.text.Editable;
import android.text.TextWatcher;
public final class r8 implements TextWatcher {
    public final ai.ba f5455a;
    public final x8 f5456b;

    public r8(x8 x8Var, ai.ba baVar) {
        this.f5456b = x8Var;
        this.f5455a = baVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f5455a.run();
        x8 x8Var = this.f5456b;
        org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
        if (x8Var.f5760c0) {
            return;
        }
        if (x8Var.f5761d0 && editable != null) {
            String substring = editable.toString().substring(8);
            x8Var.f5760c0 = true;
            i3Var.f20229b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f20229b;
            g3Var.setSelection(0, g3Var.getText().length());
            x8Var.f5760c0 = false;
            x8Var.f5761d0 = false;
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
        x8 x8Var = this.f5456b;
        if (x8Var.f5760c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        x8Var.f5761d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
