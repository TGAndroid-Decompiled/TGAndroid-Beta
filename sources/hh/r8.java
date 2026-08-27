package hh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class r8 implements View.OnClickListener {

    public final int f10000a = 1;

    public final boolean[] f10001b;

    public final Utilities.Callback2 f10002c;
    public final lh.d d;

    public final EditTextBoldCursor f10003e;

    public final org.telegram.ui.ActionBar.e3[] f10004f;

    public r8(boolean[] zArr, Utilities.Callback2 callback2, lh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f10001b = zArr;
        this.f10002c = callback2;
        this.d = dVar;
        this.f10003e = editTextBoldCursor;
        this.f10004f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10000a) {
            case 0:
                boolean[] zArr = this.f10001b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f10003e;
                    String string = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    this.f10002c.run(Long.valueOf(TextUtils.isEmpty(string) ? 0L : Long.parseLong(string)), new s8(editTextBoldCursor, this.f10004f, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.f10001b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f10002c.run(0L, new androidx.car.app.utils.a(zArr2, this.f10003e, this.f10004f, 29));
                    break;
                }
                break;
        }
    }

    public r8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, lh.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f10001b = zArr;
        this.f10002c = callback2;
        this.f10003e = editTextBoldCursor;
        this.d = dVar;
        this.f10004f = e3VarArr;
    }
}
