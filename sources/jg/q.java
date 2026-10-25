package jg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
public final class q implements TextView.OnEditorActionListener {
    public final int f15809a;
    public final int f15810b;
    public final org.telegram.ui.ActionBar.e2[] f15811c;
    public final View d;
    public final EditTextBoldCursor e;
    public final Object f15812f;

    public q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.e2[] e2VarArr, View view, int i11) {
        this.f15809a = i11;
        this.e = editTextBoldCursor;
        this.f15810b = i10;
        this.f15812f = obj;
        this.f15811c = e2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f15809a) {
            case 0:
                t tVar = (t) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f15812f;
                if (i10 != 6) {
                    return false;
                }
                String obj = tVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(tVar);
                } else {
                    z d = z.d(this.f15810b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.e2[] e2VarArr = this.f15811c;
                    org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                    if (e2Var != null) {
                        e2Var.dismiss();
                    }
                    if (e2VarArr[0] == w.e) {
                        w.e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                f5 f5Var = (f5) this.e;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f15812f;
                if (i10 != 6) {
                    return false;
                }
                String obj2 = f5Var.getText().toString();
                if (obj2.length() > this.f15810b) {
                    AndroidUtilities.shakeView(f5Var);
                } else {
                    stringCallback.run(obj2);
                    org.telegram.ui.ActionBar.e2 e2Var2 = this.f15811c[0];
                    if (e2Var2 != null) {
                        e2Var2.dismiss();
                    }
                    View view2 = this.d;
                    if (view2 != null) {
                        view2.requestFocus();
                    }
                }
                return true;
        }
    }
}
