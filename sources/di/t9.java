package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements View.OnClickListener {
    public final int f9854a = 1;
    public final boolean[] f9855b;
    public final r10 f9856c;
    public final hi.e d;
    public final EditTextBoldCursor f9857e;
    public final org.telegram.ui.ActionBar.w2[] f9858f;

    public t9(boolean[] zArr, r10 r10Var, hi.e eVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9855b = zArr;
        this.f9856c = r10Var;
        this.d = eVar;
        this.f9857e = editTextBoldCursor;
        this.f9858f = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9854a) {
            case 0:
                boolean[] zArr = this.f9855b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9857e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9856c.a(Long.valueOf(parseLong), new w9(editTextBoldCursor, this.f9858f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9855b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9856c.a(0L, new a8(zArr2, this.f9857e, this.f9858f, 1));
                    return;
                }
                return;
        }
    }

    public t9(boolean[] zArr, r10 r10Var, EditTextBoldCursor editTextBoldCursor, hi.e eVar, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9855b = zArr;
        this.f9856c = r10Var;
        this.f9857e = editTextBoldCursor;
        this.d = eVar;
        this.f9858f = w2VarArr;
    }
}
