package lh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
public final class i9 implements TextWatcher {
    public boolean f12622a;
    public int f12623b = 2;
    public final EditTextBoldCursor f12624c;
    public final ad0 d;
    public final long e;
    public final boolean f12625f;
    public final ph.d h;
    public final TextView f12626n;

    public i9(EditTextBoldCursor editTextBoldCursor, ad0 ad0Var, long j10, boolean z4, ph.d dVar, TextView textView) {
        this.f12624c = editTextBoldCursor;
        this.d = ad0Var;
        this.e = j10;
        this.f12625f = z4;
        this.h = dVar;
        this.f12626n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: lh.i9.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
