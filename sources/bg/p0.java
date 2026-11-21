package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import bi.w1;
public final class p0 implements TextWatcher {
    public final w1 f3335a;
    public final EditText f3336b;
    public String f3337c;
    public boolean d;
    public boolean f3338e;

    public p0(ah.i iVar, w1 w1Var) {
        this.f3335a = w1Var;
        this.f3336b = iVar;
    }

    public final void a() {
        this.f3338e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f3337c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f3337c = obj;
        this.f3335a.l(this.f3336b);
        if (!isEmpty && isEmpty2 && !this.f3338e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            w1 w1Var = this.f3335a;
            if (!w1Var.c()) {
                return;
            }
            if (z10) {
                w1Var.i();
            } else {
                w1Var.h();
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
