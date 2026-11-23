package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.er;
public final class r9 implements View.OnFocusChangeListener {
    public final int f9662a;
    public final Object f9663b;
    public final EditTextBoldCursor f9664c;

    public r9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f9662a = i7;
        this.f9663b = obj;
        this.f9664c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9662a) {
            case 0:
                ((vb0) this.f9663b).c(z10, !TextUtils.isEmpty(this.f9664c.getText()));
                return;
            case 1:
                ((vb0) this.f9663b).c(z10, !TextUtils.isEmpty(this.f9664c.getText()));
                return;
            case 2:
                ((vb0) this.f9663b).c(z10, !TextUtils.isEmpty(this.f9664c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9663b;
                passcodeActivity.f43266w.setEditText((er) this.f9664c);
                passcodeActivity.f43266w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
