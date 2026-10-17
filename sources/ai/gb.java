package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.vr;
public final class gb implements View.OnFocusChangeListener {
    public final int f1376a;
    public final Object f1377b;
    public final EditTextBoldCursor f1378c;

    public gb(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f1376a = i10;
        this.f1377b = obj;
        this.f1378c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f1376a) {
            case 0:
                ((sd0) this.f1377b).c(z10, !TextUtils.isEmpty(this.f1378c.getText()));
                return;
            case 1:
                ((sd0) this.f1377b).c(z10, !TextUtils.isEmpty(this.f1378c.getText()));
                return;
            case 2:
                ((sd0) this.f1377b).c(z10, !TextUtils.isEmpty(this.f1378c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1377b;
                passcodeActivity.v.setEditText((vr) this.f1378c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
