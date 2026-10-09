package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.es;
public final class w1 implements View.OnFocusChangeListener {
    public final int f9457a;
    public final Object f9458b;
    public final EditTextBoldCursor f9459c;

    public w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9457a = i10;
        this.f9458b = obj;
        this.f9459c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9457a) {
            case 0:
                ((zd0) this.f9458b).c(z10, !TextUtils.isEmpty(this.f9459c.getText()));
                return;
            case 1:
                ((zd0) this.f9458b).c(z10, !TextUtils.isEmpty(this.f9459c.getText()));
                return;
            case 2:
                ((zd0) this.f9458b).c(z10, !TextUtils.isEmpty(this.f9459c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9458b;
                passcodeActivity.v.setEditText((es) this.f9459c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
