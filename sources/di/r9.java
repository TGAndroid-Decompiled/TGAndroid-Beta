package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class r9 implements View.OnFocusChangeListener {
    public final int f9698a;
    public final Object f9699b;
    public final EditTextBoldCursor f9700c;

    public r9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9698a = i7;
        this.f9699b = obj;
        this.f9700c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9698a) {
            case 0:
                ((yb0) this.f9699b).c(z10, !TextUtils.isEmpty(this.f9700c.getText()));
                return;
            case 1:
                ((yb0) this.f9699b).c(z10, !TextUtils.isEmpty(this.f9700c.getText()));
                return;
            case 2:
                ((yb0) this.f9699b).c(z10, !TextUtils.isEmpty(this.f9700c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9699b;
                passcodeActivity.f43187w.setEditText((er) this.f9700c);
                passcodeActivity.f43187w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
