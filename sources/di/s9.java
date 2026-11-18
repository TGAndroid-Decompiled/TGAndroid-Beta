package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s9 implements View.OnClickListener {
    public final int f9737a = 1;
    public final boolean[] f9738b;
    public final q10 f9739c;
    public final hi.d d;
    public final EditTextBoldCursor f9740e;
    public final org.telegram.ui.ActionBar.x2[] f9741f;

    public s9(boolean[] zArr, q10 q10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9738b = zArr;
        this.f9739c = q10Var;
        this.d = dVar;
        this.f9740e = editTextBoldCursor;
        this.f9741f = x2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9737a) {
            case 0:
                boolean[] zArr = this.f9738b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9740e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9739c.a(Long.valueOf(parseLong), new v9(editTextBoldCursor, this.f9741f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9738b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9739c.a(0L, new ga(zArr2, this.f9740e, this.f9741f, 0));
                    return;
                }
                return;
        }
    }

    public s9(boolean[] zArr, q10 q10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9738b = zArr;
        this.f9739c = q10Var;
        this.f9740e = editTextBoldCursor;
        this.d = dVar;
        this.f9741f = x2VarArr;
    }
}
