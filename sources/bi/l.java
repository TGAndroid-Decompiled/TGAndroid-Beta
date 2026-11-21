package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3807a;
    public final EditTextBoldCursor f3808b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3807a = i7;
        this.f3808b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3807a) {
            case 0:
                u uVar = (u) this.f3808b;
                uVar.requestFocus();
                org.telegram.messenger.g0.I3(uVar);
                return;
            case 1:
                u5 u5Var = (u5) this.f3808b;
                u5Var.requestFocus();
                org.telegram.messenger.g0.I3(u5Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3808b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3808b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
