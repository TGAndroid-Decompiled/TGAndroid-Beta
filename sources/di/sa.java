package di;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
public final class sa implements TextWatcher {
    public boolean f9758a;
    public int f9759b = 2;
    public final EditTextBoldCursor f9760c;
    public final yb0 d;
    public final long f9761e;
    public final boolean f9762f;
    public final hi.e h;
    public final TextView f9763n;

    public sa(EditTextBoldCursor editTextBoldCursor, yb0 yb0Var, long j3, boolean z10, hi.e eVar, TextView textView) {
        this.f9760c = editTextBoldCursor;
        this.d = yb0Var;
        this.f9761e = j3;
        this.f9762f = z10;
        this.h = eVar;
        this.f9763n = textView;
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
