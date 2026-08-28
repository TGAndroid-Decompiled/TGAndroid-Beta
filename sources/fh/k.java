package fh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k implements DialogInterface.OnShowListener {
    public final int f6559a;
    public final EditTextBoldCursor f6560b;

    public k(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f6559a = i9;
        this.f6560b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f6559a) {
            case 0:
                s sVar = (s) this.f6560b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                g3 g3Var = (g3) this.f6560b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 2:
                pf.o oVar = (pf.o) this.f6560b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f6560b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
