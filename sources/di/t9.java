package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements View.OnClickListener {
    public final int f9851a = 1;
    public final boolean[] f9852b;
    public final q10 f9853c;
    public final hi.e d;
    public final EditTextBoldCursor f9854e;
    public final org.telegram.ui.ActionBar.w2[] f9855f;

    public t9(boolean[] zArr, q10 q10Var, hi.e eVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9852b = zArr;
        this.f9853c = q10Var;
        this.d = eVar;
        this.f9854e = editTextBoldCursor;
        this.f9855f = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9851a) {
            case 0:
                boolean[] zArr = this.f9852b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9854e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9853c.a(Long.valueOf(parseLong), new w9(editTextBoldCursor, this.f9855f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9852b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9853c.a(0L, new a8(zArr2, this.f9854e, this.f9855f, 1));
                    return;
                }
                return;
        }
    }

    public t9(boolean[] zArr, q10 q10Var, EditTextBoldCursor editTextBoldCursor, hi.e eVar, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9852b = zArr;
        this.f9853c = q10Var;
        this.f9854e = editTextBoldCursor;
        this.d = eVar;
        this.f9855f = w2VarArr;
    }
}
