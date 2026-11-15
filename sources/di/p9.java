package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p9 implements View.OnClickListener {
    public final int f9242a = 1;
    public final boolean[] f9243b;
    public final s10 f9244c;
    public final hi.d d;
    public final EditTextBoldCursor f9245e;
    public final org.telegram.ui.ActionBar.u2[] f9246f;

    public p9(boolean[] zArr, s10 s10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f9243b = zArr;
        this.f9244c = s10Var;
        this.d = dVar;
        this.f9245e = editTextBoldCursor;
        this.f9246f = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9242a) {
            case 0:
                boolean[] zArr = this.f9243b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9245e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9244c.a(Long.valueOf(parseLong), new s9(editTextBoldCursor, this.f9246f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9243b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9244c.a(0L, new aa.r(zArr2, this.f9245e, this.f9246f, 26));
                    return;
                }
                return;
        }
    }

    public p9(boolean[] zArr, s10 s10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f9243b = zArr;
        this.f9244c = s10Var;
        this.f9245e = editTextBoldCursor;
        this.d = dVar;
        this.f9246f = u2VarArr;
    }
}
