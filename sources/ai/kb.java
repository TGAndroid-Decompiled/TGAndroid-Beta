package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kb implements View.OnClickListener {
    public final int f1635a = 1;
    public final boolean[] f1636b;
    public final Utilities.Callback2 f1637c;
    public final ei.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.h3[] f1638f;

    public kb(boolean[] zArr, Utilities.Callback2 callback2, ei.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f1636b = zArr;
        this.f1637c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f1638f = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f1635a) {
            case 0:
                boolean[] zArr = this.f1636b;
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
                    this.f1637c.run(Long.valueOf(parseLong), new lb(editTextBoldCursor, this.f1638f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1636b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f1637c.run(0L, new a3.l0(zArr2, this.e, this.f1638f, 15));
                    return;
                }
                return;
        }
    }

    public kb(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ei.d dVar, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f1636b = zArr;
        this.f1637c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f1638f = h3VarArr;
    }
}
