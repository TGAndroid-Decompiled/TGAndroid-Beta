package kg;

import android.content.DialogInterface;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f17519a;
    public final EditTextBoldCursor f17520b;

    public r(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f17519a = i7;
        this.f17520b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f17519a) {
            case 0:
                s sVar = (s) this.f17520b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f17520b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                z5 z5Var = (z5) this.f17520b;
                z5Var.requestFocus();
                org.telegram.messenger.g0.K3(z5Var);
                return;
            default:
                zh.n1 n1Var = (zh.n1) this.f17520b;
                n1Var.requestFocus();
                org.telegram.messenger.g0.K3(n1Var);
                return;
        }
    }
}
