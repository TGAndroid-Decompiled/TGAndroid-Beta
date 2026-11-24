package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class n75 implements TextWatcher {
    public final g95 a;

    public n75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i;
        g95 g95Var = this.a;
        io ioVar = g95Var.F1;
        g95Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i2 = g95Var.W1;
        if (codePointCount + 25 > i2) {
            str = String.valueOf(i2 - codePointCount);
        } else {
            str = null;
        }
        ioVar.a();
        ioVar.setText(str);
        if (codePointCount >= i2) {
            i = -1280137;
        } else {
            i = -1;
        }
        ioVar.setTextColor(i);
        if (codePointCount > i2) {
            xx0.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
