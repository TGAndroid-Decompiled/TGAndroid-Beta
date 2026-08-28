package gh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;
public final class m9 implements TextWatcher {
    public boolean f8579a;
    public int f8580b = 2;
    public final EditTextBoldCursor f8581c;
    public final fc0 d;
    public final long f8582e;
    public final boolean f8583f;
    public final kh.d h;
    public final TextView f8584n;

    public m9(EditTextBoldCursor editTextBoldCursor, fc0 fc0Var, long j10, boolean z10, kh.d dVar, TextView textView) {
        this.f8581c = editTextBoldCursor;
        this.d = fc0Var;
        this.f8582e = j10;
        this.f8583f = z10;
        this.h = dVar;
        this.f8584n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: gh.m9.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
