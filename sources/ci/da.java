package ci;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class da implements Runnable {
    public final int f4987a;
    public final EditTextBoldCursor f4988b;
    public final org.telegram.ui.ActionBar.t2[] f4989c;

    public da(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.t2[] t2VarArr, int i3) {
        this.f4987a = i3;
        this.f4988b = editTextBoldCursor;
        this.f4989c = t2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f4987a) {
            case 0:
                this.f4989c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f4988b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new d1(editTextBoldCursor, 11));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f4988b);
                this.f4989c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f4988b);
                this.f4989c[0].dismiss();
                return;
        }
    }

    public da(org.telegram.ui.ActionBar.t2[] t2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f4987a = 0;
        this.f4989c = t2VarArr;
        this.f4988b = editTextBoldCursor;
    }
}
