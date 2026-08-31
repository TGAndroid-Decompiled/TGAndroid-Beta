package lf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.i5;
public final class n0 implements TextWatcher {
    public final i5 f12493a;
    public final EditText f12494b;
    public String f12495c;
    public boolean d;
    public boolean f12496e;

    public n0(lg.f fVar, i5 i5Var) {
        this.f12493a = i5Var;
        this.f12494b = fVar;
    }

    public final void a() {
        this.f12496e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f12495c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f12495c = obj;
        this.f12493a.q(this.f12494b);
        if (!isEmpty && isEmpty2 && !this.f12496e) {
            b(false);
        }
    }

    public final void b(boolean z4) {
        if (this.d != z4) {
            i5 i5Var = this.f12493a;
            if (!i5Var.c()) {
                return;
            }
            if (z4) {
                i5Var.n();
            } else {
                i5Var.m();
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
