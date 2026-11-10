package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class bb implements View.OnFocusChangeListener {
    public final int f3528a;
    public final Object f3529b;
    public final EditTextBoldCursor f3530c;

    public bb(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3528a = i7;
        this.f3529b = obj;
        this.f3530c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f3528a) {
            case 0:
                ((lb0) this.f3529b).c(z9, !TextUtils.isEmpty(this.f3530c.getText()));
                return;
            case 1:
                ((lb0) this.f3529b).c(z9, !TextUtils.isEmpty(this.f3530c.getText()));
                return;
            case 2:
                ((lb0) this.f3529b).c(z9, !TextUtils.isEmpty(this.f3530c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f3529b;
                passcodeActivity.f41331w.setEditText((er) this.f3530c);
                passcodeActivity.f41331w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
