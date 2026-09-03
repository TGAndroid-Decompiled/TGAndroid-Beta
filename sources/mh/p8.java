package mh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p8 implements View.OnClickListener {
    public final int f14606a = 0;
    public final boolean[] f14607b;
    public final Utilities.Callback2 f14608c;
    public final qh.d d;
    public final EditTextBoldCursor f14609e;
    public final org.telegram.ui.ActionBar.h3[] f14610f;

    public p8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, qh.d dVar, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f14607b = zArr;
        this.f14608c = callback2;
        this.f14609e = editTextBoldCursor;
        this.d = dVar;
        this.f14610f = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f14606a) {
            case 0:
                boolean[] zArr = this.f14607b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f14609e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f14608c.run(Long.valueOf(parseLong), new q8(editTextBoldCursor, this.f14610f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f14607b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f14608c.run(0L, new p6(zArr2, this.f14609e, this.f14610f, 1));
                    return;
                }
                return;
        }
    }

    public p8(boolean[] zArr, Utilities.Callback2 callback2, qh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f14607b = zArr;
        this.f14608c = callback2;
        this.d = dVar;
        this.f14609e = editTextBoldCursor;
        this.f14610f = h3VarArr;
    }
}
