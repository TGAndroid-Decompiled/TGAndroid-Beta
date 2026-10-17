package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class r1 implements TextView.OnEditorActionListener {
    public final o1 f13020a;
    public final int f13021b;
    public final x1 f13022c;
    public final TextView d;
    public final z2 e;
    public final Utilities.Callback f13023f;
    public final org.telegram.ui.ActionBar.b2[] f13024g;
    public final View h;

    public r1(o1 o1Var, int i10, x1 x1Var, TextView textView, z2 z2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f13020a = o1Var;
        this.f13021b = i10;
        this.f13022c = x1Var;
        this.d = textView;
        this.e = z2Var;
        this.f13023f = callback;
        this.f13024g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        o1 o1Var = this.f13020a;
        String obj = o1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            y1 f7 = y1.f(this.f13021b);
            x1 x1Var = this.f13022c;
            if (x1Var == null) {
                i11 = -1;
            } else {
                i11 = x1Var.f13080a;
            }
            x1 d = f7.d(obj);
            if (d != null && d.f13080a != i11) {
                AndroidUtilities.shakeView(o1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f13023f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f13024g;
            org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
            if (b2Var != null) {
                b2Var.dismiss();
            }
            if (b2VarArr[0] == v1.h) {
                v1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(o1Var);
        return true;
    }
}
