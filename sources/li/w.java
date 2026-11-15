package li;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final int f19643a;
    public final d0 f19644b;

    public w(d0 d0Var, int i7) {
        this.f19643a = i7;
        this.f19644b = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f19643a) {
            case 0:
                String obj = editable.toString();
                d0 d0Var = this.f19644b;
                boolean isEmpty = TextUtils.isEmpty(d0Var.M1);
                d0Var.M1 = obj;
                d0Var.A1.h(0L, d0Var.f19542p1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                d0 d0Var2 = this.f19644b;
                d0Var2.N1 = obj2;
                d0Var2.B1.f39892g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f19643a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f19643a;
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
