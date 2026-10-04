package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.es;
public final class x1 implements View.OnFocusChangeListener {
    public final int f9453a;
    public final Object f9454b;
    public final EditTextBoldCursor f9455c;

    public x1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9453a = i10;
        this.f9454b = obj;
        this.f9455c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9453a) {
            case 0:
                ((ld0) this.f9454b).c(z10, !TextUtils.isEmpty(this.f9455c.getText()));
                return;
            case 1:
                ((ld0) this.f9454b).c(z10, !TextUtils.isEmpty(this.f9455c.getText()));
                return;
            case 2:
                ((ld0) this.f9454b).c(z10, !TextUtils.isEmpty(this.f9455c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9454b;
                passcodeActivity.v.setEditText((es) this.f9455c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
