package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.hs;
public final class z1 implements View.OnFocusChangeListener {
    public final int f7054a;
    public final Object f7055b;
    public final EditTextBoldCursor f7056c;

    public z1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f7054a = i10;
        this.f7055b = obj;
        this.f7056c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f7054a) {
            case 0:
                ((hd0) this.f7055b).c(z10, !TextUtils.isEmpty(this.f7056c.getText()));
                return;
            case 1:
                ((hd0) this.f7055b).c(z10, !TextUtils.isEmpty(this.f7056c.getText()));
                return;
            case 2:
                ((hd0) this.f7055b).c(z10, !TextUtils.isEmpty(this.f7056c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f7055b;
                passcodeActivity.v.setEditText((hs) this.f7056c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
