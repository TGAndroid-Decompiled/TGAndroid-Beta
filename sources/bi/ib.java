package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ib implements View.OnClickListener {
    public final int f4844a = 1;
    public final boolean[] f4845b;
    public final Utilities.Callback2 f4846c;
    public final fi.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.k3[] f4847f;

    public ib(boolean[] zArr, Utilities.Callback2 callback2, fi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.f4845b = zArr;
        this.f4846c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f4847f = k3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f4844a) {
            case 0:
                boolean[] zArr = this.f4845b;
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
                    this.f4846c.run(Long.valueOf(parseLong), new jb(editTextBoldCursor, this.f4847f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f4845b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f4846c.run(0L, new a3.l0(zArr2, this.e, this.f4847f, 19));
                    return;
                }
                return;
        }
    }

    public ib(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, fi.d dVar, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.f4845b = zArr;
        this.f4846c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f4847f = k3VarArr;
    }
}
