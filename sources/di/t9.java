package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements View.OnClickListener {
    public final int f9816a = 1;
    public final boolean[] f9817b;
    public final r10 f9818c;
    public final hi.d d;
    public final EditTextBoldCursor f9819e;
    public final org.telegram.ui.ActionBar.w2[] f9820f;

    public t9(boolean[] zArr, r10 r10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9817b = zArr;
        this.f9818c = r10Var;
        this.d = dVar;
        this.f9819e = editTextBoldCursor;
        this.f9820f = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f9816a) {
            case 0:
                boolean[] zArr = this.f9817b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f9819e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f9818c.a(Long.valueOf(parseLong), new w9(editTextBoldCursor, this.f9820f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f9817b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f9818c.a(0L, new a8(zArr2, this.f9819e, this.f9820f, 1));
                    return;
                }
                return;
        }
    }

    public t9(boolean[] zArr, r10 r10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9817b = zArr;
        this.f9818c = r10Var;
        this.f9819e = editTextBoldCursor;
        this.d = dVar;
        this.f9820f = w2VarArr;
    }
}
