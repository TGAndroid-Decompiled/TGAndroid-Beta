package mh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
public final class i9 implements TextWatcher {
    public boolean f14270a;
    public int f14271b = 2;
    public final EditTextBoldCursor f14272c;
    public final cd0 d;
    public final long f14273e;
    public final boolean f14274f;
    public final qh.d h;
    public final TextView f14275n;

    public i9(EditTextBoldCursor editTextBoldCursor, cd0 cd0Var, long j10, boolean z4, qh.d dVar, TextView textView) {
        this.f14272c = editTextBoldCursor;
        this.d = cd0Var;
        this.f14273e = j10;
        this.f14274f = z4;
        this.h = dVar;
        this.f14275n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: mh.i9.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
