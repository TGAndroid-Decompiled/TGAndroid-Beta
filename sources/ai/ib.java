package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.td0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.vr;
public final class ib implements View.OnFocusChangeListener {
    public final int f1495a;
    public final Object f1496b;
    public final EditTextBoldCursor f1497c;

    public ib(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f1495a = i10;
        this.f1496b = obj;
        this.f1497c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f1495a) {
            case 0:
                ((td0) this.f1496b).c(z10, !TextUtils.isEmpty(this.f1497c.getText()));
                return;
            case 1:
                ((td0) this.f1496b).c(z10, !TextUtils.isEmpty(this.f1497c.getText()));
                return;
            case 2:
                ((td0) this.f1496b).c(z10, !TextUtils.isEmpty(this.f1497c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1496b;
                passcodeActivity.v.setEditText((vr) this.f1497c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
