package jh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ur;
public final class m8 implements View.OnFocusChangeListener {
    public final int f12470a;
    public final Object f12471b;
    public final EditTextBoldCursor f12472c;

    public m8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f12470a = i10;
        this.f12471b = obj;
        this.f12472c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f12470a) {
            case 0:
                ((uc0) this.f12471b).c(z10, !TextUtils.isEmpty(this.f12472c.getText()));
                return;
            case 1:
                ((uc0) this.f12471b).c(z10, !TextUtils.isEmpty(this.f12472c.getText()));
                return;
            case 2:
                ((uc0) this.f12471b).c(z10, !TextUtils.isEmpty(this.f12472c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f12471b;
                passcodeActivity.v.setEditText((ur) this.f12472c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
