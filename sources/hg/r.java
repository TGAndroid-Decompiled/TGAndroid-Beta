package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f10383a;
    public final EditTextBoldCursor f10384b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10383a = i10;
        this.f10384b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10383a) {
            case 0:
                s sVar = (s) this.f10384b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f10384b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f10384b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.b2 b2Var = (xh.b2) this.f10384b;
                b2Var.requestFocus();
                AndroidUtilities.showKeyboard(b2Var);
                return;
        }
    }
}
