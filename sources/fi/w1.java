package fi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f10057a;
    public final Object f10058b;
    public final EditTextBoldCursor f10059c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f10057a = i10;
        this.f10058b = obj;
        this.f10059c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f10057a) {
            case 0:
                ((zc0) this.f10058b).c(z10, !TextUtils.isEmpty(this.f10059c.getText()));
                return;
            case 1:
                ((zc0) this.f10058b).c(z10, !TextUtils.isEmpty(this.f10059c.getText()));
                return;
            case 2:
                ((zc0) this.f10058b).c(z10, !TextUtils.isEmpty(this.f10059c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f10058b;
                passcodeActivity.v.setEditText((gs) this.f10059c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
