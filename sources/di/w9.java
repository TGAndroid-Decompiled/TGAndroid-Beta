package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class w9 implements Runnable {
    public final int f10011a;
    public final EditTextBoldCursor f10012b;
    public final org.telegram.ui.ActionBar.w2[] f10013c;

    public w9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f10011a = i7;
        this.f10012b = editTextBoldCursor;
        this.f10013c = w2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f10011a) {
            case 0:
                this.f10013c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f10012b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new ca.r(editTextBoldCursor, 26));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f10012b);
                this.f10013c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f10012b);
                this.f10013c[0].dismiss();
                return;
        }
    }

    public w9(org.telegram.ui.ActionBar.w2[] w2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f10011a = 0;
        this.f10013c = w2VarArr;
        this.f10012b = editTextBoldCursor;
    }
}
