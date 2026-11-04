package ai;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p implements DialogInterface.OnShowListener {
    public final int f871a;
    public final EditTextBoldCursor f872b;

    public p(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f871a = i3;
        this.f872b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f871a) {
            case 0:
                z zVar = (z) this.f872b;
                zVar.requestFocus();
                org.telegram.messenger.g0.K3(zVar);
                return;
            case 1:
                u3 u3Var = (u3) this.f872b;
                u3Var.requestFocus();
                org.telegram.messenger.g0.K3(u3Var);
                return;
            case 2:
                lg.s sVar = (lg.s) this.f872b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f872b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
        }
    }
}
