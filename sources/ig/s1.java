package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class s1 implements TextView.OnEditorActionListener {
    public final p1 f13066a;
    public final int f13067b;
    public final y1 f13068c;
    public final TextView d;
    public final y2 e;
    public final Utilities.Callback f13069f;
    public final org.telegram.ui.ActionBar.c2[] f13070g;
    public final View h;

    public s1(p1 p1Var, int i10, y1 y1Var, TextView textView, y2 y2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f13066a = p1Var;
        this.f13067b = i10;
        this.f13068c = y1Var;
        this.d = textView;
        this.e = y2Var;
        this.f13069f = callback;
        this.f13070g = c2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        p1 p1Var = this.f13066a;
        String obj = p1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            z1 f7 = z1.f(this.f13067b);
            y1 y1Var = this.f13068c;
            if (y1Var == null) {
                i11 = -1;
            } else {
                i11 = y1Var.f13129a;
            }
            y1 d = f7.d(obj);
            if (d != null && d.f13129a != i11) {
                AndroidUtilities.shakeView(p1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f13069f.run(obj);
            org.telegram.ui.ActionBar.c2[] c2VarArr = this.f13070g;
            org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            if (c2VarArr[0] == w1.h) {
                w1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(p1Var);
        return true;
    }
}
