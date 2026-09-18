package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.is;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8702a;
    public final Object f8703b;
    public final EditTextBoldCursor f8704c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8702a = i10;
        this.f8703b = obj;
        this.f8704c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8702a) {
            case 0:
                ((yc0) this.f8703b).c(z10, !TextUtils.isEmpty(this.f8704c.getText()));
                return;
            case 1:
                ((yc0) this.f8703b).c(z10, !TextUtils.isEmpty(this.f8704c.getText()));
                return;
            case 2:
                ((yc0) this.f8703b).c(z10, !TextUtils.isEmpty(this.f8704c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8703b;
                passcodeActivity.v.setEditText((is) this.f8704c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
