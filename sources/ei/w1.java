package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f8685a;
    public final Object f8686b;
    public final EditTextBoldCursor f8687c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f8685a = i10;
        this.f8686b = obj;
        this.f8687c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8685a) {
            case 0:
                ((yc0) this.f8686b).c(z10, !TextUtils.isEmpty(this.f8687c.getText()));
                return;
            case 1:
                ((yc0) this.f8686b).c(z10, !TextUtils.isEmpty(this.f8687c.getText()));
                return;
            case 2:
                ((yc0) this.f8686b).c(z10, !TextUtils.isEmpty(this.f8687c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8686b;
                passcodeActivity.v.setEditText((bs) this.f8687c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
