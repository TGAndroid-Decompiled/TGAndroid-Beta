package fi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ks;
public final class v1 implements View.OnFocusChangeListener {
    public final int f9604a;
    public final Object f9605b;
    public final EditTextBoldCursor f9606c;

    public v1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f9604a = i10;
        this.f9605b = obj;
        this.f9606c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9604a) {
            case 0:
                ((yd0) this.f9605b).c(z10, !TextUtils.isEmpty(this.f9606c.getText()));
                return;
            case 1:
                ((yd0) this.f9605b).c(z10, !TextUtils.isEmpty(this.f9606c.getText()));
                return;
            case 2:
                ((yd0) this.f9605b).c(z10, !TextUtils.isEmpty(this.f9606c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f9605b;
                passcodeActivity.v.setEditText((ks) this.f9606c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
