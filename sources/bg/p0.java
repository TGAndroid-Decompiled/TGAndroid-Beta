package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import kg.v1;
public final class p0 implements TextWatcher {
    public final v1 f3360a;
    public final EditText f3361b;
    public String f3362c;
    public boolean d;
    public boolean f3363e;

    public p0(ah.i iVar, v1 v1Var) {
        this.f3360a = v1Var;
        this.f3361b = iVar;
    }

    public final void a() {
        this.f3363e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f3362c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f3362c = obj;
        this.f3360a.l(this.f3361b);
        if (!isEmpty && isEmpty2 && !this.f3363e) {
            b(false);
        }
    }

    public final void b(boolean z9) {
        if (this.d != z9) {
            v1 v1Var = this.f3360a;
            if (!v1Var.c()) {
                return;
            }
            if (z9) {
                v1Var.i();
            } else {
                v1Var.h();
            }
            this.d = z9;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
