package defpackage;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tya implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final EditTextBoldCursor c;
    public final lu7 d;
    public final long e;
    public final boolean f;
    public final c51 h;
    public final TextView n;

    public tya(EditTextBoldCursor editTextBoldCursor, lu7 lu7Var, long j, boolean z, c51 c51Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = lu7Var;
        this.e = j;
        this.f = z;
        this.h = c51Var;
        this.n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tya.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
