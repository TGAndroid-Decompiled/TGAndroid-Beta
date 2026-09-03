package lh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p8 implements View.OnClickListener {
    public final int f12921a = 0;
    public final boolean[] f12922b;
    public final Utilities.Callback2 f12923c;
    public final ph.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.g3[] f12924f;

    public p8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ph.d dVar, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12922b = zArr;
        this.f12923c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f12924f = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f12921a) {
            case 0:
                boolean[] zArr = this.f12922b;
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
                    this.f12923c.run(Long.valueOf(parseLong), new q8(editTextBoldCursor, this.f12924f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f12922b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f12923c.run(0L, new p6(zArr2, this.e, this.f12924f, 1));
                    return;
                }
                return;
        }
    }

    public p8(boolean[] zArr, Utilities.Callback2 callback2, ph.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12922b = zArr;
        this.f12923c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f12924f = g3VarArr;
    }
}
