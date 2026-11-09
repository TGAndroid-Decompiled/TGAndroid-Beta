package bi;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
public final class dc implements TextWatcher {
    public boolean f3700a;
    public int f3701b = 2;
    public final EditTextBoldCursor f3702c;
    public final mb0 d;
    public final long f3703e;
    public final boolean f3704f;
    public final fi.d h;
    public final TextView f3705n;

    public dc(EditTextBoldCursor editTextBoldCursor, mb0 mb0Var, long j3, boolean z9, fi.d dVar, TextView textView) {
        this.f3702c = editTextBoldCursor;
        this.d = mb0Var;
        this.f3703e = j3;
        this.f3704f = z9;
        this.h = dVar;
        this.f3705n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.dc.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
