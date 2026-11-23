package li;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final int f20038a;
    public final d0 f20039b;

    public w(d0 d0Var, int i7) {
        this.f20038a = i7;
        this.f20039b = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f20038a) {
            case 0:
                String obj = editable.toString();
                d0 d0Var = this.f20039b;
                boolean isEmpty = TextUtils.isEmpty(d0Var.M1);
                d0Var.M1 = obj;
                d0Var.A1.h(0L, d0Var.f19934p1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                d0 d0Var2 = this.f20039b;
                d0Var2.N1 = obj2;
                d0Var2.B1.f35789g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f20038a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f20038a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
