package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kb implements Runnable {
    public final int f1724a;
    public final EditTextBoldCursor f1725b;
    public final org.telegram.ui.ActionBar.f3[] f1726c;

    public kb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f1724a = i10;
        this.f1725b = editTextBoldCursor;
        this.f1726c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f1724a) {
            case 0:
                this.f1726c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f1725b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f1725b);
                this.f1726c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f1725b);
                this.f1726c[0].dismiss();
                return;
        }
    }

    public kb(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f1724a = 0;
        this.f1726c = f3VarArr;
        this.f1725b = editTextBoldCursor;
    }
}
