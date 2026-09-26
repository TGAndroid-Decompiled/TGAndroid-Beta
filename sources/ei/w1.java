package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.as;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8684a;
    public final Object f8685b;
    public final EditTextBoldCursor f8686c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8684a = i10;
        this.f8685b = obj;
        this.f8686c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8684a) {
            case 0:
                ((kd0) this.f8685b).c(z10, !TextUtils.isEmpty(this.f8686c.getText()));
                return;
            case 1:
                ((kd0) this.f8685b).c(z10, !TextUtils.isEmpty(this.f8686c.getText()));
                return;
            case 2:
                ((kd0) this.f8685b).c(z10, !TextUtils.isEmpty(this.f8686c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8685b;
                passcodeActivity.v.setEditText((as) this.f8686c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
