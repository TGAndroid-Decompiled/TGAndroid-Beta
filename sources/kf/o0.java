package kf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.h5;
public final class o0 implements TextWatcher {
    public final h5 f10485a;
    public final EditText f10486b;
    public String f10487c;
    public boolean d;
    public boolean e;

    public o0(kg.f fVar, h5 h5Var) {
        this.f10485a = h5Var;
        this.f10486b = fVar;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f10487c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f10487c = obj;
        this.f10485a.q(this.f10486b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z4) {
        if (this.d != z4) {
            h5 h5Var = this.f10485a;
            if (!h5Var.c()) {
                return;
            }
            if (z4) {
                h5Var.n();
            } else {
                h5Var.m();
            }
            this.d = z4;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
