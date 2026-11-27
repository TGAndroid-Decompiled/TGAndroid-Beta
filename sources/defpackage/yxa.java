package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yxa implements View.OnClickListener {
    public final byte a = 1;
    public final boolean[] b;
    public final icc c;
    public final c51 d;
    public final EditTextBoldCursor e;
    public final nx0[] f;

    public yxa(boolean[] zArr, icc iccVar, c51 c51Var, EditTextBoldCursor editTextBoldCursor, nx0[] nx0VarArr) {
        this.b = zArr;
        this.c = iccVar;
        this.d = c51Var;
        this.e = editTextBoldCursor;
        this.f = nx0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        long j = 0;
        nx0[] nx0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        c51 c51Var = this.d;
        icc iccVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    c51Var.setLoading(true);
                    if (!TextUtils.isEmpty(obj)) {
                        j = Long.parseLong(obj);
                    }
                    iccVar.a(Long.valueOf(j), new aya(editTextBoldCursor, nx0VarArr, (byte) 2));
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    c51Var.setLoading(true);
                    iccVar.a(0L, new pwa(zArr, editTextBoldCursor, nx0VarArr, (byte) 1));
                    return;
                }
                return;
        }
    }

    public yxa(boolean[] zArr, icc iccVar, EditTextBoldCursor editTextBoldCursor, c51 c51Var, nx0[] nx0VarArr) {
        this.b = zArr;
        this.c = iccVar;
        this.e = editTextBoldCursor;
        this.d = c51Var;
        this.f = nx0VarArr;
    }
}
