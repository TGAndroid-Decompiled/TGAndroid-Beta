package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class s8 implements Runnable {

    public final int f10028a;

    public final EditTextBoldCursor f10029b;

    public final org.telegram.ui.ActionBar.e3[] f10030c;

    public s8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f10028a = i10;
        this.f10029b = editTextBoldCursor;
        this.f10030c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f10028a) {
            case 0:
                this.f10030c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f10029b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new f2.r(editTextBoldCursor, 28));
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.f10029b);
                this.f10030c[0].dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f10029b);
                this.f10030c[0].dismiss();
                break;
        }
    }

    public s8(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f10028a = 0;
        this.f10030c = e3VarArr;
        this.f10029b = editTextBoldCursor;
    }
}
