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
    public final s1 f15873a;
    public final int f15874b;
    public final b2 f15875c;
    public final TextView d;
    public final y2 e;
    public final Utilities.Callback f15876f;
    public final org.telegram.ui.ActionBar.e2[] f15877g;
    public final View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, y2 y2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.f15873a = s1Var;
        this.f15874b = i10;
        this.f15875c = b2Var;
        this.d = textView;
        this.e = y2Var;
        this.f15876f = callback;
        this.f15877g = e2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.f15873a;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f15874b);
            b2 b2Var = this.f15875c;
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f15640a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f15640a != i11) {
                AndroidUtilities.shakeView(s1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f15876f.run(obj);
            org.telegram.ui.ActionBar.e2[] e2VarArr = this.f15877g;
            org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
            if (e2Var != null) {
                e2Var.dismiss();
            }
            if (e2VarArr[0] == z1.f15913f) {
                z1.f15913f = null;
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
