package ci;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
public final class za implements TextWatcher {
    public boolean f6486a;
    public int f6487b = 2;
    public final EditTextBoldCursor f6488c;
    public final gb0 d;
    public final long f6489e;
    public final boolean f6490f;
    public final gi.d h;
    public final TextView f6491n;

    public za(EditTextBoldCursor editTextBoldCursor, gb0 gb0Var, long j10, boolean z10, gi.d dVar, TextView textView) {
        this.f6488c = editTextBoldCursor;
        this.d = gb0Var;
        this.f6489e = j10;
        this.f6490f = z10;
        this.h = dVar;
        this.f6491n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.za.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
