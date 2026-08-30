package lf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.h5;
public final class n0 implements TextWatcher {
    public final h5 f12043a;
    public final EditText f12044b;
    public String f12045c;
    public boolean d;
    public boolean e;

    public n0(kg.f fVar, h5 h5Var) {
        this.f12043a = h5Var;
        this.f12044b = fVar;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f12045c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f12045c = obj;
        this.f12043a.q(this.f12044b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z4) {
        if (this.d != z4) {
            h5 h5Var = this.f12043a;
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
