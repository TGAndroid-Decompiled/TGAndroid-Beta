package ai;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
public final class hc implements TextWatcher {
    public boolean f1432a;
    public int f1433b = 2;
    public final EditTextBoldCursor f1434c;
    public final sd0 d;
    public final long e;
    public final boolean f1435f;
    public final ei.d h;
    public final TextView f1436n;

    public hc(EditTextBoldCursor editTextBoldCursor, sd0 sd0Var, long j10, boolean z10, ei.d dVar, TextView textView) {
        this.f1434c = editTextBoldCursor;
        this.d = sd0Var;
        this.e = j10;
        this.f1435f = z10;
        this.h = dVar;
        this.f1436n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.hc.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
