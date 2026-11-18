package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
public final class sa implements TextWatcher {
    public boolean f9742a;
    public int f9743b = 2;
    public final EditTextBoldCursor f9744c;
    public final xb0 d;
    public final long f9745e;
    public final boolean f9746f;
    public final hi.d h;
    public final TextView f9747n;

    public sa(EditTextBoldCursor editTextBoldCursor, xb0 xb0Var, long j3, boolean z10, hi.d dVar, TextView textView) {
        this.f9744c = editTextBoldCursor;
        this.d = xb0Var;
        this.f9745e = j3;
        this.f9746f = z10;
        this.h = dVar;
        this.f9747n = textView;
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
