package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.wr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.t4;
public final class p implements TextView.OnEditorActionListener {
    public final int f17472a;
    public final int f17473b;
    public final org.telegram.ui.ActionBar.u1[] f17474c;
    public final View d;
    public final EditTextBoldCursor f17475e;
    public final Object f17476f;

    public p(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.u1[] u1VarArr, View view, int i10) {
        this.f17472a = i10;
        this.f17475e = editTextBoldCursor;
        this.f17473b = i7;
        this.f17476f = obj;
        this.f17474c = u1VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f17472a) {
            case 0:
                s sVar = (s) this.f17475e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f17476f;
                if (i7 != 6) {
                    return false;
                }
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.F3(sVar);
                } else {
                    y d = y.d(this.f17473b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.u1[] u1VarArr = this.f17474c;
                    org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    if (u1VarArr[0] == v.f17563e) {
                        v.f17563e = null;
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                t4 t4Var = (t4) this.f17475e;
                wr wrVar = (wr) this.f17476f;
                if (i7 != 6) {
                    return false;
                }
                String obj2 = t4Var.getText().toString();
                if (obj2.length() > this.f17473b) {
                    org.telegram.messenger.g0.F3(t4Var);
                } else {
                    wrVar.a(obj2);
                    org.telegram.ui.ActionBar.u1 u1Var2 = this.f17474c[0];
                    if (u1Var2 != null) {
                        u1Var2.dismiss();
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
