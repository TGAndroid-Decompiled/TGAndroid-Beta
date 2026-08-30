package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q8 implements Runnable {
    public final int f12988a;
    public final EditTextBoldCursor f12989b;
    public final org.telegram.ui.ActionBar.g3[] f12990c;

    public q8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f12988a = i10;
        this.f12989b = editTextBoldCursor;
        this.f12990c = g3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f12988a) {
            case 0:
                this.f12990c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f12989b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new b(editTextBoldCursor, 13));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f12989b);
                this.f12990c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f12989b);
                this.f12990c[0].dismiss();
                return;
        }
    }

    public q8(org.telegram.ui.ActionBar.g3[] g3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f12988a = 0;
        this.f12990c = g3VarArr;
        this.f12989b = editTextBoldCursor;
    }
}
