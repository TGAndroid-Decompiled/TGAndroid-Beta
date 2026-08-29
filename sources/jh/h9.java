package jh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;
public final class h9 implements TextWatcher {
    public boolean f12214a;
    public int f12215b = 2;
    public final EditTextBoldCursor f12216c;
    public final uc0 d;
    public final long f12217e;
    public final boolean f12218f;
    public final nh.d h;
    public final TextView f12219n;

    public h9(EditTextBoldCursor editTextBoldCursor, uc0 uc0Var, long j10, boolean z10, nh.d dVar, TextView textView) {
        this.f12216c = editTextBoldCursor;
        this.d = uc0Var;
        this.f12217e = j10;
        this.f12218f = z10;
        this.h = dVar;
        this.f12219n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h9.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
