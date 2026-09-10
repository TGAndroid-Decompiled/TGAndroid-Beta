package bi;

import android.text.Editable;
import android.text.TextWatcher;
public final class u9 implements TextWatcher {
    public final a1.e f3732a;
    public final aa f3733b;

    public u9(aa aaVar, a1.e eVar) {
        this.f3733b = aaVar;
        this.f3732a = eVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f3732a.run();
        aa aaVar = this.f3733b;
        org.telegram.ui.Cells.i3 i3Var = aaVar.Y;
        if (aaVar.f2324c0) {
            return;
        }
        if (aaVar.f2325d0 && editable != null) {
            String substring = editable.toString().substring(8);
            aaVar.f2324c0 = true;
            i3Var.f19293b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
            g3Var.setSelection(0, g3Var.getText().length());
            aaVar.f2324c0 = false;
            aaVar.f2325d0 = false;
            aa.S(aaVar, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        aa.S(aaVar, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        aa aaVar = this.f3733b;
        if (aaVar.f2324c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        aaVar.f2325d0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
