package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
public final class hc implements TextWatcher {
    public final jc a;

    public hc(jc jcVar) {
        this.a = jcVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        jc jcVar = this.a;
        TextView textView = jcVar.h2;
        if (editable != null && editable.length() != 0) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        jcVar.c1(false);
        jcVar.d1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
