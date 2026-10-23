package ig;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f13031a;
    public final EditTextBoldCursor f13032b;

    public r(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f13031a = i10;
        this.f13032b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f13031a) {
            case 0:
                s sVar = (s) this.f13032b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f13032b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                c6 c6Var = (c6) this.f13032b;
                c6Var.requestFocus();
                AndroidUtilities.showKeyboard(c6Var);
                return;
            default:
                yh.x1 x1Var = (yh.x1) this.f13032b;
                x1Var.requestFocus();
                AndroidUtilities.showKeyboard(x1Var);
                return;
        }
    }
}
