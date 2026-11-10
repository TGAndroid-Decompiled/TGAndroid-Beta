package bi;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class gb implements Runnable {
    public final int f3954a;
    public final EditTextBoldCursor f3955b;
    public final org.telegram.ui.ActionBar.w2[] f3956c;

    public gb(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f3954a = i7;
        this.f3955b = editTextBoldCursor;
        this.f3956c = w2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f3954a) {
            case 0:
                this.f3956c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f3955b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ab(editTextBoldCursor, 1));
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f3955b);
                this.f3956c[0].dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1(this.f3955b);
                this.f3956c[0].dismiss();
                return;
        }
    }

    public gb(org.telegram.ui.ActionBar.w2[] w2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f3954a = 0;
        this.f3956c = w2VarArr;
        this.f3955b = editTextBoldCursor;
    }
}
