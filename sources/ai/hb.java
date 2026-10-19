package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.tr;
public final class hb implements View.OnFocusChangeListener {
    public final int f1436a;
    public final Object f1437b;
    public final EditTextBoldCursor f1438c;

    public hb(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f1436a = i10;
        this.f1437b = obj;
        this.f1438c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f1436a) {
            case 0:
                ((sd0) this.f1437b).c(z10, !TextUtils.isEmpty(this.f1438c.getText()));
                return;
            case 1:
                ((sd0) this.f1437b).c(z10, !TextUtils.isEmpty(this.f1438c.getText()));
                return;
            case 2:
                ((sd0) this.f1437b).c(z10, !TextUtils.isEmpty(this.f1438c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1437b;
                passcodeActivity.v.setEditText((tr) this.f1438c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
