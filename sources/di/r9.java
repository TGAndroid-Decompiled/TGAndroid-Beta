package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class r9 implements View.OnFocusChangeListener {
    public final int f9665a;
    public final Object f9666b;
    public final EditTextBoldCursor f9667c;

    public r9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9665a = i7;
        this.f9666b = obj;
        this.f9667c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9665a) {
            case 0:
                ((yb0) this.f9666b).c(z10, !TextUtils.isEmpty(this.f9667c.getText()));
                return;
            case 1:
                ((yb0) this.f9666b).c(z10, !TextUtils.isEmpty(this.f9667c.getText()));
                return;
            case 2:
                ((yb0) this.f9666b).c(z10, !TextUtils.isEmpty(this.f9667c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9666b;
                passcodeActivity.f43156w.setEditText((er) this.f9667c);
                passcodeActivity.f43156w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
