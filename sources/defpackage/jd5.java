package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class jd5 implements TextWatcher {
    public final kd5 a;

    public jd5(kd5 kd5Var) {
        this.a = kd5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        kd5 kd5Var = this.a;
        nd5 nd5Var = kd5Var.h;
        if (kd5Var.c != 0) {
            nd5Var.getConnectionsManager().cancelRequest(kd5Var.c, true);
            kd5Var.c = 0;
        }
        se4 se4Var = kd5Var.d;
        if (se4Var != null) {
            hl.r(se4Var);
        }
        kd5Var.e = null;
        if (trim.isEmpty()) {
            nd5Var.h0(null);
            return;
        }
        se4 se4Var2 = new se4(this, trim, (byte) 27);
        kd5Var.d = se4Var2;
        hl.d3(se4Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
