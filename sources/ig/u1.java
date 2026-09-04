package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class u1 implements TextView.OnEditorActionListener {
    public final r1 f12238a;
    public final int f12239b;
    public final a2 f12240c;
    public final TextView d;
    public final r3 f12241e;
    public final Utilities.Callback f12242f;
    public final org.telegram.ui.ActionBar.b2[] f12243g;
    public final View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, r3 r3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f12238a = r1Var;
        this.f12239b = i10;
        this.f12240c = a2Var;
        this.d = textView;
        this.f12241e = r3Var;
        this.f12242f = callback;
        this.f12243g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.f12238a;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f12239b);
            a2 a2Var = this.f12240c;
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f11992a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f11992a != i11) {
                AndroidUtilities.shakeView(r1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f12241e.run(Boolean.TRUE);
                return true;
            }
            this.f12242f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f12243g;
            org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
            if (b2Var != null) {
                b2Var.dismiss();
            }
            if (b2VarArr[0] == y1.h) {
                y1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(r1Var);
        return true;
    }
}
