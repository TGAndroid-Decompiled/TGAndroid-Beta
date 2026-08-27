package hh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.wr;

public final class p8 implements View.OnFocusChangeListener {

    public final int f9880a;

    public final Object f9881b;

    public final EditTextBoldCursor f9882c;

    public p8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9880a = i10;
        this.f9881b = obj;
        this.f9882c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9880a) {
            case 0:
                ((jc0) this.f9881b).c(z10, !TextUtils.isEmpty(this.f9882c.getText()));
                break;
            case 1:
                ((jc0) this.f9881b).c(z10, !TextUtils.isEmpty(this.f9882c.getText()));
                break;
            case 2:
                ((jc0) this.f9881b).c(z10, !TextUtils.isEmpty(this.f9882c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9881b;
                passcodeActivity.v.setEditText((wr) this.f9882c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
