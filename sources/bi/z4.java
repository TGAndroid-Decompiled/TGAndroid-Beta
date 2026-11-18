package bi;

import android.text.Editable;
import android.text.TextWatcher;
public final class z4 implements TextWatcher {
    public final a5 f4309a;

    public z4(a5 a5Var) {
        this.f4309a = a5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        boolean z10;
        cg.a i7;
        long j3;
        if (editable == null) {
            obj = "";
        } else {
            obj = editable.toString();
        }
        int indexOf = obj.indexOf(46);
        if (indexOf >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
            return;
        }
        if (!obj.isEmpty() && !".".equals(obj)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i7 = null;
        } else {
            i7 = cg.a.i(obj, cg.b.f5277b);
        }
        if (!z10 && i7 == null) {
            editable.delete(obj.length() - 1, obj.length());
            return;
        }
        if (z10) {
            j3 = 0;
        } else {
            j3 = i7.f5275b;
        }
        this.f4309a.K0(j3);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
