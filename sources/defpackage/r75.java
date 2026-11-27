package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class r75 implements TextWatcher {
    public final j95 a;

    public r75(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i;
        j95 j95Var = this.a;
        in inVar = j95Var.F1;
        j95Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i2 = j95Var.W1;
        if (codePointCount + 25 > i2) {
            str = String.valueOf(i2 - codePointCount);
        } else {
            str = null;
        }
        inVar.a();
        inVar.setText(str);
        if (codePointCount >= i2) {
            i = -1280137;
        } else {
            i = -1;
        }
        inVar.setTextColor(i);
        if (codePointCount > i2) {
            yw0.APP_ERROR.a();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
