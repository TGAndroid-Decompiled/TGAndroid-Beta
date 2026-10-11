package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ds;
public final class w1 implements View.OnFocusChangeListener {
    public final int f9456a;
    public final Object f9457b;
    public final EditTextBoldCursor f9458c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9456a = i10;
        this.f9457b = obj;
        this.f9458c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9456a) {
            case 0:
                ((ae0) this.f9457b).c(z10, !TextUtils.isEmpty(this.f9458c.getText()));
                return;
            case 1:
                ((ae0) this.f9457b).c(z10, !TextUtils.isEmpty(this.f9458c.getText()));
                return;
            case 2:
                ((ae0) this.f9457b).c(z10, !TextUtils.isEmpty(this.f9458c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9457b;
                passcodeActivity.v.setEditText((ds) this.f9458c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
