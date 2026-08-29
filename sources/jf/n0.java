package jf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.e5;
public final class n0 implements TextWatcher {
    public final e5 f11657a;
    public final EditText f11658b;
    public String f11659c;
    public boolean d;
    public boolean f11660e;

    public n0(ig.f fVar, e5 e5Var) {
        this.f11657a = e5Var;
        this.f11658b = fVar;
    }

    public final void a() {
        this.f11660e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f11659c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f11659c = obj;
        this.f11657a.q(this.f11658b);
        if (!isEmpty && isEmpty2 && !this.f11660e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f11657a;
            if (!e5Var.c()) {
                return;
            }
            if (z10) {
                e5Var.n();
            } else {
                e5Var.m();
            }
            this.d = z10;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
