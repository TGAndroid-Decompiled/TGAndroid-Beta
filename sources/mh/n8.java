package mh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cs;
public final class n8 implements View.OnFocusChangeListener {
    public final int f14494a;
    public final Object f14495b;
    public final EditTextBoldCursor f14496c;

    public n8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f14494a = i10;
        this.f14495b = obj;
        this.f14496c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f14494a) {
            case 0:
                ((cd0) this.f14495b).c(z4, !TextUtils.isEmpty(this.f14496c.getText()));
                return;
            case 1:
                ((cd0) this.f14495b).c(z4, !TextUtils.isEmpty(this.f14496c.getText()));
                return;
            case 2:
                ((cd0) this.f14495b).c(z4, !TextUtils.isEmpty(this.f14496c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f14495b;
                passcodeActivity.v.setEditText((cs) this.f14496c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
