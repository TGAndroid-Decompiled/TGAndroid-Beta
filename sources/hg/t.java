package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t implements DialogInterface.OnShowListener {
    public final int f10394a;
    public final EditTextBoldCursor f10395b;

    public t(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10394a = i10;
        this.f10395b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10394a) {
            case 0:
                u uVar = (u) this.f10395b;
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f10395b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f10395b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.a2 a2Var = (xh.a2) this.f10395b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                return;
        }
    }
}
