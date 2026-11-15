package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class s9 implements Runnable {
    public final int f9404a;
    public final EditTextBoldCursor f9405b;
    public final org.telegram.ui.ActionBar.u2[] f9406c;

    public s9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f9404a = i7;
        this.f9405b = editTextBoldCursor;
        this.f9406c = u2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f9404a) {
            case 0:
                this.f9406c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f9405b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ch.w(editTextBoldCursor, 22));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f9405b);
                this.f9406c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9405b);
                this.f9406c[0].dismiss();
                return;
        }
    }

    public s9(org.telegram.ui.ActionBar.u2[] u2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f9404a = 0;
        this.f9406c = u2VarArr;
        this.f9405b = editTextBoldCursor;
    }
}
