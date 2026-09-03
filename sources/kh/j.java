package kh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements DialogInterface.OnShowListener {
    public final int f10783a;
    public final EditTextBoldCursor f10784b;

    public j(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10783a = i10;
        this.f10784b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10783a) {
            case 0:
                dh.b bVar = (dh.b) this.f10784b;
                bVar.requestFocus();
                AndroidUtilities.showKeyboard(bVar);
                return;
            case 1:
                u2 u2Var = (u2) this.f10784b;
                u2Var.requestFocus();
                AndroidUtilities.showKeyboard(u2Var);
                return;
            case 2:
                uf.n nVar = (uf.n) this.f10784b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f10784b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
