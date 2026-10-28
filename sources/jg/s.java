package jg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s implements DialogInterface.OnShowListener {
    public final int f15824a;
    public final EditTextBoldCursor f15825b;

    public s(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f15824a = i10;
        this.f15825b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f15824a) {
            case 0:
                t tVar = (t) this.f15825b;
                tVar.requestFocus();
                AndroidUtilities.showKeyboard(tVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f15825b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                g6 g6Var = (g6) this.f15825b;
                g6Var.requestFocus();
                AndroidUtilities.showKeyboard(g6Var);
                return;
            default:
                zh.y1 y1Var = (zh.y1) this.f15825b;
                y1Var.requestFocus();
                AndroidUtilities.showKeyboard(y1Var);
                return;
        }
    }
}
