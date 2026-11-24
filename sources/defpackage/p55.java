package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class p55 implements TextWatcher {
    public final h75 a;

    public p55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i;
        h75 h75Var = this.a;
        hn hnVar = h75Var.F1;
        h75Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i2 = h75Var.W1;
        if (codePointCount + 25 > i2) {
            str = String.valueOf(i2 - codePointCount);
        } else {
            str = null;
        }
        hnVar.a();
        hnVar.setText(str);
        if (codePointCount >= i2) {
            i = -1280137;
        } else {
            i = -1;
        }
        hnVar.setTextColor(i);
        if (codePointCount > i2) {
            pw0.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
