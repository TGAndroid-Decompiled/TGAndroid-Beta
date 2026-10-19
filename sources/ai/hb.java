package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.tr;
public final class hb implements View.OnFocusChangeListener {
    public final int f1424a;
    public final Object f1425b;
    public final EditTextBoldCursor f1426c;

    public hb(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f1424a = i10;
        this.f1425b = obj;
        this.f1426c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f1424a) {
            case 0:
                ((sd0) this.f1425b).c(z10, !TextUtils.isEmpty(this.f1426c.getText()));
                return;
            case 1:
                ((sd0) this.f1425b).c(z10, !TextUtils.isEmpty(this.f1426c.getText()));
                return;
            case 2:
                ((sd0) this.f1425b).c(z10, !TextUtils.isEmpty(this.f1426c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1425b;
                passcodeActivity.v.setEditText((tr) this.f1426c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
