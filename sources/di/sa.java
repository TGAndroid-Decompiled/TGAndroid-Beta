package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
public final class sa implements TextWatcher {
    public boolean f9724a;
    public int f9725b = 2;
    public final EditTextBoldCursor f9726c;
    public final yb0 d;
    public final long f9727e;
    public final boolean f9728f;
    public final hi.d h;
    public final TextView f9729n;

    public sa(EditTextBoldCursor editTextBoldCursor, yb0 yb0Var, long j3, boolean z10, hi.d dVar, TextView textView) {
        this.f9726c = editTextBoldCursor;
        this.d = yb0Var;
        this.f9727e = j3;
        this.f9728f = z10;
        this.h = dVar;
        this.f9729n = textView;
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
