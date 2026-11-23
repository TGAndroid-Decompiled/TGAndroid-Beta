package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements View.OnClickListener {
    public final int f9815a = 1;
    public final boolean[] f9816b;
    public final p10 f9817c;
    public final hi.e d;
    public final EditTextBoldCursor f9818e;
    public final org.telegram.ui.ActionBar.w2[] f9819f;

    public t9(boolean[] zArr, p10 p10Var, hi.e eVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9816b = zArr;
        this.f9817c = p10Var;
        this.d = eVar;
        this.f9818e = editTextBoldCursor;
        this.f9819f = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9815a) {
            case 0:
                boolean[] zArr = this.f9816b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9818e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9817c.a(Long.valueOf(parseLong), new w9(editTextBoldCursor, this.f9819f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9816b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9817c.a(0L, new a8(zArr2, this.f9818e, this.f9819f, 1));
                    return;
                }
                return;
        }
    }

    public t9(boolean[] zArr, p10 p10Var, EditTextBoldCursor editTextBoldCursor, hi.e eVar, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9816b = zArr;
        this.f9817c = p10Var;
        this.f9818e = editTextBoldCursor;
        this.d = eVar;
        this.f9819f = w2VarArr;
    }
}
