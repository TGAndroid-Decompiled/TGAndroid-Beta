package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class r9 implements View.OnFocusChangeListener {
    public final int f9701a;
    public final Object f9702b;
    public final EditTextBoldCursor f9703c;

    public r9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9701a = i7;
        this.f9702b = obj;
        this.f9703c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9701a) {
            case 0:
                ((yb0) this.f9702b).c(z10, !TextUtils.isEmpty(this.f9703c.getText()));
                return;
            case 1:
                ((yb0) this.f9702b).c(z10, !TextUtils.isEmpty(this.f9703c.getText()));
                return;
            case 2:
                ((yb0) this.f9702b).c(z10, !TextUtils.isEmpty(this.f9703c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9702b;
                passcodeActivity.f43191w.setEditText((er) this.f9703c);
                passcodeActivity.f43191w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
