package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.dr;
public final class o9 implements View.OnFocusChangeListener {
    public final int f9183a;
    public final Object f9184b;
    public final EditTextBoldCursor f9185c;

    public o9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9183a = i7;
        this.f9184b = obj;
        this.f9185c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9183a) {
            case 0:
                ((mb0) this.f9184b).c(z10, !TextUtils.isEmpty(this.f9185c.getText()));
                return;
            case 1:
                ((mb0) this.f9184b).c(z10, !TextUtils.isEmpty(this.f9185c.getText()));
                return;
            case 2:
                ((mb0) this.f9184b).c(z10, !TextUtils.isEmpty(this.f9185c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9184b;
                passcodeActivity.f42701w.setEditText((dr) this.f9185c);
                passcodeActivity.f42701w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
