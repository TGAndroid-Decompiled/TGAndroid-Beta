package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import bi.s1;
public final class p0 implements TextWatcher {
    public final s1 f3322a;
    public final EditText f3323b;
    public String f3324c;
    public boolean d;
    public boolean f3325e;

    public p0(ah.i iVar, s1 s1Var) {
        this.f3322a = s1Var;
        this.f3323b = iVar;
    }

    public final void a() {
        this.f3325e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f3324c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f3324c = obj;
        this.f3322a.l(this.f3323b);
        if (!isEmpty && isEmpty2 && !this.f3325e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            s1 s1Var = this.f3322a;
            if (!s1Var.c()) {
                return;
            }
            if (z10) {
                s1Var.i();
            } else {
                s1Var.h();
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
