package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ds;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8687a;
    public final Object f8688b;
    public final EditTextBoldCursor f8689c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8687a = i10;
        this.f8688b = obj;
        this.f8689c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8687a) {
            case 0:
                ((jd0) this.f8688b).c(z10, !TextUtils.isEmpty(this.f8689c.getText()));
                return;
            case 1:
                ((jd0) this.f8688b).c(z10, !TextUtils.isEmpty(this.f8689c.getText()));
                return;
            case 2:
                ((jd0) this.f8688b).c(z10, !TextUtils.isEmpty(this.f8689c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8688b;
                passcodeActivity.v.setEditText((ds) this.f8689c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
