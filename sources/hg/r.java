package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f10395a;
    public final EditTextBoldCursor f10396b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10395a = i10;
        this.f10396b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10395a) {
            case 0:
                s sVar = (s) this.f10396b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f10396b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                b6 b6Var = (b6) this.f10396b;
                b6Var.requestFocus();
                AndroidUtilities.showKeyboard(b6Var);
                return;
            default:
                xh.z1 z1Var = (xh.z1) this.f10396b;
                z1Var.requestFocus();
                AndroidUtilities.showKeyboard(z1Var);
                return;
        }
    }
}
