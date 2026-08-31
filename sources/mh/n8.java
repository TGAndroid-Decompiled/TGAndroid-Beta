package mh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cs;
public final class n8 implements View.OnFocusChangeListener {
    public final int f14492a;
    public final Object f14493b;
    public final EditTextBoldCursor f14494c;

    public n8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f14492a = i10;
        this.f14493b = obj;
        this.f14494c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f14492a) {
            case 0:
                ((cd0) this.f14493b).c(z4, !TextUtils.isEmpty(this.f14494c.getText()));
                return;
            case 1:
                ((cd0) this.f14493b).c(z4, !TextUtils.isEmpty(this.f14494c.getText()));
                return;
            case 2:
                ((cd0) this.f14493b).c(z4, !TextUtils.isEmpty(this.f14494c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f14493b;
                passcodeActivity.v.setEditText((cs) this.f14494c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
