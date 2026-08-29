package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p8 implements Runnable {
    public final int f12622a;
    public final EditTextBoldCursor f12623b;
    public final org.telegram.ui.ActionBar.f3[] f12624c;

    public p8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f12622a = i10;
        this.f12623b = editTextBoldCursor;
        this.f12624c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f12622a) {
            case 0:
                this.f12624c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f12623b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new o(editTextBoldCursor, 12));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f12623b);
                this.f12624c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f12623b);
                this.f12624c[0].dismiss();
                return;
        }
    }

    public p8(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f12622a = 0;
        this.f12624c = f3VarArr;
        this.f12623b = editTextBoldCursor;
    }
}
