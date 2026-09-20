package hg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f10396a;
    public final EditTextBoldCursor f10397b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f10396a = i10;
        this.f10397b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f10396a) {
            case 0:
                s sVar = (s) this.f10397b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f10397b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                d6 d6Var = (d6) this.f10397b;
                d6Var.requestFocus();
                AndroidUtilities.showKeyboard(d6Var);
                return;
            default:
                xh.a2 a2Var = (xh.a2) this.f10397b;
                a2Var.requestFocus();
                AndroidUtilities.showKeyboard(a2Var);
                return;
        }
    }
}
