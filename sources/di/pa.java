package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
public final class pa implements TextWatcher {
    public boolean f9242a;
    public int f9243b = 2;
    public final EditTextBoldCursor f9244c;
    public final mb0 d;
    public final long f9245e;
    public final boolean f9246f;
    public final hi.d h;
    public final TextView f9247n;

    public pa(EditTextBoldCursor editTextBoldCursor, mb0 mb0Var, long j3, boolean z10, hi.d dVar, TextView textView) {
        this.f9244c = editTextBoldCursor;
        this.d = mb0Var;
        this.f9245e = j3;
        this.f9246f = z10;
        this.h = dVar;
        this.f9247n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.pa.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
