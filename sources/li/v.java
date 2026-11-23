package li;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f20101a;
    public final c0 f20102b;

    public v(c0 c0Var, int i7) {
        this.f20101a = i7;
        this.f20102b = c0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f20101a) {
            case 0:
                String obj = editable.toString();
                c0 c0Var = this.f20102b;
                boolean isEmpty = TextUtils.isEmpty(c0Var.M1);
                c0Var.M1 = obj;
                c0Var.A1.h(0L, c0Var.f19997p1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                c0 c0Var2 = this.f20102b;
                c0Var2.N1 = obj2;
                c0Var2.B1.f35323g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f20101a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f20101a;
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
