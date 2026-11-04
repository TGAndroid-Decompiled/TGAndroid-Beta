package cg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import lg.w1;
public final class o0 implements TextWatcher {
    public final w1 f4725a;
    public final EditText f4726b;
    public String f4727c;
    public boolean d;
    public boolean f4728e;

    public o0(bh.g gVar, w1 w1Var) {
        this.f4725a = w1Var;
        this.f4726b = gVar;
    }

    public final void a() {
        this.f4728e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f4727c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f4727c = obj;
        this.f4725a.l(this.f4726b);
        if (!isEmpty && isEmpty2 && !this.f4728e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            w1 w1Var = this.f4725a;
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
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
