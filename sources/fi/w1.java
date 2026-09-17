package fi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f10085a;
    public final Object f10086b;
    public final EditTextBoldCursor f10087c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f10085a = i10;
        this.f10086b = obj;
        this.f10087c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f10085a) {
            case 0:
                ((zc0) this.f10086b).c(z10, !TextUtils.isEmpty(this.f10087c.getText()));
                return;
            case 1:
                ((zc0) this.f10086b).c(z10, !TextUtils.isEmpty(this.f10087c.getText()));
                return;
            case 2:
                ((zc0) this.f10086b).c(z10, !TextUtils.isEmpty(this.f10087c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f10086b;
                passcodeActivity.v.setEditText((gs) this.f10087c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
