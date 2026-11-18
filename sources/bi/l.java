package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3798a;
    public final EditTextBoldCursor f3799b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3798a = i7;
        this.f3799b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3798a) {
            case 0:
                u uVar = (u) this.f3799b;
                uVar.requestFocus();
                org.telegram.messenger.g0.I3(uVar);
                return;
            case 1:
                q5 q5Var = (q5) this.f3799b;
                q5Var.requestFocus();
                org.telegram.messenger.g0.I3(q5Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3799b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3799b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
