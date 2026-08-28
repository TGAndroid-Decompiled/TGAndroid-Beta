package gh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.vr;
public final class q8 implements View.OnFocusChangeListener {
    public final int f8757a;
    public final Object f8758b;
    public final EditTextBoldCursor f8759c;

    public q8(Object obj, EditTextBoldCursor editTextBoldCursor, int i9) {
        this.f8757a = i9;
        this.f8758b = obj;
        this.f8759c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f8757a) {
            case 0:
                ((fc0) this.f8758b).c(z10, !TextUtils.isEmpty(this.f8759c.getText()));
                return;
            case 1:
                ((fc0) this.f8758b).c(z10, !TextUtils.isEmpty(this.f8759c.getText()));
                return;
            case 2:
                ((fc0) this.f8758b).c(z10, !TextUtils.isEmpty(this.f8759c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f8758b;
                passcodeActivity.v.setEditText((vr) this.f8759c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
