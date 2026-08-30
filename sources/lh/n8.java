package lh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bs;
public final class n8 implements View.OnFocusChangeListener {
    public final int f12854a;
    public final Object f12855b;
    public final EditTextBoldCursor f12856c;

    public n8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f12854a = i10;
        this.f12855b = obj;
        this.f12856c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f12854a) {
            case 0:
                ((ad0) this.f12855b).c(z4, !TextUtils.isEmpty(this.f12856c.getText()));
                return;
            case 1:
                ((ad0) this.f12855b).c(z4, !TextUtils.isEmpty(this.f12856c.getText()));
                return;
            case 2:
                ((ad0) this.f12855b).c(z4, !TextUtils.isEmpty(this.f12856c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f12855b;
                passcodeActivity.v.setEditText((bs) this.f12856c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
