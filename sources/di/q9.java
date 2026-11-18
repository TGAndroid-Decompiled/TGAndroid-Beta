package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class q9 implements View.OnFocusChangeListener {
    public final int f9598a;
    public final Object f9599b;
    public final EditTextBoldCursor f9600c;

    public q9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9598a = i7;
        this.f9599b = obj;
        this.f9600c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9598a) {
            case 0:
                ((xb0) this.f9599b).c(z10, !TextUtils.isEmpty(this.f9600c.getText()));
                return;
            case 1:
                ((xb0) this.f9599b).c(z10, !TextUtils.isEmpty(this.f9600c.getText()));
                return;
            case 2:
                ((xb0) this.f9599b).c(z10, !TextUtils.isEmpty(this.f9600c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9599b;
                passcodeActivity.f43146w.setEditText((er) this.f9600c);
                passcodeActivity.f43146w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
