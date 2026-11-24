package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wn2 implements TextWatcher {
    public final byte a;
    public final eo2 b;

    public wn2(eo2 eo2Var, byte b) {
        this.a = b;
        this.b = eo2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        eo2 eo2Var = this.b;
        switch (b) {
            case 0:
                String obj = editable.toString();
                boolean isEmpty = TextUtils.isEmpty(eo2Var.L1);
                eo2Var.L1 = obj;
                eo2Var.z1.h(0L, eo2Var.o1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                eo2Var.M1 = editable.toString();
                eo2Var.A1.g3.O(true);
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
