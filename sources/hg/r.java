package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f11307a;
    public final EditTextBoldCursor f11308b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f11307a = i10;
        this.f11308b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11307a) {
            case 0:
                s sVar = (s) this.f11308b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f11308b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f11308b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.a2 a2Var = (xh.a2) this.f11308b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                return;
        }
    }
}
