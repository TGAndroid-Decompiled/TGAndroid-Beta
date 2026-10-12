package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class u1 implements TextView.OnEditorActionListener {
    public final r1 f11657a;
    public final int f11658b;
    public final a2 f11659c;
    public final TextView d;
    public final u3 e;
    public final Utilities.Callback f11660f;
    public final org.telegram.ui.ActionBar.a2[] f11661g;
    public final View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, u3 u3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f11657a = r1Var;
        this.f11658b = i10;
        this.f11659c = a2Var;
        this.d = textView;
        this.e = u3Var;
        this.f11660f = callback;
        this.f11661g = a2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.f11657a;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f11658b);
            a2 a2Var = this.f11659c;
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f11434a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f11434a != i11) {
                AndroidUtilities.shakeView(r1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f11660f.run(obj);
            org.telegram.ui.ActionBar.a2[] a2VarArr = this.f11661g;
            org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr[0];
            if (a2Var2 != null) {
                a2Var2.dismiss();
            }
            if (a2VarArr[0] == y1.h) {
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
