package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
public final class sa implements TextWatcher {
    public boolean f9739a;
    public int f9740b = 2;
    public final EditTextBoldCursor f9741c;
    public final xb0 d;
    public final long f9742e;
    public final boolean f9743f;
    public final hi.d h;
    public final TextView f9744n;

    public sa(EditTextBoldCursor editTextBoldCursor, xb0 xb0Var, long j3, boolean z10, hi.d dVar, TextView textView) {
        this.f9741c = editTextBoldCursor;
        this.d = xb0Var;
        this.f9742e = j3;
        this.f9743f = z10;
        this.h = dVar;
        this.f9744n = textView;
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
