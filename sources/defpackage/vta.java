package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vta implements View.OnClickListener {
    public final byte a = 0;
    public final boolean[] b;
    public final i8c c;
    public final u41 d;
    public final EditTextBoldCursor e;
    public final fx0[] f;

    public vta(boolean[] zArr, i8c i8cVar, u41 u41Var, EditTextBoldCursor editTextBoldCursor, fx0[] fx0VarArr) {
        this.b = zArr;
        this.c = i8cVar;
        this.d = u41Var;
        this.e = editTextBoldCursor;
        this.f = fx0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        long j = 0;
        fx0[] fx0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        u41 u41Var = this.d;
        i8c i8cVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    u41Var.setLoading(true);
                    if (!TextUtils.isEmpty(obj)) {
                        j = Long.parseLong(obj);
                    }
                    i8cVar.a(Long.valueOf(j), new xta(editTextBoldCursor, fx0VarArr, (byte) 2));
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    u41Var.setLoading(true);
                    i8cVar.a(0L, new q3a(zArr, editTextBoldCursor, fx0VarArr, (byte) 22));
                    return;
                }
                return;
        }
    }

    public vta(boolean[] zArr, i8c i8cVar, EditTextBoldCursor editTextBoldCursor, u41 u41Var, fx0[] fx0VarArr) {
        this.b = zArr;
        this.c = i8cVar;
        this.e = editTextBoldCursor;
        this.d = u41Var;
        this.f = fx0VarArr;
    }
}
