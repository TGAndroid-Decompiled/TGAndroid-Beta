package lh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p8 implements View.OnClickListener {
    public final int f12937a = 0;
    public final boolean[] f12938b;
    public final Utilities.Callback2 f12939c;
    public final ph.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.g3[] f12940f;

    public p8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ph.d dVar, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12938b = zArr;
        this.f12939c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f12940f = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f12937a) {
            case 0:
                boolean[] zArr = this.f12938b;
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
                    this.f12939c.run(Long.valueOf(parseLong), new q8(editTextBoldCursor, this.f12940f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f12938b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f12939c.run(0L, new p6(zArr2, this.e, this.f12940f, 1));
                    return;
                }
                return;
        }
    }

    public p8(boolean[] zArr, Utilities.Callback2 callback2, ph.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12938b = zArr;
        this.f12939c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f12940f = g3VarArr;
    }
}
