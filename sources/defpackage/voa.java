package defpackage;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class voa implements TextWatcher {
    public boolean a;
    public final int b;
    public final EditTextBoldCursor c;
    public final gt7 d;
    public final int[] e;
    public final TextView f;

    public voa(int i, EditTextBoldCursor editTextBoldCursor, gt7 gt7Var, int[] iArr, TextView textView) {
        this.b = i;
        this.c = editTextBoldCursor;
        this.d = gt7Var;
        this.e = iArr;
        this.f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voa.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
