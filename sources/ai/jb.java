package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jb implements View.OnClickListener {
    public final int f1574a = 1;
    public final boolean[] f1575b;
    public final Utilities.Callback2 f1576c;
    public final ei.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.f3[] f1577f;

    public jb(boolean[] zArr, Utilities.Callback2 callback2, ei.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1575b = zArr;
        this.f1576c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f1577f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f1574a) {
            case 0:
                boolean[] zArr = this.f1575b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f1576c.run(Long.valueOf(parseLong), new kb(editTextBoldCursor, this.f1577f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1575b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f1576c.run(0L, new a3.l0(zArr2, this.e, this.f1577f, 15));
                    return;
                }
                return;
        }
    }

    public jb(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ei.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1575b = zArr;
        this.f1576c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f1577f = f3VarArr;
    }
}
