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
    public final s1 f11413a;
    public final int f11414b;
    public final b2 f11415c;
    public final TextView d;
    public final f4 f11416e;
    public final Utilities.Callback f11417f;
    public final org.telegram.ui.ActionBar.a2[] f11418g;
    public final View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, f4 f4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f11413a = s1Var;
        this.f11414b = i10;
        this.f11415c = b2Var;
        this.d = textView;
        this.f11416e = f4Var;
        this.f11417f = callback;
        this.f11418g = a2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.f11413a;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f11414b);
            b2 b2Var = this.f11415c;
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f11172a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f11172a != i11) {
                AndroidUtilities.shakeView(s1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f11416e.run(Boolean.TRUE);
                return true;
            }
            this.f11417f.run(obj);
            org.telegram.ui.ActionBar.a2[] a2VarArr = this.f11418g;
            org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                a2Var.dismiss();
            }
            if (a2VarArr[0] == z1.h) {
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
