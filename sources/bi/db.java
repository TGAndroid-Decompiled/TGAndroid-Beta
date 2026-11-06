package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class db implements View.OnClickListener {
    public final int f3695a = 1;
    public final boolean[] f3696b;
    public final v10 f3697c;
    public final fi.d d;
    public final EditTextBoldCursor f3698e;
    public final org.telegram.ui.ActionBar.v2[] f3699f;

    public db(boolean[] zArr, v10 v10Var, fi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f3696b = zArr;
        this.f3697c = v10Var;
        this.d = dVar;
        this.f3698e = editTextBoldCursor;
        this.f3699f = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f3695a) {
            case 0:
                boolean[] zArr = this.f3696b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f3698e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f3697c.a(Long.valueOf(parseLong), new gb(editTextBoldCursor, this.f3699f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f3696b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f3697c.a(0L, new aa.s(zArr2, this.f3698e, this.f3699f, 20));
                    return;
                }
                return;
        }
    }

    public db(boolean[] zArr, v10 v10Var, EditTextBoldCursor editTextBoldCursor, fi.d dVar, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f3696b = zArr;
        this.f3697c = v10Var;
        this.f3698e = editTextBoldCursor;
        this.d = dVar;
        this.f3699f = v2VarArr;
    }
}
