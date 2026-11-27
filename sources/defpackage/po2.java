package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class po2 implements TextWatcher {
    public final byte a;
    public final xo2 b;

    public po2(xo2 xo2Var, byte b) {
        this.a = b;
        this.b = xo2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        xo2 xo2Var = this.b;
        switch (b) {
            case 0:
                String obj = editable.toString();
                boolean isEmpty = TextUtils.isEmpty(xo2Var.L1);
                xo2Var.L1 = obj;
                xo2Var.z1.h(0L, xo2Var.o1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                xo2Var.M1 = editable.toString();
                xo2Var.A1.g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
