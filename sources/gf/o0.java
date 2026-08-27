package gf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.e5;

public final class o0 implements TextWatcher {

    public final e5 f7043a;

    public final EditText f7044b;

    public String f7045c;
    public boolean d;

    public boolean f7046e;

    public o0(gg.g gVar, e5 e5Var) {
        this.f7043a = e5Var;
        this.f7044b = gVar;
    }

    public final void a() {
        this.f7046e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        boolean zIsEmpty = TextUtils.isEmpty(this.f7045c);
        boolean zIsEmpty2 = TextUtils.isEmpty(string);
        if (zIsEmpty && !zIsEmpty2) {
            b(true);
        }
        this.f7045c = string;
        this.f7043a.q(this.f7044b);
        if (zIsEmpty || !zIsEmpty2 || this.f7046e) {
            return;
        }
        b(false);
    }

    public final void b(boolean z10) {
        if (this.d == z10) {
            return;
        }
        e5 e5Var = this.f7043a;
        if (e5Var.c()) {
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
