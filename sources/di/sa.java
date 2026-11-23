package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
public final class sa implements TextWatcher {
    public boolean f9761a;
    public int f9762b = 2;
    public final EditTextBoldCursor f9763c;
    public final yb0 d;
    public final long f9764e;
    public final boolean f9765f;
    public final hi.e h;
    public final TextView f9766n;

    public sa(EditTextBoldCursor editTextBoldCursor, yb0 yb0Var, long j3, boolean z10, hi.e eVar, TextView textView) {
        this.f9763c = editTextBoldCursor;
        this.d = yb0Var;
        this.f9764e = j3;
        this.f9765f = z10;
        this.h = eVar;
        this.f9766n = textView;
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
