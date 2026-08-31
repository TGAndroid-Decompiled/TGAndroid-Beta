package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q8 implements Runnable {
    public final int f14642a;
    public final EditTextBoldCursor f14643b;
    public final org.telegram.ui.ActionBar.h3[] f14644c;

    public q8(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f14642a = i10;
        this.f14643b = editTextBoldCursor;
        this.f14644c = h3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f14642a) {
            case 0:
                this.f14644c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f14643b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new lh.c3(editTextBoldCursor, 14));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f14643b);
                this.f14644c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f14643b);
                this.f14644c[0].dismiss();
                return;
        }
    }

    public q8(org.telegram.ui.ActionBar.h3[] h3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f14642a = 0;
        this.f14644c = h3VarArr;
        this.f14643b = editTextBoldCursor;
    }
}
