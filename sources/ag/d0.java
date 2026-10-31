package ag;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 implements DialogInterface.OnShowListener {
    public final int f483a;
    public final EditTextBoldCursor f484b;

    public d0(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f483a = i10;
        this.f484b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f483a) {
            case 0:
                f0 f0Var = (f0) this.f484b;
                f0Var.requestFocus();
                org.telegram.messenger.i0.J3(f0Var);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f484b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                ih.b bVar = (ih.b) this.f484b;
                bVar.requestFocus();
                org.telegram.messenger.i0.J3(bVar);
                return;
            default:
                ph.t1 t1Var = (ph.t1) this.f484b;
                t1Var.requestFocus();
                org.telegram.messenger.i0.J3(t1Var);
                return;
        }
    }
}
