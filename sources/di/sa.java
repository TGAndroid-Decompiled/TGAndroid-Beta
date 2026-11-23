package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vb0;
public final class sa implements TextWatcher {
    public boolean f9722a;
    public int f9723b = 2;
    public final EditTextBoldCursor f9724c;
    public final vb0 d;
    public final long f9725e;
    public final boolean f9726f;
    public final hi.e h;
    public final TextView f9727n;

    public sa(EditTextBoldCursor editTextBoldCursor, vb0 vb0Var, long j3, boolean z10, hi.e eVar, TextView textView) {
        this.f9724c = editTextBoldCursor;
        this.d = vb0Var;
        this.f9725e = j3;
        this.f9726f = z10;
        this.h = eVar;
        this.f9727n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.sa.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
