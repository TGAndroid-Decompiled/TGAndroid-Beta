package ci;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa implements View.OnClickListener {
    public final int f4838a = 1;
    public final boolean[] f4839b;
    public final n10 f4840c;
    public final gi.d d;
    public final EditTextBoldCursor f4841e;
    public final org.telegram.ui.ActionBar.t2[] f4842f;

    public aa(boolean[] zArr, n10 n10Var, gi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.f4839b = zArr;
        this.f4840c = n10Var;
        this.d = dVar;
        this.f4841e = editTextBoldCursor;
        this.f4842f = t2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f4838a) {
            case 0:
                boolean[] zArr = this.f4839b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f4841e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f4840c.a(Long.valueOf(parseLong), new da(editTextBoldCursor, this.f4842f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f4839b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f4840c.a(0L, new ai.k3(zArr2, this.f4841e, this.f4842f, 23));
                    return;
                }
                return;
        }
    }

    public aa(boolean[] zArr, n10 n10Var, EditTextBoldCursor editTextBoldCursor, gi.d dVar, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.f4839b = zArr;
        this.f4840c = n10Var;
        this.f4841e = editTextBoldCursor;
        this.d = dVar;
        this.f4842f = t2VarArr;
    }
}
