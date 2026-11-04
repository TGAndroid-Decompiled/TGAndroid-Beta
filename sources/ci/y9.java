package ci;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.zq;
public final class y9 implements View.OnFocusChangeListener {
    public final int f6413a;
    public final Object f6414b;
    public final EditTextBoldCursor f6415c;

    public y9(Object obj, EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f6413a = i3;
        this.f6414b = obj;
        this.f6415c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f6413a) {
            case 0:
                ((gb0) this.f6414b).c(z10, !TextUtils.isEmpty(this.f6415c.getText()));
                return;
            case 1:
                ((gb0) this.f6414b).c(z10, !TextUtils.isEmpty(this.f6415c.getText()));
                return;
            case 2:
                ((gb0) this.f6414b).c(z10, !TextUtils.isEmpty(this.f6415c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f6414b;
                passcodeActivity.f41362w.setEditText((zq) this.f6415c);
                passcodeActivity.f41362w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
