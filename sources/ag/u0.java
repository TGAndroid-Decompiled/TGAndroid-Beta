package ag;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import fi.c2;
import org.telegram.ui.px;
public final class u0 implements TextWatcher {
    public final px f1381a;
    public final EditText f1382b;
    public String f1383c;
    public boolean d;
    public boolean e;

    public u0(c2 c2Var, px pxVar) {
        this.f1381a = pxVar;
        this.f1382b = c2Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.f1383c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.f1383c = obj;
        this.f1381a.l(this.f1382b);
        if (!isEmpty && isEmpty2 && !this.e) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        if (this.d != z10) {
            px pxVar = this.f1381a;
            if (!pxVar.c()) {
                return;
            }
            if (z10) {
                pxVar.i();
            } else {
                pxVar.h();
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
