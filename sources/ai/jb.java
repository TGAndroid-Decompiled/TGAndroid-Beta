package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jb implements Runnable {
    public final int f1598a;
    public final EditTextBoldCursor f1599b;
    public final org.telegram.ui.ActionBar.f3[] f1600c;

    public jb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f1598a = i10;
        this.f1599b = editTextBoldCursor;
        this.f1600c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f1598a) {
            case 0:
                this.f1600c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f1599b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new a3.d(editTextBoldCursor, 21));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f1599b);
                this.f1600c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f1599b);
                this.f1600c[0].dismiss();
                return;
        }
    }

    public jb(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f1598a = 0;
        this.f1600c = f3VarArr;
        this.f1599b = editTextBoldCursor;
    }
}
