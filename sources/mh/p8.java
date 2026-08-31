package mh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p8 implements View.OnClickListener {
    public final int f14604a = 0;
    public final boolean[] f14605b;
    public final Utilities.Callback2 f14606c;
    public final qh.d d;
    public final EditTextBoldCursor f14607e;
    public final org.telegram.ui.ActionBar.h3[] f14608f;

    public p8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, qh.d dVar, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f14605b = zArr;
        this.f14606c = callback2;
        this.f14607e = editTextBoldCursor;
        this.d = dVar;
        this.f14608f = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f14604a) {
            case 0:
                boolean[] zArr = this.f14605b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f14607e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f14606c.run(Long.valueOf(parseLong), new q8(editTextBoldCursor, this.f14608f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f14605b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f14606c.run(0L, new p6(zArr2, this.f14607e, this.f14608f, 1));
                    return;
                }
                return;
        }
    }

    public p8(boolean[] zArr, Utilities.Callback2 callback2, qh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f14605b = zArr;
        this.f14606c = callback2;
        this.d = dVar;
        this.f14607e = editTextBoldCursor;
        this.f14608f = h3VarArr;
    }
}
