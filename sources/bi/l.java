package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l implements DialogInterface.OnShowListener {
    public final int f3655a;
    public final EditTextBoldCursor f3656b;

    public l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3655a = i7;
        this.f3656b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3655a) {
            case 0:
                u uVar = (u) this.f3656b;
                uVar.requestFocus();
                org.telegram.messenger.g0.J3(uVar);
                return;
            case 1:
                j3 j3Var = (j3) this.f3656b;
                j3Var.requestFocus();
                org.telegram.messenger.g0.J3(j3Var);
                return;
            case 2:
                kg.s sVar = (kg.s) this.f3656b;
                sVar.requestFocus();
                org.telegram.messenger.g0.J3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f3656b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
