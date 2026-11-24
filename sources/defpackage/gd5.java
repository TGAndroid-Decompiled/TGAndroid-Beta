package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class gd5 implements TextWatcher {
    public final hd5 a;

    public gd5(hd5 hd5Var) {
        this.a = hd5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        hd5 hd5Var = this.a;
        kd5 kd5Var = hd5Var.h;
        if (hd5Var.c != 0) {
            kd5Var.getConnectionsManager().cancelRequest(hd5Var.c, true);
            hd5Var.c = 0;
        }
        fd5 fd5Var = hd5Var.d;
        if (fd5Var != null) {
            gm.r(fd5Var);
        }
        hd5Var.e = null;
        if (trim.isEmpty()) {
            kd5Var.i0(null);
            return;
        }
        fd5 fd5Var2 = new fd5(this, trim, (byte) 0);
        hd5Var.d = fd5Var2;
        gm.d3(fd5Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
