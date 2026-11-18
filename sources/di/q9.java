package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class q9 implements View.OnFocusChangeListener {
    public final int f9601a;
    public final Object f9602b;
    public final EditTextBoldCursor f9603c;

    public q9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9601a = i7;
        this.f9602b = obj;
        this.f9603c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9601a) {
            case 0:
                ((xb0) this.f9602b).c(z10, !TextUtils.isEmpty(this.f9603c.getText()));
                return;
            case 1:
                ((xb0) this.f9602b).c(z10, !TextUtils.isEmpty(this.f9603c.getText()));
                return;
            case 2:
                ((xb0) this.f9602b).c(z10, !TextUtils.isEmpty(this.f9603c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9602b;
                passcodeActivity.f43146w.setEditText((er) this.f9603c);
                passcodeActivity.f43146w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
