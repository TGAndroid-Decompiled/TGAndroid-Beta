package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.vr;
public final class hb implements View.OnFocusChangeListener {
    public final int f1429a;
    public final Object f1430b;
    public final EditTextBoldCursor f1431c;

    public hb(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f1429a = i10;
        this.f1430b = obj;
        this.f1431c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f1429a) {
            case 0:
                ((sd0) this.f1430b).c(z10, !TextUtils.isEmpty(this.f1431c.getText()));
                return;
            case 1:
                ((sd0) this.f1430b).c(z10, !TextUtils.isEmpty(this.f1431c.getText()));
                return;
            case 2:
                ((sd0) this.f1430b).c(z10, !TextUtils.isEmpty(this.f1431c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1430b;
                passcodeActivity.v.setEditText((vr) this.f1431c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
