package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.dr;
public final class n9 implements View.OnFocusChangeListener {
    public final int f9115a;
    public final Object f9116b;
    public final EditTextBoldCursor f9117c;

    public n9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9115a = i7;
        this.f9116b = obj;
        this.f9117c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9115a) {
            case 0:
                ((mb0) this.f9116b).c(z10, !TextUtils.isEmpty(this.f9117c.getText()));
                return;
            case 1:
                ((mb0) this.f9116b).c(z10, !TextUtils.isEmpty(this.f9117c.getText()));
                return;
            case 2:
                ((mb0) this.f9116b).c(z10, !TextUtils.isEmpty(this.f9117c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9116b;
                passcodeActivity.f42701w.setEditText((dr) this.f9117c);
                passcodeActivity.f42701w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
