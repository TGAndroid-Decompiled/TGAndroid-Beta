package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8697a;
    public final Object f8698b;
    public final EditTextBoldCursor f8699c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8697a = i10;
        this.f8698b = obj;
        this.f8699c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8697a) {
            case 0:
                ((yc0) this.f8698b).c(z10, !TextUtils.isEmpty(this.f8699c.getText()));
                return;
            case 1:
                ((yc0) this.f8698b).c(z10, !TextUtils.isEmpty(this.f8699c.getText()));
                return;
            case 2:
                ((yc0) this.f8698b).c(z10, !TextUtils.isEmpty(this.f8699c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8698b;
                passcodeActivity.v.setEditText((gs) this.f8699c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
