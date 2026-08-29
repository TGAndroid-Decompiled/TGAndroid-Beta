package ih;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k implements DialogInterface.OnShowListener {
    public final int f9258a;
    public final EditTextBoldCursor f9259b;

    public k(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f9258a = i10;
        this.f9259b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f9258a) {
            case 0:
                bh.b bVar = (bh.b) this.f9259b;
                bVar.requestFocus();
                AndroidUtilities.showKeyboard(bVar);
                return;
            case 1:
                v2 v2Var = (v2) this.f9259b;
                v2Var.requestFocus();
                AndroidUtilities.showKeyboard(v2Var);
                return;
            case 2:
                sf.o oVar = (sf.o) this.f9259b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f9259b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
