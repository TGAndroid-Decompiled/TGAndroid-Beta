package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3768a;
    public final EditTextBoldCursor f3769b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3768a = i7;
        this.f3769b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3768a) {
            case 0:
                u uVar = (u) this.f3769b;
                uVar.requestFocus();
                org.telegram.messenger.g0.I3(uVar);
                return;
            case 1:
                w5 w5Var = (w5) this.f3769b;
                w5Var.requestFocus();
                org.telegram.messenger.g0.I3(w5Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3769b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3769b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
