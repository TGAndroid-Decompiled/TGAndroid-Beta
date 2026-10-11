package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s implements DialogInterface.OnShowListener {
    public final int f11366a;
    public final EditTextBoldCursor f11367b;

    public s(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f11366a = i10;
        this.f11367b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11366a) {
            case 0:
                t tVar = (t) this.f11367b;
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f11367b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f11367b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.a2 a2Var = (xh.a2) this.f11367b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                return;
        }
    }
}
