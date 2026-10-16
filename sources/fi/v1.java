package fi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ks;
public final class v1 implements View.OnFocusChangeListener {
    public final int f9607a;
    public final Object f9608b;
    public final EditTextBoldCursor f9609c;

    public v1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9607a = i10;
        this.f9608b = obj;
        this.f9609c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9607a) {
            case 0:
                ((yd0) this.f9608b).c(z10, !TextUtils.isEmpty(this.f9609c.getText()));
                return;
            case 1:
                ((yd0) this.f9608b).c(z10, !TextUtils.isEmpty(this.f9609c.getText()));
                return;
            case 2:
                ((yd0) this.f9608b).c(z10, !TextUtils.isEmpty(this.f9609c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9608b;
                passcodeActivity.v.setEditText((ks) this.f9609c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
