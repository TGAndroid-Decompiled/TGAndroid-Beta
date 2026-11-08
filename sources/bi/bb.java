package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.br;
public final class bb implements View.OnFocusChangeListener {
    public final int f3525a;
    public final Object f3526b;
    public final EditTextBoldCursor f3527c;

    public bb(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f3525a = i7;
        this.f3526b = obj;
        this.f3527c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f3525a) {
            case 0:
                ((lb0) this.f3526b).c(z9, !TextUtils.isEmpty(this.f3527c.getText()));
                return;
            case 1:
                ((lb0) this.f3526b).c(z9, !TextUtils.isEmpty(this.f3527c.getText()));
                return;
            case 2:
                ((lb0) this.f3526b).c(z9, !TextUtils.isEmpty(this.f3527c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f3526b;
                passcodeActivity.f41333w.setEditText((br) this.f3527c);
                passcodeActivity.f41333w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
