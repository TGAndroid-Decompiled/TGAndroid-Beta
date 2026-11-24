package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zva implements View.OnClickListener {
    public final byte a = 1;
    public final boolean[] b;
    public final jac c;
    public final b61 d;
    public final EditTextBoldCursor e;
    public final my0[] f;

    public zva(boolean[] zArr, jac jacVar, b61 b61Var, EditTextBoldCursor editTextBoldCursor, my0[] my0VarArr) {
        this.b = zArr;
        this.c = jacVar;
        this.d = b61Var;
        this.e = editTextBoldCursor;
        this.f = my0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        long j = 0;
        my0[] my0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        b61 b61Var = this.d;
        jac jacVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    b61Var.setLoading(true);
                    if (!TextUtils.isEmpty(obj)) {
                        j = Long.parseLong(obj);
                    }
                    jacVar.a(Long.valueOf(j), new bwa(editTextBoldCursor, my0VarArr, (byte) 2));
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    b61Var.setLoading(true);
                    jacVar.a(0L, new hw9(zArr, editTextBoldCursor, my0VarArr, (byte) 25));
                    return;
                }
                return;
        }
    }

    public zva(boolean[] zArr, jac jacVar, EditTextBoldCursor editTextBoldCursor, b61 b61Var, my0[] my0VarArr) {
        this.b = zArr;
        this.c = jacVar;
        this.e = editTextBoldCursor;
        this.d = b61Var;
        this.f = my0VarArr;
    }
}
