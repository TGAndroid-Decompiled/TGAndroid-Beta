package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
public final class oa implements TextWatcher {
    public boolean f9179a;
    public int f9180b = 2;
    public final EditTextBoldCursor f9181c;
    public final mb0 d;
    public final long f9182e;
    public final boolean f9183f;
    public final hi.d h;
    public final TextView f9184n;

    public oa(EditTextBoldCursor editTextBoldCursor, mb0 mb0Var, long j3, boolean z10, hi.d dVar, TextView textView) {
        this.f9181c = editTextBoldCursor;
        this.d = mb0Var;
        this.f9182e = j3;
        this.f9183f = z10;
        this.h = dVar;
        this.f9184n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.oa.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
