package ci;

import android.text.Editable;
import android.text.TextWatcher;
public final class o8 implements TextWatcher {
    public final ai.ba f5253a;
    public final u8 f5254b;

    public o8(u8 u8Var, ai.ba baVar) {
        this.f5254b = u8Var;
        this.f5253a = baVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f5253a.run();
        u8 u8Var = this.f5254b;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
        if (u8Var.f5619c0) {
            return;
        }
        if (u8Var.f5620d0 && editable != null) {
            String substring = editable.toString().substring(8);
            u8Var.f5619c0 = true;
            j3Var.f20491b.setText(substring);
            org.telegram.ui.Cells.h3 h3Var = j3Var.f20491b;
            h3Var.setSelection(0, h3Var.getText().length());
            u8Var.f5619c0 = false;
            u8Var.f5620d0 = false;
            u8.S(u8Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        u8.S(u8Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        u8 u8Var = this.f5254b;
        if (u8Var.f5619c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        u8Var.f5620d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
