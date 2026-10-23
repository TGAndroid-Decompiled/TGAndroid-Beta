package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lb implements Runnable {
    public final int f1777a;
    public final EditTextBoldCursor f1778b;
    public final org.telegram.ui.ActionBar.h3[] f1779c;

    public lb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f1777a = i10;
        this.f1778b = editTextBoldCursor;
        this.f1779c = h3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f1777a) {
            case 0:
                this.f1779c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f1778b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f1778b);
                this.f1779c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f1778b);
                this.f1779c[0].dismiss();
                return;
        }
    }

    public lb(org.telegram.ui.ActionBar.h3[] h3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f1777a = 0;
        this.f1779c = h3VarArr;
        this.f1778b = editTextBoldCursor;
    }
}
