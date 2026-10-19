package ig;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f13000a;
    public final EditTextBoldCursor f13001b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f13000a = i10;
        this.f13001b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f13000a) {
            case 0:
                s sVar = (s) this.f13001b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f13001b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                b6 b6Var = (b6) this.f13001b;
                b6Var.requestFocus();
                AndroidUtilities.showKeyboard(b6Var);
                return;
            default:
                yh.x1 x1Var = (yh.x1) this.f13001b;
                x1Var.requestFocus();
                AndroidUtilities.showKeyboard(x1Var);
                return;
        }
    }
}
