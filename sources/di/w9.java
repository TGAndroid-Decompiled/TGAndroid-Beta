package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class w9 implements Runnable {
    public final int f9974a;
    public final EditTextBoldCursor f9975b;
    public final org.telegram.ui.ActionBar.w2[] f9976c;

    public w9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f9974a = i7;
        this.f9975b = editTextBoldCursor;
        this.f9976c = w2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f9974a) {
            case 0:
                this.f9976c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f9975b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new ca.r(editTextBoldCursor, 25));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f9975b);
                this.f9976c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9975b);
                this.f9976c[0].dismiss();
                return;
        }
    }

    public w9(org.telegram.ui.ActionBar.w2[] w2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f9974a = 0;
        this.f9976c = w2VarArr;
        this.f9975b = editTextBoldCursor;
    }
}
