package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements Runnable {
    public final int f9490a;
    public final EditTextBoldCursor f9491b;
    public final org.telegram.ui.ActionBar.u2[] f9492c;

    public t9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f9490a = i7;
        this.f9491b = editTextBoldCursor;
        this.f9492c = u2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f9490a) {
            case 0:
                this.f9492c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f9491b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ch.w(editTextBoldCursor, 22));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f9491b);
                this.f9492c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9491b);
                this.f9492c[0].dismiss();
                return;
        }
    }

    public t9(org.telegram.ui.ActionBar.u2[] u2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f9490a = 0;
        this.f9492c = u2VarArr;
        this.f9491b = editTextBoldCursor;
    }
}
