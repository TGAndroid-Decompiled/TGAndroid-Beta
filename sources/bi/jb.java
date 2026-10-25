package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jb implements Runnable {
    public final int f4913a;
    public final EditTextBoldCursor f4914b;
    public final org.telegram.ui.ActionBar.k3[] f4915c;

    public jb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.k3[] k3VarArr, int i10) {
        this.f4913a = i10;
        this.f4914b = editTextBoldCursor;
        this.f4915c = k3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f4913a) {
            case 0:
                this.f4915c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f4914b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new u6(editTextBoldCursor, 3));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f4914b);
                this.f4915c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f4914b);
                this.f4915c[0].dismiss();
                return;
        }
    }

    public jb(org.telegram.ui.ActionBar.k3[] k3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f4913a = 0;
        this.f4915c = k3VarArr;
        this.f4914b = editTextBoldCursor;
    }
}
