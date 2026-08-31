package lh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements DialogInterface.OnShowListener {
    public final int f12813a;
    public final EditTextBoldCursor f12814b;

    public j(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f12813a = i10;
        this.f12814b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12813a) {
            case 0:
                eh.b bVar = (eh.b) this.f12814b;
                bVar.requestFocus();
                AndroidUtilities.showKeyboard(bVar);
                return;
            case 1:
                u2 u2Var = (u2) this.f12814b;
                u2Var.requestFocus();
                AndroidUtilities.showKeyboard(u2Var);
                return;
            case 2:
                vf.n nVar = (vf.n) this.f12814b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f12814b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
