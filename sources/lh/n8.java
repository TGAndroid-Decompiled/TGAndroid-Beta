package lh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ds;
public final class n8 implements View.OnFocusChangeListener {
    public final int f12838a;
    public final Object f12839b;
    public final EditTextBoldCursor f12840c;

    public n8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f12838a = i10;
        this.f12839b = obj;
        this.f12840c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f12838a) {
            case 0:
                ((bd0) this.f12839b).c(z4, !TextUtils.isEmpty(this.f12840c.getText()));
                return;
            case 1:
                ((bd0) this.f12839b).c(z4, !TextUtils.isEmpty(this.f12840c.getText()));
                return;
            case 2:
                ((bd0) this.f12839b).c(z4, !TextUtils.isEmpty(this.f12840c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f12839b;
                passcodeActivity.v.setEditText((ds) this.f12840c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
