package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3827a;
    public final EditTextBoldCursor f3828b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3827a = i7;
        this.f3828b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3827a) {
            case 0:
                u uVar = (u) this.f3828b;
                uVar.requestFocus();
                org.telegram.messenger.g0.I3(uVar);
                return;
            case 1:
                r5 r5Var = (r5) this.f3828b;
                r5Var.requestFocus();
                org.telegram.messenger.g0.I3(r5Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3828b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3828b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
