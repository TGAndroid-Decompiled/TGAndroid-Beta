package gg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t implements DialogInterface.OnShowListener {
    public final int f9036a;
    public final EditTextBoldCursor f9037b;

    public t(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f9036a = i10;
        this.f9037b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f9036a) {
            case 0:
                u uVar = (u) this.f9037b;
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f9037b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                d6 d6Var = (d6) this.f9037b;
                d6Var.requestFocus();
                AndroidUtilities.showKeyboard(d6Var);
                return;
            default:
                wh.y1 y1Var = (wh.y1) this.f9037b;
                y1Var.requestFocus();
                AndroidUtilities.showKeyboard(y1Var);
                return;
        }
    }
}
