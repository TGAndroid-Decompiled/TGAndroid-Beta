package mh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
public final class i9 implements TextWatcher {
    public boolean f14272a;
    public int f14273b = 2;
    public final EditTextBoldCursor f14274c;
    public final cd0 d;
    public final long f14275e;
    public final boolean f14276f;
    public final qh.d h;
    public final TextView f14277n;

    public i9(EditTextBoldCursor editTextBoldCursor, cd0 cd0Var, long j10, boolean z4, qh.d dVar, TextView textView) {
        this.f14274c = editTextBoldCursor;
        this.d = cd0Var;
        this.f14275e = j10;
        this.f14276f = z4;
        this.h = dVar;
        this.f14277n = textView;
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
