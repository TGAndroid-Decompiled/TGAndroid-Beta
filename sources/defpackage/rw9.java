package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class rw9 implements TextWatcher {
    public final r10 a;
    public final m7 b;
    public String c;
    public boolean d;
    public boolean e;

    public rw9(m7 m7Var, r10 r10Var) {
        this.a = r10Var;
        this.b = m7Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.c = obj;
        this.a.l(this.b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z) {
        if (this.d != z) {
            r10 r10Var = this.a;
            if (!r10Var.c()) {
                return;
            }
            if (z) {
                r10Var.i();
            } else {
                r10Var.h();
            }
            this.d = z;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
