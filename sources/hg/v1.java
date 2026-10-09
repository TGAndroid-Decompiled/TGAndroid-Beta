package hg;

import ai.f4;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class v1 implements TextView.OnEditorActionListener {
    public final s1 f11415a;
    public final int f11416b;
    public final b2 f11417c;
    public final TextView d;
    public final f4 f11418e;
    public final Utilities.Callback f11419f;
    public final org.telegram.ui.ActionBar.b2[] f11420g;
    public final View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, f4 f4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f11415a = s1Var;
        this.f11416b = i10;
        this.f11417c = b2Var;
        this.d = textView;
        this.f11418e = f4Var;
        this.f11419f = callback;
        this.f11420g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.f11415a;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f11416b);
            b2 b2Var = this.f11417c;
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f11174a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f11174a != i11) {
                AndroidUtilities.shakeView(s1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f11418e.run(Boolean.TRUE);
                return true;
            }
            this.f11419f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f11420g;
            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
            if (b2Var2 != null) {
                b2Var2.dismiss();
            }
            if (b2VarArr[0] == z1.h) {
                z1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(s1Var);
        return true;
    }
}
