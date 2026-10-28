package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.zr;
public final class gb implements View.OnFocusChangeListener {
    public final int f4691a;
    public final Object f4692b;
    public final EditTextBoldCursor f4693c;

    public gb(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f4691a = i10;
        this.f4692b = obj;
        this.f4693c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f4691a) {
            case 0:
                ((sd0) this.f4692b).c(z10, !TextUtils.isEmpty(this.f4693c.getText()));
                return;
            case 1:
                ((sd0) this.f4692b).c(z10, !TextUtils.isEmpty(this.f4693c.getText()));
                return;
            case 2:
                ((sd0) this.f4692b).c(z10, !TextUtils.isEmpty(this.f4693c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f4692b;
                passcodeActivity.v.setEditText((zr) this.f4693c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
