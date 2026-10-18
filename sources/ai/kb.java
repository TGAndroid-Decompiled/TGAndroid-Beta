package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kb implements Runnable {
    public final int f1718a;
    public final EditTextBoldCursor f1719b;
    public final org.telegram.ui.ActionBar.f3[] f1720c;

    public kb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f1718a = i10;
        this.f1719b = editTextBoldCursor;
        this.f1720c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f1718a) {
            case 0:
                this.f1720c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f1719b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f1719b);
                this.f1720c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f1719b);
                this.f1720c[0].dismiss();
                return;
        }
    }

    public kb(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f1718a = 0;
        this.f1720c = f3VarArr;
        this.f1719b = editTextBoldCursor;
    }
}
