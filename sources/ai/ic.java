package ai;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.td0;
public final class ic implements TextWatcher {
    public boolean f1498a;
    public int f1499b = 2;
    public final EditTextBoldCursor f1500c;
    public final td0 d;
    public final long e;
    public final boolean f1501f;
    public final ei.d h;
    public final TextView f1502n;

    public ic(EditTextBoldCursor editTextBoldCursor, td0 td0Var, long j10, boolean z10, ei.d dVar, TextView textView) {
        this.f1500c = editTextBoldCursor;
        this.d = td0Var;
        this.e = j10;
        this.f1501f = z10;
        this.h = dVar;
        this.f1502n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ic.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
