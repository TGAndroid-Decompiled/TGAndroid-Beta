package ii;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final int f15613a;
    public final d0 f15614b;

    public w(d0 d0Var, int i7) {
        this.f15613a = i7;
        this.f15614b = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f15613a) {
            case 0:
                String obj = editable.toString();
                d0 d0Var = this.f15614b;
                boolean isEmpty = TextUtils.isEmpty(d0Var.I1);
                d0Var.I1 = obj;
                d0Var.f15515w1.h(0L, d0Var.l1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                d0 d0Var2 = this.f15614b;
                d0Var2.J1 = obj2;
                d0Var2.f15516x1.f37190f3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f15613a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f15613a;
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
