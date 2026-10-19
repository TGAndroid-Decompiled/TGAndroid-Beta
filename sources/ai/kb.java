package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kb implements Runnable {
    public final int f1714a;
    public final EditTextBoldCursor f1715b;
    public final org.telegram.ui.ActionBar.f3[] f1716c;

    public kb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f1714a = i10;
        this.f1715b = editTextBoldCursor;
        this.f1716c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f1714a) {
            case 0:
                this.f1716c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f1715b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f1715b);
                this.f1716c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f1715b);
                this.f1716c[0].dismiss();
                return;
        }
    }

    public kb(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f1714a = 0;
        this.f1716c = f3VarArr;
        this.f1715b = editTextBoldCursor;
    }
}
