package bi;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
public final class bc implements TextWatcher {
    public boolean f4388a;
    public int f4389b = 2;
    public final EditTextBoldCursor f4390c;
    public final sd0 d;
    public final long e;
    public final boolean f4391f;
    public final fi.d h;
    public final TextView f4392n;

    public bc(EditTextBoldCursor editTextBoldCursor, sd0 sd0Var, long j10, boolean z10, fi.d dVar, TextView textView) {
        this.f4390c = editTextBoldCursor;
        this.d = sd0Var;
        this.e = j10;
        this.f4391f = z10;
        this.h = dVar;
        this.f4392n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.bc.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
