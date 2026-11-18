package di;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class v9 implements Runnable {
    public final int f9946a;
    public final EditTextBoldCursor f9947b;
    public final org.telegram.ui.ActionBar.x2[] f9948c;

    public v9(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.f9946a = i7;
        this.f9947b = editTextBoldCursor;
        this.f9948c = x2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f9946a) {
            case 0:
                this.f9948c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f9947b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new ca.r(editTextBoldCursor, 26));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f9947b);
                this.f9948c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9947b);
                this.f9948c[0].dismiss();
                return;
        }
    }

    public v9(org.telegram.ui.ActionBar.x2[] x2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f9946a = 0;
        this.f9948c = x2VarArr;
        this.f9947b = editTextBoldCursor;
    }
}
