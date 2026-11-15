package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q9 implements View.OnClickListener {
    public final int f9293a = 1;
    public final boolean[] f9294b;
    public final s10 f9295c;
    public final hi.d d;
    public final EditTextBoldCursor f9296e;
    public final org.telegram.ui.ActionBar.u2[] f9297f;

    public q9(boolean[] zArr, s10 s10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f9294b = zArr;
        this.f9295c = s10Var;
        this.d = dVar;
        this.f9296e = editTextBoldCursor;
        this.f9297f = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9293a) {
            case 0:
                boolean[] zArr = this.f9294b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9296e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9295c.a(Long.valueOf(parseLong), new t9(editTextBoldCursor, this.f9297f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9294b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9295c.a(0L, new aa.r(zArr2, this.f9296e, this.f9297f, 26));
                    return;
                }
                return;
        }
    }

    public q9(boolean[] zArr, s10 s10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f9294b = zArr;
        this.f9295c = s10Var;
        this.f9296e = editTextBoldCursor;
        this.d = dVar;
        this.f9297f = u2VarArr;
    }
}
