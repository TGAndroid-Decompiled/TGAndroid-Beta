package kh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements DialogInterface.OnShowListener {
    public final int f10673a;
    public final EditTextBoldCursor f10674b;

    public j(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10673a = i10;
        this.f10674b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10673a) {
            case 0:
                dh.b bVar = (dh.b) this.f10674b;
                bVar.requestFocus();
                AndroidUtilities.showKeyboard(bVar);
                return;
            case 1:
                v2 v2Var = (v2) this.f10674b;
                v2Var.requestFocus();
                AndroidUtilities.showKeyboard(v2Var);
                return;
            case 2:
                uf.n nVar = (uf.n) this.f10674b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f10674b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
