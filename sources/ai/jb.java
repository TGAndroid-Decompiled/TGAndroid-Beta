package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jb implements View.OnClickListener {
    public final int f1582a = 1;
    public final boolean[] f1583b;
    public final Utilities.Callback2 f1584c;
    public final ei.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.f3[] f1585f;

    public jb(boolean[] zArr, Utilities.Callback2 callback2, ei.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1583b = zArr;
        this.f1584c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f1585f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f1582a) {
            case 0:
                boolean[] zArr = this.f1583b;
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
                    this.f1584c.run(Long.valueOf(parseLong), new kb(editTextBoldCursor, this.f1585f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1583b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f1584c.run(0L, new a3.l0(zArr2, this.e, this.f1585f, 15));
                    return;
                }
                return;
        }
    }

    public jb(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ei.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1583b = zArr;
        this.f1584c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f1585f = f3VarArr;
    }
}
