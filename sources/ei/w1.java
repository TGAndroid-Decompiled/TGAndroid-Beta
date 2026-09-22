package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8701a;
    public final Object f8702b;
    public final EditTextBoldCursor f8703c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8701a = i10;
        this.f8702b = obj;
        this.f8703c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8701a) {
            case 0:
                ((kd0) this.f8702b).c(z10, !TextUtils.isEmpty(this.f8703c.getText()));
                return;
            case 1:
                ((kd0) this.f8702b).c(z10, !TextUtils.isEmpty(this.f8703c.getText()));
                return;
            case 2:
                ((kd0) this.f8702b).c(z10, !TextUtils.isEmpty(this.f8703c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8702b;
                passcodeActivity.v.setEditText((gs) this.f8703c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
