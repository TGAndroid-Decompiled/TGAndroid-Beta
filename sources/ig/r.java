package ig;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f12994a;
    public final EditTextBoldCursor f12995b;

    public r(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f12994a = i10;
        this.f12995b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f12994a) {
            case 0:
                s sVar = (s) this.f12995b;
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f12995b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                b6 b6Var = (b6) this.f12995b;
                b6Var.requestFocus();
                AndroidUtilities.showKeyboard(b6Var);
                return;
            default:
                yh.y1 y1Var = (yh.y1) this.f12995b;
                y1Var.requestFocus();
                AndroidUtilities.showKeyboard(y1Var);
                return;
        }
    }
}
