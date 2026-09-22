package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8699a;
    public final Object f8700b;
    public final EditTextBoldCursor f8701c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8699a = i10;
        this.f8700b = obj;
        this.f8701c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8699a) {
            case 0:
                ((yc0) this.f8700b).c(z10, !TextUtils.isEmpty(this.f8701c.getText()));
                return;
            case 1:
                ((yc0) this.f8700b).c(z10, !TextUtils.isEmpty(this.f8701c.getText()));
                return;
            case 2:
                ((yc0) this.f8700b).c(z10, !TextUtils.isEmpty(this.f8701c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8700b;
                passcodeActivity.v.setEditText((gs) this.f8701c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
