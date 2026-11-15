package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import kg.x1;
public final class o0 implements TextWatcher {
    public final x1 f3315a;
    public final EditText f3316b;
    public String f3317c;
    public boolean d;
    public boolean f3318e;

    public o0(ah.i iVar, x1 x1Var) {
        this.f3315a = x1Var;
        this.f3316b = iVar;
    }

    public final void a() {
        this.f3318e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f3317c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f3317c = obj;
        this.f3315a.l(this.f3316b);
        if (!isEmpty && isEmpty2 && !this.f3318e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            x1 x1Var = this.f3315a;
            if (!x1Var.c()) {
                return;
            }
            if (z10) {
                x1Var.i();
            } else {
                x1Var.h();
            }
            this.d = z10;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
