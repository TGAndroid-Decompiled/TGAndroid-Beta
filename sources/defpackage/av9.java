package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class av9 implements TextWatcher {
    public final q20 a;
    public final l7 b;
    public String c;
    public boolean d;
    public boolean e;

    public av9(l7 l7Var, q20 q20Var) {
        this.a = q20Var;
        this.b = l7Var;
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
            q20 q20Var = this.a;
            if (!q20Var.c()) {
                return;
            }
            if (z) {
                q20Var.i();
            } else {
                q20Var.h();
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
