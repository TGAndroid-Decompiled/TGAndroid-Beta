package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3806a;
    public final EditTextBoldCursor f3807b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3806a = i7;
        this.f3807b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3806a) {
            case 0:
                u uVar = (u) this.f3807b;
                uVar.requestFocus();
                org.telegram.messenger.g0.I3(uVar);
                return;
            case 1:
                t5 t5Var = (t5) this.f3807b;
                t5Var.requestFocus();
                org.telegram.messenger.g0.I3(t5Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3807b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3807b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
