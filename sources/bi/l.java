package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3652a;
    public final EditTextBoldCursor f3653b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3652a = i7;
        this.f3653b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3652a) {
            case 0:
                u uVar = (u) this.f3653b;
                uVar.requestFocus();
                org.telegram.messenger.g0.J3(uVar);
                return;
            case 1:
                j3 j3Var = (j3) this.f3653b;
                j3Var.requestFocus();
                org.telegram.messenger.g0.J3(j3Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3653b;
                sVar.requestFocus();
                org.telegram.messenger.g0.J3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3653b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
