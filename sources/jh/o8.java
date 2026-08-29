package jh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o8 implements View.OnClickListener {
    public final int f12583a = 1;
    public final boolean[] f12584b;
    public final Utilities.Callback2 f12585c;
    public final nh.d d;
    public final EditTextBoldCursor f12586e;
    public final org.telegram.ui.ActionBar.f3[] f12587f;

    public o8(boolean[] zArr, Utilities.Callback2 callback2, nh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f12584b = zArr;
        this.f12585c = callback2;
        this.d = dVar;
        this.f12586e = editTextBoldCursor;
        this.f12587f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f12583a) {
            case 0:
                boolean[] zArr = this.f12584b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f12586e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f12585c.run(Long.valueOf(parseLong), new p8(editTextBoldCursor, this.f12587f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f12584b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f12585c.run(0L, new androidx.car.app.utils.b(zArr2, this.f12586e, this.f12587f, 29));
                    return;
                }
                return;
        }
    }

    public o8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, nh.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f12584b = zArr;
        this.f12585c = callback2;
        this.f12586e = editTextBoldCursor;
        this.d = dVar;
        this.f12587f = f3VarArr;
    }
}
