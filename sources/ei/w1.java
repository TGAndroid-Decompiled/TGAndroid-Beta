package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.de0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.hs;
public final class w1 implements View.OnFocusChangeListener {
    public final int f9454a;
    public final Object f9455b;
    public final EditTextBoldCursor f9456c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9454a = i10;
        this.f9455b = obj;
        this.f9456c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9454a) {
            case 0:
                ((de0) this.f9455b).c(z10, !TextUtils.isEmpty(this.f9456c.getText()));
                return;
            case 1:
                ((de0) this.f9455b).c(z10, !TextUtils.isEmpty(this.f9456c.getText()));
                return;
            case 2:
                ((de0) this.f9455b).c(z10, !TextUtils.isEmpty(this.f9456c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9455b;
                passcodeActivity.v.setEditText((hs) this.f9456c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
