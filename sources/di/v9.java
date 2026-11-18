package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class v9 implements Runnable {
    public final int f9949a;
    public final EditTextBoldCursor f9950b;
    public final org.telegram.ui.ActionBar.x2[] f9951c;

    public v9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.f9949a = i7;
        this.f9950b = editTextBoldCursor;
        this.f9951c = x2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f9949a) {
            case 0:
                this.f9951c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f9950b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new ca.r(editTextBoldCursor, 26));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f9950b);
                this.f9951c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9950b);
                this.f9951c[0].dismiss();
                return;
        }
    }

    public v9(org.telegram.ui.ActionBar.x2[] x2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f9949a = 0;
        this.f9951c = x2VarArr;
        this.f9950b = editTextBoldCursor;
    }
}
