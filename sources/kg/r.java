package kg;

import android.content.DialogInterface;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f17516a;
    public final EditTextBoldCursor f17517b;

    public r(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f17516a = i7;
        this.f17517b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f17516a) {
            case 0:
                s sVar = (s) this.f17517b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f17517b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                z5 z5Var = (z5) this.f17517b;
                z5Var.requestFocus();
                org.telegram.messenger.g0.K3(z5Var);
                return;
            default:
                zh.n1 n1Var = (zh.n1) this.f17517b;
                n1Var.requestFocus();
                org.telegram.messenger.g0.K3(n1Var);
                return;
        }
    }
}
