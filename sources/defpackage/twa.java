package defpackage;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class twa implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final EditTextBoldCursor c;
    public final gt7 d;
    public final long e;
    public final boolean f;
    public final b61 h;
    public final TextView n;

    public twa(EditTextBoldCursor editTextBoldCursor, gt7 gt7Var, long j, boolean z, b61 b61Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = gt7Var;
        this.e = j;
        this.f = z;
        this.h = b61Var;
        this.n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twa.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
