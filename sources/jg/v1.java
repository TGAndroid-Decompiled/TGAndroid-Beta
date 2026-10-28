package jg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import di.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class v1 implements TextView.OnEditorActionListener {
    public final s1 f15872a;
    public final int f15873b;
    public final b2 f15874c;
    public final TextView d;
    public final y2 e;
    public final Utilities.Callback f15875f;
    public final org.telegram.ui.ActionBar.e2[] f15876g;
    public final View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, y2 y2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.f15872a = s1Var;
        this.f15873b = i10;
        this.f15874c = b2Var;
        this.d = textView;
        this.e = y2Var;
        this.f15875f = callback;
        this.f15876g = e2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.f15872a;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f15873b);
            b2 b2Var = this.f15874c;
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f15639a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f15639a != i11) {
                AndroidUtilities.shakeView(s1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f15875f.run(obj);
            org.telegram.ui.ActionBar.e2[] e2VarArr = this.f15876g;
            org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
            if (e2Var != null) {
                e2Var.dismiss();
            }
            if (e2VarArr[0] == z1.f15912f) {
                z1.f15912f = null;
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
