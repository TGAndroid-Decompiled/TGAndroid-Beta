package ff;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.e5;
public final class o0 implements TextWatcher {
    public final e5 f6243a;
    public final EditText f6244b;
    public String f6245c;
    public boolean d;
    public boolean f6246e;

    public o0(fg.g gVar, e5 e5Var) {
        this.f6243a = e5Var;
        this.f6244b = gVar;
    }

    public final void a() {
        this.f6246e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f6245c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f6245c = obj;
        this.f6243a.q(this.f6244b);
        if (!isEmpty && isEmpty2 && !this.f6246e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            e5 e5Var = this.f6243a;
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
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
