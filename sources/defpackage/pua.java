package defpackage;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pua implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final EditTextBoldCursor c;
    public final er7 d;
    public final long e;
    public final boolean f;
    public final u41 h;
    public final TextView n;

    public pua(EditTextBoldCursor editTextBoldCursor, er7 er7Var, long j, boolean z, u41 u41Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = er7Var;
        this.e = j;
        this.f = z;
        this.h = u41Var;
        this.n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pua.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
