package ig;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f11617a;
    public final EditTextBoldCursor f11618b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f11617a = i10;
        this.f11618b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f11617a) {
            case 0:
                s sVar = (s) this.f11618b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f11618b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f11618b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                yh.y1 y1Var = (yh.y1) this.f11618b;
                y1Var.requestFocus();
                AndroidUtilities.showKeyboard(y1Var);
                return;
        }
    }
}
