package ig;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f12998a;
    public final EditTextBoldCursor f12999b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f12998a = i10;
        this.f12999b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12998a) {
            case 0:
                s sVar = (s) this.f12999b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f12999b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                b6 b6Var = (b6) this.f12999b;
                b6Var.requestFocus();
                AndroidUtilities.showKeyboard(b6Var);
                return;
            default:
                yh.x1 x1Var = (yh.x1) this.f12999b;
                x1Var.requestFocus();
                AndroidUtilities.showKeyboard(x1Var);
                return;
        }
    }
}
