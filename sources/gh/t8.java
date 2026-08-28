package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t8 implements Runnable {
    public final int f8923a;
    public final EditTextBoldCursor f8924b;
    public final org.telegram.ui.ActionBar.f3[] f8925c;

    public t8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i9) {
        this.f8923a = i9;
        this.f8924b = editTextBoldCursor;
        this.f8925c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f8923a) {
            case 0:
                this.f8925c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f8924b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new fh.o1(editTextBoldCursor, 17));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f8924b);
                this.f8925c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f8924b);
                this.f8925c[0].dismiss();
                return;
        }
    }

    public t8(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f8923a = 0;
        this.f8925c = f3VarArr;
        this.f8924b = editTextBoldCursor;
    }
}
