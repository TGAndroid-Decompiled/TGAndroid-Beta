package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class hp2 implements TextWatcher {
    public final byte a;
    public final pp2 b;

    public hp2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        pp2 pp2Var = this.b;
        switch (b) {
            case 0:
                String obj = editable.toString();
                boolean isEmpty = TextUtils.isEmpty(pp2Var.L1);
                pp2Var.L1 = obj;
                pp2Var.z1.h(0L, pp2Var.o1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                pp2Var.M1 = editable.toString();
                pp2Var.A1.g3.O(true);
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
