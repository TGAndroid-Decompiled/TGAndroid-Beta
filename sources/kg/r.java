package kg;

import android.content.DialogInterface;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements DialogInterface.OnShowListener {
    public final int f17513a;
    public final EditTextBoldCursor f17514b;

    public r(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f17513a = i7;
        this.f17514b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f17513a) {
            case 0:
                s sVar = (s) this.f17514b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f17514b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                z5 z5Var = (z5) this.f17514b;
                z5Var.requestFocus();
                org.telegram.messenger.g0.K3(z5Var);
                return;
            default:
                zh.o1 o1Var = (zh.o1) this.f17514b;
                o1Var.requestFocus();
                org.telegram.messenger.g0.K3(o1Var);
                return;
        }
    }
}
