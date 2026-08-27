package gh;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class k implements DialogInterface.OnShowListener {

    public final int f7369a;

    public final EditTextBoldCursor f7370b;

    public k(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f7369a = i10;
        this.f7370b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f7369a) {
            case 0:
                r rVar = (r) this.f7370b;
                rVar.requestFocus();
                AndroidUtilities.showKeyboard(rVar);
                break;
            case 1:
                b3 b3Var = (b3) this.f7370b;
                b3Var.requestFocus();
                AndroidUtilities.showKeyboard(b3Var);
                break;
            case 2:
                qf.p pVar = (qf.p) this.f7370b;
                pVar.requestFocus();
                AndroidUtilities.showKeyboard(pVar);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f7370b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
