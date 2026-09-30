package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t implements DialogInterface.OnShowListener {
    public final int f10408a;
    public final EditTextBoldCursor f10409b;

    public t(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10408a = i10;
        this.f10409b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10408a) {
            case 0:
                u uVar = (u) this.f10409b;
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f10409b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f10409b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.a2 a2Var = (xh.a2) this.f10409b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                return;
        }
    }
}
