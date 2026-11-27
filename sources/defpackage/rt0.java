package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
public final class rt0 implements View.OnFocusChangeListener {
    public final byte a;
    public final Object b;
    public final EditTextBoldCursor c;

    public rt0(Object obj, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                return;
            case 1:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                return;
            case 2:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.w.setEditText((ok2) editTextBoldCursor);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
