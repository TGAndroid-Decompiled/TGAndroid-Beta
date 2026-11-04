package ji;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f16372a;
    public final b0 f16373b;

    public u(b0 b0Var, int i3) {
        this.f16372a = i3;
        this.f16373b = b0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f16372a) {
            case 0:
                String obj = editable.toString();
                b0 b0Var = this.f16373b;
                boolean isEmpty = TextUtils.isEmpty(b0Var.J1);
                b0Var.J1 = obj;
                b0Var.f16276x1.h(0L, b0Var.m1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                b0 b0Var2 = this.f16373b;
                b0Var2.K1 = obj2;
                b0Var2.f16277y1.f35594g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f16372a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f16372a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
