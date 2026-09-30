package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.md0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.as;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8696a;
    public final Object f8697b;
    public final EditTextBoldCursor f8698c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8696a = i10;
        this.f8697b = obj;
        this.f8698c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8696a) {
            case 0:
                ((md0) this.f8697b).c(z10, !TextUtils.isEmpty(this.f8698c.getText()));
                return;
            case 1:
                ((md0) this.f8697b).c(z10, !TextUtils.isEmpty(this.f8698c.getText()));
                return;
            case 2:
                ((md0) this.f8697b).c(z10, !TextUtils.isEmpty(this.f8698c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8697b;
                passcodeActivity.v.setEditText((as) this.f8698c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
