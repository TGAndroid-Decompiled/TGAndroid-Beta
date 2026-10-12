package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s implements DialogInterface.OnShowListener {
    public final int f11365a;
    public final EditTextBoldCursor f11366b;

    public s(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f11365a = i10;
        this.f11366b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11365a) {
            case 0:
                t tVar = (t) this.f11366b;
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f11366b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f11366b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                xh.z1 z1Var = (xh.z1) this.f11366b;
                z1Var.requestFocus();
                AndroidUtilities.showKeyboard(z1Var);
                return;
        }
    }
}
