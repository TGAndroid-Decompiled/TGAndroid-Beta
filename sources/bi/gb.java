package bi;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class gb implements Runnable {
    public final int f3957a;
    public final EditTextBoldCursor f3958b;
    public final org.telegram.ui.ActionBar.v2[] f3959c;

    public gb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f3957a = i7;
        this.f3958b = editTextBoldCursor;
        this.f3959c = v2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f3957a) {
            case 0:
                this.f3959c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f3958b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ab(editTextBoldCursor, 1));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f3958b);
                this.f3959c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f3958b);
                this.f3959c[0].dismiss();
                return;
        }
    }

    public gb(org.telegram.ui.ActionBar.v2[] v2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f3957a = 0;
        this.f3959c = v2VarArr;
        this.f3958b = editTextBoldCursor;
    }
}
