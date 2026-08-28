package gh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s8 implements View.OnClickListener {
    public final int f8882a = 1;
    public final boolean[] f8883b;
    public final Utilities.Callback2 f8884c;
    public final kh.d d;
    public final EditTextBoldCursor f8885e;
    public final org.telegram.ui.ActionBar.f3[] f8886f;

    public s8(boolean[] zArr, Utilities.Callback2 callback2, kh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f8883b = zArr;
        this.f8884c = callback2;
        this.d = dVar;
        this.f8885e = editTextBoldCursor;
        this.f8886f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f8882a) {
            case 0:
                boolean[] zArr = this.f8883b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f8885e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f8884c.run(Long.valueOf(parseLong), new t8(editTextBoldCursor, this.f8886f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f8883b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f8884c.run(0L, new androidx.car.app.utils.b(zArr2, this.f8885e, this.f8886f, 28));
                    return;
                }
                return;
        }
    }

    public s8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, kh.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f8883b = zArr;
        this.f8884c = callback2;
        this.f8885e = editTextBoldCursor;
        this.d = dVar;
        this.f8886f = f3VarArr;
    }
}
